package com.justAm0dd3r.obsidian_extension.events;

import com.justAm0dd3r.obsidian_extension.registry.types.Items;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber
public class Events {
    private static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public static void onEntityPickupEvent(EntityItemPickupEvent event) {
        LOGGER.debug("onEntityPickupEvent called.");
    }

    @SubscribeEvent
    public static void enchantSaturationFunction(LivingEquipmentChangeEvent event) {
        LOGGER.debug("enchantSaturationFunction() called.");

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
