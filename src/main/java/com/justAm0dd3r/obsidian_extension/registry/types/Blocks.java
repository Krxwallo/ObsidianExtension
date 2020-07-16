package com.justAm0dd3r.obsidian_extension.registry.types;

import com.justAm0dd3r.obsidian_extension.objects.block_items.BlockItemBase;
import com.justAm0dd3r.obsidian_extension.reference.Reference;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.justAm0dd3r.obsidian_extension.registry.types.Items.ITEMS;
import static net.minecraft.block.Blocks.OBSIDIAN;
import static net.minecraft.block.Blocks.field_235399_ni_; // Crying Obsidian

/**
 * Author: justAm0dd3r
 */
@SuppressWarnings("unused")
public class Blocks {
    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    // Stairs and Slabs
    public static final RegistryObject<Block> OBSIDIAN_SLAB= BLOCKS.register("obsidian_slab", () -> new SlabBlock(Block.Properties.from(OBSIDIAN).harvestLevel(3)));
    public static final RegistryObject<Item> OBSIDIAN_SLAB_ITEM = ITEMS.register("obsidian_slab", () -> new BlockItemBase(OBSIDIAN_SLAB.get()));
    public static final RegistryObject<Block> OBSIDIAN_STAIRS= BLOCKS.register("obsidian_stairs", () -> new StairsBlock(OBSIDIAN::getDefaultState, Block.Properties.from(OBSIDIAN).harvestLevel(4)));
    public static final RegistryObject<Item> OBSIDIAN_STAIRS_ITEM = ITEMS.register("obsidian_stairs", () -> new BlockItemBase(OBSIDIAN_STAIRS.get()));
    public static final RegistryObject<Block> CRYING_OBSIDIAN_SLAB= BLOCKS.register("crying_obsidian_slab", () -> new SlabBlock(Block.Properties.from(field_235399_ni_).harvestLevel(3)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_SLAB_ITEM = ITEMS.register("crying_obsidian_slab", () -> new BlockItemBase(CRYING_OBSIDIAN_SLAB.get()));
    public static final RegistryObject<Block> CRYING_OBSIDIAN_STAIRS= BLOCKS.register("crying_obsidian_stairs", () -> new StairsBlock(field_235399_ni_::getDefaultState, Block.Properties.from(field_235399_ni_).harvestLevel(3)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_STAIRS_ITEM = ITEMS.register("crying_obsidian_stairs", () -> new BlockItemBase(CRYING_OBSIDIAN_STAIRS.get()));

    // Buttons
    public static final RegistryObject<Block> OBSIDIAN_BUTTON = BLOCKS.register("obsidian_button", () -> new StoneButtonBlock(AbstractBlock.Properties.from(OBSIDIAN)));
    public static final RegistryObject<Item> OBSIDIAN_BUTTON_ITEM = ITEMS.register("obsidian_button", () -> new BlockItemBase(OBSIDIAN_BUTTON.get()));

    public static final RegistryObject<Block> CRYING_OBSIDIAN_BUTTON = BLOCKS.register("crying_obsidian_button", () -> new StoneButtonBlock(AbstractBlock.Properties.from(field_235399_ni_)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_BUTTON_ITEM = ITEMS.register("crying_obsidian_button", () -> new BlockItemBase(CRYING_OBSIDIAN_BUTTON.get()));

    // Walls
    public static final RegistryObject<Block> OBSIDIAN_WALL = BLOCKS.register("obsidian_wall", () -> new WallBlock(AbstractBlock.Properties.from(OBSIDIAN)));
    public static final RegistryObject<Item> OBSIDIAN_WALL_ITEM = ITEMS.register("obsidian_wall", () -> new BlockItemBase(OBSIDIAN_WALL.get()));

    public static final RegistryObject<Block> CRYING_OBSIDIAN_WALL = BLOCKS.register("crying_obsidian_wall", () -> new WallBlock(AbstractBlock.Properties.from(field_235399_ni_)));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_WALL_ITEM = ITEMS.register("crying_obsidian_wall", () -> new BlockItemBase(CRYING_OBSIDIAN_WALL.get()));
}
