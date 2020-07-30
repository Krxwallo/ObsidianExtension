package com.justAm0dd3r.obsidian_extension.objects.items;

import com.justAm0dd3r.obsidian_extension.objects.NBT;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class ObsidianShovelItem extends ShovelItem {
    public ObsidianShovelItem(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public void onCreated(@Nonnull ItemStack stack, @Nonnull World worldIn, @Nonnull PlayerEntity playerIn) {
        stack.getItem().updateItemStackNBT(NBT.unbreakable);
        super.onCreated(stack, worldIn, playerIn);
    }
}
