package yourname.mods.yourmod.client.renderer.blockentity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import yourname.mods.yourmod.block.entity.YourBlockEntity;

public class YourBlockRenderer implements BlockEntityRenderer<YourBlockEntity> {

    public YourBlockRenderer(BlockEntityRendererProvider.Context context) {
    }

    @Override
    public void render(YourBlockEntity blockEntity, float partialTicks, PoseStack poseStack, MultiBufferSource buffers, int combinedLight, int combinedOverlay) {
    }
}
