package com.justAm0dd3r.obsidian_extension.registry.types;

import com.justAm0dd3r.obsidian_extension.armor_materials.ArmorMaterials;
import com.justAm0dd3r.obsidian_extension.config.Config;
import com.justAm0dd3r.obsidian_extension.item_groups.ItemGroups;
import com.justAm0dd3r.obsidian_extension.reference.Reference;
import net.minecraft.inventory.EquipmentSlotType;
import com.justAm0dd3r.obsidian_extension.objects.items.ObsidianArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Author: justAm0dd3r
 */
@SuppressWarnings("unused")
public class Items {
    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    // Armor
    public static RegistryObject<Item> OBSIDIAN_CHESTPLATE = null;
    public static RegistryObject<Item> OBSIDIAN_HELMET = null;
    public static RegistryObject<Item> OBSIDIAN_BOOTS = null;
    public static RegistryObject<Item> OBSIDIAN_LEGGINGS = null;
    static {
        if (Config.COMMON.enableArmor.get()) {
            OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate", () -> new ObsidianArmorItem(
                    ArmorMaterials.OBSIDIAN_ARMOR_MATERIAL, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroups.OBSIDIAN_VARIANTS_TAB)));
            OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", () -> new ObsidianArmorItem(
                    ArmorMaterials.OBSIDIAN_ARMOR_MATERIAL, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroups.OBSIDIAN_VARIANTS_TAB)));
            OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings", () -> new ObsidianArmorItem(
                    ArmorMaterials.OBSIDIAN_ARMOR_MATERIAL, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroups.OBSIDIAN_VARIANTS_TAB)));
            OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots", () -> new ObsidianArmorItem(
                    ArmorMaterials.OBSIDIAN_ARMOR_MATERIAL, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroups.OBSIDIAN_VARIANTS_TAB)));
        }
    }
}