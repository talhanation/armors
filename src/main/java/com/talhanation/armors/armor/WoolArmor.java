package com.talhanation.armors.armor;

import com.talhanation.armors.Reference;
import com.talhanation.armors.init.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import java.util.ArrayList;
import java.util.List;

public class WoolArmor {

    static final CreativeTabs armors = (new CreativeTabs("Armors") {

        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(IronArmor.RED_IRON_WOOL_CHESTPLATE);
        }

    });


    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item CHAIN = new ItemBase("chain");

    //WOOL//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_WOOL = EnumHelper.addArmorMaterial("armor_material_wool", Reference.MOD_ID + ":wool", 6, new int[]{1,2,2,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
    public static final ItemArmor.ArmorMaterial RED_ARMOR_MATERIAL_WOOL = EnumHelper.addArmorMaterial("armor_material_wool", Reference.MOD_ID + ":wool", 6, new int[]{1,2,2,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
    public static final ItemArmor.ArmorMaterial ORANGE_ARMOR_MATERIAL_WOOL = EnumHelper.addArmorMaterial("armor_material_wool", Reference.MOD_ID + ":wool", 6, new int[]{1,2,2,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
    public static final ItemArmor.ArmorMaterial MAGENTA_ARMOR_MATERIAL_WOOL = EnumHelper.addArmorMaterial("armor_material_wool", Reference.MOD_ID + ":wool", 6, new int[]{1,2,2,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
     public static final ItemArmor.ArmorMaterial BROWN_ARMOR_MATERIAL_WOOL = EnumHelper.addArmorMaterial("armor_material_wool", Reference.MOD_ID + ":wool", 6, new int[]{1,2,2,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
     public static final ItemArmor.ArmorMaterial YELLOW_ARMOR_MATERIAL_WOOL = EnumHelper.addArmorMaterial("armor_material_wool", Reference.MOD_ID + ":wool", 6, new int[]{1,2,2,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
     public static final ItemArmor.ArmorMaterial LIME_ARMOR_MATERIAL_WOOL = EnumHelper.addArmorMaterial("armor_material_wool", Reference.MOD_ID + ":wool", 6, new int[]{1,2,2,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
     public static final ItemArmor.ArmorMaterial GREEN_ARMOR_MATERIAL_WOOL = EnumHelper.addArmorMaterial("armor_material_wool", Reference.MOD_ID + ":wool", 6, new int[]{1,2,2,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
     public static final ItemArmor.ArmorMaterial LIGHT_BLUE_ARMOR_MATERIAL_WOOL = EnumHelper.addArmorMaterial("armor_material_wool", Reference.MOD_ID + ":wool", 6, new int[]{1,2,2,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
     public static final ItemArmor.ArmorMaterial CYAN_ARMOR_MATERIAL_WOOL = EnumHelper.addArmorMaterial("armor_material_wool", Reference.MOD_ID + ":wool", 6, new int[]{1,2,2,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
     public static final ItemArmor.ArmorMaterial BLUE_ARMOR_MATERIAL_WOOL = EnumHelper.addArmorMaterial("armor_material_wool", Reference.MOD_ID + ":wool", 6, new int[]{1,2,2,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
     public static final ItemArmor.ArmorMaterial PURPLE_ARMOR_MATERIAL_WOOL = EnumHelper.addArmorMaterial("armor_material_wool", Reference.MOD_ID + ":wool", 6, new int[]{1,2,2,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
     public static final ItemArmor.ArmorMaterial PINK_ARMOR_MATERIAL_WOOL = EnumHelper.addArmorMaterial("armor_material_wool", Reference.MOD_ID + ":wool", 6, new int[]{1,2,2,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
     public static final ItemArmor.ArmorMaterial GRAY_ARMOR_MATERIAL_WOOL = EnumHelper.addArmorMaterial("armor_material_wool", Reference.MOD_ID + ":wool", 6, new int[]{1,2,2,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
     public static final ItemArmor.ArmorMaterial LIGHT_GRAY_ARMOR_MATERIAL_WOOL = EnumHelper.addArmorMaterial("armor_material_wool", Reference.MOD_ID + ":wool", 6, new int[]{1,2,2,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
     public static final ItemArmor.ArmorMaterial BLACK_ARMOR_MATERIAL_WOOL = EnumHelper.addArmorMaterial("armor_material_wool", Reference.MOD_ID + ":wool", 6, new int[]{1,2,2,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);

     //Item Wool
    public static final Item WOOL_HELMET = new ArmorBase("wool_helmet",ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item WOOL_CHESTPLATE = new ArmorBase("wool_chestplate",ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item WOOL_LEGGINGS = new ArmorBase("wool_leggings",ARMOR_MATERIAL_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item WOOL_BOOTS = new ArmorBase("wool_boots",ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item RED_WOOL_HELMET = new ArmorBase("red_wool_helmet",RED_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item RED_WOOL_CHESTPLATE = new ArmorBase("red_wool_chestplate",RED_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item RED_WOOL_LEGGINGS = new ArmorBase("red_wool_leggings",RED_ARMOR_MATERIAL_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item RED_WOOL_BOOTS = new ArmorBase("red_wool_boots",RED_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item ORANGE_WOOL_HELMET = new ArmorBase("orange_wool_helmet",ORANGE_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item ORANGE_WOOL_CHESTPLATE = new ArmorBase("orange_wool_chestplate",ORANGE_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item ORANGE_WOOL_LEGGINGS = new ArmorBase("orange_wool_leggings",ORANGE_ARMOR_MATERIAL_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item ORANGE_WOOL_BOOTS = new ArmorBase("orange_wool_boots",ORANGE_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item MAGENTA_WOOL_HELMET = new ArmorBase("magenta_wool_helmet",MAGENTA_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item MAGENTA_WOOL_CHESTPLATE = new ArmorBase("magenta_wool_chestplate",MAGENTA_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item MAGENTA_WOOL_LEGGINGS = new ArmorBase("magenta_wool_leggings",MAGENTA_ARMOR_MATERIAL_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item MAGENTA_WOOL_BOOTS = new ArmorBase("magenta_wool_boots",MAGENTA_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item BROWN_WOOL_HELMET = new ArmorBase("brown_wool_helmet",BROWN_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item BROWN_WOOL_CHESTPLATE = new ArmorBase("brown_wool_chestplate",BROWN_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item BROWN_WOOL_LEGGINGS = new ArmorBase("brown_wool_leggings",BROWN_ARMOR_MATERIAL_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item BROWN_WOOL_BOOTS = new ArmorBase("brown_wool_boots",BROWN_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item YELLOW_WOOL_HELMET = new ArmorBase("yellow_wool_helmet",YELLOW_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item YELLOW_WOOL_CHESTPLATE = new ArmorBase("yellow_wool_chestplate",YELLOW_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item YELLOW_WOOL_LEGGINGS = new ArmorBase("yellow_wool_leggings",YELLOW_ARMOR_MATERIAL_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item YELLOW_WOOL_BOOTS = new ArmorBase("yellow_wool_boots",YELLOW_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item LIME_WOOL_HELMET = new ArmorBase("lime_wool_helmet",LIME_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIME_WOOL_CHESTPLATE = new ArmorBase("lime_wool_chestplate",LIME_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIME_WOOL_LEGGINGS = new ArmorBase("lime_wool_leggings",LIME_ARMOR_MATERIAL_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIME_WOOL_BOOTS = new ArmorBase("lime_wool_boots",LIME_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item GREEN_WOOL_HELMET = new ArmorBase("green_wool_helmet",GREEN_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item GREEN_WOOL_CHESTPLATE = new ArmorBase("green_wool_chestplate",GREEN_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item GREEN_WOOL_LEGGINGS = new ArmorBase("green_wool_leggings",GREEN_ARMOR_MATERIAL_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item GREEN_WOOL_BOOTS = new ArmorBase("green_wool_boots",GREEN_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item LIGHT_BLUE_WOOL_HELMET = new ArmorBase("light_blue_wool_helmet",LIGHT_BLUE_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIGHT_BLUE_WOOL_CHESTPLATE = new ArmorBase("light_blue_wool_chestplate",LIGHT_BLUE_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIGHT_BLUE_WOOL_LEGGINGS = new ArmorBase("light_blue_wool_leggings",LIGHT_BLUE_ARMOR_MATERIAL_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIGHT_BLUE_WOOL_BOOTS = new ArmorBase("light_blue_wool_boots",LIGHT_BLUE_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item CYAN_BLUE_WOOL_HELMET = new ArmorBase("cyan_wool_helmet",CYAN_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item CYAN_BLUE_WOOL_CHESTPLATE = new ArmorBase("cyan_wool_chestplate",CYAN_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item CYAN_BLUE_WOOL_LEGGINGS = new ArmorBase("cyan_wool_leggings",CYAN_ARMOR_MATERIAL_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item CYAN_BLUE_WOOL_BOOTS = new ArmorBase("cyan_wool_boots",CYAN_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item BLUE_WOOL_HELMET = new ArmorBase("blue_wool_helmet",BLUE_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLUE_WOOL_CHESTPLATE = new ArmorBase("blue_wool_chestplate",BLUE_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLUE_WOOL_LEGGINGS = new ArmorBase("blue_wool_leggings",BLUE_ARMOR_MATERIAL_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLUE_WOOL_BOOTS = new ArmorBase("blue_wool_boots",BLUE_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item PURPLE_WOOL_HELMET = new ArmorBase("purple_wool_helmet",PURPLE_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item PURPLE_WOOL_CHESTPLATE = new ArmorBase("purple_wool_chestplate",PURPLE_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item PURPLE_WOOL_LEGGINGS = new ArmorBase("purple_wool_leggings",PURPLE_ARMOR_MATERIAL_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item PURPLE_WOOL_BOOTS = new ArmorBase("purple_wool_boots",PURPLE_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item PINK_WOOL_HELMET = new ArmorBase("pink_wool_helmet",PINK_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item PINK_WOOL_CHESTPLATE = new ArmorBase("pink_wool_chestplate",PINK_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item PINK_WOOL_LEGGINGS = new ArmorBase("pink_wool_leggings",PINK_ARMOR_MATERIAL_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item PINK_WOOL_BOOTS = new ArmorBase("pink_wool_boots",PINK_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item GRAY_WOOL_HELMET = new ArmorBase("gray_wool_helmet",GRAY_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item GRAY_WOOL_CHESTPLATE = new ArmorBase("gray_wool_chestplate",GRAY_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item GRAY_WOOL_LEGGINGS = new ArmorBase("gray_wool_leggings",GRAY_ARMOR_MATERIAL_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item GRAY_WOOL_BOOTS = new ArmorBase("gray_wool_boots",GRAY_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item LIGHT_GRAY_WOOL_HELMET = new ArmorBase("light_gray_wool_helmet",LIGHT_GRAY_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIGHT_GRAY_WOOL_CHESTPLATE = new ArmorBase("light_gray_wool_chestplate",LIGHT_GRAY_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIGHT_GRAY_WOOL_LEGGINGS = new ArmorBase("light_gray_wool_leggings",LIGHT_GRAY_ARMOR_MATERIAL_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIGHT_GRAY_WOOL_BOOTS = new ArmorBase("light_gray_wool_boots",LIGHT_GRAY_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.FEET);

    public static final Item BLACK_WOOL_HELMET = new ArmorBase("black_wool_helmet",BLACK_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLACK_WOOL_CHESTPLATE = new ArmorBase("black_wool_chestplate",BLACK_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLACK_WOOL_LEGGINGS = new ArmorBase("black_wool_leggings",BLACK_ARMOR_MATERIAL_WOOL, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLACK_WOOL_BOOTS = new ArmorBase("black_wool_boots",BLACK_ARMOR_MATERIAL_WOOL, 1, EntityEquipmentSlot.FEET);


    //WOOL + LEATHER*///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_WOOL_LEATHER = EnumHelper.addArmorMaterial("armor_material_wool_leather", Reference.MOD_ID + ":wool_leather", 7, new int[]{1,2,3,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
    public static final ItemArmor.ArmorMaterial RED_ARMOR_MATERIAL_WOOL_LEATHER = EnumHelper.addArmorMaterial("armor_material_wool_leather", Reference.MOD_ID + ":wool_leather", 7, new int[]{1,2,3,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
    public static final ItemArmor.ArmorMaterial ORANGE_ARMOR_MATERIAL_WOOL_LEATHER = EnumHelper.addArmorMaterial("armor_material_wool_leather", Reference.MOD_ID + ":wool_leather", 7, new int[]{1,2,3,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
    public static final ItemArmor.ArmorMaterial MAGENTA_ARMOR_MATERIAL_WOOL_LEATHER = EnumHelper.addArmorMaterial("armor_material_wool_leather", Reference.MOD_ID + ":wool_leather", 7, new int[]{1,2,3,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);

        public static final ItemArmor.ArmorMaterial BROWN_ARMOR_MATERIAL_WOOL_LEATHER = EnumHelper.addArmorMaterial("armor_material_wool_leather", Reference.MOD_ID + ":wool_leather", 7, new int[]{1,2,3,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial YELLOW_ARMOR_MATERIAL_WOOL_LEATHER = EnumHelper.addArmorMaterial("armor_material_wool_leather", Reference.MOD_ID + ":wool_leather", 7, new int[]{1,2,3,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial LIME_ARMOR_MATERIAL_WOOL_LEATHER = EnumHelper.addArmorMaterial("armor_material_wool_leather", Reference.MOD_ID + ":wool_leather", 7, new int[]{1,2,3,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial GREEN_ARMOR_MATERIAL_WOOL_LEATHER = EnumHelper.addArmorMaterial("armor_material_wool_leather", Reference.MOD_ID + ":wool_leather", 7, new int[]{1,2,3,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial LIGHT_BLUE_ARMOR_MATERIAL_WOOL_LEATHER = EnumHelper.addArmorMaterial("armor_material_wool_leather", Reference.MOD_ID + ":wool_leather", 7, new int[]{1,2,3,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial CYAN_ARMOR_MATERIAL_WOOL_LEATHER = EnumHelper.addArmorMaterial("armor_material_wool_leather", Reference.MOD_ID + ":wool_leather", 7, new int[]{1,2,3,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial BLUE_ARMOR_MATERIAL_WOOL_LEATHER = EnumHelper.addArmorMaterial("armor_material_wool_leather", Reference.MOD_ID + ":wool_leather", 7, new int[]{1,2,3,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial PURPLE_ARMOR_MATERIAL_WOOL_LEATHER = EnumHelper.addArmorMaterial("armor_material_wool_leather", Reference.MOD_ID + ":wool_leather", 7, new int[]{1,2,3,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial PINK_ARMOR_MATERIAL_WOOL_LEATHER = EnumHelper.addArmorMaterial("armor_material_wool_leather", Reference.MOD_ID + ":wool_leather", 7, new int[]{1,2,3,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial GRAY_ARMOR_MATERIAL_WOOL_LEATHER = EnumHelper.addArmorMaterial("armor_material_wool_leather", Reference.MOD_ID + ":wool_leather", 7, new int[]{1,2,3,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial LIGHT_GRAY_ARMOR_MATERIAL_WOOL_LEATHER = EnumHelper.addArmorMaterial("armor_material_wool_leather", Reference.MOD_ID + ":wool_leather", 7, new int[]{1,2,3,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
        public static final ItemArmor.ArmorMaterial BLACK_ARMOR_MATERIAL_WOOL_LEATHER = EnumHelper.addArmorMaterial("armor_material_wool_leather", Reference.MOD_ID + ":wool_leather", 7, new int[]{1,2,3,1},10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);

    //Item Wool + leather
    public static final Item WOOL_LEATHER_HELMET = new ArmorBase("wool_leather_helmet",ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.HEAD);
    public static final Item WOOL_LEATHER_CHESTPLATE = new ArmorBase("wool_leather_chestplate",ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.CHEST);
    public static final Item WOOL_LEATHER_LEGGINGS = new ArmorBase("wool_leather_leggings",ARMOR_MATERIAL_WOOL_LEATHER, 2, EntityEquipmentSlot.LEGS);
    public static final Item WOOL_LEATHER_BOOTS = new ArmorBase("wool_leather_boots",ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.FEET);

    public static final Item RED_WOOL_LEATHER_HELMET = new ArmorBase("red_wool_leather_helmet",RED_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.HEAD);
    public static final Item RED_WOOL_LEATHER_CHESTPLATE = new ArmorBase("red_wool_leather_chestplate",RED_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.CHEST);
    public static final Item RED_WOOL_LEATHER_LEGGINGS = new ArmorBase("red_wool_leather_leggings",RED_ARMOR_MATERIAL_WOOL_LEATHER, 2, EntityEquipmentSlot.LEGS);
    public static final Item RED_WOOL_LEATHER_BOOTS = new ArmorBase("red_wool_leather_boots",RED_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.FEET);

    public static final Item ORANGE_WOOL_LEATHER_HELMET = new ArmorBase("orange_wool_leather_helmet",ORANGE_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.HEAD);
    public static final Item ORANGE_WOOL_LEATHER_CHESTPLATE = new ArmorBase("orange_wool_leather_chestplate",ORANGE_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.CHEST);
    public static final Item ORANGE_WOOL_LEATHER_LEGGINGS = new ArmorBase("orange_wool_leather_leggings",ORANGE_ARMOR_MATERIAL_WOOL_LEATHER, 2, EntityEquipmentSlot.LEGS);
    public static final Item ORANGE_WOOL_LEATHER_BOOTS = new ArmorBase("orange_wool_leather_boots",ORANGE_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.FEET);

    public static final Item MAGENTA_WOOL_LEATHER_HELMET = new ArmorBase("magenta_wool_leather_helmet",MAGENTA_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.HEAD);
    public static final Item MAGENTA_WOOL_LEATHER_CHESTPLATE = new ArmorBase("magenta_wool_leather_chestplate",MAGENTA_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.CHEST);
    public static final Item MAGENTA_WOOL_LEATHER_LEGGINGS = new ArmorBase("magenta_wool_leather_leggings",MAGENTA_ARMOR_MATERIAL_WOOL_LEATHER, 2, EntityEquipmentSlot.LEGS);
    public static final Item MAGENTA_WOOL_LEATHER_BOOTS = new ArmorBase("magenta_wool_leather_boots",MAGENTA_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.FEET);

    public static final Item BROWN_WOOL_LEATHER_HELMET = new ArmorBase("brown_wool_leather_helmet",BROWN_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.HEAD);
    public static final Item BROWN_WOOL_LEATHER_CHESTPLATE = new ArmorBase("brown_wool_leather_chestplate",BROWN_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.CHEST);
    public static final Item BROWN_WOOL_LEATHER_LEGGINGS = new ArmorBase("brown_wool_leather_leggings",BROWN_ARMOR_MATERIAL_WOOL_LEATHER, 2, EntityEquipmentSlot.LEGS);
    public static final Item BROWN_WOOL_LEATHER_BOOTS = new ArmorBase("brown_wool_leather_boots",BROWN_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.FEET);

    public static final Item YELLOW_WOOL_LEATHER_HELMET = new ArmorBase("yellow_wool_leather_helmet",YELLOW_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.HEAD);
    public static final Item YELLOW_WOOL_LEATHER_CHESTPLATE = new ArmorBase("yellow_wool_leather_chestplate",YELLOW_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.CHEST);
    public static final Item YELLOW_WOOL_LEATHER_LEGGINGS = new ArmorBase("yellow_wool_leather_leggings",YELLOW_ARMOR_MATERIAL_WOOL_LEATHER, 2, EntityEquipmentSlot.LEGS);
    public static final Item YELLOW_WOOL_LEATHER_BOOTS = new ArmorBase("yellow_wool_leather_boots",YELLOW_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.FEET);

    public static final Item LIME_WOOL_LEATHER_HELMET = new ArmorBase("lime_wool_leather_helmet",LIME_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIME_WOOL_LEATHER_CHESTPLATE = new ArmorBase("lime_wool_leather_chestplate",LIME_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIME_WOOL_LEATHER_LEGGINGS = new ArmorBase("lime_wool_leather_leggings",LIME_ARMOR_MATERIAL_WOOL_LEATHER, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIME_WOOL_LEATHER_BOOTS = new ArmorBase("lime_wool_leather_boots",LIME_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.FEET);

    public static final Item GREEN_WOOL_LEATHER_HELMET = new ArmorBase("green_wool_leather_helmet",GREEN_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.HEAD);
    public static final Item GREEN_WOOL_LEATHER_CHESTPLATE = new ArmorBase("green_wool_leather_chestplate",GREEN_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.CHEST);
    public static final Item GREEN_WOOL_LEATHER_LEGGINGS = new ArmorBase("green_wool_leather_leggings",GREEN_ARMOR_MATERIAL_WOOL_LEATHER, 2, EntityEquipmentSlot.LEGS);
    public static final Item GREEN_WOOL_LEATHER_BOOTS = new ArmorBase("green_wool_leather_boots",GREEN_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.FEET);

    public static final Item LIGHT_BLUE_WOOL_LEATHER_HELMET = new ArmorBase("light_blue_wool_leather_helmet",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIGHT_BLUE_WOOL_LEATHER_CHESTPLATE = new ArmorBase("light_blue_wool_leather_chestplate",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIGHT_BLUE_WOOL_LEATHER_LEGGINGS = new ArmorBase("light_blue_wool_leather_leggings",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_LEATHER, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIGHT_BLUE_WOOL_LEATHER_BOOTS = new ArmorBase("light_blue_wool_leather_boots",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.FEET);

    public static final Item CYAN_BLUE_WOOL_LEATHER_HELMET = new ArmorBase("cyan_wool_leather_helmet",CYAN_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.HEAD);
    public static final Item CYAN_BLUE_WOOL_LEATHER_CHESTPLATE = new ArmorBase("cyan_wool_leather_chestplate",CYAN_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.CHEST);
    public static final Item CYAN_BLUE_WOOL_LEATHER_LEGGINGS = new ArmorBase("cyan_wool_leather_leggings",CYAN_ARMOR_MATERIAL_WOOL_LEATHER, 2, EntityEquipmentSlot.LEGS);
    public static final Item CYAN_BLUE_WOOL_LEATHER_BOOTS = new ArmorBase("cyan_wool_leather_boots",CYAN_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.FEET);

    public static final Item BLUE_WOOL_LEATHER_HELMET = new ArmorBase("blue_wool_leather_helmet",BLUE_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLUE_WOOL_LEATHER_CHESTPLATE = new ArmorBase("blue_wool_leather_chestplate",BLUE_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLUE_WOOL_LEATHER_LEGGINGS = new ArmorBase("blue_wool_leather_leggings",BLUE_ARMOR_MATERIAL_WOOL_LEATHER, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLUE_WOOL_LEATHER_BOOTS = new ArmorBase("blue_wool_leather_boots",BLUE_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.FEET);

    public static final Item PURPLE_WOOL_LEATHER_HELMET = new ArmorBase("purple_wool_leather_helmet",PURPLE_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.HEAD);
    public static final Item PURPLE_WOOL_LEATHER_CHESTPLATE = new ArmorBase("purple_wool_leather_chestplate",PURPLE_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.CHEST);
    public static final Item PURPLE_WOOL_LEATHER_LEGGINGS = new ArmorBase("purple_wool_leather_leggings",PURPLE_ARMOR_MATERIAL_WOOL_LEATHER, 2, EntityEquipmentSlot.LEGS);
    public static final Item PURPLE_WOOL_LEATHER_BOOTS = new ArmorBase("purple_wool_leather_boots",PURPLE_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.FEET);


    public static final Item PINK_WOOL_LEATHER_HELMET = new ArmorBase("pink_wool_leather_helmet",PINK_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.HEAD);
    public static final Item PINK_WOOL_LEATHER_CHESTPLATE = new ArmorBase("pink_wool_leather_chestplate",PINK_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.CHEST);
    public static final Item PINK_WOOL_LEATHER_LEGGINGS = new ArmorBase("pink_wool_leather_leggings",PINK_ARMOR_MATERIAL_WOOL_LEATHER, 2, EntityEquipmentSlot.LEGS);
    public static final Item PINK_WOOL_LEATHER_BOOTS = new ArmorBase("pink_wool_leather_boots",PINK_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.FEET);

    public static final Item GRAY_WOOL_LEATHER_HELMET = new ArmorBase("gray_wool_leather_helmet",GRAY_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.HEAD);
    public static final Item GRAY_WOOL_LEATHER_CHESTPLATE = new ArmorBase("gray_wool_leather_chestplate",GRAY_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.CHEST);
    public static final Item GRAY_WOOL_LEATHER_LEGGINGS = new ArmorBase("gray_wool_leather_leggings",GRAY_ARMOR_MATERIAL_WOOL_LEATHER, 2, EntityEquipmentSlot.LEGS);
    public static final Item GRAY_WOOL_LEATHER_BOOTS = new ArmorBase("gray_wool_leather_boots",GRAY_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.FEET);

    public static final Item LIGHT_GRAY_WOOL_LEATHER_HELMET = new ArmorBase("light_gray_wool_leather_helmet",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIGHT_GRAY_WOOL_LEATHER_CHESTPLATE = new ArmorBase("light_gray_wool_leather_chestplate",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIGHT_GRAY_WOOL_LEATHER_LEGGINGS = new ArmorBase("light_gray_wool_leather_leggings",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_LEATHER, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIGHT_GRAY_WOOL_LEATHER_BOOTS = new ArmorBase("light_gray_wool_leather_boots",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.FEET);

    public static final Item BLACK_WOOL_LEATHER_HELMET = new ArmorBase("black_wool_leather_helmet",BLACK_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLACK_WOOL_LEATHER_CHESTPLATE = new ArmorBase("black_wool_leather_chestplate",BLACK_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLACK_WOOL_LEATHER_LEGGINGS = new ArmorBase("black_wool_leather_leggings",BLACK_ARMOR_MATERIAL_WOOL_LEATHER, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLACK_WOOL_LEATHER_BOOTS = new ArmorBase("black_wool_leather_boots",BLACK_ARMOR_MATERIAL_WOOL_LEATHER, 1, EntityEquipmentSlot.FEET);


    //WOOL + CHAIN*///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_WOOL_CHAIN = EnumHelper.addArmorMaterial("armor_material_wool_chain", Reference.MOD_ID + ":wool_chain", 12, new int[]{1,3,3,2},10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial RED_ARMOR_MATERIAL_WOOL_CHAIN = EnumHelper.addArmorMaterial("armor_material_wool_chain", Reference.MOD_ID + ":wool_chain", 12, new int[]{1,3,3,2},10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ORANGE_ARMOR_MATERIAL_WOOL_CHAIN = EnumHelper.addArmorMaterial("armor_material_wool_chain", Reference.MOD_ID + ":wool_chain", 12, new int[]{1,3,3,2},10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial BROWN_ARMOR_MATERIAL_WOOL_CHAIN = EnumHelper.addArmorMaterial("armor_material_wool_chain", Reference.MOD_ID + ":wool_chain", 12, new int[]{1,3,3,2},10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial YELLOW_ARMOR_MATERIAL_WOOL_CHAIN = EnumHelper.addArmorMaterial("armor_material_wool_chain", Reference.MOD_ID + ":wool_chain", 12, new int[]{1,3,3,2},10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial LIME_ARMOR_MATERIAL_WOOL_CHAIN = EnumHelper.addArmorMaterial("armor_material_wool_chain", Reference.MOD_ID + ":wool_chain", 12, new int[]{1,3,3,2},10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial GREEN_ARMOR_MATERIAL_WOOL_CHAIN = EnumHelper.addArmorMaterial("armor_material_wool_chain", Reference.MOD_ID + ":wool_chain", 12, new int[]{1,3,3,2},10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial LIGHT_BLUE_ARMOR_MATERIAL_WOOL_CHAIN = EnumHelper.addArmorMaterial("armor_material_wool_chain", Reference.MOD_ID + ":wool_chain", 12, new int[]{1,3,3,2},10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial CYAN_ARMOR_MATERIAL_WOOL_CHAIN = EnumHelper.addArmorMaterial("armor_material_wool_chain", Reference.MOD_ID + ":wool_chain", 12, new int[]{1,3,3,2},10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial BLUE_ARMOR_MATERIAL_WOOL_CHAIN = EnumHelper.addArmorMaterial("armor_material_wool_chain", Reference.MOD_ID + ":wool_chain", 12, new int[]{1,3,3,2},10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial PURPLE_ARMOR_MATERIAL_WOOL_CHAIN = EnumHelper.addArmorMaterial("armor_material_wool_chain", Reference.MOD_ID + ":wool_chain", 12, new int[]{1,3,3,2},10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial MAGENTA_ARMOR_MATERIAL_WOOL_CHAIN = EnumHelper.addArmorMaterial("armor_material_wool_chain", Reference.MOD_ID + ":wool_chain", 12, new int[]{1,3,3,2},10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial PINK_ARMOR_MATERIAL_WOOL_CHAIN = EnumHelper.addArmorMaterial("armor_material_wool_chain", Reference.MOD_ID + ":wool_chain", 12, new int[]{1,3,3,2},10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial GRAY_ARMOR_MATERIAL_WOOL_CHAIN = EnumHelper.addArmorMaterial("armor_material_wool_chain", Reference.MOD_ID + ":wool_chain", 12, new int[]{1,3,3,2},10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial LIGHT_GRAY_ARMOR_MATERIAL_WOOL_CHAIN = EnumHelper.addArmorMaterial("armor_material_wool_chain", Reference.MOD_ID + ":wool_chain", 12, new int[]{1,3,3,2},10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial BLACK_ARMOR_MATERIAL_WOOL_CHAIN = EnumHelper.addArmorMaterial("armor_material_wool_chain", Reference.MOD_ID + ":wool_chain", 12, new int[]{1,3,3,2},10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);


    //Item Wool + Chain
    public static final Item WOOL_CHAIN_HELMET = new ArmorBase("wool_chain_helmet",ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item WOOL_CHAIN_CHESTPLATE = new ArmorBase("wool_chain_chestplate",ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item WOOL_CHAIN_LEGGINGS = new ArmorBase("wool_chain_leggings",ARMOR_MATERIAL_WOOL_CHAIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item WOOL_CHAIN_BOOTS = new ArmorBase("wool_chain_boots",ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.FEET);

    public static final Item RED_WOOL_CHAIN_HELMET = new ArmorBase("red_wool_chain_helmet",RED_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item RED_WOOL_CHAIN_CHESTPLATE = new ArmorBase("red_wool_chain_chestplate",RED_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item RED_WOOL_CHAIN_LEGGINGS = new ArmorBase("red_wool_chain_leggings",RED_ARMOR_MATERIAL_WOOL_CHAIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item RED_WOOL_CHAIN_BOOTS = new ArmorBase("red_wool_chain_boots",RED_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.FEET);

    public static final Item ORANGE_WOOL_CHAIN_HELMET = new ArmorBase("orange_wool_chain_helmet",ORANGE_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item ORANGE_WOOL_CHAIN_CHESTPLATE = new ArmorBase("orange_wool_chain_chestplate",ORANGE_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item ORANGE_WOOL_CHAIN_LEGGINGS = new ArmorBase("orange_wool_chain_leggings",ORANGE_ARMOR_MATERIAL_WOOL_CHAIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item ORANGE_WOOL_CHAIN_BOOTS = new ArmorBase("orange_wool_chain_boots",ORANGE_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.FEET);

    public static final Item BROWN_WOOL_CHAIN_HELMET = new ArmorBase("brown_wool_chain_helmet",BROWN_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item BROWN_WOOL_CHAIN_CHESTPLATE = new ArmorBase("brown_wool_chain_chestplate",BROWN_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item BROWN_WOOL_CHAIN_LEGGINGS = new ArmorBase("brown_wool_chain_leggings",BROWN_ARMOR_MATERIAL_WOOL_CHAIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item BROWN_WOOL_CHAIN_BOOTS = new ArmorBase("brown_wool_chain_boots",BROWN_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.FEET);

    public static final Item YELLOW_WOOL_CHAIN_HELMET = new ArmorBase("yellow_wool_chain_helmet",YELLOW_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item YELLOW_WOOL_CHAIN_CHESTPLATE = new ArmorBase("yellow_wool_chain_chestplate",YELLOW_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item YELLOW_WOOL_CHAIN_LEGGINGS = new ArmorBase("yellow_wool_chain_leggings",YELLOW_ARMOR_MATERIAL_WOOL_CHAIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item YELLOW_WOOL_CHAIN_BOOTS = new ArmorBase("yellow_wool_chain_boots",YELLOW_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.FEET);

    public static final Item LIME_WOOL_CHAIN_HELMET = new ArmorBase("lime_wool_chain_helmet",LIME_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIME_WOOL_CHAIN_CHESTPLATE = new ArmorBase("lime_wool_chain_chestplate",LIME_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIME_WOOL_CHAIN_LEGGINGS = new ArmorBase("lime_wool_chain_leggings",LIME_ARMOR_MATERIAL_WOOL_CHAIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIME_WOOL_CHAIN_BOOTS = new ArmorBase("lime_wool_chain_boots",LIME_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.FEET);

    public static final Item GREEN_WOOL_CHAIN_HELMET = new ArmorBase("green_wool_chain_helmet",GREEN_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item GREEN_WOOL_CHAIN_CHESTPLATE = new ArmorBase("green_wool_chain_chestplate",GREEN_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item GREEN_WOOL_CHAIN_LEGGINGS = new ArmorBase("green_wool_chain_leggings",GREEN_ARMOR_MATERIAL_WOOL_CHAIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item GREEN_WOOL_CHAIN_BOOTS = new ArmorBase("green_wool_chain_boots",GREEN_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.FEET);

    public static final Item LIGHT_BLUE_WOOL_CHAIN_HELMET = new ArmorBase("light_blue_wool_chain_helmet",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIGHT_BLUE_WOOL_CHAIN_CHESTPLATE = new ArmorBase("light_blue_wool_chain_chestplate",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIGHT_BLUE_WOOL_CHAIN_LEGGINGS = new ArmorBase("light_blue_wool_chain_leggings",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_CHAIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIGHT_BLUE_WOOL_CHAIN_BOOTS = new ArmorBase("light_blue_wool_chain_boots",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.FEET);

    public static final Item CYAN_BLUE_WOOL_CHAIN_HELMET = new ArmorBase("cyan_wool_chain_helmet",CYAN_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item CYAN_BLUE_WOOL_CHAIN_CHESTPLATE = new ArmorBase("cyan_wool_chain_chestplate",CYAN_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item CYAN_BLUE_WOOL_CHAIN_LEGGINGS = new ArmorBase("cyan_wool_chain_leggings",CYAN_ARMOR_MATERIAL_WOOL_CHAIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item CYAN_BLUE_WOOL_CHAIN_BOOTS = new ArmorBase("cyan_wool_chain_boots",CYAN_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.FEET);

    public static final Item BLUE_WOOL_CHAIN_HELMET = new ArmorBase("blue_wool_chain_helmet",BLUE_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLUE_WOOL_CHAIN_CHESTPLATE = new ArmorBase("blue_wool_chain_chestplate",BLUE_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLUE_WOOL_CHAIN_LEGGINGS = new ArmorBase("blue_wool_chain_leggings",BLUE_ARMOR_MATERIAL_WOOL_CHAIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLUE_WOOL_CHAIN_BOOTS = new ArmorBase("blue_wool_chain_boots",BLUE_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.FEET);

    public static final Item PURPLE_WOOL_CHAIN_HELMET = new ArmorBase("purple_wool_chain_helmet",PURPLE_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item PURPLE_WOOL_CHAIN_CHESTPLATE = new ArmorBase("purple_wool_chain_chestplate",PURPLE_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item PURPLE_WOOL_CHAIN_LEGGINGS = new ArmorBase("purple_wool_chain_leggings",PURPLE_ARMOR_MATERIAL_WOOL_CHAIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item PURPLE_WOOL_CHAIN_BOOTS = new ArmorBase("purple_wool_chain_boots",PURPLE_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.FEET);

    public static final Item MAGENTA_WOOL_CHAIN_HELMET = new ArmorBase("magenta_wool_chain_helmet",MAGENTA_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item MAGENTA_WOOL_CHAIN_CHESTPLATE = new ArmorBase("magenta_wool_chain_chestplate",MAGENTA_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item MAGENTA_WOOL_CHAIN_LEGGINGS = new ArmorBase("magenta_wool_chain_leggings",MAGENTA_ARMOR_MATERIAL_WOOL_CHAIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item MAGENTA_WOOL_CHAIN_BOOTS = new ArmorBase("magenta_wool_chain_boots",MAGENTA_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.FEET);

    public static final Item PINK_WOOL_CHAIN_HELMET = new ArmorBase("pink_wool_chain_helmet",PINK_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item PINK_WOOL_CHAIN_CHESTPLATE = new ArmorBase("pink_wool_chain_chestplate",PINK_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item PINK_WOOL_CHAIN_LEGGINGS = new ArmorBase("pink_wool_chain_leggings",PINK_ARMOR_MATERIAL_WOOL_CHAIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item PINK_WOOL_CHAIN_BOOTS = new ArmorBase("pink_wool_chain_boots",PINK_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.FEET);

    public static final Item GRAY_WOOL_CHAIN_HELMET = new ArmorBase("gray_wool_chain_helmet",GRAY_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item GRAY_WOOL_CHAIN_CHESTPLATE = new ArmorBase("gray_wool_chain_chestplate",GRAY_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item GRAY_WOOL_CHAIN_LEGGINGS = new ArmorBase("gray_wool_chain_leggings",GRAY_ARMOR_MATERIAL_WOOL_CHAIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item GRAY_WOOL_CHAIN_BOOTS = new ArmorBase("gray_wool_chain_boots",GRAY_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.FEET);

    public static final Item LIGHT_GRAY_WOOL_CHAIN_HELMET = new ArmorBase("light_gray_wool_chain_helmet",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIGHT_GRAY_WOOL_CHAIN_CHESTPLATE = new ArmorBase("light_gray_wool_chain_chestplate",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIGHT_GRAY_WOOL_CHAIN_LEGGINGS = new ArmorBase("light_gray_wool_chain_leggings",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_CHAIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIGHT_GRAY_WOOL_CHAIN_BOOTS = new ArmorBase("light_gray_wool_chain_boots",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.FEET);

    public static final Item BLACK_WOOL_CHAIN_HELMET = new ArmorBase("black_wool_chain_helmet",BLACK_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLACK_WOOL_CHAIN_CHESTPLATE = new ArmorBase("black_wool_chain_chestplate",BLACK_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLACK_WOOL_CHAIN_LEGGINGS = new ArmorBase("black_wool_chain_leggings",BLACK_ARMOR_MATERIAL_WOOL_CHAIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLACK_WOOL_CHAIN_BOOTS = new ArmorBase("black_wool_chain_boots",BLACK_ARMOR_MATERIAL_WOOL_CHAIN, 1, EntityEquipmentSlot.FEET);


    //WOOL + IRON*///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_WOOL_IRON = EnumHelper.addArmorMaterial("armor_material_wool_iron", Reference.MOD_ID + ":wool_iron", 17, new int[]{2, 4, 4, 2},10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial RED_ARMOR_MATERIAL_WOOL_IRON = EnumHelper.addArmorMaterial("armor_material_wool_iron", Reference.MOD_ID + ":wool_iron", 17, new int[]{2, 4, 4, 2},10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial ORANGE_ARMOR_MATERIAL_WOOL_IRON = EnumHelper.addArmorMaterial("armor_material_wool_iron", Reference.MOD_ID + ":wool_iron", 17, new int[]{2, 4, 4, 2},10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial MAGENTA_ARMOR_MATERIAL_WOOL_IRON = EnumHelper.addArmorMaterial("armor_material_wool_iron", Reference.MOD_ID + ":wool_iron", 17, new int[]{2, 4, 4, 2},10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial LIGHT_BLUE_ARMOR_MATERIAL_WOOL_IRON = EnumHelper.addArmorMaterial("armor_material_wool_iron", Reference.MOD_ID + ":wool_iron", 17, new int[]{2, 4, 4, 2},10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

    public static final ItemArmor.ArmorMaterial BROWN_ARMOR_MATERIAL_WOOL_IRON = EnumHelper.addArmorMaterial("armor_material_wool_iron", Reference.MOD_ID + ":wool_iron", 17, new int[]{2, 4, 4, 2},10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial YELLOW_ARMOR_MATERIAL_WOOL_IRON = EnumHelper.addArmorMaterial("armor_material_wool_iron", Reference.MOD_ID + ":wool_iron", 17, new int[]{2, 4, 4, 2},10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial LIME_ARMOR_MATERIAL_WOOL_IRON = EnumHelper.addArmorMaterial("armor_material_wool_iron", Reference.MOD_ID + ":wool_iron", 17, new int[]{2, 4, 4, 2},10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial GREEN_ARMOR_MATERIAL_WOOL_IRON = EnumHelper.addArmorMaterial("armor_material_wool_iron", Reference.MOD_ID + ":wool_iron", 17, new int[]{2, 4, 4, 2},10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
     public static final ItemArmor.ArmorMaterial CYAN_ARMOR_MATERIAL_WOOL_IRON = EnumHelper.addArmorMaterial("armor_material_wool_iron", Reference.MOD_ID + ":wool_iron", 17, new int[]{2, 4, 4, 2},10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial BLUE_ARMOR_MATERIAL_WOOL_IRON = EnumHelper.addArmorMaterial("armor_material_wool_iron", Reference.MOD_ID + ":wool_iron", 17, new int[]{2, 4, 4, 2},10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial PURPLE_ARMOR_MATERIAL_WOOL_IRON = EnumHelper.addArmorMaterial("armor_material_wool_iron", Reference.MOD_ID + ":wool_iron", 17, new int[]{2, 4, 4, 2},10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial PINK_ARMOR_MATERIAL_WOOL_IRON = EnumHelper.addArmorMaterial("armor_material_wool_iron", Reference.MOD_ID + ":wool_iron", 17, new int[]{2, 4, 4, 2},10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial GRAY_ARMOR_MATERIAL_WOOL_IRON = EnumHelper.addArmorMaterial("armor_material_wool_iron", Reference.MOD_ID + ":wool_iron", 17, new int[]{2, 4, 4, 2},10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial LIGHT_GRAY_ARMOR_MATERIAL_WOOL_IRON = EnumHelper.addArmorMaterial("armor_material_wool_iron", Reference.MOD_ID + ":wool_iron", 17, new int[]{2, 4, 4, 2},10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial BLACK_ARMOR_MATERIAL_WOOL_IRON = EnumHelper.addArmorMaterial("armor_material_wool_iron", Reference.MOD_ID + ":wool_iron", 17, new int[]{2, 4, 4, 2},10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

    //Item Wool + iron
    public static final Item WOOL_IRON_HELMET = new ArmorBase("wool_iron_helmet",ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.HEAD);
    public static final Item WOOL_IRON_CHESTPLATE = new ArmorBase("wool_iron_chestplate",ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.CHEST);
    public static final Item WOOL_IRON_LEGGINGS = new ArmorBase("wool_iron_leggings",ARMOR_MATERIAL_WOOL_IRON, 2, EntityEquipmentSlot.LEGS);
    public static final Item WOOL_IRON_BOOTS = new ArmorBase("wool_iron_boots",ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.FEET);

    public static final Item RED_WOOL_IRON_HELMET = new ArmorBase("red_wool_iron_helmet",RED_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.HEAD);
    public static final Item RED_WOOL_IRON_CHESTPLATE = new ArmorBase("red_wool_iron_chestplate",RED_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.CHEST);
    public static final Item RED_WOOL_IRON_LEGGINGS = new ArmorBase("red_wool_iron_leggings",RED_ARMOR_MATERIAL_WOOL_IRON, 2, EntityEquipmentSlot.LEGS);
    public static final Item RED_WOOL_IRON_BOOTS = new ArmorBase("red_wool_iron_boots",RED_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.FEET);

    public static final Item ORANGE_WOOL_IRON_HELMET = new ArmorBase("orange_wool_iron_helmet",ORANGE_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.HEAD);
    public static final Item ORANGE_WOOL_IRON_CHESTPLATE = new ArmorBase("orange_wool_iron_chestplate",ORANGE_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.CHEST);
    public static final Item ORANGE_WOOL_IRON_LEGGINGS = new ArmorBase("orange_wool_iron_leggings",ORANGE_ARMOR_MATERIAL_WOOL_IRON, 2, EntityEquipmentSlot.LEGS);
    public static final Item ORANGE_WOOL_IRON_BOOTS = new ArmorBase("orange_wool_iron_boots",ORANGE_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.FEET);

    public static final Item MAGENTA_WOOL_IRON_HELMET = new ArmorBase("magenta_wool_iron_helmet",MAGENTA_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.HEAD);
    public static final Item MAGENTA_WOOL_IRON_CHESTPLATE = new ArmorBase("magenta_wool_iron_chestplate",MAGENTA_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.CHEST);
    public static final Item MAGENTA_WOOL_IRON_LEGGINGS = new ArmorBase("magenta_wool_iron_leggings",MAGENTA_ARMOR_MATERIAL_WOOL_IRON, 2, EntityEquipmentSlot.LEGS);
    public static final Item MAGENTA_WOOL_IRON_BOOTS = new ArmorBase("magenta_wool_iron_boots",MAGENTA_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.FEET);


    public static final Item BROWN_WOOL_IRON_HELMET = new ArmorBase("brown_wool_iron_helmet",BROWN_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.HEAD);
    public static final Item BROWN_WOOL_IRON_CHESTPLATE = new ArmorBase("brown_wool_iron_chestplate",BROWN_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.CHEST);
    public static final Item BROWN_WOOL_IRON_LEGGINGS = new ArmorBase("brown_wool_iron_leggings",BROWN_ARMOR_MATERIAL_WOOL_IRON, 2, EntityEquipmentSlot.LEGS);
    public static final Item BROWN_WOOL_IRON_BOOTS = new ArmorBase("brown_wool_iron_boots",BROWN_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.FEET);

    public static final Item YELLOW_WOOL_IRON_HELMET = new ArmorBase("yellow_wool_iron_helmet",YELLOW_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.HEAD);
    public static final Item YELLOW_WOOL_IRON_CHESTPLATE = new ArmorBase("yellow_wool_iron_chestplate",YELLOW_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.CHEST);
    public static final Item YELLOW_WOOL_IRON_LEGGINGS = new ArmorBase("yellow_wool_iron_leggings",YELLOW_ARMOR_MATERIAL_WOOL_IRON, 2, EntityEquipmentSlot.LEGS);
    public static final Item YELLOW_WOOL_IRON_BOOTS = new ArmorBase("yellow_wool_iron_boots",YELLOW_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.FEET);

    public static final Item LIME_WOOL_IRON_HELMET = new ArmorBase("lime_wool_iron_helmet",LIME_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIME_WOOL_IRON_CHESTPLATE = new ArmorBase("lime_wool_iron_chestplate",LIME_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIME_WOOL_IRON_LEGGINGS = new ArmorBase("lime_wool_iron_leggings",LIME_ARMOR_MATERIAL_WOOL_IRON, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIME_WOOL_IRON_BOOTS = new ArmorBase("lime_wool_iron_boots",LIME_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.FEET);

    public static final Item GREEN_WOOL_IRON_HELMET = new ArmorBase("green_wool_iron_helmet",GREEN_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.HEAD);
    public static final Item GREEN_WOOL_IRON_CHESTPLATE = new ArmorBase("green_wool_iron_chestplate",GREEN_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.CHEST);
    public static final Item GREEN_WOOL_IRON_LEGGINGS = new ArmorBase("green_wool_iron_leggings",GREEN_ARMOR_MATERIAL_WOOL_IRON, 2, EntityEquipmentSlot.LEGS);
    public static final Item GREEN_WOOL_IRON_BOOTS = new ArmorBase("green_wool_iron_boots",GREEN_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.FEET);

    public static final Item LIGHT_BLUE_WOOL_IRON_HELMET = new ArmorBase("light_blue_wool_iron_helmet",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIGHT_BLUE_WOOL_IRON_CHESTPLATE = new ArmorBase("light_blue_wool_iron_chestplate",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIGHT_BLUE_WOOL_IRON_LEGGINGS = new ArmorBase("light_blue_wool_iron_leggings",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_IRON, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIGHT_BLUE_WOOL_IRON_BOOTS = new ArmorBase("light_blue_wool_iron_boots",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.FEET);

    public static final Item CYAN_BLUE_WOOL_IRON_HELMET = new ArmorBase("cyan_wool_iron_helmet",CYAN_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.HEAD);
    public static final Item CYAN_BLUE_WOOL_IRON_CHESTPLATE = new ArmorBase("cyan_wool_iron_chestplate",CYAN_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.CHEST);
    public static final Item CYAN_BLUE_WOOL_IRON_LEGGINGS = new ArmorBase("cyan_wool_iron_leggings",CYAN_ARMOR_MATERIAL_WOOL_IRON, 2, EntityEquipmentSlot.LEGS);
    public static final Item CYAN_BLUE_WOOL_IRON_BOOTS = new ArmorBase("cyan_wool_iron_boots",CYAN_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.FEET);

    public static final Item BLUE_WOOL_IRON_HELMET = new ArmorBase("blue_wool_iron_helmet",BLUE_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLUE_WOOL_IRON_CHESTPLATE = new ArmorBase("blue_wool_iron_chestplate",BLUE_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLUE_WOOL_IRON_LEGGINGS = new ArmorBase("blue_wool_iron_leggings",BLUE_ARMOR_MATERIAL_WOOL_IRON, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLUE_WOOL_IRON_BOOTS = new ArmorBase("blue_wool_iron_boots",BLUE_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.FEET);

    public static final Item PURPLE_WOOL_IRON_HELMET = new ArmorBase("purple_wool_iron_helmet",PURPLE_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.HEAD);
    public static final Item PURPLE_WOOL_IRON_CHESTPLATE = new ArmorBase("purple_wool_iron_chestplate",PURPLE_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.CHEST);
    public static final Item PURPLE_WOOL_IRON_LEGGINGS = new ArmorBase("purple_wool_iron_leggings",PURPLE_ARMOR_MATERIAL_WOOL_IRON, 2, EntityEquipmentSlot.LEGS);
    public static final Item PURPLE_WOOL_IRON_BOOTS = new ArmorBase("purple_wool_iron_boots",PURPLE_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.FEET);

    public static final Item PINK_WOOL_IRON_HELMET = new ArmorBase("pink_wool_iron_helmet",PINK_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.HEAD);
    public static final Item PINK_WOOL_IRON_CHESTPLATE = new ArmorBase("pink_wool_iron_chestplate",PINK_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.CHEST);
    public static final Item PINK_WOOL_IRON_LEGGINGS = new ArmorBase("pink_wool_iron_leggings",PINK_ARMOR_MATERIAL_WOOL_IRON, 2, EntityEquipmentSlot.LEGS);
    public static final Item PINK_WOOL_IRON_BOOTS = new ArmorBase("pink_wool_iron_boots",PINK_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.FEET);

    public static final Item GRAY_WOOL_IRON_HELMET = new ArmorBase("gray_wool_iron_helmet",GRAY_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.HEAD);
    public static final Item GRAY_WOOL_IRON_CHESTPLATE = new ArmorBase("gray_wool_iron_chestplate",GRAY_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.CHEST);
    public static final Item GRAY_WOOL_IRON_LEGGINGS = new ArmorBase("gray_wool_iron_leggings",GRAY_ARMOR_MATERIAL_WOOL_IRON, 2, EntityEquipmentSlot.LEGS);
    public static final Item GRAY_WOOL_IRON_BOOTS = new ArmorBase("gray_wool_iron_boots",GRAY_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.FEET);

    public static final Item LIGHT_GRAY_WOOL_IRON_HELMET = new ArmorBase("light_gray_wool_iron_helmet",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIGHT_GRAY_WOOL_IRON_CHESTPLATE = new ArmorBase("light_gray_wool_iron_chestplate",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIGHT_GRAY_WOOL_IRON_LEGGINGS = new ArmorBase("light_gray_wool_iron_leggings",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_IRON, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIGHT_GRAY_WOOL_IRON_BOOTS = new ArmorBase("light_gray_wool_iron_boots",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.FEET);

    public static final Item BLACK_WOOL_IRON_HELMET = new ArmorBase("black_wool_iron_helmet",BLACK_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLACK_WOOL_IRON_CHESTPLATE = new ArmorBase("black_wool_iron_chestplate",BLACK_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLACK_WOOL_IRON_LEGGINGS = new ArmorBase("black_wool_iron_leggings",BLACK_ARMOR_MATERIAL_WOOL_IRON, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLACK_WOOL_IRON_BOOTS = new ArmorBase("black_wool_iron_boots",BLACK_ARMOR_MATERIAL_WOOL_IRON, 1, EntityEquipmentSlot.FEET);


    //WOOL + GOLD*///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_WOOL_GOLD = EnumHelper.addArmorMaterial("armor_material_wool_gold", Reference.MOD_ID + ":wool_gold", 7, new int[]{1,3,3,1},20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    public static final ItemArmor.ArmorMaterial RED_ARMOR_MATERIAL_WOOL_GOLD = EnumHelper.addArmorMaterial("armor_material_wool_gold", Reference.MOD_ID + ":wool_gold", 7, new int[]{1,3,3,1},20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    public static final ItemArmor.ArmorMaterial ORANGE_ARMOR_MATERIAL_WOOL_GOLD = EnumHelper.addArmorMaterial("armor_material_wool_gold", Reference.MOD_ID + ":wool_gold", 7, new int[]{1,3,3,1},20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    public static final ItemArmor.ArmorMaterial BROWN_ARMOR_MATERIAL_WOOL_GOLD = EnumHelper.addArmorMaterial("armor_material_wool_gold", Reference.MOD_ID + ":wool_gold", 7, new int[]{1,3,3,1},20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    public static final ItemArmor.ArmorMaterial YELLOW_ARMOR_MATERIAL_WOOL_GOLD = EnumHelper.addArmorMaterial("armor_material_wool_gold", Reference.MOD_ID + ":wool_gold", 7, new int[]{1,3,3,1},20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    public static final ItemArmor.ArmorMaterial LIME_ARMOR_MATERIAL_WOOL_GOLD = EnumHelper.addArmorMaterial("armor_material_wool_gold", Reference.MOD_ID + ":wool_gold", 7, new int[]{1,3,3,1},20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    public static final ItemArmor.ArmorMaterial GREEN_ARMOR_MATERIAL_WOOL_GOLD = EnumHelper.addArmorMaterial("armor_material_wool_gold", Reference.MOD_ID + ":wool_gold", 7, new int[]{1,3,3,1},20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    public static final ItemArmor.ArmorMaterial LIGHT_BLUE_ARMOR_MATERIAL_WOOL_GOLD = EnumHelper.addArmorMaterial("armor_material_wool_gold", Reference.MOD_ID + ":wool_gold", 7, new int[]{1,3,3,1},20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    public static final ItemArmor.ArmorMaterial CYAN_ARMOR_MATERIAL_WOOL_GOLD = EnumHelper.addArmorMaterial("armor_material_wool_gold", Reference.MOD_ID + ":wool_gold", 7, new int[]{1,3,3,1},20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    public static final ItemArmor.ArmorMaterial BLUE_ARMOR_MATERIAL_WOOL_GOLD = EnumHelper.addArmorMaterial("armor_material_wool_gold", Reference.MOD_ID + ":wool_gold", 7, new int[]{1,3,3,1},20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    public static final ItemArmor.ArmorMaterial PURPLE_ARMOR_MATERIAL_WOOL_GOLD = EnumHelper.addArmorMaterial("armor_material_wool_gold", Reference.MOD_ID + ":wool_gold", 7, new int[]{1,3,3,1},20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    public static final ItemArmor.ArmorMaterial MAGENTA_ARMOR_MATERIAL_WOOL_GOLD = EnumHelper.addArmorMaterial("armor_material_wool_gold", Reference.MOD_ID + ":wool_gold", 7, new int[]{1,3,3,1},20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    public static final ItemArmor.ArmorMaterial PINK_ARMOR_MATERIAL_WOOL_GOLD = EnumHelper.addArmorMaterial("armor_material_wool_gold", Reference.MOD_ID + ":wool_gold", 7, new int[]{1,3,3,1},20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    public static final ItemArmor.ArmorMaterial GRAY_ARMOR_MATERIAL_WOOL_GOLD = EnumHelper.addArmorMaterial("armor_material_wool_gold", Reference.MOD_ID + ":wool_gold", 7, new int[]{1,3,3,1},20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    public static final ItemArmor.ArmorMaterial LIGHT_GRAY_ARMOR_MATERIAL_WOOL_GOLD = EnumHelper.addArmorMaterial("armor_material_wool_gold", Reference.MOD_ID + ":wool_gold", 7, new int[]{1,3,3,1},20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    public static final ItemArmor.ArmorMaterial BLACK_ARMOR_MATERIAL_WOOL_GOLD = EnumHelper.addArmorMaterial("armor_material_wool_gold", Reference.MOD_ID + ":wool_gold", 7, new int[]{1,3,3,1},20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);


    //Item Wool + gold
    public static final Item WOOL_GOLD_HELMET = new ArmorBase("wool_gold_helmet",ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item WOOL_GOLD_CHESTPLATE = new ArmorBase("wool_gold_chestplate",ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item WOOL_GOLD_LEGGINGS = new ArmorBase("wool_gold_leggings",ARMOR_MATERIAL_WOOL_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item WOOL_GOLD_BOOTS = new ArmorBase("wool_gold_boots",ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.FEET);

    public static final Item RED_WOOL_GOLD_HELMET = new ArmorBase("red_wool_gold_helmet",RED_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item RED_WOOL_GOLD_CHESTPLATE = new ArmorBase("red_wool_gold_chestplate",RED_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item RED_WOOL_GOLD_LEGGINGS = new ArmorBase("red_wool_gold_leggings",RED_ARMOR_MATERIAL_WOOL_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item RED_WOOL_GOLD_BOOTS = new ArmorBase("red_wool_gold_boots",RED_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.FEET);

    public static final Item ORANGE_WOOL_GOLD_HELMET = new ArmorBase("orange_wool_gold_helmet",ORANGE_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item ORANGE_WOOL_GOLD_CHESTPLATE = new ArmorBase("orange_wool_gold_chestplate",ORANGE_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item ORANGE_WOOL_GOLD_LEGGINGS = new ArmorBase("orange_wool_gold_leggings",ORANGE_ARMOR_MATERIAL_WOOL_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item ORANGE_WOOL_GOLD_BOOTS = new ArmorBase("orange_wool_gold_boots",ORANGE_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.FEET);

    public static final Item BROWN_WOOL_GOLD_HELMET = new ArmorBase("brown_wool_gold_helmet",BROWN_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item BROWN_WOOL_GOLD_CHESTPLATE = new ArmorBase("brown_wool_gold_chestplate",BROWN_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item BROWN_WOOL_GOLD_LEGGINGS = new ArmorBase("brown_wool_gold_leggings",BROWN_ARMOR_MATERIAL_WOOL_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item BROWN_WOOL_GOLD_BOOTS = new ArmorBase("brown_wool_gold_boots",BROWN_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.FEET);

    public static final Item YELLOW_WOOL_GOLD_HELMET = new ArmorBase("yellow_wool_gold_helmet",YELLOW_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item YELLOW_WOOL_GOLD_CHESTPLATE = new ArmorBase("yellow_wool_gold_chestplate",YELLOW_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item YELLOW_WOOL_GOLD_LEGGINGS = new ArmorBase("yellow_wool_gold_leggings",YELLOW_ARMOR_MATERIAL_WOOL_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item YELLOW_WOOL_GOLD_BOOTS = new ArmorBase("yellow_wool_gold_boots",YELLOW_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.FEET);

    public static final Item LIME_WOOL_GOLD_HELMET = new ArmorBase("lime_wool_gold_helmet",LIME_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIME_WOOL_GOLD_CHESTPLATE = new ArmorBase("lime_wool_gold_chestplate",LIME_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIME_WOOL_GOLD_LEGGINGS = new ArmorBase("lime_wool_gold_leggings",LIME_ARMOR_MATERIAL_WOOL_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIME_WOOL_GOLD_BOOTS = new ArmorBase("lime_wool_gold_boots",LIME_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.FEET);

    public static final Item GREEN_WOOL_GOLD_HELMET = new ArmorBase("green_wool_gold_helmet",GREEN_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item GREEN_WOOL_GOLD_CHESTPLATE = new ArmorBase("green_wool_gold_chestplate",GREEN_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item GREEN_WOOL_GOLD_LEGGINGS = new ArmorBase("green_wool_gold_leggings",GREEN_ARMOR_MATERIAL_WOOL_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item GREEN_WOOL_GOLD_BOOTS = new ArmorBase("green_wool_gold_boots",GREEN_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.FEET);

    public static final Item LIGHT_BLUE_WOOL_GOLD_HELMET = new ArmorBase("light_blue_wool_gold_helmet",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIGHT_BLUE_WOOL_GOLD_CHESTPLATE = new ArmorBase("light_blue_wool_gold_chestplate",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIGHT_BLUE_WOOL_GOLD_LEGGINGS = new ArmorBase("light_blue_wool_gold_leggings",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIGHT_BLUE_WOOL_GOLD_BOOTS = new ArmorBase("light_blue_wool_gold_boots",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.FEET);

    public static final Item CYAN_BLUE_WOOL_GOLD_HELMET = new ArmorBase("cyan_wool_gold_helmet",CYAN_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item CYAN_BLUE_WOOL_GOLD_CHESTPLATE = new ArmorBase("cyan_wool_gold_chestplate",CYAN_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item CYAN_BLUE_WOOL_GOLD_LEGGINGS = new ArmorBase("cyan_wool_gold_leggings",CYAN_ARMOR_MATERIAL_WOOL_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item CYAN_BLUE_WOOL_GOLD_BOOTS = new ArmorBase("cyan_wool_gold_boots",CYAN_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.FEET);

    public static final Item BLUE_WOOL_GOLD_HELMET = new ArmorBase("blue_wool_gold_helmet",BLUE_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLUE_WOOL_GOLD_CHESTPLATE = new ArmorBase("blue_wool_gold_chestplate",BLUE_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLUE_WOOL_GOLD_LEGGINGS = new ArmorBase("blue_wool_gold_leggings",BLUE_ARMOR_MATERIAL_WOOL_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLUE_WOOL_GOLD_BOOTS = new ArmorBase("blue_wool_gold_boots",BLUE_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.FEET);

    public static final Item PURPLE_WOOL_GOLD_HELMET = new ArmorBase("purple_wool_gold_helmet",PURPLE_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item PURPLE_WOOL_GOLD_CHESTPLATE = new ArmorBase("purple_wool_gold_chestplate",PURPLE_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item PURPLE_WOOL_GOLD_LEGGINGS = new ArmorBase("purple_wool_gold_leggings",PURPLE_ARMOR_MATERIAL_WOOL_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item PURPLE_WOOL_GOLD_BOOTS = new ArmorBase("purple_wool_gold_boots",PURPLE_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.FEET);

    public static final Item MAGENTA_WOOL_GOLD_HELMET = new ArmorBase("magenta_wool_gold_helmet",MAGENTA_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item MAGENTA_WOOL_GOLD_CHESTPLATE = new ArmorBase("magenta_wool_gold_chestplate",MAGENTA_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item MAGENTA_WOOL_GOLD_LEGGINGS = new ArmorBase("magenta_wool_gold_leggings",MAGENTA_ARMOR_MATERIAL_WOOL_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item MAGENTA_WOOL_GOLD_BOOTS = new ArmorBase("magenta_wool_gold_boots",MAGENTA_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.FEET);

    public static final Item PINK_WOOL_GOLD_HELMET = new ArmorBase("pink_wool_gold_helmet",PINK_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item PINK_WOOL_GOLD_CHESTPLATE = new ArmorBase("pink_wool_gold_chestplate",PINK_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item PINK_WOOL_GOLD_LEGGINGS = new ArmorBase("pink_wool_gold_leggings",PINK_ARMOR_MATERIAL_WOOL_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item PINK_WOOL_GOLD_BOOTS = new ArmorBase("pink_wool_gold_boots",PINK_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.FEET);

    public static final Item GRAY_WOOL_GOLD_HELMET = new ArmorBase("gray_wool_gold_helmet",GRAY_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item GRAY_WOOL_GOLD_CHESTPLATE = new ArmorBase("gray_wool_gold_chestplate",GRAY_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item GRAY_WOOL_GOLD_LEGGINGS = new ArmorBase("gray_wool_gold_leggings",GRAY_ARMOR_MATERIAL_WOOL_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item GRAY_WOOL_GOLD_BOOTS = new ArmorBase("gray_wool_gold_boots",GRAY_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.FEET);

    public static final Item LIGHT_GRAY_WOOL_GOLD_HELMET = new ArmorBase("light_gray_wool_gold_helmet",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIGHT_GRAY_WOOL_GOLD_CHESTPLATE = new ArmorBase("light_gray_wool_gold_chestplate",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIGHT_GRAY_WOOL_GOLD_LEGGINGS = new ArmorBase("light_gray_wool_gold_leggings",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIGHT_GRAY_WOOL_GOLD_BOOTS = new ArmorBase("light_gray_wool_gold_boots",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.FEET);

    public static final Item BLACK_WOOL_GOLD_HELMET = new ArmorBase("black_wool_gold_helmet",BLACK_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLACK_WOOL_GOLD_CHESTPLATE = new ArmorBase("black_wool_gold_chestplate",BLACK_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLACK_WOOL_GOLD_LEGGINGS = new ArmorBase("black_wool_gold_leggings",BLACK_ARMOR_MATERIAL_WOOL_GOLD, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLACK_WOOL_GOLD_BOOTS = new ArmorBase("black_wool_gold_boots",BLACK_ARMOR_MATERIAL_WOOL_GOLD, 1, EntityEquipmentSlot.FEET);


    //WOOL + DIA*///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_WOOL_DIA = EnumHelper.addArmorMaterial("armor_material_wool_dia", Reference.MOD_ID + ":wool_dia", 22, new int[]{2,4,5,3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial RED_ARMOR_MATERIAL_WOOL_DIA = EnumHelper.addArmorMaterial("armor_material_wool_dia", Reference.MOD_ID + ":wool_dia", 22, new int[]{2,4,5,3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial ORANGE_ARMOR_MATERIAL_WOOL_DIA = EnumHelper.addArmorMaterial("armor_material_wool_dia", Reference.MOD_ID + ":wool_dia", 22, new int[]{2,4,5,3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial BROWN_ARMOR_MATERIAL_WOOL_DIA = EnumHelper.addArmorMaterial("armor_material_wool_dia", Reference.MOD_ID + ":wool_dia", 22, new int[]{2,4,5,3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial YELLOW_ARMOR_MATERIAL_WOOL_DIA = EnumHelper.addArmorMaterial("armor_material_wool_dia", Reference.MOD_ID + ":wool_dia", 22, new int[]{2,4,5,3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial LIME_ARMOR_MATERIAL_WOOL_DIA = EnumHelper.addArmorMaterial("armor_material_wool_dia", Reference.MOD_ID + ":wool_dia", 22, new int[]{2,4,5,3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial GREEN_ARMOR_MATERIAL_WOOL_DIA = EnumHelper.addArmorMaterial("armor_material_wool_dia", Reference.MOD_ID + ":wool_dia", 22, new int[]{2,4,5,3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial LIGHT_BLUE_ARMOR_MATERIAL_WOOL_DIA = EnumHelper.addArmorMaterial("armor_material_wool_dia", Reference.MOD_ID + ":wool_dia", 22, new int[]{2,4,5,3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial CYAN_ARMOR_MATERIAL_WOOL_DIA = EnumHelper.addArmorMaterial("armor_material_wool_dia", Reference.MOD_ID + ":wool_dia", 22, new int[]{2,4,5,3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial BLUE_ARMOR_MATERIAL_WOOL_DIA = EnumHelper.addArmorMaterial("armor_material_wool_dia", Reference.MOD_ID + ":wool_dia", 22, new int[]{2,4,5,3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial PURPLE_ARMOR_MATERIAL_WOOL_DIA = EnumHelper.addArmorMaterial("armor_material_wool_dia", Reference.MOD_ID + ":wool_dia", 22, new int[]{2,4,5,3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial MAGENTA_ARMOR_MATERIAL_WOOL_DIA = EnumHelper.addArmorMaterial("armor_material_wool_dia", Reference.MOD_ID + ":wool_dia", 22, new int[]{2,4,5,3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial PINK_ARMOR_MATERIAL_WOOL_DIA = EnumHelper.addArmorMaterial("armor_material_wool_dia", Reference.MOD_ID + ":wool_dia", 22, new int[]{2,4,5,3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial GRAY_ARMOR_MATERIAL_WOOL_DIA = EnumHelper.addArmorMaterial("armor_material_wool_dia", Reference.MOD_ID + ":wool_dia", 22, new int[]{2,4,5,3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial LIGHT_GRAY_ARMOR_MATERIAL_WOOL_DIA = EnumHelper.addArmorMaterial("armor_material_wool_dia", Reference.MOD_ID + ":wool_dia", 22, new int[]{2,4,5,3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial BLACK_ARMOR_MATERIAL_WOOL_DIA = EnumHelper.addArmorMaterial("armor_material_wool_dia", Reference.MOD_ID + ":wool_dia", 22, new int[]{2,4,5,3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);


    //Item Wool + dia
    public static final Item WOOL_DIA_HELMET = new ArmorBase("wool_dia_helmet",ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.HEAD);
    public static final Item WOOL_DIA_CHESTPLATE = new ArmorBase("wool_dia_chestplate",ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.CHEST);
    public static final Item WOOL_DIA_LEGGINGS = new ArmorBase("wool_dia_leggings",ARMOR_MATERIAL_WOOL_DIA, 2, EntityEquipmentSlot.LEGS);
    public static final Item WOOL_DIA_BOOTS = new ArmorBase("wool_dia_boots",ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.FEET);

    public static final Item RED_WOOL_DIA_HELMET = new ArmorBase("red_wool_dia_helmet",RED_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.HEAD);
    public static final Item RED_WOOL_DIA_CHESTPLATE = new ArmorBase("red_wool_dia_chestplate",RED_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.CHEST);
    public static final Item RED_WOOL_DIA_LEGGINGS = new ArmorBase("red_wool_dia_leggings",RED_ARMOR_MATERIAL_WOOL_DIA, 2, EntityEquipmentSlot.LEGS);
    public static final Item RED_WOOL_DIA_BOOTS = new ArmorBase("red_wool_dia_boots",RED_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.FEET);

    public static final Item ORANGE_WOOL_DIA_HELMET = new ArmorBase("orange_wool_dia_helmet",ORANGE_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.HEAD);
    public static final Item ORANGE_WOOL_DIA_CHESTPLATE = new ArmorBase("orange_wool_dia_chestplate",ORANGE_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.CHEST);
    public static final Item ORANGE_WOOL_DIA_LEGGINGS = new ArmorBase("orange_wool_dia_leggings",ORANGE_ARMOR_MATERIAL_WOOL_DIA, 2, EntityEquipmentSlot.LEGS);
    public static final Item ORANGE_WOOL_DIA_BOOTS = new ArmorBase("orange_wool_dia_boots",ORANGE_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.FEET);

    public static final Item BROWN_WOOL_DIA_HELMET = new ArmorBase("brown_wool_dia_helmet",BROWN_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.HEAD);
    public static final Item BROWN_WOOL_DIA_CHESTPLATE = new ArmorBase("brown_wool_dia_chestplate",BROWN_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.CHEST);
    public static final Item BROWN_WOOL_DIA_LEGGINGS = new ArmorBase("brown_wool_dia_leggings",BROWN_ARMOR_MATERIAL_WOOL_DIA, 2, EntityEquipmentSlot.LEGS);
    public static final Item BROWN_WOOL_DIA_BOOTS = new ArmorBase("brown_wool_dia_boots",BROWN_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.FEET);

    public static final Item YELLOW_WOOL_DIA_HELMET = new ArmorBase("yellow_wool_dia_helmet",YELLOW_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.HEAD);
    public static final Item YELLOW_WOOL_DIA_CHESTPLATE = new ArmorBase("yellow_wool_dia_chestplate",YELLOW_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.CHEST);
    public static final Item YELLOW_WOOL_DIA_LEGGINGS = new ArmorBase("yellow_wool_dia_leggings",YELLOW_ARMOR_MATERIAL_WOOL_DIA, 2, EntityEquipmentSlot.LEGS);
    public static final Item YELLOW_WOOL_DIA_BOOTS = new ArmorBase("yellow_wool_dia_boots",YELLOW_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.FEET);

    public static final Item LIME_WOOL_DIA_HELMET = new ArmorBase("lime_wool_dia_helmet",LIME_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIME_WOOL_DIA_CHESTPLATE = new ArmorBase("lime_wool_dia_chestplate",LIME_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIME_WOOL_DIA_LEGGINGS = new ArmorBase("lime_wool_dia_leggings",LIME_ARMOR_MATERIAL_WOOL_DIA, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIME_WOOL_DIA_BOOTS = new ArmorBase("lime_wool_dia_boots",LIME_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.FEET);

    public static final Item GREEN_WOOL_DIA_HELMET = new ArmorBase("green_wool_dia_helmet",GREEN_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.HEAD);
    public static final Item GREEN_WOOL_DIA_CHESTPLATE = new ArmorBase("green_wool_dia_chestplate",GREEN_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.CHEST);
    public static final Item GREEN_WOOL_DIA_LEGGINGS = new ArmorBase("green_wool_dia_leggings",GREEN_ARMOR_MATERIAL_WOOL_DIA, 2, EntityEquipmentSlot.LEGS);
    public static final Item GREEN_WOOL_DIA_BOOTS = new ArmorBase("green_wool_dia_boots",GREEN_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.FEET);

    public static final Item LIGHT_BLUE_WOOL_DIA_HELMET = new ArmorBase("light_blue_wool_dia_helmet",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIGHT_BLUE_WOOL_DIA_CHESTPLATE = new ArmorBase("light_blue_wool_dia_chestplate",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIGHT_BLUE_WOOL_DIA_LEGGINGS = new ArmorBase("light_blue_wool_dia_leggings",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_DIA, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIGHT_BLUE_WOOL_DIA_BOOTS = new ArmorBase("light_blue_wool_dia_boots",LIGHT_BLUE_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.FEET);

    public static final Item CYAN_BLUE_WOOL_DIA_HELMET = new ArmorBase("cyan_wool_dia_helmet",CYAN_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.HEAD);
    public static final Item CYAN_BLUE_WOOL_DIA_CHESTPLATE = new ArmorBase("cyan_wool_dia_chestplate",CYAN_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.CHEST);
    public static final Item CYAN_BLUE_WOOL_DIA_LEGGINGS = new ArmorBase("cyan_wool_dia_leggings",CYAN_ARMOR_MATERIAL_WOOL_DIA, 2, EntityEquipmentSlot.LEGS);
    public static final Item CYAN_BLUE_WOOL_DIA_BOOTS = new ArmorBase("cyan_wool_dia_boots",CYAN_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.FEET);

    public static final Item BLUE_WOOL_DIA_HELMET = new ArmorBase("blue_wool_dia_helmet",BLUE_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLUE_WOOL_DIA_CHESTPLATE = new ArmorBase("blue_wool_dia_chestplate",BLUE_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLUE_WOOL_DIA_LEGGINGS = new ArmorBase("blue_wool_dia_leggings",BLUE_ARMOR_MATERIAL_WOOL_DIA, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLUE_WOOL_DIA_BOOTS = new ArmorBase("blue_wool_dia_boots",BLUE_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.FEET);

    public static final Item PURPLE_WOOL_DIA_HELMET = new ArmorBase("purple_wool_dia_helmet",PURPLE_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.HEAD);
    public static final Item PURPLE_WOOL_DIA_CHESTPLATE = new ArmorBase("purple_wool_dia_chestplate",PURPLE_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.CHEST);
    public static final Item PURPLE_WOOL_DIA_LEGGINGS = new ArmorBase("purple_wool_dia_leggings",PURPLE_ARMOR_MATERIAL_WOOL_DIA, 2, EntityEquipmentSlot.LEGS);
    public static final Item PURPLE_WOOL_DIA_BOOTS = new ArmorBase("purple_wool_dia_boots",PURPLE_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.FEET);

    public static final Item MAGENTA_WOOL_DIA_HELMET = new ArmorBase("magenta_wool_dia_helmet",MAGENTA_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.HEAD);
    public static final Item MAGENTA_WOOL_DIA_CHESTPLATE = new ArmorBase("magenta_wool_dia_chestplate",MAGENTA_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.CHEST);
    public static final Item MAGENTA_WOOL_DIA_LEGGINGS = new ArmorBase("magenta_wool_dia_leggings",MAGENTA_ARMOR_MATERIAL_WOOL_DIA, 2, EntityEquipmentSlot.LEGS);
    public static final Item MAGENTA_WOOL_DIA_BOOTS = new ArmorBase("magenta_wool_dia_boots",MAGENTA_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.FEET);

    public static final Item PINK_WOOL_DIA_HELMET = new ArmorBase("pink_wool_dia_helmet",PINK_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.HEAD);
    public static final Item PINK_WOOL_DIA_CHESTPLATE = new ArmorBase("pink_wool_dia_chestplate",PINK_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.CHEST);
    public static final Item PINK_WOOL_DIA_LEGGINGS = new ArmorBase("pink_wool_dia_leggings",PINK_ARMOR_MATERIAL_WOOL_DIA, 2, EntityEquipmentSlot.LEGS);
    public static final Item PINK_WOOL_DIA_BOOTS = new ArmorBase("pink_wool_dia_boots",PINK_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.FEET);

    public static final Item GRAY_WOOL_DIA_HELMET = new ArmorBase("gray_wool_dia_helmet",GRAY_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.HEAD);
    public static final Item GRAY_WOOL_DIA_CHESTPLATE = new ArmorBase("gray_wool_dia_chestplate",GRAY_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.CHEST);
    public static final Item GRAY_WOOL_DIA_LEGGINGS = new ArmorBase("gray_wool_dia_leggings",GRAY_ARMOR_MATERIAL_WOOL_DIA, 2, EntityEquipmentSlot.LEGS);
    public static final Item GRAY_WOOL_DIA_BOOTS = new ArmorBase("gray_wool_dia_boots",GRAY_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.FEET);

    public static final Item LIGHT_GRAY_WOOL_DIA_HELMET = new ArmorBase("light_gray_wool_dia_helmet",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.HEAD);
    public static final Item LIGHT_GRAY_WOOL_DIA_CHESTPLATE = new ArmorBase("light_gray_wool_dia_chestplate",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.CHEST);
    public static final Item LIGHT_GRAY_WOOL_DIA_LEGGINGS = new ArmorBase("light_gray_wool_dia_leggings",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_DIA, 2, EntityEquipmentSlot.LEGS);
    public static final Item LIGHT_GRAY_WOOL_DIA_BOOTS = new ArmorBase("light_gray_wool_dia_boots",LIGHT_GRAY_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.FEET);

    public static final Item BLACK_WOOL_DIA_HELMET = new ArmorBase("black_wool_dia_helmet",BLACK_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLACK_WOOL_DIA_CHESTPLATE = new ArmorBase("black_wool_dia_chestplate",BLACK_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLACK_WOOL_DIA_LEGGINGS = new ArmorBase("black_wool_dia_leggings",BLACK_ARMOR_MATERIAL_WOOL_DIA, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLACK_WOOL_DIA_BOOTS = new ArmorBase("black_wool_dia_boots",BLACK_ARMOR_MATERIAL_WOOL_DIA, 1, EntityEquipmentSlot.FEET);

}
