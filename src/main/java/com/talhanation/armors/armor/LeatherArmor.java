package com.talhanation.armors.armor;

import com.talhanation.armors.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;


public class LeatherArmor {



        public static final List<Item> ITEMS = new ArrayList<Item>();

        //leather + wool
        public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_LEATHER_WOOL = EnumHelper.addArmorMaterial("armor_material_leather_wool", Reference.MOD_ID + ":leather_wool", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial RED_ARMOR_MATERIAL_LEATHER_WOOL = EnumHelper.addArmorMaterial("armor_material_leather_wool", Reference.MOD_ID + ":leather_wool", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial ORANGE_ARMOR_MATERIAL_LEATHER_WOOL = EnumHelper.addArmorMaterial("armor_material_leather_wool", Reference.MOD_ID + ":leather_wool", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial BROWN_ARMOR_MATERIAL_LEATHER_WOOL = EnumHelper.addArmorMaterial("armor_material_leather_wool", Reference.MOD_ID + ":leather_wool", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial YELLOW_ARMOR_MATERIAL_LEATHER_WOOL = EnumHelper.addArmorMaterial("armor_material_leather_wool", Reference.MOD_ID + ":leather_wool", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial LIME_ARMOR_MATERIAL_LEATHER_WOOL = EnumHelper.addArmorMaterial("armor_material_leather_wool", Reference.MOD_ID + ":leather_wool", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial GREEN_ARMOR_MATERIAL_LEATHER_WOOL = EnumHelper.addArmorMaterial("armor_material_leather_wool", Reference.MOD_ID + ":leather_wool", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial LIGHT_BLUE_ARMOR_MATERIAL_LEATHER_WOOL = EnumHelper.addArmorMaterial("armor_material_leather_wool", Reference.MOD_ID + ":leather_wool", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial CYAN_ARMOR_MATERIAL_LEATHER_WOOL = EnumHelper.addArmorMaterial("armor_material_leather_wool", Reference.MOD_ID + ":leather_wool", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial BLUE_ARMOR_MATERIAL_LEATHER_WOOL = EnumHelper.addArmorMaterial("armor_material_leather_wool", Reference.MOD_ID + ":leather_wool", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial PURPLE_ARMOR_MATERIAL_LEATHER_WOOL = EnumHelper.addArmorMaterial("armor_material_leather_wool", Reference.MOD_ID + ":leather_wool", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial MAGENTA_ARMOR_MATERIAL_LEATHER_WOOL = EnumHelper.addArmorMaterial("armor_material_leather_wool", Reference.MOD_ID + ":leather_wool", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial PINK_ARMOR_MATERIAL_LEATHER_WOOL = EnumHelper.addArmorMaterial("armor_material_leather_wool", Reference.MOD_ID + ":leather_wool", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial LIGHT_GRAY_ARMOR_MATERIAL_LEATHER_WOOL = EnumHelper.addArmorMaterial("armor_material_leather_wool", Reference.MOD_ID + ":leather_wool", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial GRAY_ARMOR_MATERIAL_LEATHER_WOOL = EnumHelper.addArmorMaterial("armor_material_leather_wool", Reference.MOD_ID + ":leather_wool", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial BLACK_ARMOR_MATERIAL_LEATHER_WOOL = EnumHelper.addArmorMaterial("armor_material_leather_wool", Reference.MOD_ID + ":leather_wool", 7, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);

        //Item leather + wool
        public static final Item LEATHER_WOOL_HELMET = new ArmorBase("leather_wool_helmet",ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.HEAD);
        public static final Item LEATHER_WOOL_CHESTPLATE = new ArmorBase("leather_wool_chestplate",ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.CHEST);
        public static final Item LEATHER_WOOL_LEGGINGS = new ArmorBase("leather_wool_leggings",ARMOR_MATERIAL_LEATHER_WOOL, 2, EntityEquipmentSlot.LEGS);
        public static final Item LEATHER_WOOL_BOOTS = new ArmorBase("leather_wool_boots",ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.FEET);

        public static final Item RED_LEATHER_WOOL_HELMET = new ArmorBase("red_leather_wool_helmet",RED_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.HEAD);
        public static final Item RED_LEATHER_WOOL_CHESTPLATE = new ArmorBase("red_leather_wool_chestplate",RED_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.CHEST);
        public static final Item RED_LEATHER_WOOL_LEGGINGS = new ArmorBase("red_leather_wool_leggings",RED_ARMOR_MATERIAL_LEATHER_WOOL, 2, EntityEquipmentSlot.LEGS);
        public static final Item RED_LEATHER_WOOL_BOOTS = new ArmorBase("red_leather_wool_boots",RED_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.FEET);

        public static final Item ORANGE_LEATHER_WOOL_HELMET = new ArmorBase("orange_leather_wool_helmet",ORANGE_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.HEAD);
        public static final Item ORANGE_LEATHER_WOOL_CHESTPLATE = new ArmorBase("orange_leather_wool_chestplate",ORANGE_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.CHEST);
        public static final Item ORANGE_LEATHER_WOOL_LEGGINGS = new ArmorBase("orange_leather_wool_leggings",ORANGE_ARMOR_MATERIAL_LEATHER_WOOL, 2, EntityEquipmentSlot.LEGS);
        public static final Item ORANGE_LEATHER_WOOL_BOOTS = new ArmorBase("orange_leather_wool_boots",ORANGE_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.FEET);

        public static final Item MAGENTA_LEATHER_WOOL_HELMET = new ArmorBase("magenta_leather_wool_helmet",MAGENTA_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.HEAD);
        public static final Item MAGENTA_LEATHER_WOOL_CHESTPLATE = new ArmorBase("magenta_leather_wool_chestplate",MAGENTA_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.CHEST);
        public static final Item MAGENTA_LEATHER_WOOL_LEGGINGS = new ArmorBase("magenta_leather_wool_leggings",MAGENTA_ARMOR_MATERIAL_LEATHER_WOOL, 2, EntityEquipmentSlot.LEGS);
        public static final Item MAGENTA_LEATHER_WOOL_BOOTS = new ArmorBase("magenta_leather_wool_boots",MAGENTA_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.FEET);

        public static final Item BROWN_LEATHER_WOOL_HELMET = new ArmorBase("brown_leather_wool_helmet",BROWN_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.HEAD);
        public static final Item BROWN_LEATHER_WOOL_CHESTPLATE = new ArmorBase("brown_leather_wool_chestplate",BROWN_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.CHEST);
        public static final Item BROWN_LEATHER_WOOL_LEGGINGS = new ArmorBase("brown_leather_wool_leggings",BROWN_ARMOR_MATERIAL_LEATHER_WOOL, 2, EntityEquipmentSlot.LEGS);
        public static final Item BROWN_LEATHER_WOOL_BOOTS = new ArmorBase("brown_leather_wool_boots",BROWN_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.FEET);

        public static final Item YELLOW_LEATHER_WOOL_HELMET = new ArmorBase("yellow_leather_wool_helmet",YELLOW_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.HEAD);
        public static final Item YELLOW_LEATHER_WOOL_CHESTPLATE = new ArmorBase("yellow_leather_wool_chestplate",YELLOW_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.CHEST);
        public static final Item YELLOW_LEATHER_WOOL_LEGGINGS = new ArmorBase("yellow_leather_wool_leggings",YELLOW_ARMOR_MATERIAL_LEATHER_WOOL, 2, EntityEquipmentSlot.LEGS);
        public static final Item YELLOW_LEATHER_WOOL_BOOTS = new ArmorBase("yellow_leather_wool_boots",YELLOW_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.FEET);

        public static final Item LIME_LEATHER_WOOL_HELMET = new ArmorBase("lime_leather_wool_helmet",LIME_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.HEAD);
        public static final Item LIME_LEATHER_WOOL_CHESTPLATE = new ArmorBase("lime_leather_wool_chestplate",LIME_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.CHEST);
        public static final Item LIME_LEATHER_WOOL_LEGGINGS = new ArmorBase("lime_leather_wool_leggings",LIME_ARMOR_MATERIAL_LEATHER_WOOL, 2, EntityEquipmentSlot.LEGS);
        public static final Item LIME_LEATHER_WOOL_BOOTS = new ArmorBase("lime_leather_wool_boots",LIME_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.FEET);

        public static final Item GREEN_LEATHER_WOOL_HELMET = new ArmorBase("green_leather_wool_helmet",GREEN_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.HEAD);
        public static final Item GREEN_LEATHER_WOOL_CHESTPLATE = new ArmorBase("green_leather_wool_chestplate",GREEN_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.CHEST);
        public static final Item GREEN_LEATHER_WOOL_LEGGINGS = new ArmorBase("green_leather_wool_leggings",GREEN_ARMOR_MATERIAL_LEATHER_WOOL, 2, EntityEquipmentSlot.LEGS);
        public static final Item GREEN_LEATHER_WOOL_BOOTS = new ArmorBase("green_leather_wool_boots",GREEN_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.FEET);

        public static final Item LIGHT_BLUE_LEATHER_WOOL_HELMET = new ArmorBase("light_blue_leather_wool_helmet",LIGHT_BLUE_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.HEAD);
        public static final Item LIGHT_BLUE_LEATHER_WOOL_CHESTPLATE = new ArmorBase("light_blue_leather_wool_chestplate",LIGHT_BLUE_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.CHEST);
        public static final Item LIGHT_BLUE_LEATHER_WOOL_LEGGINGS = new ArmorBase("light_blue_leather_wool_leggings",LIGHT_BLUE_ARMOR_MATERIAL_LEATHER_WOOL, 2, EntityEquipmentSlot.LEGS);
        public static final Item LIGHT_BLUE_LEATHER_WOOL_BOOTS = new ArmorBase("light_blue_leather_wool_boots",LIGHT_BLUE_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.FEET);

        public static final Item CYAN_BLUE_LEATHER_WOOL_HELMET = new ArmorBase("cyan_leather_wool_helmet",CYAN_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.HEAD);
        public static final Item CYAN_BLUE_LEATHER_WOOL_CHESTPLATE = new ArmorBase("cyan_leather_wool_chestplate",CYAN_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.CHEST);
        public static final Item CYAN_BLUE_LEATHER_WOOL_LEGGINGS = new ArmorBase("cyan_leather_wool_leggings",CYAN_ARMOR_MATERIAL_LEATHER_WOOL, 2, EntityEquipmentSlot.LEGS);
        public static final Item CYAN_BLUE_LEATHER_WOOL_BOOTS = new ArmorBase("cyan_leather_wool_boots",CYAN_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.FEET);

        public static final Item BLUE_LEATHER_WOOL_HELMET = new ArmorBase("blue_leather_wool_helmet",BLUE_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.HEAD);
        public static final Item BLUE_LEATHER_WOOL_CHESTPLATE = new ArmorBase("blue_leather_wool_chestplate",BLUE_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.CHEST);
        public static final Item BLUE_LEATHER_WOOL_LEGGINGS = new ArmorBase("blue_leather_wool_leggings",BLUE_ARMOR_MATERIAL_LEATHER_WOOL, 2, EntityEquipmentSlot.LEGS);
        public static final Item BLUE_LEATHER_WOOL_BOOTS = new ArmorBase("blue_leather_wool_boots",BLUE_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.FEET);

        public static final Item PURPLE_LEATHER_WOOL_HELMET = new ArmorBase("purple_leather_wool_helmet",PURPLE_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.HEAD);
        public static final Item PURPLE_LEATHER_WOOL_CHESTPLATE = new ArmorBase("purple_leather_wool_chestplate",PURPLE_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.CHEST);
        public static final Item PURPLE_LEATHER_WOOL_LEGGINGS = new ArmorBase("purple_leather_wool_leggings",PURPLE_ARMOR_MATERIAL_LEATHER_WOOL, 2, EntityEquipmentSlot.LEGS);
        public static final Item PURPLE_LEATHER_WOOL_BOOTS = new ArmorBase("purple_leather_wool_boots",PURPLE_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.FEET);

        public static final Item PINK_LEATHER_WOOL_HELMET = new ArmorBase("pink_leather_wool_helmet",PINK_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.HEAD);
        public static final Item PINK_LEATHER_WOOL_CHESTPLATE = new ArmorBase("pink_leather_wool_chestplate",PINK_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.CHEST);
        public static final Item PINK_LEATHER_WOOL_LEGGINGS = new ArmorBase("pink_leather_wool_leggings",PINK_ARMOR_MATERIAL_LEATHER_WOOL, 2, EntityEquipmentSlot.LEGS);
        public static final Item PINK_LEATHER_WOOL_BOOTS = new ArmorBase("pink_leather_wool_boots",PINK_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.FEET);

        public static final Item GRAY_LEATHER_WOOL_HELMET = new ArmorBase("gray_leather_wool_helmet",GRAY_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.HEAD);
        public static final Item GRAY_LEATHER_WOOL_CHESTPLATE = new ArmorBase("gray_leather_wool_chestplate",GRAY_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.CHEST);
        public static final Item GRAY_LEATHER_WOOL_LEGGINGS = new ArmorBase("gray_leather_wool_leggings",GRAY_ARMOR_MATERIAL_LEATHER_WOOL, 2, EntityEquipmentSlot.LEGS);
        public static final Item GRAY_LEATHER_WOOL_BOOTS = new ArmorBase("gray_leather_wool_boots",GRAY_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.FEET);

        public static final Item LIGHT_GRAY_LEATHER_WOOL_HELMET = new ArmorBase("light_gray_leather_wool_helmet",LIGHT_GRAY_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.HEAD);
        public static final Item LIGHT_GRAY_LEATHER_WOOL_CHESTPLATE = new ArmorBase("light_gray_leather_wool_chestplate",LIGHT_GRAY_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.CHEST);
        public static final Item LIGHT_GRAY_LEATHER_WOOL_LEGGINGS = new ArmorBase("light_gray_leather_wool_leggings",LIGHT_GRAY_ARMOR_MATERIAL_LEATHER_WOOL, 2, EntityEquipmentSlot.LEGS);
        public static final Item LIGHT_GRAY_LEATHER_WOOL_BOOTS = new ArmorBase("light_gray_leather_wool_boots",LIGHT_GRAY_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.FEET);

        public static final Item BLACK_LEATHER_WOOL_HELMET = new ArmorBase("black_leather_wool_helmet",BLACK_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.HEAD);
        public static final Item BLACK_LEATHER_WOOL_CHESTPLATE = new ArmorBase("black_leather_wool_chestplate",BLACK_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.CHEST);
        public static final Item BLACK_LEATHER_WOOL_LEGGINGS = new ArmorBase("black_leather_wool_leggings",BLACK_ARMOR_MATERIAL_LEATHER_WOOL, 2, EntityEquipmentSlot.LEGS);
        public static final Item BLACK_LEATHER_WOOL_BOOTS = new ArmorBase("black_leather_wool_boots",BLACK_ARMOR_MATERIAL_LEATHER_WOOL, 1, EntityEquipmentSlot.FEET);

        //leather + chain

        public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_LEATHER_CHAIN = EnumHelper.addArmorMaterial("armor_material_leather_chain", Reference.MOD_ID + ":leather_chain", 20, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);

        //Item leather + chain
        public static final Item LEATHER_CHAIN_HELMET = new ArmorBase("leather_chain_helmet",ARMOR_MATERIAL_LEATHER_CHAIN, 1, EntityEquipmentSlot.HEAD);
        public static final Item LEATHER_CHAIN_CHESTPLATE = new ArmorBase("leather_chain_chestplate",ARMOR_MATERIAL_LEATHER_CHAIN, 1, EntityEquipmentSlot.CHEST);
        public static final Item LEATHER_CHAIN_LEGGINGS = new ArmorBase("leather_chain_leggings",ARMOR_MATERIAL_LEATHER_CHAIN, 2, EntityEquipmentSlot.LEGS);
        public static final Item LEATHER_CHAIN_BOOTS = new ArmorBase("leather_chain_boots",ARMOR_MATERIAL_LEATHER_CHAIN, 1, EntityEquipmentSlot.FEET);


        //leather + gold

        public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_LEATHER_GOLD = EnumHelper.addArmorMaterial("armor_material_leather_gold", Reference.MOD_ID + ":leather_gold", 15, new int[]{1, 2, 3, 1},25, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);

        //Item leather + gold
        public static final Item LEATHER_GOLD_HELMET = new ArmorBase("leather_gold_helmet",ARMOR_MATERIAL_LEATHER_GOLD, 1, EntityEquipmentSlot.HEAD);
        public static final Item LEATHER_GOLD_CHESTPLATE = new ArmorBase("leather_gold_chestplate",ARMOR_MATERIAL_LEATHER_GOLD, 1, EntityEquipmentSlot.CHEST);
        public static final Item LEATHER_GOLD_LEGGINGS = new ArmorBase("leather_gold_leggings",ARMOR_MATERIAL_LEATHER_GOLD, 2, EntityEquipmentSlot.LEGS);
        public static final Item LEATHER_GOLD_BOOTS = new ArmorBase("leather_gold_boots",ARMOR_MATERIAL_LEATHER_GOLD, 1, EntityEquipmentSlot.FEET);


        //leather + iron

        public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_LEATHER_IRON = EnumHelper.addArmorMaterial("armor_material_leather_iron", Reference.MOD_ID + ":leather_iron", 2*5, new int[]{2, 3, 4, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);

        //Item leather + iron
        public static final Item LEATHER_IRON_HELMET = new ArmorBase("leather_iron_helmet",ARMOR_MATERIAL_LEATHER_IRON, 1, EntityEquipmentSlot.HEAD);
        public static final Item LEATHER_IRON_CHESTPLATE = new ArmorBase("leather_iron_chestplate",ARMOR_MATERIAL_LEATHER_IRON, 1, EntityEquipmentSlot.CHEST);
        public static final Item LEATHER_IRON_LEGGINGS = new ArmorBase("leather_iron_leggings",ARMOR_MATERIAL_LEATHER_IRON, 2, EntityEquipmentSlot.LEGS);
        public static final Item LEATHER_IRON_BOOTS = new ArmorBase("leather_iron_boots",ARMOR_MATERIAL_LEATHER_IRON, 1, EntityEquipmentSlot.FEET);




}
