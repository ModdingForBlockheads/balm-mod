package net.blay09.mods.balmtemplate;

import net.blay09.mods.balm.api.Balm;

public class BalmTemplateConfig {
    public static BalmTemplateConfigData getActive() {
        return Balm.getConfig().getActive(BalmTemplateConfigData.class);
    }

    public static void initialize() {
        Balm.getConfig().registerConfig(BalmTemplateConfigData.class, null);
    }
}
