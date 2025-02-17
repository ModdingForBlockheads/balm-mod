package yourname.mods.yourmod.client;

import net.blay09.mods.balm.api.DeferredObject;
import net.blay09.mods.balm.api.client.rendering.BalmModels;
import net.minecraft.client.resources.model.BakedModel;

import static yourname.mods.yourmod.YourMod.id;

public class ModModels {
    public static DeferredObject<BakedModel> customModel;

    public static void initialize(BalmModels models) {
        customModel = models.loadModel(id("block/custom_model"));
    }
}
