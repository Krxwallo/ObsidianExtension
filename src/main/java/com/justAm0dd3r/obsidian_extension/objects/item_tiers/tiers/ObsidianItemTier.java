package com.justAm0dd3r.obsidian_extension.objects.item_tiers.tiers;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.Nonnull;

public class ObsidianItemTier implements Tier {
    @Override
    public int getUses() {
        return 131; // Iron, but it doesn't matter...
    }

    @Override
    public float getSpeed() {
        return 6.0F; // Iron
    }

    @Override
    public float getAttackDamageBonus() {
        return 2.0F; // Iron
    }

    @Override
    public int getLevel() {
        return 3; // Diamond
    }

    @Override
    public int getEnchantmentValue() {
        return 5; // Stone
    }

    @Nonnull
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(Items.OBSIDIAN); // Obsidian
    }
}
