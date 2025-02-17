package yourname.mods.yourmod.network.protocol;

import net.blay09.mods.balm.api.network.SyncConfigMessage;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import yourname.mods.yourmod.YourModConfig;

import static yourname.mods.yourmod.YourMod.id;

public class ClientboundConfigMessage extends SyncConfigMessage<YourModConfig> {
    public static final CustomPacketPayload.Type<ClientboundConfigMessage> TYPE = new CustomPacketPayload.Type<>(id("config"));

    public ClientboundConfigMessage(YourModConfig yourModConfig) {
        super(TYPE, yourModConfig);
    }
}
