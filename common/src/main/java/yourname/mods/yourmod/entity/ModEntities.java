package yourname.mods.yourmod.entity;

import net.blay09.mods.balm.api.DeferredObject;
import net.blay09.mods.balm.api.entity.BalmEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.animal.Chicken;

import static yourname.mods.yourmod.YourMod.id;

public class ModEntities {
    public static DeferredObject<EntityType<YourEntity>> yourEntity;

    public static void initialize(BalmEntities entities) {
        yourEntity = entities.registerEntity(
                id("your_entity"),
                EntityType.Builder.of(YourEntity::new, MobCategory.MONSTER).sized(0.4f, 0.7f),
                Chicken::createAttributes);
    }

}
