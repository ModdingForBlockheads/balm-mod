package net.blay09.mods.balmtemplate;

import net.blay09.mods.balm.api.Balm;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BalmTemplate {

    public static final String MOD_ID = "balmtemplate";
    public static final Logger logger = LogManager.getLogger(MOD_ID);

    public static void initialize() {
        BalmTemplateConfig.initialize();
    }

}
