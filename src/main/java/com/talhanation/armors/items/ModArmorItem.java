package com.talhanation.armors.items;
import com.talhanation.armors.ModArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;


public class ModArmorItem extends ArmorItem {

    private static Item.Properties defaultArmorProperties() {
        return (new Item.Properties()).stacksTo(1).tab(ItemGroup.TAB_COMBAT);
    }

    public ModArmorItem(IArmorMaterial material, EquipmentSlotType slot) {
        this(material, slot, defaultArmorProperties(), null);
    }

    public ModArmorItem(IArmorMaterial material, EquipmentSlotType slot, String specialTex) {
        this(material, slot, defaultArmorProperties(), specialTex);
    }

    public ModArmorItem(IArmorMaterial material, EquipmentSlotType slot, Item.Properties properties) {
        this(material, slot, properties, null);
    }

    public ModArmorItem(IArmorMaterial material, EquipmentSlotType slot, Item.Properties properties, String specialTex) {
        super(material, slot, properties);
    }

    public ModArmorItem(ModArmorMaterials material, EquipmentSlotType slot) {
        this(material.iModArmorMaterial(), slot);
    }

    public ModArmorItem(ModArmorMaterials material, EquipmentSlotType slot, String specialTex) {
        this(material.iModArmorMaterial(), slot, specialTex);
    }

    public ModArmorItem(ModArmorMaterials material, EquipmentSlotType slot, Item.Properties properties) {
        this(material.iModArmorMaterial(), slot, properties, null);
    }
    /*
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        if (this.specialTextureName == null)
            return super.getArmorTexture(stack, entity, slot, type);
        ArmorItem item = (ArmorItem)stack.getItem();
        String materialName = item.getArmorMaterial().getName();
        String domain = "minecraft";
        int idx = materialName.indexOf(':');
        if (idx != -1) {
            domain = materialName.substring(0, idx);
            materialName = materialName.substring(idx + 1);
        }
        String texturePath = String.format("%s:textures/models/armor/%s_%s%s.png", new Object[] { domain, materialName, this.specialTextureName, (type == null) ? "" : String.format("_%s", new Object[] { type }) });
        return texturePath;
    }
    */
}
