package com.justAm0dd3r.obsidian_extension.filters;

import com.justAm0dd3r.obsidian_extension.registry.types.Blocks;
import com.justAm0dd3r.obsidian_extension.registry.types.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.ModList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FiltersRebornManager {
    private static final Logger LOGGER = LogManager.getLogger();
    public static void addFiltersWhenLoaded() {
        if (ModList.get().isLoaded("filters")) {
            // Filters Reborn Mod is loaded -> add the filters.
            addFilters();
        }
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public static boolean isFiltersLoaded() {
        return ModList.get().isLoaded("filters");
    }

    private static void addFilters() {
        addFilter("armor", Items.OBSIDIAN_CHESTPLATE.get());
        addFilter("buttons", Blocks.OBSIDIAN_BUTTON.get());
        addFilter("doors", Blocks.OBSIDIAN_DOOR.get());
        addFilter("pressure_plates", Blocks.OBSIDIAN_PRESSURE_PLATE.get());
        addFilter("slabs", Blocks.OBSIDIAN_SLAB.get());
        addFilter("stairs", Blocks.OBSIDIAN_STAIRS.get());
        addFilter("tools", Items.OBSIDIAN_PICKAXE.get());
        addFilter("walls", Blocks.OBSIDIAN_WALL.get());
    }

    private static void addFilter(String tagName, Item item) {
        //Filters.get().register(Tabs.OBSIDIAN_EXTENSION_TAB, new ResourceLocation(Reference.MOD_ID,"obsidian_extension_tab/" + tagName), new ItemStack(item));
    }

    private static void addFilter(String tagName, Block block) {
        //Filters.get().register(Tabs.OBSIDIAN_EXTENSION_TAB, new ResourceLocation(Reference.MOD_ID,"obsidian_extension_tab/" + tagName), new ItemStack(block));
    }
}
