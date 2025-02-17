package yourname.mods.yourmod.neoforge.client;

import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.balm.neoforge.NeoForgeLoadContext;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import yourname.mods.yourmod.YourMod;
import yourname.mods.yourmod.client.YourModClient;

@Mod(value = YourMod.MOD_ID, dist = Dist.CLIENT)
public class NeoForgeYourModClient {

    public NeoForgeYourModClient(IEventBus modEventBus) {
        final var context = new NeoForgeLoadContext(modEventBus);
        BalmClient.initialize(YourMod.MOD_ID, context, YourModClient::initialize);
    }
}
