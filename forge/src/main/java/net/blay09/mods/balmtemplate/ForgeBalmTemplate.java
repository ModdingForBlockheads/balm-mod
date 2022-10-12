package net.blay09.mods.balmtemplate;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.balmtemplate.client.BalmTemplateClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;

@Mod(BalmTemplate.MOD_ID)
public class ForgeBalmTemplate {

    public ForgeBalmTemplate() {
        Balm.initialize(BalmTemplate.MOD_ID, BalmTemplate::initialize);
        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> BalmClient.initialize(BalmTemplate.MOD_ID, BalmTemplateClient::initialize));
    }

}
