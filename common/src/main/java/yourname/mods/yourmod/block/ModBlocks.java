package yourname.mods.yourmod.block;

import net.blay09.mods.balm.api.block.BalmBlocks;
import net.blay09.mods.balm.api.item.BalmItems;
import net.minecraft.world.level.block.Block;

import static net.blay09.mods.balm.api.block.BalmBlocks.blockProperties;
import static yourname.mods.yourmod.YourMod.id;

public class ModBlocks {

    public static Block yourBlock;

    public static void initialize(BalmBlocks blocks) {
        blocks.register(
                (identifier) -> yourBlock = new YourBlock(blockProperties(identifier)),
                BalmItems::blockItem,
                id("your_block"));
    }

}
