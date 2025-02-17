package yourname.mods.yourmod.client;

import net.blay09.mods.balm.api.client.rendering.BalmRenderers;
import net.minecraft.client.renderer.RenderType;
import yourname.mods.yourmod.block.ModBlocks;
import yourname.mods.yourmod.block.entity.ModBlockEntities;
import yourname.mods.yourmod.client.renderer.blockentity.YourBlockRenderer;

public class ModRenderers {

    public static void initialize(BalmRenderers renderers) {
        // Note: To support cutout rendering on all loaders, you must additionally specify `"render_type": "minecraft:cutout"` in your block model JSON.
        renderers.setBlockRenderType(() -> ModBlocks.yourBlock, RenderType.cutout());

        renderers.registerBlockEntityRenderer(ModBlockEntities.yourBlock::get, YourBlockRenderer::new);
    }
}
