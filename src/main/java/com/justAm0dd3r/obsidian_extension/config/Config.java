package com.justAm0dd3r.obsidian_extension.config;

import com.justAm0dd3r.obsidian_extension.reference.Reference;
import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class Config {

    public static class Common {

        public final ForgeConfigSpec.BooleanValue enableArmour;

        public Common(ForgeConfigSpec.Builder builder) {
            builder.comment("Obsidian Extension Mod Configurations")
                   .push(Reference.MOD_ID);

            enableArmour = builder
                    .comment("Enable obsidian and crying obsidian armour? (default: true)")
                    .worldRestart()
                    .define("enable_armour", true);

            builder.pop();
        }
    }

    public static final ForgeConfigSpec COMMON_SPEC;
    public static final Common COMMON;
    static {
        final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
        COMMON_SPEC = specPair.getRight();
        COMMON = specPair.getLeft();
    }
}
