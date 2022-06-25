package com.justAm0dd3r.obsidian_extension.datagen;

import com.justAm0dd3r.obsidian_extension.reference.Reference;
import com.justAm0dd3r.obsidian_extension.registry.types.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import static com.justAm0dd3r.obsidian_extension.ObsidianExtension.LOGGER;

public class BlockTagGen extends BlockTagsProvider {
    public BlockTagGen(DataGenerator dataGenerator, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        LOGGER.info("Adding block tags");
        var mineableWithPickaxe = tag(BlockTags.MINEABLE_WITH_PICKAXE);
        var needsDiamondTool = tag(BlockTags.NEEDS_DIAMOND_TOOL);
        Blocks.BLOCKS.getEntries().stream()
                .filter(s -> s.get().defaultBlockState().getMaterial() == Material.STONE)
                .map(RegistryObject::get)
                .forEach(b -> {
                    mineableWithPickaxe.add(b);
                    needsDiamondTool.add(b);
                });
    }
}
