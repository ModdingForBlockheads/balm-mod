package net.blay09.mods.balmtemplate.compat;

import mcp.mobius.waila.api.*;

public class WTHITBalmTemplatePlugin implements IWailaPlugin {
    @Override
    public void register(IRegistrar registrar) {
        //registrar.addComponent(new GenericComponentProvider(CookingForBlockheadsWailaUtils::appendMilkJarTooltip), TooltipPosition.BODY, MilkJarBlock.class);
    }

    //private static class GenericComponentProvider implements IBlockComponentProvider {
    //    private final CookingForBlockheadsWailaUtils.TooltipAppender appender;
    //
    //    private GenericComponentProvider(CookingForBlockheadsWailaUtils.TooltipAppender appender) {
    //        this.appender = appender;
    //    }
    //
    //    @Override
    //    public void appendBody(ITooltip tooltip, IBlockAccessor accessor, IPluginConfig config) {
    //        appender.appendTooltip(accessor.getBlockEntity(), accessor.getPlayer(), tooltip::addLine);
    //    }
    //}
}
