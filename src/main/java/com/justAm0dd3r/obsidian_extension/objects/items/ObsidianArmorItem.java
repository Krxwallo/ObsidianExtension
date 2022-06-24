package com.justAm0dd3r.obsidian_extension.objects.items;


import com.justAm0dd3r.obsidian_extension.objects.armor_materials.ArmorMaterials;
import com.justAm0dd3r.obsidian_extension.objects.tabs.Tabs;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import static net.minecraft.world.level.block.Blocks.OBSIDIAN;

public class ObsidianArmorItem extends ArmorItem {
    public ObsidianArmorItem(EquipmentSlot slot) {
        super(ArmorMaterials.OBSIDIAN_ARMOR_MATERIAL, slot, new Item.Properties().tab(Tabs.getFromBlock(OBSIDIAN)));
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        player.addEffect(new MobEffectInstance(MobEffect.byId(2)));
    }
}
