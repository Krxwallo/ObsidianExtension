package com.justAm0dd3r.obsidian_extension.objects.item_groups;

import com.justAm0dd3r.obsidian_extension.ObsidianExtension;
import com.justAm0dd3r.obsidian_extension.filters.FiltersRebornManager;
import com.justAm0dd3r.obsidian_extension.objects.item_groups.groups.CryingObsidianStuffTab;
import com.justAm0dd3r.obsidian_extension.objects.item_groups.groups.ObsidianExtensionTab;
import com.justAm0dd3r.obsidian_extension.objects.item_groups.groups.ObsidianStuffTab;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;

/**
 * Author: justAm0dd3r
 */
public class ItemGroups {
    public static ObsidianStuffTab OBSIDIAN_STUFF_TAB = null;
    public static CryingObsidianStuffTab CRYING_OBSIDIAN_STUFF_TAB = null;
    public static ObsidianExtensionTab OBSIDIAN_EXTENSION_TAB = null;

    static {
        if (!FiltersRebornManager.isFiltersLoaded()) {
            // "Register" the two default item groups.
            OBSIDIAN_STUFF_TAB = new ObsidianStuffTab();
            CRYING_OBSIDIAN_STUFF_TAB = new CryingObsidianStuffTab();
        }
        else {
            // Filters Reborn Mod is loaded -> only register one item group for the filters.
            OBSIDIAN_EXTENSION_TAB = new ObsidianExtensionTab();
        }
    }

    public static ItemGroup getFromBlock(Block block) {
        if (!FiltersRebornManager.isFiltersLoaded()) {
            String key = block.getTranslationKey();

            if (key.contains("crying_obsidian")) return CRYING_OBSIDIAN_STUFF_TAB;
            else return OBSIDIAN_STUFF_TAB;
        }
        else return OBSIDIAN_EXTENSION_TAB;
    }

}
