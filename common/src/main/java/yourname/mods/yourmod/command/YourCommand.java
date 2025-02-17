package yourname.mods.yourmod.command;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;

public class YourCommand {

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("yourcommand")
                .executes(context -> {
                    context.getSource().sendSuccess(() -> Component.literal("It works"), true);
                    return 1;
                }));
    }
}
