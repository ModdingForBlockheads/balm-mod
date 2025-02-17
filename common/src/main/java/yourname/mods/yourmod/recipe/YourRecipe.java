package yourname.mods.yourmod.recipe;

import com.google.gson.JsonObject;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

public record YourRecipe(ResourceLocation identifier, Ingredient ingredient, ItemStack result) implements Recipe<Container> {

    @Override
    public RecipeType<YourRecipe> getType() {
        return ModRecipeTypes.yourRecipeType;
    }

    @Override
    public boolean matches(Container container, Level level) {
        return ingredient.test(container.getItem(0));
    }

    @Override
    public ItemStack assemble(Container container, RegistryAccess registryAccess) {
        return result.copy();
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResultItem(RegistryAccess registryAccess) {
        return null;
    }

    @Override
    public ResourceLocation getId() {
        return identifier;
    }

    @Override
    public RecipeSerializer<YourRecipe> getSerializer() {
        return ModRecipeTypes.yourRecipeSerializer;
    }

    public static class Serializer implements RecipeSerializer<YourRecipe> {
        @Override
        public YourRecipe fromJson(ResourceLocation identifier, JsonObject jsonObject) {
            final var jsonElement = GsonHelper.isArrayNode(jsonObject, "ingredient") ? GsonHelper.getAsJsonArray(jsonObject, "ingredient") : GsonHelper.getAsJsonObject(jsonObject, "ingredient");
            final var ingredient = Ingredient.fromJson(jsonElement, false);
            final var resultString = GsonHelper.getAsString(jsonObject, "result");
            final var resultId = new ResourceLocation(resultString);
            final var result = new ItemStack(BuiltInRegistries.ITEM.getOptional(resultId).orElseThrow(() -> new IllegalStateException("Item: " + resultString + " does not exist")));
            return new YourRecipe(identifier, ingredient, result);
        }

        @Override
        public YourRecipe fromNetwork(ResourceLocation identifier, FriendlyByteBuf buf) {
            final var ingredient = Ingredient.fromNetwork(buf);
            final var result = buf.readItem();
            return new YourRecipe(identifier, ingredient, result);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, YourRecipe recipe) {
            recipe.ingredient.toNetwork(buf);
            buf.writeItem(recipe.result);
        }
    }
}
