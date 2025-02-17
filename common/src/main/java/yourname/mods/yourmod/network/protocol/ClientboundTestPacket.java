package yourname.mods.yourmod.network.protocol;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;

import static yourname.mods.yourmod.YourMod.id;

public record ClientboundTestPacket(int example) implements CustomPacketPayload {

    public static final Type<ClientboundTestPacket> TYPE = new Type<>(id("hello_client"));

    public static void encode(FriendlyByteBuf buf, ClientboundTestPacket message) {
        buf.writeInt(message.example);
    }

    public static ClientboundTestPacket decode(FriendlyByteBuf buf) {
        return new ClientboundTestPacket(buf.readInt());
    }

    public static void handle(final Player player, ClientboundTestPacket message) {
        player.displayClientMessage(Component.literal("Hello, I received: " + message.example), true);
    }

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
