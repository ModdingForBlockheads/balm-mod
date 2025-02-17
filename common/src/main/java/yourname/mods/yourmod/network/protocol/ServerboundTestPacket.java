package yourname.mods.yourmod.network.protocol;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

public record ServerboundTestPacket(int example) {

    public static void encode(ServerboundTestPacket message, FriendlyByteBuf buf) {
        buf.writeInt(message.example);
    }

    public static ServerboundTestPacket decode(FriendlyByteBuf buf) {
        return new ServerboundTestPacket(buf.readInt());
    }

    public static void handle(final ServerPlayer player, ServerboundTestPacket message) {
        player.sendSystemMessage(Component.literal("Hello, I received: " + message.example));
    }

}
