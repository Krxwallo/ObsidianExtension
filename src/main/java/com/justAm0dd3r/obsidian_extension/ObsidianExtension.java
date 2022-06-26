package com.justAm0dd3r.obsidian_extension;

import com.justAm0dd3r.obsidian_extension.config.Config;
import com.justAm0dd3r.obsidian_extension.datagen.BlockTagGen;
import com.justAm0dd3r.obsidian_extension.filters.FiltersRebornManager;
import com.justAm0dd3r.obsidian_extension.reference.Reference;
import com.justAm0dd3r.obsidian_extension.registry.RegistryManager;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Author: justAm0dd3r
 */
@Mod(Reference.MOD_ID)
public class ObsidianExtension
{
    public static final Logger LOGGER = LogManager.getLogger();

    public ObsidianExtension() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_SPEC, Reference.MOD_ID + "-common.toml");
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onGatherData);

        RegistryManager.registerAll(); // Registries (Blocks, Items)
    }

    public void onClientSetup(FMLClientSetupEvent event) {
        FiltersRebornManager.addFiltersWhenLoaded();
    }

    public void onGatherData(GatherDataEvent event) {
        LOGGER.info("Gather Data Event");
        var generator = event.getGenerator();
        generator.addProvider(event.includeServer(), new BlockTagGen(generator, event.getExistingFileHelper()));
    }
}
