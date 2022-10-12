package net.blay09.mods.balmtemplate.client;

import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.balmtemplate.BalmTemplate;
import net.fabricmc.api.ClientModInitializer;

public class FabricBalmTemplateClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BalmClient.initialize(BalmTemplate.MOD_ID, BalmTemplateClient::initialize);
    }
}
