package yourname.mods.yourmod.api.client;

import org.jetbrains.annotations.ApiStatus;

public class YourModClientAPI {
    private static InternalClientMethods internalMethods;

    /**
     * Internal use only.
     */
    @ApiStatus.Internal
    public static void __setupAPI(InternalClientMethods internalMethods) {
        YourModClientAPI.internalMethods = internalMethods;
    }

}
