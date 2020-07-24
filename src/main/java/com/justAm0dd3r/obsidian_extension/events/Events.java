package com.justAm0dd3r.obsidian_extension.events;

import com.justAm0dd3r.obsidian_extension.armor_materials.ObsidianArmorMaterial;
import com.justAm0dd3r.obsidian_extension.registry.types.Items;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Events {

    @SubscribeEvent
    public static void enchantSaturationFunction(LivingEquipmentChangeEvent event) {
        EquipmentSlotType slotChanged = event.getSlot();
        if (slotChanged.getSlotIndex() > 0 && slotChanged.getSlotIndex() < 5) {
            ItemStack previousArmorPiece = event.getFrom();
            ItemStack newArmorPiece = event.getTo();

            if (previousArmorPiece != newArmorPiece) {
                if (newArmorPiece.getItem() == Items.OBSIDIAN_CHESTPLATE.get() || newArmorPiece.getItem() == Items.OBSIDIAN_BOOTS.get() || newArmorPiece.getItem() == Items.OBSIDIAN_LEGGINGS.get() || newArmorPiece.getItem() == Items.OBSIDIAN_HELMET.get()) {
                    // Give the player an infinite slowness effect because he has at least one piece of obsidian armor.
                    //noinspection ConstantConditions // Effect.get(2) will always return nonnull (Slowness)
                    event.getEntityLiving().addPotionEffect(new EffectInstance(Effect.get(2), 1000000));
                }

                else {
                    int noObsidianArmor = 0;
                    for (ItemStack armor : event.getEntityLiving().getArmorInventoryList()) {
                        if (armor.getItem() != Items.OBSIDIAN_CHESTPLATE.get() && armor.getItem() != Items.OBSIDIAN_BOOTS.get() &&
                                armor.getItem() != Items.OBSIDIAN_LEGGINGS.get() && armor.getItem() != Items.OBSIDIAN_HELMET.get()) {
                            noObsidianArmor++;
                        }
                    }
                    if (noObsidianArmor == 4) {
                        // The player has no obsidian armor anymore. Remove the slowness and knockback resistance
                        //noinspection ConstantConditions // Effect.get(2) will always return nonnull (Slowness)
                        event.getEntityLiving().removePotionEffect(Effect.get(2));
                    }
                }
            }
        }
    }
}
