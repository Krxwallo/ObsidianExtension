package com.justAm0dd3r.obsidian_extension.objects.tabs.groups;

import com.justAm0dd3r.obsidian_extension.registry.types.Blocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

/**
 * Author: justAm0dd3r
 */
public class ObsidianStuffTab extends CreativeModeTab {
    public ObsidianStuffTab() {
        super("obsidian_stuff");
    }

    @Nonnull
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Blocks.OBSIDIAN_STAIRS.get());
    }
}
