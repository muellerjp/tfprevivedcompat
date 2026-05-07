package com.yourname.tfprevivedcompat;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.AddPackFindersEvent;

@Mod(TFPRevivedCompat.MOD_ID)
public class TFPRevivedCompat {
    public static final String MOD_ID = "tfprevived_compat";

    public TFPRevivedCompat(IEventBus modEventBus) {
        modEventBus.addListener(this::onAddPackFinders);
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
