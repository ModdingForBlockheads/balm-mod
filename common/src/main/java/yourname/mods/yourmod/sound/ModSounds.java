package yourname.mods.yourmod.sound;

import net.blay09.mods.balm.api.DeferredObject;
import net.blay09.mods.balm.api.sound.BalmSounds;
import net.minecraft.sounds.SoundEvent;

import static yourname.mods.yourmod.YourMod.id;

public class ModSounds {
    public static DeferredObject<SoundEvent> yourSound;

    public static void initialize(BalmSounds sounds) {
        yourSound = sounds.register(id("your_sound"));
    }
}
