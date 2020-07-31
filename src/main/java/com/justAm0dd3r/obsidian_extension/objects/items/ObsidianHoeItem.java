package com.justAm0dd3r.obsidian_extension.objects.items;

import com.justAm0dd3r.obsidian_extension.objects.NBT;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class ObsidianHoeItem extends HoeItem {
    public ObsidianHoeItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties p_i48460_4_) {
        super(tier, attackDamageIn, attackSpeedIn, p_i48460_4_);
    }

    @Override
    public boolean onBlockDestroyed(@Nonnull ItemStack stack, @Nonnull World worldIn, @Nonnull BlockState state, @Nonnull BlockPos pos, @Nonnull LivingEntity entityLiving) {
        return true;
    }

    @Override
    public boolean isDamageable() {
        return false;
    }

    @Override
    public boolean hitEntity(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {
        return true;
    }
}
