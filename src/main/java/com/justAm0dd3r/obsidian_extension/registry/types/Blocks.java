package com.justAm0dd3r.obsidian_extension.registry.types;

import com.justAm0dd3r.obsidian_extension.objects.block_items.BlockItemBase;
import com.justAm0dd3r.obsidian_extension.objects.blocks.ObsidianDoorBlock;
import com.justAm0dd3r.obsidian_extension.objects.tabs.Tabs;
import com.justAm0dd3r.obsidian_extension.reference.Reference;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;

import static com.justAm0dd3r.obsidian_extension.registry.types.Items.ITEMS;
import static net.minecraft.world.level.block.Blocks.CRYING_OBSIDIAN;
import static net.minecraft.world.level.block.Blocks.OBSIDIAN;

/**
 * Author: justAm0dd3r
 */
public class Blocks {
    public static void init() {
        registerBlocksFor("obsidian", OBSIDIAN);
        registerBlocksFor("crying_obsidian", CRYING_OBSIDIAN);

        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static HashMap<String, RegistryObject<Block>> blocks = new HashMap<>();

    private static BlockBehaviour.Properties properties(Block block) {
        return BlockBehaviour.Properties.copy(block).strength(40F, 1200.0F);
    }

    private static void registerBlocksFor(String name, Block block) {
        var properties = properties(block);
        // Blocks
        String slabName = name + "_slab";
        String stairsName = name + "_stairs";
        String wallName = name + "_wall";
        String doorName = name + "_door";
        String pressurePlateName = name + "_pressure_plate";
        RegistryObject<Block> slab = BLOCKS.register(slabName, () -> new SlabBlock(properties));
        RegistryObject<Block> stairs = BLOCKS.register(stairsName, () -> new StairBlock(block::defaultBlockState, properties));
        RegistryObject<Block> wall = BLOCKS.register(wallName, () -> new WallBlock(properties));
        RegistryObject<Block> door = BLOCKS.register(doorName, () -> new ObsidianDoorBlock(BlockBehaviour.Properties.copy(block).dynamicShape()));
        RegistryObject<Block> pressurePlate = BLOCKS.register(pressurePlateName, () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, properties(block).dynamicShape()));

        blocks.put(slabName, slab);
        blocks.put(stairsName, stairs);
        blocks.put(wallName, wall);
        blocks.put(doorName, door);
        blocks.put(pressurePlateName, pressurePlate);

        // Items
        ITEMS.register(slabName, () -> new BlockItemBase(slab.get()));
        ITEMS.register(stairsName, () -> new BlockItemBase(stairs.get()));
        ITEMS.register(wallName, () -> new BlockItemBase(wall.get()));
        ITEMS.register(doorName, () -> new DoubleHighBlockItem(door.get(), new Item.Properties().tab(Tabs.getFromBlock(block))));
        ITEMS.register(pressurePlateName, () -> new BlockItemBase(pressurePlate.get()));

        // Button
        BlockBehaviour.Properties buttonProperties = properties(block).noCollission().strength(15F);
        String buttonName = name + "_button";
        RegistryObject<Block> button = BLOCKS.register(buttonName, () -> new StoneButtonBlock(buttonProperties));
        ITEMS.register(buttonName, () -> new BlockItemBase(button.get()));
        blocks.put(buttonName, button);
    }

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);
}
