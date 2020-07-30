package com.justAm0dd3r.obsidian_extension.events;

import com.justAm0dd3r.obsidian_extension.registry.types.Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.player.UseHoeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Events {
    @SubscribeEvent
    public void onHoeUse(UseHoeEvent event) {
        Item item = event.getPlayer().getHeldItem(event.getContext().getHand()).getItem();
        if (item.equals(Items.OBSIDIAN_HOE.get())) event.setResult(Event.Result.DENY);
    }
}
