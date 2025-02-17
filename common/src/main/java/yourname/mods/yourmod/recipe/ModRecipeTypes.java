package yourname.mods.yourmod.recipe;

import net.blay09.mods.balm.api.recipe.BalmRecipes;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;

import static yourname.mods.yourmod.YourMod.id;

public class ModRecipeTypes {

    public static RecipeType<YourRecipe> yourRecipeType;
    public static RecipeSerializer<YourRecipe> yourRecipeSerializer;

    public static void initialize(BalmRecipes recipes) {
        recipes.registerRecipeType((identifier) -> yourRecipeType = new RecipeType<>() {
            @Override
            public String toString() {
                return identifier.getPath();
            }
        }, id("your_recipe"));
        recipes.registerRecipeSerializer(() -> yourRecipeSerializer = new YourRecipe.Serializer(), id("your_recipe"));
    }
}
