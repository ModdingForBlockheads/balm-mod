package yourname.mods.yourmod.neoforge;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.neoforge.NeoForgeLoadContext;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import yourname.mods.yourmod.YourMod;

@Mod(YourMod.MOD_ID)
public class NeoForgeYourMod {

    public NeoForgeYourMod(IEventBus modEventBus) {
        final var context = new NeoForgeLoadContext(modEventBus);
        Balm.initialize(YourMod.MOD_ID, context, YourMod::initialize);
    }
}
