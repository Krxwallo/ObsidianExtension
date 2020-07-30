package com.justAm0dd3r.obsidian_extension.objects;

import net.minecraft.nbt.CompoundNBT;

public class NBT {
    public static final CompoundNBT unbreakable;
    static {
        unbreakable = new CompoundNBT();
        unbreakable.putBoolean("Unbreakable", true);
    }
}
