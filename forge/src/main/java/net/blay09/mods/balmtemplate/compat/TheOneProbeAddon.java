package net.blay09.mods.balmtemplate.compat;

import mcjty.theoneprobe.api.*;
import net.blay09.mods.balmtemplate.BalmTemplate;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.fml.InterModComms;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;

public class TheOneProbeAddon {

    public static void register() {
        InterModComms.sendTo("theoneprobe", "getTheOneProbe", TopInitializer::new);
    }

    public static class TopInitializer implements Function<ITheOneProbe, Void> {
        @Nullable
        @Override
        public Void apply(@Nullable ITheOneProbe top) {
            if (top != null) {
                top.registerProvider(new ProbeInfoProvider());
            }
            return null;
        }
    }

    public static class ProbeInfoProvider implements IProbeInfoProvider {

        @Override
        public ResourceLocation getID() {
            return new ResourceLocation(BalmTemplate.MOD_ID, BalmTemplate.MOD_ID);
        }

        @Override
        public void addProbeInfo(ProbeMode mode, IProbeInfo info, Player playerEntity, Level level, BlockState state, IProbeHitData data) {
            //if (state.getBlock() instanceof MilkJarBlock) {
            //    MilkJarBlockEntity tileEntity = tryGetTileEntity(level, data.getPos(), MilkJarBlockEntity.class);
            //    if (tileEntity != null) {
            //        addMilkJarInfo(tileEntity, info);
            //    }
            //}
        }
    }

    @Nullable
    @SuppressWarnings("unchecked")
    private static <T extends BlockEntity> T tryGetTileEntity(Level level, BlockPos pos, Class<T> tileClass) {
        BlockEntity blockEntity = level.getBlockEntity(pos);
        if (blockEntity != null && tileClass.isAssignableFrom(blockEntity.getClass())) {
            return (T) blockEntity;
        }
        return null;
    }
}
