package com.justAm0dd3r.obsidian_extension.objects.tabs.groups;

import com.justAm0dd3r.obsidian_extension.registry.types.Blocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

/**
 * Author: justAm0dd3r
 */
public class ObsidianExtensionTab extends CreativeModeTab {
    public ObsidianExtensionTab() {
        super("obsidian_extension");
    }

    @Nonnull
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Blocks.blocks.get("crying_obsidian_stairs").get());
    }
}
