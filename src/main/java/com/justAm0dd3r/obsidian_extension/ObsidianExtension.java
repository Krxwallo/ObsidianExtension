package com.justAm0dd3r.obsidian_extension;

import com.justAm0dd3r.obsidian_extension.config.Config;
import com.justAm0dd3r.obsidian_extension.filters.FiltersRebornManager;
import com.justAm0dd3r.obsidian_extension.reference.Reference;
import com.justAm0dd3r.obsidian_extension.registry.RegistryManager;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Author: justAm0dd3r
 */
@Mod(Reference.MOD_ID)
public class ObsidianExtension
{
    private static final Logger LOGGER = LogManager.getLogger();

    public ObsidianExtension() {
        LOGGER.info(Reference.MOD_NAME + " Version " + Reference.VERSION + " by " + Reference.AUTHOR + " started up.");

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_SPEC, Reference.MOD_ID + "-common.toml");
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);

        RegistryManager.registerAll(); // Registries (Blocks, Items)
    }

    public void onClientSetup(FMLClientSetupEvent event) {
        FiltersRebornManager.addFiltersWhenLoaded();
    }
}
