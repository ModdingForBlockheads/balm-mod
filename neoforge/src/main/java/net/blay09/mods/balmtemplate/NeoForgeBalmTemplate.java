package net.blay09.mods.balmtemplate;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.balmtemplate.client.BalmTemplateClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.DistExecutor;
import net.neoforged.fml.common.Mod;

@Mod(BalmTemplate.MOD_ID)
public class NeoForgeBalmTemplate {

    public NeoForgeBalmTemplate() {
        Balm.initialize(BalmTemplate.MOD_ID, BalmTemplate::initialize);
        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> BalmClient.initialize(BalmTemplate.MOD_ID, BalmTemplateClient::initialize));
    }

}
