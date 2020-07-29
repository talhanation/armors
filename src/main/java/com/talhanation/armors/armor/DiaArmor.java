package com.talhanation.armors.armor;

import com.talhanation.armors.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class DiaArmor {



    public static final List<Item> ITEMS = new ArrayList<Item>();

    //dia + wool
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_DIA_WOOL = EnumHelper.addArmorMaterial("armor_material_dia_wool", Reference.MOD_ID + ":dia_wool", 35, new int[]{3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ItemArmor.ArmorMaterial RED_ARMOR_MATERIAL_DIA_WOOL = EnumHelper.addArmorMaterial("armor_material_dia_wool", Reference.MOD_ID + ":dia_wool", 35, new int[]{3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ItemArmor.ArmorMaterial ORANGE_ARMOR_MATERIAL_DIA_WOOL = EnumHelper.addArmorMaterial("armor_material_dia_wool", Reference.MOD_ID + ":dia_wool", 35, new int[]{3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ItemArmor.ArmorMaterial BROWN_ARMOR_MATERIAL_DIA_WOOL = EnumHelper.addArmorMaterial("armor_material_dia_wool", Reference.MOD_ID + ":dia_wool", 35, new int[]{3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ItemArmor.ArmorMaterial YELLOW_ARMOR_MATERIAL_DIA_WOOL = EnumHelper.addArmorMaterial("armor_material_dia_wool", Reference.MOD_ID + ":dia_wool", 35, new int[]{3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ItemArmor.ArmorMaterial LIME_ARMOR_MATERIAL_DIA_WOOL = EnumHelper.addArmorMaterial("armor_material_dia_wool", Reference.MOD_ID + ":dia_wool", 35, new int[]{3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ItemArmor.ArmorMaterial GREEN_ARMOR_MATERIAL_DIA_WOOL = EnumHelper.addArmorMaterial("armor_material_dia_wool", Reference.MOD_ID + ":dia_wool", 35, new int[]{3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ItemArmor.ArmorMaterial LIGHT_BLUE_ARMOR_MATERIAL_DIA_WOOL = EnumHelper.addArmorMaterial("armor_material_dia_wool", Reference.MOD_ID + ":dia_wool", 35, new int[]{3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ItemArmor.ArmorMaterial CYAN_ARMOR_MATERIAL_DIA_WOOL = EnumHelper.addArmorMaterial("armor_material_dia_wool", Reference.MOD_ID + ":dia_wool", 35, new int[]{3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ItemArmor.ArmorMaterial BLUE_ARMOR_MATERIAL_DIA_WOOL = EnumHelper.addArmorMaterial("armor_material_dia_wool", Reference.MOD_ID + ":dia_wool", 35, new int[]{3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ItemArmor.ArmorMaterial PURPLE_ARMOR_MATERIAL_DIA_WOOL = EnumHelper.addArmorMaterial("armor_material_dia_wool", Reference.MOD_ID + ":dia_wool", 35, new int[]{3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ItemArmor.ArmorMaterial MAGENTA_ARMOR_MATERIAL_DIA_WOOL = EnumHelper.addArmorMaterial("armor_material_dia_wool", Reference.MOD_ID + ":dia_wool", 35, new int[]{3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ItemArmor.ArmorMaterial PINK_ARMOR_MATERIAL_DIA_WOOL = EnumHelper.addArmorMaterial("armor_material_dia_wool", Reference.MOD_ID + ":dia_wool", 35, new int[]{3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ItemArmor.ArmorMaterial LIGHT_GRAY_ARMOR_MATERIAL_DIA_WOOL = EnumHelper.addArmorMaterial("armor_material_dia_wool", Reference.MOD_ID + ":dia_wool", 35, new int[]{3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ItemArmor.ArmorMaterial GRAY_ARMOR_MATERIAL_DIA_WOOL = EnumHelper.addArmorMaterial("armor_material_dia_wool", Reference.MOD_ID + ":dia_wool", 35, new int[]{3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ItemArmor.ArmorMaterial BLACK_ARMOR_MATERIAL_DIA_WOOL = EnumHelper.addArmorMaterial("armor_material_dia_wool", Reference.MOD_ID + ":dia_wool", 35, new int[]{3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    //Item dia + wool
    public static final Item DIA_WOOL_HELMET = new ArmorBase("dia_wool_helmet",ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item DIA_WOOL_CHESTPLATE = new ArmorBase("dia_wool_chestplate",ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item DIA_WOOL_LEGGINGS = new ArmorBase("dia_wool_leggings",ARMOR_MATERIAL_DIA_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item DIA_WOOL_BOOTS = new ArmorBase("dia_wool_boots",ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item RED_DIA_WOOL_HELMET = new ArmorBase("red_dia_wool_helmet",RED_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item RED_DIA_WOOL_CHESTPLATE = new ArmorBase("red_dia_wool_chestplate",RED_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item RED_DIA_WOOL_LEGGINGS = new ArmorBase("red_dia_wool_leggings",RED_ARMOR_MATERIAL_DIA_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item RED_DIA_WOOL_BOOTS = new ArmorBase("red_dia_wool_boots",RED_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item ORANGE_DIA_WOOL_HELMET = new ArmorBase("orange_dia_wool_helmet",ORANGE_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item ORANGE_DIA_WOOL_CHESTPLATE = new ArmorBase("orange_dia_wool_chestplate",ORANGE_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item ORANGE_DIA_WOOL_LEGGINGS = new ArmorBase("orange_dia_wool_leggings",ORANGE_ARMOR_MATERIAL_DIA_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item ORANGE_DIA_WOOL_BOOTS = new ArmorBase("orange_dia_wool_boots",ORANGE_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item MAGENTA_DIA_WOOL_HELMET = new ArmorBase("magenta_dia_wool_helmet",MAGENTA_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item MAGENTA_DIA_WOOL_CHESTPLATE = new ArmorBase("magenta_dia_wool_chestplate",MAGENTA_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item MAGENTA_DIA_WOOL_LEGGINGS = new ArmorBase("magenta_dia_wool_leggings",MAGENTA_ARMOR_MATERIAL_DIA_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item MAGENTA_DIA_WOOL_BOOTS = new ArmorBase("magenta_dia_wool_boots",MAGENTA_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item BROWN_DIA_WOOL_HELMET = new ArmorBase("brown_dia_wool_helmet",BROWN_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item BROWN_DIA_WOOL_CHESTPLATE = new ArmorBase("brown_dia_wool_chestplate",BROWN_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item BROWN_DIA_WOOL_LEGGINGS = new ArmorBase("brown_dia_wool_leggings",BROWN_ARMOR_MATERIAL_DIA_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item BROWN_DIA_WOOL_BOOTS = new ArmorBase("brown_dia_wool_boots",BROWN_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item YELLOW_DIA_WOOL_HELMET = new ArmorBase("yellow_dia_wool_helmet",YELLOW_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item YELLOW_DIA_WOOL_CHESTPLATE = new ArmorBase("yellow_dia_wool_chestplate",YELLOW_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item YELLOW_DIA_WOOL_LEGGINGS = new ArmorBase("yellow_dia_wool_leggings",YELLOW_ARMOR_MATERIAL_DIA_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item YELLOW_DIA_WOOL_BOOTS = new ArmorBase("yellow_dia_wool_boots",YELLOW_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item LIME_DIA_WOOL_HELMET = new ArmorBase("lime_dia_wool_helmet",LIME_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIME_DIA_WOOL_CHESTPLATE = new ArmorBase("lime_dia_wool_chestplate",LIME_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIME_DIA_WOOL_LEGGINGS = new ArmorBase("lime_dia_wool_leggings",LIME_ARMOR_MATERIAL_DIA_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIME_DIA_WOOL_BOOTS = new ArmorBase("lime_dia_wool_boots",LIME_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item GREEN_DIA_WOOL_HELMET = new ArmorBase("green_dia_wool_helmet",GREEN_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item GREEN_DIA_WOOL_CHESTPLATE = new ArmorBase("green_dia_wool_chestplate",GREEN_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item GREEN_DIA_WOOL_LEGGINGS = new ArmorBase("green_dia_wool_leggings",GREEN_ARMOR_MATERIAL_DIA_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item GREEN_DIA_WOOL_BOOTS = new ArmorBase("green_dia_wool_boots",GREEN_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item LIGHT_BLUE_DIA_WOOL_HELMET = new ArmorBase("light_blue_dia_wool_helmet",LIGHT_BLUE_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIGHT_BLUE_DIA_WOOL_CHESTPLATE = new ArmorBase("light_blue_dia_wool_chestplate",LIGHT_BLUE_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIGHT_BLUE_DIA_WOOL_LEGGINGS = new ArmorBase("light_blue_dia_wool_leggings",LIGHT_BLUE_ARMOR_MATERIAL_DIA_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIGHT_BLUE_DIA_WOOL_BOOTS = new ArmorBase("light_blue_dia_wool_boots",LIGHT_BLUE_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item CYAN_BLUE_DIA_WOOL_HELMET = new ArmorBase("cyan_dia_wool_helmet",CYAN_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item CYAN_BLUE_DIA_WOOL_CHESTPLATE = new ArmorBase("cyan_dia_wool_chestplate",CYAN_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item CYAN_BLUE_DIA_WOOL_LEGGINGS = new ArmorBase("cyan_dia_wool_leggings",CYAN_ARMOR_MATERIAL_DIA_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item CYAN_BLUE_DIA_WOOL_BOOTS = new ArmorBase("cyan_dia_wool_boots",CYAN_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item BLUE_DIA_WOOL_HELMET = new ArmorBase("blue_dia_wool_helmet",BLUE_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLUE_DIA_WOOL_CHESTPLATE = new ArmorBase("blue_dia_wool_chestplate",BLUE_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLUE_DIA_WOOL_LEGGINGS = new ArmorBase("blue_dia_wool_leggings",BLUE_ARMOR_MATERIAL_DIA_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLUE_DIA_WOOL_BOOTS = new ArmorBase("blue_dia_wool_boots",BLUE_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item PURPLE_DIA_WOOL_HELMET = new ArmorBase("purple_dia_wool_helmet",PURPLE_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item PURPLE_DIA_WOOL_CHESTPLATE = new ArmorBase("purple_dia_wool_chestplate",PURPLE_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item PURPLE_DIA_WOOL_LEGGINGS = new ArmorBase("purple_dia_wool_leggings",PURPLE_ARMOR_MATERIAL_DIA_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item PURPLE_DIA_WOOL_BOOTS = new ArmorBase("purple_dia_wool_boots",PURPLE_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item PINK_DIA_WOOL_HELMET = new ArmorBase("pink_dia_wool_helmet",PINK_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item PINK_DIA_WOOL_CHESTPLATE = new ArmorBase("pink_dia_wool_chestplate",PINK_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item PINK_DIA_WOOL_LEGGINGS = new ArmorBase("pink_dia_wool_leggings",PINK_ARMOR_MATERIAL_DIA_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item PINK_DIA_WOOL_BOOTS = new ArmorBase("pink_dia_wool_boots",PINK_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item GRAY_DIA_WOOL_HELMET = new ArmorBase("gray_dia_wool_helmet",GRAY_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item GRAY_DIA_WOOL_CHESTPLATE = new ArmorBase("gray_dia_wool_chestplate",GRAY_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item GRAY_DIA_WOOL_LEGGINGS = new ArmorBase("gray_dia_wool_leggings",GRAY_ARMOR_MATERIAL_DIA_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item GRAY_DIA_WOOL_BOOTS = new ArmorBase("gray_dia_wool_boots",GRAY_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item LIGHT_GRAY_DIA_WOOL_HELMET = new ArmorBase("light_gray_dia_wool_helmet",LIGHT_GRAY_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIGHT_GRAY_DIA_WOOL_CHESTPLATE = new ArmorBase("light_gray_dia_wool_chestplate",LIGHT_GRAY_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIGHT_GRAY_DIA_WOOL_LEGGINGS = new ArmorBase("light_gray_dia_wool_leggings",LIGHT_GRAY_ARMOR_MATERIAL_DIA_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIGHT_GRAY_DIA_WOOL_BOOTS = new ArmorBase("light_gray_dia_wool_boots",LIGHT_GRAY_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item BLACK_DIA_WOOL_HELMET = new ArmorBase("black_dia_wool_helmet",BLACK_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLACK_DIA_WOOL_CHESTPLATE = new ArmorBase("black_dia_wool_chestplate",BLACK_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLACK_DIA_WOOL_LEGGINGS = new ArmorBase("black_dia_wool_leggings",BLACK_ARMOR_MATERIAL_DIA_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLACK_DIA_WOOL_BOOTS = new ArmorBase("black_dia_wool_boots",BLACK_ARMOR_MATERIAL_DIA_WOOL, 1, EntityEquipmentSlot.FEET);

    //dia + iron
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_DIA_IRON = EnumHelper.addArmorMaterial("armor_material_dia_iron", Reference.MOD_ID + ":dia_iron", 50, new int[]{1, 7, 9, 4},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);

    //Item dia + iron
    public static final Item DIA_IRON_HELMET = new ArmorBase("dia_iron_helmet",ARMOR_MATERIAL_DIA_IRON, 1, EntityEquipmentSlot.HEAD);
    public static final Item DIA_IRON_CHESTPLATE = new ArmorBase("dia_iron_chestplate",ARMOR_MATERIAL_DIA_IRON, 1, EntityEquipmentSlot.CHEST);
    public static final Item DIA_IRON_LEGGINGS = new ArmorBase("dia_iron_leggings",ARMOR_MATERIAL_DIA_IRON, 2, EntityEquipmentSlot.LEGS);
    public static final Item DIA_IRON_BOOTS = new ArmorBase("dia_iron_boots",ARMOR_MATERIAL_DIA_IRON, 1, EntityEquipmentSlot.FEET);


    //dia + chain
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_DIA_CHAIN = EnumHelper.addArmorMaterial("armor_material_dia_chain", Reference.MOD_ID + ":dia_chain", 40, new int[]{3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

    //Item dia + chain
    public static final Item DIA_CHAIN_HELMET = new ArmorBase("dia_chain_helmet",ARMOR_MATERIAL_DIA_CHAIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item DIA_CHAIN_CHESTPLATE = new ArmorBase("dia_chain_chestplate",ARMOR_MATERIAL_DIA_CHAIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item DIA_CHAIN_LEGGINGS = new ArmorBase("dia_chain_leggings",ARMOR_MATERIAL_DIA_CHAIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item DIA_CHAIN_BOOTS = new ArmorBase("dia_chain_boots",ARMOR_MATERIAL_DIA_CHAIN, 1, EntityEquipmentSlot.FEET);

    //dia + gold
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_DIA_GOLD = EnumHelper.addArmorMaterial("armor_material_dia_gold", Reference.MOD_ID + ":dia_gold", 33, new int[]{3, 6, 8, 3},25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

    //Item dia + gold
    public static final Item DIA_GOLD_HELMET = new ArmorBase("dia_gold_helmet",ARMOR_MATERIAL_DIA_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item DIA_GOLD_CHESTPLATE = new ArmorBase("dia_gold_chestplate",ARMOR_MATERIAL_DIA_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item DIA_GOLD_LEGGINGS = new ArmorBase("dia_gold_leggings",ARMOR_MATERIAL_DIA_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item DIA_GOLD_BOOTS = new ArmorBase("dia_gold_boots",ARMOR_MATERIAL_DIA_GOLD, 1, EntityEquipmentSlot.FEET);


}
