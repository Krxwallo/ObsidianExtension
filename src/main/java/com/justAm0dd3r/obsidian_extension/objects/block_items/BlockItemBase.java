package com.justAm0dd3r.obsidian_extension.objects.block_items;

import com.justAm0dd3r.obsidian_extension.item_groups.ItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block blockIn) {
        super(blockIn, new Properties().group(ItemGroups.getFromBlock(blockIn)));
    }
}
