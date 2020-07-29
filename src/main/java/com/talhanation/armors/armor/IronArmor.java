package com.talhanation.armors.armor;

import com.talhanation.armors.Reference;
import com.talhanation.armors.armor.ArmorBase;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class IronArmor {


    public static final List<Item> ITEMS = new ArrayList<Item>();

    //iron + wool
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_IRON_WOOL = EnumHelper.addArmorMaterial("armor_material_iron_wool", Reference.MOD_ID + ":iron_wool", 20, new int[]{2, 5, 6, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial RED_ARMOR_MATERIAL_IRON_WOOL = EnumHelper.addArmorMaterial("armor_material_iron_wool", Reference.MOD_ID + ":iron_wool", 20, new int[]{2, 5, 6, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial ORANGE_ARMOR_MATERIAL_IRON_WOOL = EnumHelper.addArmorMaterial("armor_material_iron_wool", Reference.MOD_ID + ":iron_wool", 20, new int[]{2, 5, 6, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial BROWN_ARMOR_MATERIAL_IRON_WOOL = EnumHelper.addArmorMaterial("armor_material_iron_wool", Reference.MOD_ID + ":iron_wool", 20, new int[]{2, 5, 6, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial YELLOW_ARMOR_MATERIAL_IRON_WOOL = EnumHelper.addArmorMaterial("armor_material_iron_wool", Reference.MOD_ID + ":iron_wool", 20, new int[]{2, 5, 6, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial LIME_ARMOR_MATERIAL_IRON_WOOL = EnumHelper.addArmorMaterial("armor_material_iron_wool", Reference.MOD_ID + ":iron_wool", 20, new int[]{2, 5, 6, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial GREEN_ARMOR_MATERIAL_IRON_WOOL = EnumHelper.addArmorMaterial("armor_material_iron_wool", Reference.MOD_ID + ":iron_wool", 20, new int[]{2, 5, 6, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial LIGHT_BLUE_ARMOR_MATERIAL_IRON_WOOL = EnumHelper.addArmorMaterial("armor_material_iron_wool", Reference.MOD_ID + ":iron_wool", 20, new int[]{2, 5, 6, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial CYAN_ARMOR_MATERIAL_IRON_WOOL = EnumHelper.addArmorMaterial("armor_material_iron_wool", Reference.MOD_ID + ":iron_wool", 20, new int[]{2, 5, 6, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial BLUE_ARMOR_MATERIAL_IRON_WOOL = EnumHelper.addArmorMaterial("armor_material_iron_wool", Reference.MOD_ID + ":iron_wool", 20, new int[]{2, 5, 6, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial PURPLE_ARMOR_MATERIAL_IRON_WOOL = EnumHelper.addArmorMaterial("armor_material_iron_wool", Reference.MOD_ID + ":iron_wool", 20, new int[]{2, 5, 6, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial MAGENTA_ARMOR_MATERIAL_IRON_WOOL = EnumHelper.addArmorMaterial("armor_material_iron_wool", Reference.MOD_ID + ":iron_wool", 20, new int[]{2, 5, 6, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial PINK_ARMOR_MATERIAL_IRON_WOOL = EnumHelper.addArmorMaterial("armor_material_iron_wool", Reference.MOD_ID + ":iron_wool", 20, new int[]{2, 5, 6, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial LIGHT_GRAY_ARMOR_MATERIAL_IRON_WOOL = EnumHelper.addArmorMaterial("armor_material_iron_wool", Reference.MOD_ID + ":iron_wool", 20, new int[]{2, 5, 6, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial GRAY_ARMOR_MATERIAL_IRON_WOOL = EnumHelper.addArmorMaterial("armor_material_iron_wool", Reference.MOD_ID + ":iron_wool", 20, new int[]{2, 5, 6, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial BLACK_ARMOR_MATERIAL_IRON_WOOL = EnumHelper.addArmorMaterial("armor_material_iron_wool", Reference.MOD_ID + ":iron_wool", 20, new int[]{2, 5, 6, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);


    //Item iron + wool
    public static final Item IRON_WOOL_HELMET = new ArmorBase("iron_wool_helmet",ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item IRON_WOOL_CHESTPLATE = new ArmorBase("iron_wool_chestplate",ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item IRON_WOOL_LEGGINGS = new ArmorBase("iron_wool_leggings",ARMOR_MATERIAL_IRON_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item IRON_WOOL_BOOTS = new ArmorBase("iron_wool_boots",ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item RED_IRON_WOOL_HELMET = new ArmorBase("red_iron_wool_helmet",RED_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item RED_IRON_WOOL_CHESTPLATE = new ArmorBase("red_iron_wool_chestplate",RED_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item RED_IRON_WOOL_LEGGINGS = new ArmorBase("red_iron_wool_leggings",RED_ARMOR_MATERIAL_IRON_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item RED_IRON_WOOL_BOOTS = new ArmorBase("red_iron_wool_boots",RED_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item ORANGE_IRON_WOOL_HELMET = new ArmorBase("orange_iron_wool_helmet",ORANGE_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item ORANGE_IRON_WOOL_CHESTPLATE = new ArmorBase("orange_iron_wool_chestplate",ORANGE_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item ORANGE_IRON_WOOL_LEGGINGS = new ArmorBase("orange_iron_wool_leggings",ORANGE_ARMOR_MATERIAL_IRON_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item ORANGE_IRON_WOOL_BOOTS = new ArmorBase("orange_iron_wool_boots",ORANGE_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item MAGENTA_IRON_WOOL_HELMET = new ArmorBase("magenta_iron_wool_helmet",MAGENTA_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item MAGENTA_IRON_WOOL_CHESTPLATE = new ArmorBase("magenta_iron_wool_chestplate",MAGENTA_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item MAGENTA_IRON_WOOL_LEGGINGS = new ArmorBase("magenta_iron_wool_leggings",MAGENTA_ARMOR_MATERIAL_IRON_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item MAGENTA_IRON_WOOL_BOOTS = new ArmorBase("magenta_iron_wool_boots",MAGENTA_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item BROWN_IRON_WOOL_HELMET = new ArmorBase("brown_iron_wool_helmet",BROWN_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item BROWN_IRON_WOOL_CHESTPLATE = new ArmorBase("brown_iron_wool_chestplate",BROWN_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item BROWN_IRON_WOOL_LEGGINGS = new ArmorBase("brown_iron_wool_leggings",BROWN_ARMOR_MATERIAL_IRON_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item BROWN_IRON_WOOL_BOOTS = new ArmorBase("brown_iron_wool_boots",BROWN_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item YELLOW_IRON_WOOL_HELMET = new ArmorBase("yellow_iron_wool_helmet",YELLOW_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item YELLOW_IRON_WOOL_CHESTPLATE = new ArmorBase("yellow_iron_wool_chestplate",YELLOW_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item YELLOW_IRON_WOOL_LEGGINGS = new ArmorBase("yellow_iron_wool_leggings",YELLOW_ARMOR_MATERIAL_IRON_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item YELLOW_IRON_WOOL_BOOTS = new ArmorBase("yellow_iron_wool_boots",YELLOW_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item LIME_IRON_WOOL_HELMET = new ArmorBase("lime_iron_wool_helmet",LIME_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIME_IRON_WOOL_CHESTPLATE = new ArmorBase("lime_iron_wool_chestplate",LIME_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIME_IRON_WOOL_LEGGINGS = new ArmorBase("lime_iron_wool_leggings",LIME_ARMOR_MATERIAL_IRON_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIME_IRON_WOOL_BOOTS = new ArmorBase("lime_iron_wool_boots",LIME_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item GREEN_IRON_WOOL_HELMET = new ArmorBase("green_iron_wool_helmet",GREEN_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item GREEN_IRON_WOOL_CHESTPLATE = new ArmorBase("green_iron_wool_chestplate",GREEN_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item GREEN_IRON_WOOL_LEGGINGS = new ArmorBase("green_iron_wool_leggings",GREEN_ARMOR_MATERIAL_IRON_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item GREEN_IRON_WOOL_BOOTS = new ArmorBase("green_iron_wool_boots",GREEN_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item LIGHT_BLUE_IRON_WOOL_HELMET = new ArmorBase("light_blue_iron_wool_helmet",LIGHT_BLUE_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIGHT_BLUE_IRON_WOOL_CHESTPLATE = new ArmorBase("light_blue_iron_wool_chestplate",LIGHT_BLUE_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIGHT_BLUE_IRON_WOOL_LEGGINGS = new ArmorBase("light_blue_iron_wool_leggings",LIGHT_BLUE_ARMOR_MATERIAL_IRON_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIGHT_BLUE_IRON_WOOL_BOOTS = new ArmorBase("light_blue_iron_wool_boots",LIGHT_BLUE_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item CYAN_BLUE_IRON_WOOL_HELMET = new ArmorBase("cyan_iron_wool_helmet",CYAN_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item CYAN_BLUE_IRON_WOOL_CHESTPLATE = new ArmorBase("cyan_iron_wool_chestplate",CYAN_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item CYAN_BLUE_IRON_WOOL_LEGGINGS = new ArmorBase("cyan_iron_wool_leggings",CYAN_ARMOR_MATERIAL_IRON_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item CYAN_BLUE_IRON_WOOL_BOOTS = new ArmorBase("cyan_iron_wool_boots",CYAN_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item BLUE_IRON_WOOL_HELMET = new ArmorBase("blue_iron_wool_helmet",BLUE_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLUE_IRON_WOOL_CHESTPLATE = new ArmorBase("blue_iron_wool_chestplate",BLUE_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLUE_IRON_WOOL_LEGGINGS = new ArmorBase("blue_iron_wool_leggings",BLUE_ARMOR_MATERIAL_IRON_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLUE_IRON_WOOL_BOOTS = new ArmorBase("blue_iron_wool_boots",BLUE_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item PURPLE_IRON_WOOL_HELMET = new ArmorBase("purple_iron_wool_helmet",PURPLE_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item PURPLE_IRON_WOOL_CHESTPLATE = new ArmorBase("purple_iron_wool_chestplate",PURPLE_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item PURPLE_IRON_WOOL_LEGGINGS = new ArmorBase("purple_iron_wool_leggings",PURPLE_ARMOR_MATERIAL_IRON_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item PURPLE_IRON_WOOL_BOOTS = new ArmorBase("purple_iron_wool_boots",PURPLE_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item PINK_IRON_WOOL_HELMET = new ArmorBase("pink_iron_wool_helmet",PINK_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item PINK_IRON_WOOL_CHESTPLATE = new ArmorBase("pink_iron_wool_chestplate",PINK_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item PINK_IRON_WOOL_LEGGINGS = new ArmorBase("pink_iron_wool_leggings",PINK_ARMOR_MATERIAL_IRON_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item PINK_IRON_WOOL_BOOTS = new ArmorBase("pink_iron_wool_boots",PINK_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item GRAY_IRON_WOOL_HELMET = new ArmorBase("gray_iron_wool_helmet",GRAY_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item GRAY_IRON_WOOL_CHESTPLATE = new ArmorBase("gray_iron_wool_chestplate",GRAY_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item GRAY_IRON_WOOL_LEGGINGS = new ArmorBase("gray_iron_wool_leggings",GRAY_ARMOR_MATERIAL_IRON_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item GRAY_IRON_WOOL_BOOTS = new ArmorBase("gray_iron_wool_boots",GRAY_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item LIGHT_GRAY_IRON_WOOL_HELMET = new ArmorBase("light_gray_iron_wool_helmet",LIGHT_GRAY_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIGHT_GRAY_IRON_WOOL_CHESTPLATE = new ArmorBase("light_gray_iron_wool_chestplate",LIGHT_GRAY_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIGHT_GRAY_IRON_WOOL_LEGGINGS = new ArmorBase("light_gray_iron_wool_leggings",LIGHT_GRAY_ARMOR_MATERIAL_IRON_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIGHT_GRAY_IRON_WOOL_BOOTS = new ArmorBase("light_gray_iron_wool_boots",LIGHT_GRAY_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item BLACK_IRON_WOOL_HELMET = new ArmorBase("black_iron_wool_helmet",BLACK_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLACK_IRON_WOOL_CHESTPLATE = new ArmorBase("black_iron_wool_chestplate",BLACK_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLACK_IRON_WOOL_LEGGINGS = new ArmorBase("black_iron_wool_leggings",BLACK_ARMOR_MATERIAL_IRON_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLACK_IRON_WOOL_BOOTS = new ArmorBase("black_iron_wool_boots",BLACK_ARMOR_MATERIAL_IRON_WOOL, 1, EntityEquipmentSlot.FEET);

    //iron + leather
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_IRON_LEATHER = EnumHelper.addArmorMaterial("armor_material_iron_leather", Reference.MOD_ID + ":iron_leather", 25, new int[]{2, 4, 6, 3},15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

    public static final Item IRON_LEATHER_HELMET = new ArmorBase("iron_leather_helmet",ARMOR_MATERIAL_IRON_LEATHER, 1, EntityEquipmentSlot.HEAD);
    public static final Item IRON_LEATHER_CHESTPLATE = new ArmorBase("iron_leather_chestplate",ARMOR_MATERIAL_IRON_LEATHER, 1, EntityEquipmentSlot.CHEST);
    public static final Item IRON_LEATHER_LEGGINGS = new ArmorBase("iron_leather_leggings",ARMOR_MATERIAL_IRON_LEATHER, 2, EntityEquipmentSlot.LEGS);
    public static final Item IRON_LEATHER_BOOTS = new ArmorBase("iron_leather_boots",ARMOR_MATERIAL_IRON_LEATHER, 1, EntityEquipmentSlot.FEET);

    //iron + gold
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_IRON_GOLD = EnumHelper.addArmorMaterial("armor_material_iron_gold", Reference.MOD_ID + ":iron_gold", 15, new int[]{2, 4, 6, 3},25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

    public static final Item IRON_GOLD_HELMET = new ArmorBase("iron_gold_helmet",ARMOR_MATERIAL_IRON_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item IRON_GOLD_CHESTPLATE = new ArmorBase("iron_gold_chestplate",ARMOR_MATERIAL_IRON_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item IRON_GOLD_LEGGINGS = new ArmorBase("iron_gold_leggings",ARMOR_MATERIAL_IRON_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item IRON_GOLD_BOOTS = new ArmorBase("iron_gold_boots",ARMOR_MATERIAL_IRON_GOLD, 1, EntityEquipmentSlot.FEET);

    //iron + dia
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_IRON_DIA = EnumHelper.addArmorMaterial("armor_material_iron_dia", Reference.MOD_ID + ":iron_dia", 40, new int[]{4, 6, 8, 5},15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

    public static final Item IRON_DIA_HELMET = new ArmorBase("iron_dia_helmet",ARMOR_MATERIAL_IRON_DIA, 1, EntityEquipmentSlot.HEAD);
    public static final Item IRON_DIA_CHESTPLATE = new ArmorBase("iron_dia_chestplate",ARMOR_MATERIAL_IRON_DIA, 1, EntityEquipmentSlot.CHEST);
    public static final Item IRON_DIA_LEGGINGS = new ArmorBase("iron_dia_leggings",ARMOR_MATERIAL_IRON_DIA, 2, EntityEquipmentSlot.LEGS);
    public static final Item IRON_DIA_BOOTS = new ArmorBase("iron_dia_boots",ARMOR_MATERIAL_IRON_DIA, 1, EntityEquipmentSlot.FEET);

    //iron + chain
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_IRON_CHAIN = EnumHelper.addArmorMaterial("armor_material_iron_chain", Reference.MOD_ID + ":iron_chain", 30, new int[]{2, 5, 7, 3},15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

    public static final Item IRON_CHAIN_HELMET = new ArmorBase("iron_chain_helmet",ARMOR_MATERIAL_IRON_CHAIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item IRON_CHAIN_CHESTPLATE = new ArmorBase("iron_chain_chestplate",ARMOR_MATERIAL_IRON_CHAIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item IRON_CHAIN_LEGGINGS = new ArmorBase("iron_chain_leggings",ARMOR_MATERIAL_IRON_CHAIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item IRON_CHAIN_BOOTS = new ArmorBase("iron_chain_boots",ARMOR_MATERIAL_IRON_CHAIN, 1, EntityEquipmentSlot.FEET);



}
