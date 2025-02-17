package yourname.mods.yourmod.command;

import net.blay09.mods.balm.api.command.BalmCommands;

public class ModCommands {
    public static void initialize(BalmCommands commands) {
        commands.register(YourCommand::register);
    }
}
