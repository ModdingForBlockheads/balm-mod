package yourname.mods.yourmod.worldgen;

import net.blay09.mods.balm.api.DeferredObject;
import net.blay09.mods.balm.api.world.BalmWorldGen;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;
import yourname.mods.yourmod.block.ModBlocks;

import java.util.Set;

import static yourname.mods.yourmod.YourMod.id;

public class ModWorldGen {
    public static ResourceLocation yourFeature = id("your_feature");
    public static DeferredObject<PlacementModifierType<YourPlacement>> yourPlacement;

    public static void initialize(BalmWorldGen worldGen) {
        worldGen.registerFeature(yourFeature, () -> new YourFeature(NoneFeatureConfiguration.CODEC));

        yourPlacement = worldGen.registerPlacementModifier(id("your_placement"), () -> () -> YourPlacement.CODEC);

        worldGen.addFeatureToBiomes((id, biome) -> biome.is(BiomeTags.IS_BEACH),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                yourFeature);

        worldGen.registerPoiType(id("your_poi"), () -> new PoiType(Set.of(ModBlocks.yourBlock.defaultBlockState()), 1, 1));
    }
}
