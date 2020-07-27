package com.justAm0dd3r.obsidian_extension.registry.types;

import com.justAm0dd3r.obsidian_extension.item_groups.ItemGroups;
import com.justAm0dd3r.obsidian_extension.objects.block_items.BlockItemBase;
import com.justAm0dd3r.obsidian_extension.reference.Reference;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.item.TallBlockItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.justAm0dd3r.obsidian_extension.registry.types.Items.ITEMS;
import static net.minecraft.block.Blocks.*; // field_235399_ni_ equals CRYING_OBSIDIAN

/**
 * Author: justAm0dd3r
 */
@SuppressWarnings("unused")
public class Blocks {
    private static final Block CRYING_OBSIDIAN = field_235399_ni_; // equals crying obsidian
    
    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    // Stairs and Slabs
    public static final RegistryObject<Block> OBSIDIAN_SLAB= BLOCKS.register("obsidian_slab", () -> new SlabBlock(Block.Properties.from(OBSIDIAN).harvestLevel(3)));
    public static final RegistryObject<Item> OBSIDIAN_SLAB_ITEM = ITEMS.register("obsidian_slab", () -> new BlockItemBase(OBSIDIAN_SLAB.get()));
    public static final RegistryObject<Block> OBSIDIAN_STAIRS= BLOCKS.register("obsidian_stairs", () -> new StairsBlock(OBSIDIAN::getDefaultState, Block.Properties.from(OBSIDIAN).harvestLevel(4)));
    public static final RegistryObject<Item> OBSIDIAN_STAIRS_ITEM = ITEMS.register("obsidian_stairs", () -> new BlockItemBase(OBSIDIAN_STAIRS.get()));
    public static final RegistryObject<Block> CRYING_OBSIDIAN_SLAB= BLOCKS.register("crying_obsidian_slab", () -> new SlabBlock(Block.Properties.from(CRYING_OBSIDIAN).harvestLevel(3)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_SLAB_ITEM = ITEMS.register("crying_obsidian_slab", () -> new BlockItemBase(CRYING_OBSIDIAN_SLAB.get()));
    public static final RegistryObject<Block> CRYING_OBSIDIAN_STAIRS= BLOCKS.register("crying_obsidian_stairs", () -> new StairsBlock(CRYING_OBSIDIAN::getDefaultState, Block.Properties.from(CRYING_OBSIDIAN).harvestLevel(3)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_STAIRS_ITEM = ITEMS.register("crying_obsidian_stairs", () -> new BlockItemBase(CRYING_OBSIDIAN_STAIRS.get()));

    // Buttons
    public static final RegistryObject<Block> OBSIDIAN_BUTTON = BLOCKS.register("obsidian_button", () -> new StoneButtonBlock(AbstractBlock.Properties.from(OBSIDIAN)));
    public static final RegistryObject<Item> OBSIDIAN_BUTTON_ITEM = ITEMS.register("obsidian_button", () -> new BlockItemBase(OBSIDIAN_BUTTON.get()));

    public static final RegistryObject<Block> CRYING_OBSIDIAN_BUTTON = BLOCKS.register("crying_obsidian_button", () -> new StoneButtonBlock(AbstractBlock.Properties.from(CRYING_OBSIDIAN)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_BUTTON_ITEM = ITEMS.register("crying_obsidian_button", () -> new BlockItemBase(CRYING_OBSIDIAN_BUTTON.get()));

    // Walls
    public static final RegistryObject<Block> OBSIDIAN_WALL = BLOCKS.register("obsidian_wall", () -> new WallBlock(AbstractBlock.Properties.from(OBSIDIAN)));
    public static final RegistryObject<Item> OBSIDIAN_WALL_ITEM = ITEMS.register("obsidian_wall", () -> new BlockItemBase(OBSIDIAN_WALL.get()));

    public static final RegistryObject<Block> CRYING_OBSIDIAN_WALL = BLOCKS.register("crying_obsidian_wall", () -> new WallBlock(AbstractBlock.Properties.from(CRYING_OBSIDIAN)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_WALL_ITEM = ITEMS.register("crying_obsidian_wall", () -> new BlockItemBase(CRYING_OBSIDIAN_WALL.get()));

    // Doors
    public static final RegistryObject<Block> OBSIDIAN_DOOR = BLOCKS.register("obsidian_door", () -> new DoorBlock(AbstractBlock.Properties.from(OBSIDIAN).func_235861_h_().notSolid()));
    public static final RegistryObject<Item> OBSIDIAN_DOOR_ITEM = ITEMS.register("obsidian_door", () -> new TallBlockItem(OBSIDIAN_DOOR.get(),
            new Item.Properties().group(ItemGroups.OBSIDIAN_VARIANTS_TAB)));

    public static final RegistryObject<Block> CRYING_OBSIDIAN_DOOR = BLOCKS.register("crying_obsidian_door", () -> new DoorBlock(AbstractBlock.Properties.from(CRYING_OBSIDIAN).func_235861_h_().notSolid()));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_DOOR_ITEM = ITEMS.register("crying_obsidian_door", () -> new TallBlockItem(CRYING_OBSIDIAN_DOOR.get(),
            new Item.Properties().group(ItemGroups.CRYING_OBSIDIAN_VARIANTS_TAB)));

    // Pressure Plates
    public static final RegistryObject<Block> OBSIDIAN_PRESSURE_PLATE = BLOCKS.register("obsidian_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, AbstractBlock.Properties.from(OBSIDIAN)));
    public static final RegistryObject<Item> OBSIDIAN_PRESSURE_PLATE_ITEM = ITEMS.register("obsidian_pressure_plate",
            () -> new BlockItemBase(OBSIDIAN_PRESSURE_PLATE.get()));

    public static final RegistryObject<Block> CRYING_OBSIDIAN_PRESSURE_PLATE = BLOCKS.register("crying_obsidian_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, AbstractBlock.Properties.from(CRYING_OBSIDIAN)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_PRESSURE_PLATE_ITEM = ITEMS.register("crying_obsidian_pressure_plate",
            () -> new BlockItemBase(CRYING_OBSIDIAN_PRESSURE_PLATE.get()));
}
