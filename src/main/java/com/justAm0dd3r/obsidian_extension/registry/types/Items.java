package com.justAm0dd3r.obsidian_extension.registry.types;

import com.justAm0dd3r.obsidian_extension.config.Config;
import com.justAm0dd3r.obsidian_extension.objects.items.*;
import com.justAm0dd3r.obsidian_extension.reference.Reference;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Author: justAm0dd3r
 */
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
            OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate", () -> new ObsidianArmorItem(EquipmentSlot.CHEST));
            OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", () -> new ObsidianArmorItem(EquipmentSlot.HEAD));
            OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings", () -> new ObsidianArmorItem(EquipmentSlot.LEGS));
            OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots", () -> new ObsidianArmorItem(EquipmentSlot.FEET));
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
            OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> new ObsidianSwordItem(3, -2.4F));
            OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> new ObsidianAxeItem(6.0F, -3.1F));
            OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () -> new ObsidianPickaxeItem(1, -2.8F));
            OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () -> new ObsidianHoeItem(-2, -1.0F));
            OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> new ObsidianShovelItem(1.5F, -3.0F));
        }
    }
}