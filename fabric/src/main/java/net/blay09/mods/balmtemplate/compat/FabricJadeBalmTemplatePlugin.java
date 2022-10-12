package net.blay09.mods.balmtemplate.compat;

import net.blay09.mods.balmtemplate.BalmTemplate;
import snownee.jade.api.*;

@WailaPlugin(BalmTemplate.MOD_ID)
public class FabricJadeBalmTemplatePlugin implements IWailaPlugin {

    @Override
    public void registerClient(IWailaClientRegistration registration) {
        //registration.registerBlockComponent(new GenericComponentProvider(CookingForBlockheadsWailaUtils.MILK_JAR_UID, CookingForBlockheadsWailaUtils::appendMilkJarTooltip), MilkJarBlock.class);
    }

    //private static class GenericComponentProvider implements IBlockComponentProvider {
    //    private final ResourceLocation uid;
    //    private final CookingForBlockheadsWailaUtils.TooltipAppender appender;
    //
    //    private GenericComponentProvider(ResourceLocation uid, CookingForBlockheadsWailaUtils.TooltipAppender appender) {
    //        this.uid = uid;
    //        this.appender = appender;
    //    }
    //
    //    @Override
    //    public void appendTooltip(ITooltip tooltip, BlockAccessor accessor, IPluginConfig config) {
    //        appender.appendTooltip(accessor.getBlockEntity(), accessor.getPlayer(), tooltip::add);
    //    }
    //
    //    @Override
    //    public ResourceLocation getUid() {
    //        return uid;
    //    }
    //}
}
