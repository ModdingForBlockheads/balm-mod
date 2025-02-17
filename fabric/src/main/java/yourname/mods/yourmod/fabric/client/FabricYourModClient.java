package yourname.mods.yourmod.fabric.client;

import net.blay09.mods.balm.api.client.BalmClient;
import net.fabricmc.api.ClientModInitializer;
import yourname.mods.yourmod.YourMod;
import yourname.mods.yourmod.client.YourModClient;

public class FabricYourModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BalmClient.initialize(YourMod.MOD_ID, YourModClient::initialize);
    }
}
