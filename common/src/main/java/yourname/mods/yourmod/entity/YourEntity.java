package yourname.mods.yourmod.entity;

import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.level.Level;

public class YourEntity extends Chicken {

    public YourEntity(EntityType<? extends YourEntity> type, Level level) {
        super(type, level);
    }

}
