package com.yourname.tfprevivedcompat;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.AddPackFindersEvent;

@Mod(TFPRevivedCompat.MOD_ID)
public class TFPRevivedCompat {
    public static final String MOD_ID = "tfprevived_compat";

    public TFPRevivedCompat(IEventBus modEventBus) {
        modEventBus.addListener(this::onAddPackFinders);
        // Register the colony: advancement bridge only when MineColonies is present.
        // The check is done here (not in ColonyBridgeEvents) so the JVM never loads
        // ColonyBridgeEvents and its MC type references unless MC is actually loaded.
        if (ModList.get().isLoaded("minecolonies")) {
            ColonyBridgeEvents.register();
        }
    }

    private void onAddPackFinders(AddPackFindersEvent event) {
        if (event.getPackType() != PackType.SERVER_DATA) return;
        event.addPackFinders(
            ResourceLocation.fromNamespaceAndPath(MOD_ID, "."),
            PackType.SERVER_DATA,
            Component.literal("TFPRevived Compat Data"),
            PackSource.BUILT_IN,
            true,
            Pack.Position.TOP
        );
    }
}
