package com.justAm0dd3r.obsidian_extension.item_groups.groups;

import com.justAm0dd3r.obsidian_extension.registry.types.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ObsidianVariantsTab extends ItemGroup {
    public ObsidianVariantsTab() {
        super("obsidian_variants");
    }

    @Nonnull
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Blocks.OBSIDIAN_STAIRS.get());
    }
}
