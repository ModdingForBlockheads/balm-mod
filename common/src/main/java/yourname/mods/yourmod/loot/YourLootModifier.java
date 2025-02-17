package yourname.mods.yourmod.loot;

import net.blay09.mods.balm.api.loot.BalmLootModifier;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootContext;
import yourname.mods.yourmod.YourMod;

import java.util.List;

public class YourLootModifier implements BalmLootModifier {

    @Override
    public void apply(LootContext context, List<ItemStack> list) {
        if (context.getRandom().nextFloat() < 0.1f) {
            final var itemStack = new ItemStack(Items.STICK);
            itemStack.setHoverName(Component.literal(YourMod.MOD_ID));
            list.add(itemStack);
        }
    }

}
