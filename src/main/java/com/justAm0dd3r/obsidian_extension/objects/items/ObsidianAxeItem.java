package com.justAm0dd3r.obsidian_extension.objects.items;

import com.justAm0dd3r.obsidian_extension.objects.item_tiers.ItemTiers;
import com.justAm0dd3r.obsidian_extension.objects.tabs.Tabs;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.world.level.block.Blocks.OBSIDIAN;

public class ObsidianAxeItem extends AxeItem {
    public ObsidianAxeItem(float attackDamageIn, float attackSpeedIn) {
        super(ItemTiers.OBSIDIAN_ITEM_TIER, attackDamageIn, attackSpeedIn, new Item.Properties().tab(Tabs.getFromBlock(OBSIDIAN)));
    }

    @Override public boolean mineBlock(@NotNull ItemStack stack, @NotNull Level world, @NotNull BlockState state, @NotNull BlockPos pos, @NotNull LivingEntity entity)  { return true; }
    @Override public boolean hurtEnemy(@NotNull ItemStack stack, @NotNull LivingEntity target, @NotNull LivingEntity attacker) { return true; }

    @Override
    public @NotNull InteractionResult useOn(@NotNull UseOnContext context) {
        InteractionResult result = super.useOn(context);
        setDamage(context.getItemInHand(), 0);
        return result;
    }
}
