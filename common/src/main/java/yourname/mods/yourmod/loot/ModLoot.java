package yourname.mods.yourmod.loot;

import net.blay09.mods.balm.api.loot.BalmLootTables;

import static yourname.mods.yourmod.YourMod.id;

public class ModLoot {

    public static void initialize(BalmLootTables lootTables) {
        lootTables.registerLootModifier(id("your_loot_modifier"), new YourLootModifier());
    }

}
