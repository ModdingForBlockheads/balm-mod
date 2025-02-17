package yourname.mods.yourmod.worldgen;

import com.mojang.serialization.Codec;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import yourname.mods.yourmod.block.ModBlocks;

public class YourFeature extends Feature<NoneFeatureConfiguration> {

    public YourFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        final var level = context.level();
        final var pos = context.origin();
        final var state = level.getBlockState(pos);
        if (state.isAir()) {
            level.setBlock(pos, ModBlocks.yourBlock.defaultBlockState(), 2);
            return true;
        }

        return false;
    }
}
