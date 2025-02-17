package yourname.mods.yourmod.forge;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import yourname.mods.yourmod.YourMod;

@Mod(YourMod.MOD_ID)
public class ForgeYourMod {

    public ForgeYourMod(FMLJavaModLoadingContext context) {
        Balm.initialize(YourMod.MOD_ID, EmptyLoadContext.INSTANCE, YourMod::initialize);
    }

}
