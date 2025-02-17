package yourname.mods.yourmod;

import net.blay09.mods.balm.api.Balm;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yourname.mods.yourmod.api.YourModAPI;
import yourname.mods.yourmod.block.ModBlocks;
import yourname.mods.yourmod.block.entity.ModBlockEntities;
import yourname.mods.yourmod.command.ModCommands;
import yourname.mods.yourmod.entity.ModEntities;
import yourname.mods.yourmod.item.ModItems;
import yourname.mods.yourmod.loot.ModLoot;
import yourname.mods.yourmod.menu.ModMenus;
import yourname.mods.yourmod.network.ModNetworking;
import yourname.mods.yourmod.recipe.ModRecipeTypes;
import yourname.mods.yourmod.sound.ModSounds;
import yourname.mods.yourmod.stats.ModStats;
import yourname.mods.yourmod.worldgen.ModWorldGen;

public class YourMod {

    public static final Logger logger = LoggerFactory.getLogger(YourMod.class);

    public static final String MOD_ID = "yourmod";

    public static void initialize() {
        YourModAPI.__setupAPI(new InternalMethodsImpl());

        YourModConfig.initialize();
        ModBlocks.initialize(Balm.getBlocks());
        ModBlockEntities.initialize(Balm.getBlockEntities());
        ModEntities.initialize(Balm.getEntities());
        ModItems.initialize(Balm.getItems());
        ModMenus.initialize(Balm.getMenus());
        ModLoot.initialize(Balm.getLootTables());
        ModRecipeTypes.initialize(Balm.getRecipes());
        ModStats.initialize(Balm.getStats());
        ModWorldGen.initialize(Balm.getWorldGen());
        ModNetworking.initialize(Balm.getNetworking());
        ModCommands.initialize(Balm.getCommands());
        ModSounds.initialize(Balm.getSounds());
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

}
