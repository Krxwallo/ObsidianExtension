package com.justAm0dd3r.obsidian_extension.registry.types;

import com.justAm0dd3r.obsidian_extension.config.Config;
import com.justAm0dd3r.obsidian_extension.objects.armor_materials.ArmorMaterials;
import com.justAm0dd3r.obsidian_extension.objects.item_tiers.ItemTiers;
import com.justAm0dd3r.obsidian_extension.objects.items.*;
import com.justAm0dd3r.obsidian_extension.objects.tabs.Tabs;
import com.justAm0dd3r.obsidian_extension.reference.Reference;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.level.block.Blocks.OBSIDIAN;

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
                    ArmorMaterials.OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(Tabs.getFromBlock(OBSIDIAN))));
            OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", () -> new ObsidianArmorItem(
                    ArmorMaterials.OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(Tabs.getFromBlock(OBSIDIAN))));
            OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings", () -> new ObsidianArmorItem(
                    ArmorMaterials.OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(Tabs.getFromBlock(OBSIDIAN))));
            OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots", () -> new ObsidianArmorItem(
                    ArmorMaterials.OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(Tabs.getFromBlock(OBSIDIAN))));

        }
    }

    // Tools
    public static RegistryObject<Item> OBSIDIAN_SWORD = null;
    public static RegistryObject<Item> OBSIDIAN_AXE = null;
    public static RegistryObject<Item> OBSIDIAN_PICKAXE = null;
    public static RegistryObject<Item> OBSIDIAN_HOE = null;
    public static RegistryObject<Item> OBSIDIAN_SHOVEL = null;
    static {
        if (Config.COMMON.enableTools.get()) {
            OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> new ObsidianSwordItem(
                    ItemTiers.OBSIDIAN_ITEM_TIER, 3, -2.4F,
                    new Item.Properties().tab(Tabs.getFromBlock(OBSIDIAN))));

            OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> new ObsidianAxeItem(
                    ItemTiers.OBSIDIAN_ITEM_TIER, 6.0F, -3.1F,
                    new Item.Properties().tab(Tabs.getFromBlock(OBSIDIAN))));

            OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () -> new ObsidianPickaxeItem(
                    ItemTiers.OBSIDIAN_ITEM_TIER, 1, -2.8F,
                    new Item.Properties().tab(Tabs.getFromBlock(OBSIDIAN))));

            OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () -> new ObsidianHoeItem(
                    ItemTiers.OBSIDIAN_ITEM_TIER, -2, -1.0F,
                    new Item.Properties().tab(Tabs.getFromBlock(OBSIDIAN))));

            OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> new ObsidianShovelItem(
                    ItemTiers.OBSIDIAN_ITEM_TIER, 1.5F, -3.0F,
                    new Item.Properties().tab(Tabs.getFromBlock(OBSIDIAN))));
        }
    }

    public static RegistryObject<Item> OBSIDIAN_BOAT = null;
    static {
        //OBSIDIAN_BOAT = ITEMS.register("obsidian_boat", () -> new BoatItem(BoatEntity.Type.OAK, new Item.Properties().maxStackSize(1).group(ItemGroups.getFromBlock(OBSIDIAN))));
    }
}