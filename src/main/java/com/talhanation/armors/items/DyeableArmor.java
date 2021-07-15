package com.talhanation.armors.items;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

import javax.annotation.Nonnull;

public class DyeableArmor extends ModArmor implements IDyeableArmorItem {

    public DyeableArmor(String name, IArmorMaterial material, EquipmentSlotType slot, Properties properties) {
        super(name, material, slot, properties);
    }

    public int getColor(@Nonnull ItemStack stack) {
        CompoundNBT nbt = stack.getTagElement("display");
        return (nbt != null && nbt.contains("color", 99)) ? nbt.getInt("color") : 14869989;
    }
}
