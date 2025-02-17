package yourname.mods.yourmod.network.protocol;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;

public record ClientboundTestPacket(int example) {

    public static void encode(ClientboundTestPacket message, FriendlyByteBuf buf) {
        buf.writeInt(message.example);
    }

    public static ClientboundTestPacket decode(FriendlyByteBuf buf) {
        return new ClientboundTestPacket(buf.readInt());
    }

    public static void handle(final Player player, ClientboundTestPacket message) {
        player.displayClientMessage(Component.literal("Hello, I received: " + message.example), true);
    }

}
