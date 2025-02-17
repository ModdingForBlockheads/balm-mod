package yourname.mods.yourmod.block.entity;

import net.blay09.mods.balm.common.BalmBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class YourBlockEntity extends BalmBlockEntity {

    public YourBlockEntity(BlockPos pos, BlockState state) {
        this(ModBlockEntities.yourBlock.get(), pos, state);
    }

    public YourBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

}
