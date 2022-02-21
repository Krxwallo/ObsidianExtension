package com.justAm0dd3r.obsidian_extension.objects.armor_materials;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;

public class ObsidianArmorMaterial implements ArmorMaterial {

    @Override
    public int getDurabilityForSlot(@Nonnull EquipmentSlot slotIn) {
        return new int[]{13, 15, 16, 11}[slotIn.getIndex()] * 66;
    }

    @Override
    public int getDefenseForSlot(@Nonnull EquipmentSlot slotIn) {
        return (new int[]{3, 6, 8, 3}[slotIn.getIndex()]);
    }

    @Override
    public int getEnchantmentValue() {
        return 9;
    }

    @Nonnull
    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_DIAMOND;
    }

    @Nonnull
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(new ItemStack(Items.OBSIDIAN));
    }

    @OnlyIn(Dist.CLIENT)
    @Nonnull
    @Override
    public String getName() {
        return "obsidian";
    }

    @Override
    public float getToughness() {
        return 2.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 1.0F;
    }
}
