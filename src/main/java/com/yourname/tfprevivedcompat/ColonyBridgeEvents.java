package com.yourname.tfprevivedcompat;

import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.IColonyManager;
import com.minecolonies.api.colony.buildings.IBuilding;
import com.minecolonies.api.colony.managers.interfaces.IRegisteredStructureManager;
import com.minecolonies.api.colony.permissions.Action;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

import java.util.List;
import java.util.Map;

/**
 * Grants custom colony: advancements so HQM quest tasks can detect:
 *   - colony population reaching 100 / 150 / 250 / 375 / 500
 *   - specific MineColonies buildings upgraded to a target level
 *
 * Polls every POLL_INTERVAL_TICKS (default 200 = 10 s). The advancement
 * system deduplicates — award() is a no-op once already granted.
 *
 * Building type is identified via IBuilding.getSchematicName(), whose
 * values are confirmed from the MC source: "farmer", "warehouse",
 * "library", "mechanic", "alchemist".
 */
public class ColonyBridgeEvents {

    private static final int POLL_INTERVAL_TICKS = 200;

    // population threshold → advancement path (after "colony:")
    private static final Map<Integer, String> POPULATION_ADVANCEMENTS = Map.of(
        100, "population_100",
        150, "population_150",
        250, "population_250",
        375, "population_375",
        500, "population_500"
    );

    // schematic name → level → advancement path
    private static final Map<String, Map<Integer, String>> BUILDING_LEVEL_ADVANCEMENTS = Map.of(
        "warehouse", Map.of(
            3, "building_level/warehouse_3",
            5, "building_level/warehouse_5"
        ),
        "farmer",    Map.of(5, "building_level/farmer_5"),
        "library",   Map.of(5, "building_level/library_5"),
        "mechanic",  Map.of(5, "building_level/mechanic_5"),
        "alchemist", Map.of(5, "building_level/alchemist_5")
    );

    private int tickCount = 0;

    public static void register() {
        NeoForge.EVENT_BUS.register(new ColonyBridgeEvents());
    }

    @SubscribeEvent
    public void onServerTick(ServerTickEvent.Post event) {
        if (++tickCount % POLL_INTERVAL_TICKS != 0) return;

        MinecraftServer server = event.getServer();
        List<ServerPlayer> players = server.getPlayerList().getPlayers();
        if (players.isEmpty()) return;

        for (ServerLevel level : server.getAllLevels()) {
            for (IColony colony : IColonyManager.getInstance().getColonies(level)) {
                int population = colony.getCitizenManager().getCitizens().size();
                IRegisteredStructureManager bm = colony.getServerBuildingManager();
                Map<?, IBuilding> buildings = bm.getBuildings();

                for (ServerPlayer player : players) {
                    if (!colony.getPermissions().hasPermission(player, Action.ACCESS_HUTS)) {
                        continue;
                    }
                    checkPopulation(player, population);
                    checkBuildingLevels(player, buildings.values());
                }
            }
        }
    }

    private void checkPopulation(ServerPlayer player, int population) {
        for (Map.Entry<Integer, String> entry : POPULATION_ADVANCEMENTS.entrySet()) {
            if (population >= entry.getKey()) {
                award(player, entry.getValue());
            }
        }
    }

    private void checkBuildingLevels(ServerPlayer player, Iterable<IBuilding> buildings) {
        for (IBuilding building : buildings) {
            int buildingLevel = building.getBuildingLevel();
            if (buildingLevel == 0) continue;

            String schematicName = building.getSchematicName();
            Map<Integer, String> levelMap = BUILDING_LEVEL_ADVANCEMENTS.get(schematicName);
            if (levelMap == null) continue;

            for (Map.Entry<Integer, String> entry : levelMap.entrySet()) {
                if (buildingLevel >= entry.getKey()) {
                    award(player, entry.getValue());
                }
            }
        }
    }

    /**
     * Awards the advancement {@code colony:<path>} to {@code player} if not already done.
     * award() is idempotent — safe to call every poll cycle.
     */
    private void award(ServerPlayer player, String path) {
        MinecraftServer server = player.getServer();
        if (server == null) return;

        ResourceLocation id = ResourceLocation.fromNamespaceAndPath("colony", path);
        AdvancementHolder holder = server.getAdvancements().get(id);
        if (holder == null) return;

        AdvancementProgress progress = player.getAdvancements().getOrStartProgress(holder);
        if (progress.isDone()) return;

        for (String criterion : progress.getRemainingCriteria()) {
            player.getAdvancements().award(holder, criterion);
        }
    }
}
