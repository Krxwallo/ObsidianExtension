package com.justAm0dd3r.obsidian_extension.registry.types;

import com.justAm0dd3r.obsidian_extension.objects.block_items.BlockItemBase;
import com.justAm0dd3r.obsidian_extension.objects.tabs.Tabs;
import com.justAm0dd3r.obsidian_extension.reference.Reference;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.justAm0dd3r.obsidian_extension.registry.types.Items.ITEMS;
import static net.minecraft.world.level.block.Blocks.CRYING_OBSIDIAN;
import static net.minecraft.world.level.block.Blocks.OBSIDIAN;

/**
 * Author: justAm0dd3r
 */
@SuppressWarnings("unused")
// TODO Fix unbreakable
public class Blocks {
    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    // Stairs and Slabs
    public static final RegistryObject<Block> OBSIDIAN_SLAB = BLOCKS.register("obsidian_slab", () -> new SlabBlock(Block.Properties.copy(OBSIDIAN)/*.harvestLevel(3)*/));
    public static final RegistryObject<Item> OBSIDIAN_SLAB_ITEM = ITEMS.register("obsidian_slab", () -> new BlockItemBase(OBSIDIAN_SLAB.get()));
    public static final RegistryObject<Block> OBSIDIAN_STAIRS = BLOCKS.register("obsidian_stairs", () -> new StairBlock(OBSIDIAN::defaultBlockState, Block.Properties.copy(OBSIDIAN)/*.harvestLevel(4)*/));
    public static final RegistryObject<Item> OBSIDIAN_STAIRS_ITEM = ITEMS.register("obsidian_stairs", () -> new BlockItemBase(OBSIDIAN_STAIRS.get()));

    public static final RegistryObject<Block> CRYING_OBSIDIAN_SLAB = BLOCKS.register("crying_obsidian_slab", () -> new SlabBlock(Block.Properties.copy(CRYING_OBSIDIAN)/*.harvestLevel(3)*/));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_SLAB_ITEM = ITEMS.register("crying_obsidian_slab", () -> new BlockItemBase(CRYING_OBSIDIAN_SLAB.get()));
    public static final RegistryObject<Block> CRYING_OBSIDIAN_STAIRS = BLOCKS.register("crying_obsidian_stairs", () -> new StairBlock(CRYING_OBSIDIAN::defaultBlockState, Block.Properties.copy(CRYING_OBSIDIAN)/*.harvestLevel(3)*/));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_STAIRS_ITEM = ITEMS.register("crying_obsidian_stairs", () -> new BlockItemBase(CRYING_OBSIDIAN_STAIRS.get()));

    // Buttons
    public static final RegistryObject<Block> OBSIDIAN_BUTTON = BLOCKS.register("obsidian_button", () -> new StoneButtonBlock(Block.Properties.copy(OBSIDIAN)));
    public static final RegistryObject<Item> OBSIDIAN_BUTTON_ITEM = ITEMS.register("obsidian_button", () -> new BlockItemBase(OBSIDIAN_BUTTON.get()));

    public static final RegistryObject<Block> CRYING_OBSIDIAN_BUTTON = BLOCKS.register("crying_obsidian_button", () -> new StoneButtonBlock(Block.Properties.copy(CRYING_OBSIDIAN)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_BUTTON_ITEM = ITEMS.register("crying_obsidian_button", () -> new BlockItemBase(CRYING_OBSIDIAN_BUTTON.get()));

    // Walls
    public static final RegistryObject<Block> OBSIDIAN_WALL = BLOCKS.register("obsidian_wall", () -> new WallBlock(Block.Properties.copy(OBSIDIAN)));
    public static final RegistryObject<Item> OBSIDIAN_WALL_ITEM = ITEMS.register("obsidian_wall", () -> new BlockItemBase(OBSIDIAN_WALL.get()));

    public static final RegistryObject<Block> CRYING_OBSIDIAN_WALL = BLOCKS.register("crying_obsidian_wall", () -> new WallBlock(Block.Properties.copy(CRYING_OBSIDIAN)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_WALL_ITEM = ITEMS.register("crying_obsidian_wall", () -> new BlockItemBase(CRYING_OBSIDIAN_WALL.get()));

    // Doors
    public static final RegistryObject<Block> OBSIDIAN_DOOR = BLOCKS.register("obsidian_door", () -> new DoorBlock(Block.Properties.copy(OBSIDIAN)/*.func_235861_h_()*/.dynamicShape()));
    public static final RegistryObject<Item> OBSIDIAN_DOOR_ITEM = ITEMS.register("obsidian_door", () -> new DoubleHighBlockItem(OBSIDIAN_DOOR.get(),
            new Item.Properties().tab(Tabs.getFromBlock(OBSIDIAN))));

    public static final RegistryObject<Block> CRYING_OBSIDIAN_DOOR = BLOCKS.register("crying_obsidian_door", () -> new DoorBlock(Block.Properties.copy(CRYING_OBSIDIAN)/*.func_235861_h_()*/.dynamicShape()));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_DOOR_ITEM = ITEMS.register("crying_obsidian_door", () -> new DoubleHighBlockItem(CRYING_OBSIDIAN_DOOR.get(),
            new Item.Properties().tab(Tabs.getFromBlock(CRYING_OBSIDIAN))));

    // Pressure Plates
    public static final RegistryObject<Block> OBSIDIAN_PRESSURE_PLATE = BLOCKS.register("obsidian_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(OBSIDIAN)));
    public static final RegistryObject<Item> OBSIDIAN_PRESSURE_PLATE_ITEM = ITEMS.register("obsidian_pressure_plate",
            () -> new BlockItemBase(OBSIDIAN_PRESSURE_PLATE.get()));

    public static final RegistryObject<Block> CRYING_OBSIDIAN_PRESSURE_PLATE = BLOCKS.register("crying_obsidian_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(CRYING_OBSIDIAN)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_PRESSURE_PLATE_ITEM = ITEMS.register("crying_obsidian_pressure_plate",
            () -> new BlockItemBase(CRYING_OBSIDIAN_PRESSURE_PLATE.get()));
}
