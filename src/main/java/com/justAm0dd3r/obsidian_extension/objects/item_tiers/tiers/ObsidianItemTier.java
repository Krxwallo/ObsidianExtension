package com.justAm0dd3r.obsidian_extension.objects.item_tiers.tiers;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

import javax.annotation.Nonnull;

public class ObsidianItemTier implements IItemTier {
    @Override
    public int getMaxUses() {
        return 131; // Iron, but it doesn't matter...
    }

    @Override
    public float getEfficiency() {
        return 6.0F; // Iron
    }

    @Override
    public float getAttackDamage() {
        return 2.0F; // Iron
    }

    @Override
    public int getHarvestLevel() {
        return 3; // Diamond
    }

    @Override
    public int getEnchantability() {
        return 5; // Stone
    }

    @Nonnull
    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(Items.OBSIDIAN); // Obsidian
    }
}
