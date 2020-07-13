package com.justAm0dd3r.obsidian_extension.item_groups;

import com.justAm0dd3r.obsidian_extension.item_groups.groups.CryingObsidianVariantsTab;
import com.justAm0dd3r.obsidian_extension.item_groups.groups.ObsidianVariantsTab;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;

public class ItemGroups {
    public static final ObsidianVariantsTab OBSIDIAN_VARIANTS_TAB = new ObsidianVariantsTab();
    public static final CryingObsidianVariantsTab CRYING_OBSIDIAN_VARIANTS_TAB = new CryingObsidianVariantsTab();

    public static ItemGroup getFromBlock(Block block) {
        String key = block.getTranslationKey();

        if (key.contains("crying_obsidian")) return CRYING_OBSIDIAN_VARIANTS_TAB;
        else return OBSIDIAN_VARIANTS_TAB;
    }

}
