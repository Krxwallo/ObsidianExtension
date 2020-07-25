package com.justAm0dd3r.obsidian_extension.objects.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;

public class ObsidianArmorItem extends ArmorItem {
    public ObsidianArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties p_i48534_3_) {
        super(materialIn, slot, p_i48534_3_);
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        //noinspection ConstantConditions
        player.addPotionEffect(new EffectInstance(Effect.get(2), 1));
    }
}
