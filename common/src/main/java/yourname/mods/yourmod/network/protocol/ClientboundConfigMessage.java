package yourname.mods.yourmod.network.protocol;

import net.blay09.mods.balm.api.network.SyncConfigMessage;
import yourname.mods.yourmod.YourModConfig;

public class ClientboundConfigMessage extends SyncConfigMessage<YourModConfig> {
    public ClientboundConfigMessage(YourModConfig yourModConfig) {
        super(yourModConfig);
    }
}
