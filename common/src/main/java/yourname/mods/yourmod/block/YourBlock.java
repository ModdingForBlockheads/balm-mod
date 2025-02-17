package yourname.mods.yourmod.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.Block;

public class YourBlock extends Block {

    public static final MapCodec<YourBlock> CODEC = simpleCodec(YourBlock::new);

    public YourBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends Block> codec() {
        return CODEC;
    }
}
