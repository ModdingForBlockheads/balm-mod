package yourname.mods.yourmod.network.protocol;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.server.level.ServerPlayer;

import static yourname.mods.yourmod.YourMod.id;

public record ServerboundTestPacket(int example) implements CustomPacketPayload {

    public static final CustomPacketPayload.Type<ServerboundTestPacket> TYPE = new CustomPacketPayload.Type<>(id("hello_server"));

    public static void encode(FriendlyByteBuf buf, ServerboundTestPacket message) {
        buf.writeInt(message.example);
    }

    public static ServerboundTestPacket decode(FriendlyByteBuf buf) {
        return new ServerboundTestPacket(buf.readInt());
    }

    public static void handle(final ServerPlayer player, ServerboundTestPacket message) {
        player.sendSystemMessage(Component.literal("Hello, I received: " + message.example));
    }

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
