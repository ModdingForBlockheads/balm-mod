package yourname.mods.yourmod.network;

import net.blay09.mods.balm.api.network.BalmNetworking;
import net.blay09.mods.balm.api.network.SyncConfigMessage;
import yourname.mods.yourmod.YourModConfig;
import yourname.mods.yourmod.network.protocol.ClientboundConfigMessage;
import yourname.mods.yourmod.network.protocol.ClientboundTestPacket;
import yourname.mods.yourmod.network.protocol.ServerboundTestPacket;

import static yourname.mods.yourmod.YourMod.id;

public class ModNetworking {

    public static void initialize(BalmNetworking networking) {
        networking.registerServerboundPacket(id("hello_server"),
                ServerboundTestPacket.class,
                ServerboundTestPacket::encode,
                ServerboundTestPacket::decode,
                ServerboundTestPacket::handle);
        networking.registerClientboundPacket(id("hello_client"),
                ClientboundTestPacket.class,
                ClientboundTestPacket::encode,
                ClientboundTestPacket::decode,
                ClientboundTestPacket::handle);

        SyncConfigMessage.register(id("config"),
                ClientboundConfigMessage.class,
                ClientboundConfigMessage::new,
                YourModConfig.class,
                YourModConfig::new);
    }
}
