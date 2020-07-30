package com.justAm0dd3r.obsidian_extension.objects.armor_materials;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;

public class ObsidianArmorMaterial implements IArmorMaterial {

    @Override
    public int getDurability(@Nonnull EquipmentSlotType slotIn) {
        return new int[]{13, 15, 16, 11}[slotIn.getIndex()] * 66;
    }

    @Override
    public int getDamageReductionAmount(@Nonnull EquipmentSlotType slotIn) {
        return (new int[]{3, 6, 8, 3}[slotIn.getIndex()]);
    }

    @Override
    public int getEnchantability() {
        return 9;
    }

    @Nonnull
    @Override
    public SoundEvent getSoundEvent() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Nonnull
    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromStacks(new ItemStack(Items.OBSIDIAN));
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
    public float func_230304_f_() {
        return 0.0F;
    }
}
