package com.justAm0dd3r.obsidian_extension;

import com.justAm0dd3r.obsidian_extension.reference.Reference;
import com.justAm0dd3r.obsidian_extension.registry.RegistryManager;
import net.minecraftforge.fml.common.Mod;
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

        RegistryManager.init();
    }

}
