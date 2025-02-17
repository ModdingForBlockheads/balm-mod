package yourname.mods.yourmod.client;

import net.blay09.mods.balm.api.client.screen.BalmScreens;
import yourname.mods.yourmod.client.screen.YourScreen;
import yourname.mods.yourmod.menu.ModMenus;

public class ModScreens {
    public static void initialize(BalmScreens screens) {
        screens.registerScreen(ModMenus.yourMenu::get, YourScreen::new);
    }
}
