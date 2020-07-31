package com.justAm0dd3r.obsidian_extension.events;

import com.justAm0dd3r.obsidian_extension.registry.types.Items;
import net.minecraftforge.event.entity.player.UseHoeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber
public class Events {
    private static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public static void onHoeUse(UseHoeEvent event) {
        if (event.getContext().getItem().getItem().equals(Items.OBSIDIAN_HOE.get())) {
            LOGGER.debug("onHoeUse called.");
            event.getContext().getItem().setDamage(0);
        }
    }
}
