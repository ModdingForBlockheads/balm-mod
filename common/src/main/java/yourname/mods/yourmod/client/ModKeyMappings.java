package yourname.mods.yourmod.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.blay09.mods.kuma.api.InputBinding;
import net.blay09.mods.kuma.api.Kuma;
import net.blay09.mods.kuma.api.ManagedKeyMapping;
import yourname.mods.yourmod.YourMod;

import static yourname.mods.yourmod.YourMod.id;

public class ModKeyMappings {

    public static ManagedKeyMapping yourKey;

    public static void initialize() {
        yourKey = Kuma.createKeyMapping(id("your_key"))
                .withDefault(InputBinding.key(InputConstants.KEY_B))
                .handleScreenInput(event -> {
                    YourMod.logger.info("B was pressed - " + YourMod.MOD_ID);
                    return true;
                })
                .build();
    }
}
