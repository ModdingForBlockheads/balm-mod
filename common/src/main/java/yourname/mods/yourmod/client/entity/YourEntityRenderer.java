package yourname.mods.yourmod.client.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.ChickenModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.state.ChickenRenderState;
import net.minecraft.resources.ResourceLocation;
import yourname.mods.yourmod.entity.YourEntity;

import static yourname.mods.yourmod.YourMod.id;

public class YourEntityRenderer extends MobRenderer<YourEntity, ChickenRenderState, ChickenModel> {
    private static final ResourceLocation chickenTextures = ResourceLocation.withDefaultNamespace("textures/entity/chicken.png");

    public YourEntityRenderer(EntityRendererProvider.Context context, ChickenModel model, float shadowSize) {
        super(context, model, shadowSize);
    }

    @Override
    public ResourceLocation getTextureLocation(ChickenRenderState entity) {
        return chickenTextures;
    }

    @Override
    public void render(ChickenRenderState renderState, PoseStack poseStack, MultiBufferSource buffer, int packedLightIn) {
        poseStack.pushPose();
        poseStack.scale(2f, 2f, 2f);
        super.render(renderState, poseStack, buffer, packedLightIn);
        poseStack.popPose();
    }

    @Override
    public ChickenRenderState createRenderState() {
        return new ChickenRenderState();
    }

}
