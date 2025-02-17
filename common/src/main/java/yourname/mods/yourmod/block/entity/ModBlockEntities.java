package yourname.mods.yourmod.block.entity;

import net.blay09.mods.balm.api.DeferredObject;
import net.blay09.mods.balm.api.block.BalmBlockEntities;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import yourname.mods.yourmod.block.ModBlocks;

import static yourname.mods.yourmod.YourMod.id;

public class ModBlockEntities {
    public static DeferredObject<BlockEntityType<YourBlockEntity>> yourBlock;

    public static void initialize(BalmBlockEntities blockEntities) {
        yourBlock = blockEntities.registerBlockEntity(id("your_block"), YourBlockEntity::new, () -> new Block[]{ModBlocks.yourBlock});
    }

}
