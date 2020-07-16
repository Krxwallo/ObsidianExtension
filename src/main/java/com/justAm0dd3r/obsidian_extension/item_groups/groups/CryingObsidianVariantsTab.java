package com.justAm0dd3r.obsidian_extension.item_groups.groups;

import com.justAm0dd3r.obsidian_extension.registry.types.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

/**
 * Author: justAm0dd3r
 */
public class CryingObsidianVariantsTab extends ItemGroup {
    public CryingObsidianVariantsTab() {
        super("crying_obsidian_variants");
    }

    @Nonnull
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Blocks.CRYING_OBSIDIAN_STAIRS.get());
    }
}
