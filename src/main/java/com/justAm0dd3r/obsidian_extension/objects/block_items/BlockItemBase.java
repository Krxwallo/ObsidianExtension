package com.justAm0dd3r.obsidian_extension.objects.block_items;

import com.justAm0dd3r.obsidian_extension.objects.tabs.Tabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

/**
 * Author: justAm0dd3r
 */
public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block blockIn) {
        super(blockIn, new Properties().tab(Tabs.getFromBlock(blockIn)));
    }
}
