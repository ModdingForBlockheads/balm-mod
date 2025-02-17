package yourname.mods.yourmod.client.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.ChickenModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import yourname.mods.yourmod.entity.YourEntity;

public class YourEntityRenderer extends MobRenderer<YourEntity, ChickenModel<YourEntity>> {
    private static final ResourceLocation chickenTextures = new ResourceLocation("textures/entity/chicken.png");

    public YourEntityRenderer(EntityRendererProvider.Context context, ChickenModel<YourEntity> model, float shadowSize) {
        super(context, model, shadowSize);
    }

    @Override
    public ResourceLocation getTextureLocation(YourEntity entity) {
        return chickenTextures;
    }

    @Override
    public void render(YourEntity entity, float yaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLightIn) {
        poseStack.pushPose();
        poseStack.scale(2f, 2f, 2f);
        super.render(entity, yaw, partialTicks, poseStack, buffer, packedLightIn);
        poseStack.popPose();
    }

}
