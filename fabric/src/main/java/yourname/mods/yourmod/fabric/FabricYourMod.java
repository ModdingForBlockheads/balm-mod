package yourname.mods.yourmod.fabric;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.fabricmc.api.ModInitializer;
import yourname.mods.yourmod.YourMod;

public class FabricYourMod implements ModInitializer {
    @Override
    public void onInitialize() {
        Balm.initialize(YourMod.MOD_ID, EmptyLoadContext.INSTANCE, YourMod::initialize);
    }
}
