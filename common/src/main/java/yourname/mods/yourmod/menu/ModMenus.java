package yourname.mods.yourmod.menu;

import net.blay09.mods.balm.api.DeferredObject;
import net.blay09.mods.balm.api.menu.BalmMenuFactory;
import net.blay09.mods.balm.api.menu.BalmMenus;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.util.Unit;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.MenuType;

import static yourname.mods.yourmod.YourMod.id;

public class ModMenus {
    public static DeferredObject<MenuType<YourMenu>> yourMenu;

    public static void initialize(BalmMenus menus) {
        yourMenu = menus.registerMenu(id("your_menu"), new BalmMenuFactory<YourMenu, Unit>() {
                    @Override
                    public YourMenu create(int windowId, Inventory inventory, Unit unit) {
                        return new YourMenu(windowId, inventory);
                    }

                    @Override
                    public StreamCodec<RegistryFriendlyByteBuf, Unit> getStreamCodec() {
                        return StreamCodec.unit(Unit.INSTANCE);
                    }
                }
        );
    }
}
