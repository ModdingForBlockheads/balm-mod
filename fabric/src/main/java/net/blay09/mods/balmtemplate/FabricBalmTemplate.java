package net.blay09.mods.balmtemplate;

import net.blay09.mods.balm.api.Balm;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.lookup.v1.block.BlockApiLookup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class FabricBalmTemplate implements ModInitializer {
    @Override
    public void onInitialize() {
        Balm.initialize(BalmTemplate.MOD_ID, BalmTemplate::initialize);
    }
}
