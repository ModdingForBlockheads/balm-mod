package yourname.mods.yourmod;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.config.BalmConfigData;
import net.blay09.mods.balm.api.config.Comment;
import net.blay09.mods.balm.api.config.Config;
import net.blay09.mods.balm.api.config.ExpectedType;
import yourname.mods.yourmod.network.protocol.ClientboundConfigMessage;

import java.util.List;

@Config(YourMod.MOD_ID)
public class YourModConfig implements BalmConfigData {

    @Comment("This is an example int property")
    public int exampleInt = 1234;

    @ExpectedType(String.class)
    @Comment("This is an example string list property")
    public List<String> exampleStringList = List.of("Hello", "World");

    public static void initialize() {
        Balm.getConfig().registerConfig(YourModConfig.class, ClientboundConfigMessage::new);
    }

    public static YourModConfig getActive() {
        return Balm.getConfig().getActive(YourModConfig.class);
    }
}
