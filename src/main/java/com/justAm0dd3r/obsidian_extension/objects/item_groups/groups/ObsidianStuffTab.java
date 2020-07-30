package com.justAm0dd3r.obsidian_extension.objects.item_groups.groups;

import com.justAm0dd3r.obsidian_extension.registry.types.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

/**
 * Author: justAm0dd3r
 */
public class ObsidianStuffTab extends ItemGroup {
    public ObsidianStuffTab() {
        super("obsidian_stuff");
    }

    @Nonnull
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Blocks.OBSIDIAN_STAIRS.get());
    }
}
