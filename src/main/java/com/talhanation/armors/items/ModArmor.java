package com.talhanation.armors.items;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ModArmor extends ArmorItem {

    private final String armorPieceName;
    private boolean hasRender = false;
    private int damageModifier;

    public ModArmor(String name, IArmorMaterial material, EquipmentSlotType slot, Properties properties) {
        super(material, slot, properties);
        this.armorPieceName = name;
    }

    public ModArmor setDamageModifier(int percentage) {
        this.damageModifier = percentage;
        return this;
    }

    public ModArmor setHasRender() {
        this.hasRender = true;
        return this;
    }

    public int getMaxDamage(@Nonnull ItemStack stack) {
        return (this.damageModifier > 0) ? (super.getMaxDamage(stack) + super.getMaxDamage(stack) * this.damageModifier / 100) : super.getMaxDamage(stack);
    }

    public String getArmorTexture(@Nonnull ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return this.hasRender ? String.format("%s:textures/models/armor/%s.png", "atum", this.armorPieceName) : String.format("%s:textures/models/armor/%s_%d%s.png", "atum", this.armorPieceName, (slot == EquipmentSlotType.LEGS) ? 2 : 1, (type == null) ? "" : "_overlay");
    }
}
