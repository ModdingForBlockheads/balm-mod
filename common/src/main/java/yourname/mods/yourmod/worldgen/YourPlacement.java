package yourname.mods.yourmod.worldgen;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.placement.PlacementContext;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;

import java.util.stream.Stream;

public class YourPlacement extends PlacementModifier {

    public static final Codec<YourPlacement> CODEC = RecordCodecBuilder.create((builder) -> builder.group(Heightmap.Types.CODEC.fieldOf("heightmap")
            .forGetter((placement) -> placement.heightmap)).apply(builder, YourPlacement::new));

    private final Heightmap.Types heightmap;

    public YourPlacement(Heightmap.Types heightmap) {
        this.heightmap = heightmap;
    }

    @Override
    public Stream<BlockPos> getPositions(PlacementContext context, RandomSource randomSource, BlockPos pos) {
        final var x = pos.getX();
        final var z = pos.getZ();
        final var y = context.getHeight(heightmap, x, z) + 2; // Place 2 blocks above the ground
        return y > context.getMinBuildHeight() ? Stream.of(new BlockPos(x, y, z)) : Stream.of();
    }

    @Override
    public PlacementModifierType<?> type() {
        return ModWorldGen.yourPlacement.get();
    }
}
