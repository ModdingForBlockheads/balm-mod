package yourname.mods.yourmod.fabric.client;

import net.blay09.mods.balm.api.EmptyLoadContext;
import net.blay09.mods.balm.api.client.BalmClient;
import net.fabricmc.api.ModInitializer;
import yourname.mods.yourmod.YourMod;
import yourname.mods.yourmod.client.YourModClient;

public class FabricYourModClient implements ModInitializer {
    @Override
    public void onInitialize() {
        BalmClient.initialize(YourMod.MOD_ID, EmptyLoadContext.INSTANCE, YourModClient::initialize);
    }
}
