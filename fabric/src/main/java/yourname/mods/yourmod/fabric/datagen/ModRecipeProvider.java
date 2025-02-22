package yourname.mods.yourmod.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import yourname.mods.yourmod.YourMod;
import yourname.mods.yourmod.block.ModBlocks;
import yourname.mods.yourmod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                shaped(RecipeCategory.DECORATIONS, ModBlocks.yourBlock)
                        .pattern("DDD")
                        .pattern("SSS")
                        .pattern("DDD")
                        .define('D', Items.DIAMOND)
                        .define('S', Items.STICK)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .save(exporter);

                shapeless(RecipeCategory.DECORATIONS, ModItems.yourItem)
                        .requires(Items.DIAMOND)
                        .requires(Items.BONE_MEAL)
                        .unlockedBy("has_bone_meal", has(Items.BONE_MEAL))
                        .save(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return YourMod.MOD_ID;
    }
}
