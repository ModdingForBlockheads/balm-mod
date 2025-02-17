package yourname.mods.yourmod.stats;

import net.blay09.mods.balm.api.stats.BalmStats;
import net.minecraft.resources.ResourceLocation;

import static yourname.mods.yourmod.YourMod.id;

public class ModStats {
    public static final ResourceLocation yourStat = id("your_stat");

    public static void initialize(BalmStats stats) {
        stats.registerCustomStat(yourStat);
    }
}
