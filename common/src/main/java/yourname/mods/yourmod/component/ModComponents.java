package yourname.mods.yourmod.component;

import com.mojang.serialization.Codec;
import net.blay09.mods.balm.api.DeferredObject;
import net.blay09.mods.balm.api.component.BalmComponents;
import net.minecraft.core.component.DataComponentType;

import static yourname.mods.yourmod.YourMod.id;

public class ModComponents {

    public static DeferredObject<DataComponentType<Integer>> yourComponent;

    public static void initialize(BalmComponents components) {
        yourComponent = components.registerComponent(() -> DataComponentType.<Integer>builder().persistent(Codec.INT).build(), id("your_component"));
    }
}
