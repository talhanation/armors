package com.talhanation.armors.items;

import com.talhanation.armors.ModArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

import javax.annotation.Nonnull;

public class DyeableArmor extends ModArmorItem implements IDyeableArmorItem {

    public DyeableArmor(ModArmorMaterials material, EquipmentSlotType slot, Properties properties) {
        super(material, slot, properties);
    }

    public int getColor(@Nonnull ItemStack stack) {
        CompoundNBT nbt = stack.getTagElement("display");
        return (nbt != null && nbt.contains("color", 99)) ? nbt.getInt("color") : 14869989;
    }
}
