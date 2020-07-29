package com.talhanation.armors.armor;

import com.talhanation.armors.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ChainArmor {


    public static final List<Item> ITEMS = new ArrayList<Item>();

//chain + wool
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_CHAIN_WOOL = EnumHelper.addArmorMaterial("armor_material_chain_wool", Reference.MOD_ID + ":chain_wool", 20, new int[]{1, 4, 5, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial RED_ARMOR_MATERIAL_CHAIN_WOOL = EnumHelper.addArmorMaterial("armor_material_chain_wool", Reference.MOD_ID + ":chain_wool", 20, new int[]{1, 4, 5, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ORANGE_ARMOR_MATERIAL_CHAIN_WOOL = EnumHelper.addArmorMaterial("armor_material_chain_wool", Reference.MOD_ID + ":chain_wool", 20, new int[]{1, 4, 5, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial BROWN_ARMOR_MATERIAL_CHAIN_WOOL = EnumHelper.addArmorMaterial("armor_material_chain_wool", Reference.MOD_ID + ":chain_wool", 20, new int[]{1, 4, 5, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial YELLOW_ARMOR_MATERIAL_CHAIN_WOOL = EnumHelper.addArmorMaterial("armor_material_chain_wool", Reference.MOD_ID + ":chain_wool", 20, new int[]{1, 4, 5, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial LIME_ARMOR_MATERIAL_CHAIN_WOOL = EnumHelper.addArmorMaterial("armor_material_chain_wool", Reference.MOD_ID + ":chain_wool", 20, new int[]{1, 4, 5, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial GREEN_ARMOR_MATERIAL_CHAIN_WOOL = EnumHelper.addArmorMaterial("armor_material_chain_wool", Reference.MOD_ID + ":chain_wool", 20, new int[]{1, 4, 5, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial LIGHT_BLUE_ARMOR_MATERIAL_CHAIN_WOOL = EnumHelper.addArmorMaterial("armor_material_chain_wool", Reference.MOD_ID + ":chain_wool", 20, new int[]{1, 4, 5, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial CYAN_ARMOR_MATERIAL_CHAIN_WOOL = EnumHelper.addArmorMaterial("armor_material_chain_wool", Reference.MOD_ID + ":chain_wool", 20, new int[]{1, 4, 5, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial BLUE_ARMOR_MATERIAL_CHAIN_WOOL = EnumHelper.addArmorMaterial("armor_material_chain_wool", Reference.MOD_ID + ":chain_wool", 20, new int[]{1, 4, 5, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial PURPLE_ARMOR_MATERIAL_CHAIN_WOOL = EnumHelper.addArmorMaterial("armor_material_chain_wool", Reference.MOD_ID + ":chain_wool", 20, new int[]{1, 4, 5, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial MAGENTA_ARMOR_MATERIAL_CHAIN_WOOL = EnumHelper.addArmorMaterial("armor_material_chain_wool", Reference.MOD_ID + ":chain_wool", 20, new int[]{1, 4, 5, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial PINK_ARMOR_MATERIAL_CHAIN_WOOL = EnumHelper.addArmorMaterial("armor_material_chain_wool", Reference.MOD_ID + ":chain_wool", 20, new int[]{1, 4, 5, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial LIGHT_GRAY_ARMOR_MATERIAL_CHAIN_WOOL = EnumHelper.addArmorMaterial("armor_material_chain_wool", Reference.MOD_ID + ":chain_wool", 20, new int[]{1, 4, 5, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial GRAY_ARMOR_MATERIAL_CHAIN_WOOL = EnumHelper.addArmorMaterial("armor_material_chain_wool", Reference.MOD_ID + ":chain_wool", 20, new int[]{1, 4, 5, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial BLACK_ARMOR_MATERIAL_CHAIN_WOOL = EnumHelper.addArmorMaterial("armor_material_chain_wool", Reference.MOD_ID + ":chain_wool", 20, new int[]{1, 4, 5, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);


    //Item chain + wool
    public static final Item CHAIN_WOOL_HELMET = new ArmorBase("chain_wool_helmet",ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHAIN_WOOL_CHESTPLATE = new ArmorBase("chain_wool_chestplate",ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item CHAIN_WOOL_LEGGINGS = new ArmorBase("chain_wool_leggings",ARMOR_MATERIAL_CHAIN_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item CHAIN_WOOL_BOOTS = new ArmorBase("chain_wool_boots",ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item RED_CHAIN_WOOL_HELMET = new ArmorBase("red_chain_wool_helmet",RED_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item RED_CHAIN_WOOL_CHESTPLATE = new ArmorBase("red_chain_wool_chestplate",RED_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item RED_CHAIN_WOOL_LEGGINGS = new ArmorBase("red_chain_wool_leggings",RED_ARMOR_MATERIAL_CHAIN_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item RED_CHAIN_WOOL_BOOTS = new ArmorBase("red_chain_wool_boots",RED_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item ORANGE_CHAIN_WOOL_HELMET = new ArmorBase("orange_chain_wool_helmet",ORANGE_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item ORANGE_CHAIN_WOOL_CHESTPLATE = new ArmorBase("orange_chain_wool_chestplate",ORANGE_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item ORANGE_CHAIN_WOOL_LEGGINGS = new ArmorBase("orange_chain_wool_leggings",ORANGE_ARMOR_MATERIAL_CHAIN_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item ORANGE_CHAIN_WOOL_BOOTS = new ArmorBase("orange_chain_wool_boots",ORANGE_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item MAGENTA_CHAIN_WOOL_HELMET = new ArmorBase("magenta_chain_wool_helmet",MAGENTA_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item MAGENTA_CHAIN_WOOL_CHESTPLATE = new ArmorBase("magenta_chain_wool_chestplate",MAGENTA_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item MAGENTA_CHAIN_WOOL_LEGGINGS = new ArmorBase("magenta_chain_wool_leggings",MAGENTA_ARMOR_MATERIAL_CHAIN_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item MAGENTA_CHAIN_WOOL_BOOTS = new ArmorBase("magenta_chain_wool_boots",MAGENTA_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item BROWN_CHAIN_WOOL_HELMET = new ArmorBase("brown_chain_wool_helmet",BROWN_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item BROWN_CHAIN_WOOL_CHESTPLATE = new ArmorBase("brown_chain_wool_chestplate",BROWN_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item BROWN_CHAIN_WOOL_LEGGINGS = new ArmorBase("brown_chain_wool_leggings",BROWN_ARMOR_MATERIAL_CHAIN_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item BROWN_CHAIN_WOOL_BOOTS = new ArmorBase("brown_chain_wool_boots",BROWN_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item YELLOW_CHAIN_WOOL_HELMET = new ArmorBase("yellow_chain_wool_helmet",YELLOW_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item YELLOW_CHAIN_WOOL_CHESTPLATE = new ArmorBase("yellow_chain_wool_chestplate",YELLOW_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item YELLOW_CHAIN_WOOL_LEGGINGS = new ArmorBase("yellow_chain_wool_leggings",YELLOW_ARMOR_MATERIAL_CHAIN_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item YELLOW_CHAIN_WOOL_BOOTS = new ArmorBase("yellow_chain_wool_boots",YELLOW_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item LIME_CHAIN_WOOL_HELMET = new ArmorBase("lime_chain_wool_helmet",LIME_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIME_CHAIN_WOOL_CHESTPLATE = new ArmorBase("lime_chain_wool_chestplate",LIME_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIME_CHAIN_WOOL_LEGGINGS = new ArmorBase("lime_chain_wool_leggings",LIME_ARMOR_MATERIAL_CHAIN_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIME_CHAIN_WOOL_BOOTS = new ArmorBase("lime_chain_wool_boots",LIME_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item GREEN_CHAIN_WOOL_HELMET = new ArmorBase("green_chain_wool_helmet",GREEN_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item GREEN_CHAIN_WOOL_CHESTPLATE = new ArmorBase("green_chain_wool_chestplate",GREEN_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item GREEN_CHAIN_WOOL_LEGGINGS = new ArmorBase("green_chain_wool_leggings",GREEN_ARMOR_MATERIAL_CHAIN_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item GREEN_CHAIN_WOOL_BOOTS = new ArmorBase("green_chain_wool_boots",GREEN_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item LIGHT_BLUE_CHAIN_WOOL_HELMET = new ArmorBase("light_blue_chain_wool_helmet",LIGHT_BLUE_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIGHT_BLUE_CHAIN_WOOL_CHESTPLATE = new ArmorBase("light_blue_chain_wool_chestplate",LIGHT_BLUE_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIGHT_BLUE_CHAIN_WOOL_LEGGINGS = new ArmorBase("light_blue_chain_wool_leggings",LIGHT_BLUE_ARMOR_MATERIAL_CHAIN_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIGHT_BLUE_CHAIN_WOOL_BOOTS = new ArmorBase("light_blue_chain_wool_boots",LIGHT_BLUE_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item CYAN_BLUE_CHAIN_WOOL_HELMET = new ArmorBase("cyan_chain_wool_helmet",CYAN_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item CYAN_BLUE_CHAIN_WOOL_CHESTPLATE = new ArmorBase("cyan_chain_wool_chestplate",CYAN_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item CYAN_BLUE_CHAIN_WOOL_LEGGINGS = new ArmorBase("cyan_chain_wool_leggings",CYAN_ARMOR_MATERIAL_CHAIN_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item CYAN_BLUE_CHAIN_WOOL_BOOTS = new ArmorBase("cyan_chain_wool_boots",CYAN_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item BLUE_CHAIN_WOOL_HELMET = new ArmorBase("blue_chain_wool_helmet",BLUE_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLUE_CHAIN_WOOL_CHESTPLATE = new ArmorBase("blue_chain_wool_chestplate",BLUE_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLUE_CHAIN_WOOL_LEGGINGS = new ArmorBase("blue_chain_wool_leggings",BLUE_ARMOR_MATERIAL_CHAIN_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLUE_CHAIN_WOOL_BOOTS = new ArmorBase("blue_chain_wool_boots",BLUE_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item PURPLE_CHAIN_WOOL_HELMET = new ArmorBase("purple_chain_wool_helmet",PURPLE_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item PURPLE_CHAIN_WOOL_CHESTPLATE = new ArmorBase("purple_chain_wool_chestplate",PURPLE_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item PURPLE_CHAIN_WOOL_LEGGINGS = new ArmorBase("purple_chain_wool_leggings",PURPLE_ARMOR_MATERIAL_CHAIN_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item PURPLE_CHAIN_WOOL_BOOTS = new ArmorBase("purple_chain_wool_boots",PURPLE_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item PINK_CHAIN_WOOL_HELMET = new ArmorBase("pink_chain_wool_helmet",PINK_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item PINK_CHAIN_WOOL_CHESTPLATE = new ArmorBase("pink_chain_wool_chestplate",PINK_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item PINK_CHAIN_WOOL_LEGGINGS = new ArmorBase("pink_chain_wool_leggings",PINK_ARMOR_MATERIAL_CHAIN_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item PINK_CHAIN_WOOL_BOOTS = new ArmorBase("pink_chain_wool_boots",PINK_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item GRAY_CHAIN_WOOL_HELMET = new ArmorBase("gray_chain_wool_helmet",GRAY_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item GRAY_CHAIN_WOOL_CHESTPLATE = new ArmorBase("gray_chain_wool_chestplate",GRAY_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item GRAY_CHAIN_WOOL_LEGGINGS = new ArmorBase("gray_chain_wool_leggings",GRAY_ARMOR_MATERIAL_CHAIN_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item GRAY_CHAIN_WOOL_BOOTS = new ArmorBase("gray_chain_wool_boots",GRAY_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item LIGHT_GRAY_CHAIN_WOOL_HELMET = new ArmorBase("light_gray_chain_wool_helmet",LIGHT_GRAY_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIGHT_GRAY_CHAIN_WOOL_CHESTPLATE = new ArmorBase("light_gray_chain_wool_chestplate",LIGHT_GRAY_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIGHT_GRAY_CHAIN_WOOL_LEGGINGS = new ArmorBase("light_gray_chain_wool_leggings",LIGHT_GRAY_ARMOR_MATERIAL_CHAIN_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIGHT_GRAY_CHAIN_WOOL_BOOTS = new ArmorBase("light_gray_chain_wool_boots",LIGHT_GRAY_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item BLACK_CHAIN_WOOL_HELMET = new ArmorBase("black_chain_wool_helmet",BLACK_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLACK_CHAIN_WOOL_CHESTPLATE = new ArmorBase("black_chain_wool_chestplate",BLACK_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLACK_CHAIN_WOOL_LEGGINGS = new ArmorBase("black_chain_wool_leggings",BLACK_ARMOR_MATERIAL_CHAIN_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLACK_CHAIN_WOOL_BOOTS = new ArmorBase("black_chain_wool_boots",BLACK_ARMOR_MATERIAL_CHAIN_WOOL, 1, EntityEquipmentSlot.FEET);

    //chain + leather

    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_CHAIN_LEATHER = EnumHelper.addArmorMaterial("armor_material_chain_leather", Reference.MOD_ID + ":chain_leather", 25, new int[]{1, 4, 5, 2},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);

    //Item chain + leather
    public static final Item CHAIN_LEATHER_HELMET = new ArmorBase("chain_leather_helmet",ARMOR_MATERIAL_CHAIN_LEATHER, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHAIN_LEATHER_CHESTPLATE = new ArmorBase("chain_leather_chestplate",ARMOR_MATERIAL_CHAIN_LEATHER, 1, EntityEquipmentSlot.CHEST);
    public static final Item CHAIN_LEATHER_LEGGINGS = new ArmorBase("chain_leather_leggings",ARMOR_MATERIAL_CHAIN_LEATHER, 2, EntityEquipmentSlot.LEGS);
    public static final Item CHAIN_LEATHER_BOOTS = new ArmorBase("chain_leather_boots",ARMOR_MATERIAL_CHAIN_LEATHER, 1, EntityEquipmentSlot.FEET);


    //chain + gold

    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_CHAIN_GOLD = EnumHelper.addArmorMaterial("armor_material_chain_gold", Reference.MOD_ID + ":chain_gold", 20, new int[]{1, 4, 5, 2},20, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);

    //Item chain + gold
    public static final Item CHAIN_GOLD_HELMET = new ArmorBase("chain_gold_helmet",ARMOR_MATERIAL_CHAIN_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHAIN_GOLD_CHESTPLATE = new ArmorBase("chain_gold_chestplate",ARMOR_MATERIAL_CHAIN_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item CHAIN_GOLD_LEGGINGS = new ArmorBase("chain_gold_leggings",ARMOR_MATERIAL_CHAIN_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item CHAIN_GOLD_BOOTS = new ArmorBase("chain_gold_boots",ARMOR_MATERIAL_CHAIN_GOLD, 1, EntityEquipmentSlot.FEET);


    //chain + iron

    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_CHAIN_IRON = EnumHelper.addArmorMaterial("armor_material_chain_iron", Reference.MOD_ID + ":chain_iron", 30, new int[]{2, 5, 6, 3},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);

    //Item chain + iron
    public static final Item CHAIN_IRON_HELMET = new ArmorBase("chain_iron_helmet",ARMOR_MATERIAL_CHAIN_IRON, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHAIN_IRON_CHESTPLATE = new ArmorBase("chain_iron_chestplate",ARMOR_MATERIAL_CHAIN_IRON, 1, EntityEquipmentSlot.CHEST);
    public static final Item CHAIN_IRON_LEGGINGS = new ArmorBase("chain_iron_leggings",ARMOR_MATERIAL_CHAIN_IRON, 2, EntityEquipmentSlot.LEGS);
    public static final Item CHAIN_IRON_BOOTS = new ArmorBase("chain_iron_boots",ARMOR_MATERIAL_CHAIN_IRON, 1, EntityEquipmentSlot.FEET);

    //chain + dia

    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_CHAIN_DIA = EnumHelper.addArmorMaterial("armor_material_chain_dia", Reference.MOD_ID + ":chain_dia", 40, new int[]{3, 6, 7, 4},12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);

    //Item chain + dia
    public static final Item CHAIN_DIA_HELMET = new ArmorBase("chain_dia_helmet",ARMOR_MATERIAL_CHAIN_DIA, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHAIN_DIA_CHESTPLATE = new ArmorBase("chain_dia_chestplate",ARMOR_MATERIAL_CHAIN_DIA, 1, EntityEquipmentSlot.CHEST);
    public static final Item CHAIN_DIA_LEGGINGS = new ArmorBase("chain_dia_leggings",ARMOR_MATERIAL_CHAIN_DIA, 2, EntityEquipmentSlot.LEGS);
    public static final Item CHAIN_DIA_BOOTS = new ArmorBase("chain_dia_boots",ARMOR_MATERIAL_CHAIN_DIA, 1, EntityEquipmentSlot.FEET);

}

