package yourname.mods.yourmod.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

public record YourRecipe(Ingredient ingredient, ItemStack result) implements Recipe<SingleRecipeInput> {

    @Override
    public RecipeType<YourRecipe> getType() {
        return ModRecipeTypes.yourRecipeType;
    }

    @Override
    public boolean matches(SingleRecipeInput singleRecipeInput, Level level) {
        return ingredient.test(singleRecipeInput.item());
    }

    @Override
    public ItemStack assemble(SingleRecipeInput singleRecipeInput, HolderLookup.Provider provider) {
        return result.copy();
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider provider) {
        return result.copy();
    }

    @Override
    public RecipeSerializer<YourRecipe> getSerializer() {
        return ModRecipeTypes.yourRecipeSerializer;
    }

    public static class Serializer implements RecipeSerializer<YourRecipe> {
        private static final MapCodec<YourRecipe> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(YourRecipe::ingredient),
                ItemStack.STRICT_CODEC.fieldOf("result").forGetter(YourRecipe::result)
        ).apply(instance, YourRecipe::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, YourRecipe> STREAM_CODEC = StreamCodec.composite(
                Ingredient.CONTENTS_STREAM_CODEC, YourRecipe::ingredient,
                ItemStack.STREAM_CODEC, YourRecipe::result,
                YourRecipe::new);

        @Override
        public MapCodec<YourRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, YourRecipe> streamCodec() {
            return STREAM_CODEC;
        }
    }
}
