package yourname.mods.yourmod.client;

import net.blay09.mods.balm.api.client.BalmClient;

public class YourModClient {
    public static void initialize() {
        ModScreens.initialize(BalmClient.getScreens());
        ModRenderers.initialize(BalmClient.getRenderers());
        ModModels.initialize(BalmClient.getModels());
        ModKeyMappings.initialize();
    }
}
