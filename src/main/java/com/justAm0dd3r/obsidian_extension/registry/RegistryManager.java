package com.justAm0dd3r.obsidian_extension.registry;

import com.justAm0dd3r.obsidian_extension.registry.types.Blocks;
import com.justAm0dd3r.obsidian_extension.registry.types.Items;

public class RegistryManager {
    public static void init() {
        Blocks.init();
        Items.init();
    }
}