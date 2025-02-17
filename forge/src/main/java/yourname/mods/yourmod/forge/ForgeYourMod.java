package yourname.mods.yourmod.forge;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.forge.ForgeLoadContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import yourname.mods.yourmod.YourMod;

@Mod(YourMod.MOD_ID)
public class ForgeYourMod {

    public ForgeYourMod(FMLJavaModLoadingContext context) {
        final var loadContext = new ForgeLoadContext(context.getModEventBus());
        Balm.initialize(YourMod.MOD_ID, loadContext, YourMod::initialize);
    }

}
