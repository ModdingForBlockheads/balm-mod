package yourname.mods.yourmod.api;

import org.jetbrains.annotations.ApiStatus;

public class YourModAPI {
    public static final String MOD_ID = "yourmod";

    private static InternalMethods internalMethods;

    /**
     * Internal use only.
     */
    @ApiStatus.Internal
    public static void __setupAPI(InternalMethods internalMethods) {
        YourModAPI.internalMethods = internalMethods;
    }

}
