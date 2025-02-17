package yourname.mods.yourmod.menu;

import net.blay09.mods.balm.api.DeferredObject;
import net.blay09.mods.balm.api.menu.BalmMenus;
import net.minecraft.world.inventory.MenuType;

import static yourname.mods.yourmod.YourMod.id;

public class ModMenus {
    public static DeferredObject<MenuType<YourMenu>> yourMenu;

    public static void initialize(BalmMenus menus) {
        yourMenu = menus.registerMenu(id("your_menu"), (windowId, inventory, buf) -> new YourMenu(windowId, inventory));
    }
}
