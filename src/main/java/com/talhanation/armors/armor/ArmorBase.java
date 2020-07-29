package com.talhanation.armors.armor;

import com.talhanation.armors.IHasModel;
import com.talhanation.armors.Main;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorBase extends ItemArmor implements IHasModel {

    private final ItemArmor.ArmorMaterial material;

    public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlot) {
        super(materialIn, renderIndexIn, equipmentSlot);
        this.material = materialIn;
        setUnlocalizedName(name);
        setRegistryName(name);
        this.setCreativeTab(WoolArmor.armors);
        this.maxStackSize = 1;
        WoolArmor.ITEMS.add(this);
        LeatherArmor.ITEMS.add(this);
        ChainArmor.ITEMS.add(this);
        IronArmor.ITEMS.add(this);
        GoldArmor.ITEMS.add(this);
        DiaArmor.ITEMS.add(this);


    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");

    }


    @Override
    public boolean hasOverlay(ItemStack stack) {
        return this.material== WoolArmor.ARMOR_MATERIAL_WOOL_LEATHER
                ||  this.material== WoolArmor.ARMOR_MATERIAL_WOOL_CHAIN//overlay
                ||  this.material== WoolArmor.ARMOR_MATERIAL_WOOL_IRON//overlay
                ||  this.material== WoolArmor.ARMOR_MATERIAL_WOOL_GOLD//overlay
                ||  this.material== WoolArmor.ARMOR_MATERIAL_WOOL_DIA//overlay
                ||  this.material== LeatherArmor.ARMOR_MATERIAL_LEATHER_WOOL//overlay
                ||  this.material== LeatherArmor.ARMOR_MATERIAL_LEATHER_CHAIN//overlay
                ||  this.material== LeatherArmor.ARMOR_MATERIAL_LEATHER_IRON//overlay
                ||  this.material== ChainArmor.ARMOR_MATERIAL_CHAIN_WOOL//overlay
                ||  this.material== ChainArmor.ARMOR_MATERIAL_CHAIN_LEATHER//overlay
                ||  this.material== ChainArmor.ARMOR_MATERIAL_CHAIN_IRON//overlay
                ||  this.material== ChainArmor.ARMOR_MATERIAL_CHAIN_GOLD//overlay
                ||  this.material== ChainArmor.ARMOR_MATERIAL_CHAIN_DIA//overlay
                ||  this.material== IronArmor.ARMOR_MATERIAL_IRON_WOOL//overlay
                ||  this.material== IronArmor.ARMOR_MATERIAL_IRON_LEATHER//overlay
                ||  this.material== IronArmor.ARMOR_MATERIAL_IRON_CHAIN//overlay
                ||  this.material== IronArmor.ARMOR_MATERIAL_IRON_GOLD//overlay
                ||  this.material== IronArmor.ARMOR_MATERIAL_IRON_DIA//overlay
                ||  this.material== GoldArmor.ARMOR_MATERIAL_GOLD_WOOL//overlay
                ||  this.material== GoldArmor.ARMOR_MATERIAL_GOLD_CHAIN//overlay
                ||  this.material== GoldArmor.ARMOR_MATERIAL_GOLD_IRON//overlay
                ||  this.material== GoldArmor.ARMOR_MATERIAL_GOLD_DIA//overlay
                ||  this.material== DiaArmor.ARMOR_MATERIAL_DIA_WOOL//overlay
                ||  this.material== DiaArmor.ARMOR_MATERIAL_DIA_CHAIN//overlay
                ||  this.material== DiaArmor.ARMOR_MATERIAL_DIA_IRON//overlay
                ||  this.material== DiaArmor.ARMOR_MATERIAL_DIA_GOLD//overlay
            || getColor(stack) != 0x00FFFFFF;//color
    }


    public int getColor(ItemStack stack) {

//wool
        if (this.material == WoolArmor.ARMOR_MATERIAL_WOOL) { return 16777215; }
        if (this.material == WoolArmor.RED_ARMOR_MATERIAL_WOOL) {return 11546150; }
        if (this.material == WoolArmor.ORANGE_ARMOR_MATERIAL_WOOL) { return 16351261; }
        if (this.material == WoolArmor.MAGENTA_ARMOR_MATERIAL_WOOL) { return 13061821; }
        if (this.material == WoolArmor.BROWN_ARMOR_MATERIAL_WOOL) { return 8606770; }
        if (this.material == WoolArmor.YELLOW_ARMOR_MATERIAL_WOOL) { return 16701501; }
        if (this.material == WoolArmor.LIME_ARMOR_MATERIAL_WOOL) { return 8439583; }
        if (this.material == WoolArmor.GREEN_ARMOR_MATERIAL_WOOL) { return 6192150; }
        if (this.material == WoolArmor.LIGHT_BLUE_ARMOR_MATERIAL_WOOL) { return 3847130; }
        if (this.material == WoolArmor.CYAN_ARMOR_MATERIAL_WOOL) { return 1481884; }
        if (this.material == WoolArmor.BLUE_ARMOR_MATERIAL_WOOL) { return 3949738; }
        if (this.material == WoolArmor.PURPLE_ARMOR_MATERIAL_WOOL) { return 8991416; }

        if (this.material == WoolArmor.PINK_ARMOR_MATERIAL_WOOL) { return 15961002; }
        if (this.material == WoolArmor.LIGHT_GRAY_ARMOR_MATERIAL_WOOL) { return 10329495; }
        if (this.material == WoolArmor.GRAY_ARMOR_MATERIAL_WOOL) { return 4673362; }
        if (this.material == WoolArmor.BLACK_ARMOR_MATERIAL_WOOL) { return 3355443; }

//wool + leather
        if (this.material == WoolArmor.ARMOR_MATERIAL_WOOL_LEATHER) { return 16777215; }
        if (this.material == WoolArmor.RED_ARMOR_MATERIAL_WOOL_LEATHER) {return 11546150; }
        if (this.material == WoolArmor.ORANGE_ARMOR_MATERIAL_WOOL_LEATHER) { return 16351261; }
        if (this.material == WoolArmor.MAGENTA_ARMOR_MATERIAL_WOOL_LEATHER) { return 13061821; }

        if (this.material == WoolArmor.BROWN_ARMOR_MATERIAL_WOOL_LEATHER) { return 8606770; }
        if (this.material == WoolArmor.YELLOW_ARMOR_MATERIAL_WOOL_LEATHER) { return 16701501; }
        if (this.material == WoolArmor.LIME_ARMOR_MATERIAL_WOOL_LEATHER) { return 8439583; }
        if (this.material == WoolArmor.GREEN_ARMOR_MATERIAL_WOOL_LEATHER) { return 6192150; }
        if (this.material == WoolArmor.LIGHT_BLUE_ARMOR_MATERIAL_WOOL_LEATHER) { return 3847130; }
        if (this.material == WoolArmor.CYAN_ARMOR_MATERIAL_WOOL_LEATHER) { return 1481884; }
        if (this.material == WoolArmor.BLUE_ARMOR_MATERIAL_WOOL_LEATHER) { return 3949738; }
        if (this.material == WoolArmor.PURPLE_ARMOR_MATERIAL_WOOL_LEATHER) { return 8991416; }

        if (this.material == WoolArmor.PINK_ARMOR_MATERIAL_WOOL_LEATHER) { return 15961002; }
        if (this.material == WoolArmor.LIGHT_GRAY_ARMOR_MATERIAL_WOOL_LEATHER) { return 10329495; }
        if (this.material == WoolArmor.GRAY_ARMOR_MATERIAL_WOOL_LEATHER) { return 4673362; }
        if (this.material == WoolArmor.BLACK_ARMOR_MATERIAL_WOOL_LEATHER) { return 3355443; }

//wool + chain
        if (this.material == WoolArmor.ARMOR_MATERIAL_WOOL_CHAIN) { return 16777215; }
        if (this.material == WoolArmor.RED_ARMOR_MATERIAL_WOOL_CHAIN) {return 11546150; }
        if (this.material == WoolArmor.ORANGE_ARMOR_MATERIAL_WOOL_CHAIN) { return 16351261; }
        if (this.material == WoolArmor.BROWN_ARMOR_MATERIAL_WOOL_CHAIN) { return 8606770; }
        if (this.material == WoolArmor.YELLOW_ARMOR_MATERIAL_WOOL_CHAIN) { return 16701501; }
        if (this.material == WoolArmor.LIME_ARMOR_MATERIAL_WOOL_CHAIN) { return 8439583; }
        if (this.material == WoolArmor.GREEN_ARMOR_MATERIAL_WOOL_CHAIN) { return 6192150; }
        if (this.material == WoolArmor.LIGHT_BLUE_ARMOR_MATERIAL_WOOL_CHAIN) { return 3847130; }
        if (this.material == WoolArmor.CYAN_ARMOR_MATERIAL_WOOL_CHAIN) { return 1481884; }
        if (this.material == WoolArmor.BLUE_ARMOR_MATERIAL_WOOL_CHAIN) { return 3949738; }
        if (this.material == WoolArmor.PURPLE_ARMOR_MATERIAL_WOOL_CHAIN) { return 8991416; }
        if (this.material == WoolArmor.MAGENTA_ARMOR_MATERIAL_WOOL_CHAIN) { return 13061821; }
        if (this.material == WoolArmor.PINK_ARMOR_MATERIAL_WOOL_CHAIN) { return 15961002; }
        if (this.material == WoolArmor.LIGHT_GRAY_ARMOR_MATERIAL_WOOL_CHAIN) { return 10329495; }
        if (this.material == WoolArmor.GRAY_ARMOR_MATERIAL_WOOL_CHAIN) { return 4673362; }
        if (this.material == WoolArmor.BLACK_ARMOR_MATERIAL_WOOL_CHAIN) { return 3355443; }


//wool + iron
        if (this.material == WoolArmor.ARMOR_MATERIAL_WOOL_IRON) { return 16777215; }
        if (this.material == WoolArmor.RED_ARMOR_MATERIAL_WOOL_IRON) {return 11546150; }
        if (this.material == WoolArmor.ORANGE_ARMOR_MATERIAL_WOOL_IRON) { return 16351261; }
        if (this.material == WoolArmor.BROWN_ARMOR_MATERIAL_WOOL_IRON) { return 8606770; }
        if (this.material == WoolArmor.YELLOW_ARMOR_MATERIAL_WOOL_IRON) { return 16701501; }
        if (this.material == WoolArmor.LIME_ARMOR_MATERIAL_WOOL_IRON) { return 8439583; }
        if (this.material == WoolArmor.GREEN_ARMOR_MATERIAL_WOOL_IRON) { return 6192150; }
        if (this.material == WoolArmor.LIGHT_BLUE_ARMOR_MATERIAL_WOOL_IRON) { return 3847130; }
        if (this.material == WoolArmor.CYAN_ARMOR_MATERIAL_WOOL_IRON) { return 1481884; }
        if (this.material == WoolArmor.BLUE_ARMOR_MATERIAL_WOOL_IRON) { return 3949738; }
        if (this.material == WoolArmor.PURPLE_ARMOR_MATERIAL_WOOL_IRON) { return 8991416; }
        if (this.material == WoolArmor.MAGENTA_ARMOR_MATERIAL_WOOL_IRON) { return 13061821; }
        if (this.material == WoolArmor.PINK_ARMOR_MATERIAL_WOOL_IRON) { return 15961002; }
        if (this.material == WoolArmor.LIGHT_GRAY_ARMOR_MATERIAL_WOOL_IRON) { return 10329495; }
        if (this.material == WoolArmor.GRAY_ARMOR_MATERIAL_WOOL_IRON) { return 4673362; }
        if (this.material == WoolArmor.BLACK_ARMOR_MATERIAL_WOOL_IRON) { return 3355443; }

//wool + gold
        if (this.material == WoolArmor.ARMOR_MATERIAL_WOOL_GOLD) { return 16777215; }
        if (this.material == WoolArmor.RED_ARMOR_MATERIAL_WOOL_GOLD) {return 11546150; }
        if (this.material == WoolArmor.ORANGE_ARMOR_MATERIAL_WOOL_GOLD) { return 16351261; }
        if (this.material == WoolArmor.BROWN_ARMOR_MATERIAL_WOOL_GOLD) { return 8606770; }
        if (this.material == WoolArmor.YELLOW_ARMOR_MATERIAL_WOOL_GOLD) { return 16701501; }
        if (this.material == WoolArmor.LIME_ARMOR_MATERIAL_WOOL_GOLD) { return 8439583; }
        if (this.material == WoolArmor.GREEN_ARMOR_MATERIAL_WOOL_GOLD) { return 6192150; }
        if (this.material == WoolArmor.LIGHT_BLUE_ARMOR_MATERIAL_WOOL_GOLD) { return 3847130; }
        if (this.material == WoolArmor.CYAN_ARMOR_MATERIAL_WOOL_GOLD) { return 1481884; }
        if (this.material == WoolArmor.BLUE_ARMOR_MATERIAL_WOOL_GOLD) { return 3949738; }
        if (this.material == WoolArmor.PURPLE_ARMOR_MATERIAL_WOOL_GOLD) { return 8991416; }
        if (this.material == WoolArmor.MAGENTA_ARMOR_MATERIAL_WOOL_GOLD) { return 13061821; }
        if (this.material == WoolArmor.PINK_ARMOR_MATERIAL_WOOL_GOLD) { return 15961002; }
        if (this.material == WoolArmor.LIGHT_GRAY_ARMOR_MATERIAL_WOOL_GOLD) { return 10329495; }
        if (this.material == WoolArmor.GRAY_ARMOR_MATERIAL_WOOL_GOLD) { return 4673362; }
        if (this.material == WoolArmor.BLACK_ARMOR_MATERIAL_WOOL_GOLD) { return 3355443; }

//wool + dia
        if (this.material == WoolArmor.ARMOR_MATERIAL_WOOL_DIA) { return 16777215; }
        if (this.material == WoolArmor.RED_ARMOR_MATERIAL_WOOL_DIA) {return 11546150; }
        if (this.material == WoolArmor.ORANGE_ARMOR_MATERIAL_WOOL_DIA) { return 16351261; }
        if (this.material == WoolArmor.BROWN_ARMOR_MATERIAL_WOOL_DIA) { return 8606770; }
        if (this.material == WoolArmor.YELLOW_ARMOR_MATERIAL_WOOL_DIA) { return 16701501; }
        if (this.material == WoolArmor.LIME_ARMOR_MATERIAL_WOOL_DIA) { return 8439583; }
        if (this.material == WoolArmor.GREEN_ARMOR_MATERIAL_WOOL_DIA) { return 6192150; }
        if (this.material == WoolArmor.LIGHT_BLUE_ARMOR_MATERIAL_WOOL_DIA) { return 3847130; }
        if (this.material == WoolArmor.CYAN_ARMOR_MATERIAL_WOOL_DIA) { return 1481884; }
        if (this.material == WoolArmor.BLUE_ARMOR_MATERIAL_WOOL_DIA) { return 3949738; }
        if (this.material == WoolArmor.PURPLE_ARMOR_MATERIAL_WOOL_DIA) { return 8991416; }
        if (this.material == WoolArmor.MAGENTA_ARMOR_MATERIAL_WOOL_DIA) { return 13061821; }
        if (this.material == WoolArmor.PINK_ARMOR_MATERIAL_WOOL_DIA) { return 15961002; }
        if (this.material == WoolArmor.LIGHT_GRAY_ARMOR_MATERIAL_WOOL_DIA) { return 10329495; }
        if (this.material == WoolArmor.GRAY_ARMOR_MATERIAL_WOOL_DIA) { return 4673362; }
        if (this.material == WoolArmor.BLACK_ARMOR_MATERIAL_WOOL_DIA) { return 3355443; }

//chain + wool
        if (this.material == ChainArmor.ARMOR_MATERIAL_CHAIN_WOOL) { return 16777215; }
        if (this.material == ChainArmor.RED_ARMOR_MATERIAL_CHAIN_WOOL) { return 11546150; }
        if (this.material == ChainArmor.ORANGE_ARMOR_MATERIAL_CHAIN_WOOL) { return 16351261; }
        if (this.material == ChainArmor.BROWN_ARMOR_MATERIAL_CHAIN_WOOL) { return 8606770; }
        if (this.material == ChainArmor.YELLOW_ARMOR_MATERIAL_CHAIN_WOOL) { return 16701501; }
        if (this.material == ChainArmor.LIME_ARMOR_MATERIAL_CHAIN_WOOL) { return 8439583; }
        if (this.material == ChainArmor.GREEN_ARMOR_MATERIAL_CHAIN_WOOL) { return 6192150; }
        if (this.material == ChainArmor.LIGHT_BLUE_ARMOR_MATERIAL_CHAIN_WOOL) { return 3847130; }
        if (this.material == ChainArmor.CYAN_ARMOR_MATERIAL_CHAIN_WOOL) { return 1481884; }
        if (this.material == ChainArmor.BLUE_ARMOR_MATERIAL_CHAIN_WOOL) { return 3949738; }
        if (this.material == ChainArmor.PURPLE_ARMOR_MATERIAL_CHAIN_WOOL) { return 8991416; }
        if (this.material == ChainArmor.MAGENTA_ARMOR_MATERIAL_CHAIN_WOOL) { return 13061821; }
        if (this.material == ChainArmor.PINK_ARMOR_MATERIAL_CHAIN_WOOL) { return 15961002; }
        if (this.material == ChainArmor.LIGHT_GRAY_ARMOR_MATERIAL_CHAIN_WOOL) { return 10329495; }
        if (this.material == ChainArmor.GRAY_ARMOR_MATERIAL_CHAIN_WOOL) { return 4673362; }
        if (this.material == ChainArmor.BLACK_ARMOR_MATERIAL_CHAIN_WOOL) { return 3355443; }

//iron + wool
        if (this.material == IronArmor.ARMOR_MATERIAL_IRON_WOOL) { return 16777215; }
        if (this.material == IronArmor.RED_ARMOR_MATERIAL_IRON_WOOL) { return 11546150; }
        if (this.material == IronArmor.ORANGE_ARMOR_MATERIAL_IRON_WOOL) { return 16351261; }
        if (this.material == IronArmor.BROWN_ARMOR_MATERIAL_IRON_WOOL) { return 8606770; }
        if (this.material == IronArmor.YELLOW_ARMOR_MATERIAL_IRON_WOOL) { return 16701501; }
        if (this.material == IronArmor.LIME_ARMOR_MATERIAL_IRON_WOOL) { return 8439583; }
        if (this.material == IronArmor.GREEN_ARMOR_MATERIAL_IRON_WOOL) { return 6192150; }
        if (this.material == IronArmor.LIGHT_BLUE_ARMOR_MATERIAL_IRON_WOOL) { return 3847130; }
        if (this.material == IronArmor.CYAN_ARMOR_MATERIAL_IRON_WOOL) { return 1481884; }
        if (this.material == IronArmor.BLUE_ARMOR_MATERIAL_IRON_WOOL) { return 3949738; }
        if (this.material == IronArmor.PURPLE_ARMOR_MATERIAL_IRON_WOOL) { return 8991416; }
        if (this.material == IronArmor.MAGENTA_ARMOR_MATERIAL_IRON_WOOL) { return 13061821; }
        if (this.material == IronArmor.PINK_ARMOR_MATERIAL_IRON_WOOL) { return 15961002; }
        if (this.material == IronArmor.LIGHT_GRAY_ARMOR_MATERIAL_IRON_WOOL) { return 10329495; }
        if (this.material == IronArmor.GRAY_ARMOR_MATERIAL_IRON_WOOL) { return 4673362; }
        if (this.material == IronArmor.BLACK_ARMOR_MATERIAL_IRON_WOOL) { return 3355443; }

//gold + wool
        if (this.material == GoldArmor.ARMOR_MATERIAL_GOLD_WOOL) { return 16777215; }
        if (this.material == GoldArmor.RED_ARMOR_MATERIAL_GOLD_WOOL) { return 11546150; }
        if (this.material == GoldArmor.ORANGE_ARMOR_MATERIAL_GOLD_WOOL) { return 16351261; }
        if (this.material == GoldArmor.BROWN_ARMOR_MATERIAL_GOLD_WOOL) { return 8606770; }
        if (this.material == GoldArmor.YELLOW_ARMOR_MATERIAL_GOLD_WOOL) { return 16701501; }
        if (this.material == GoldArmor.LIME_ARMOR_MATERIAL_GOLD_WOOL) { return 8439583; }
        if (this.material == GoldArmor.GREEN_ARMOR_MATERIAL_GOLD_WOOL) { return 6192150; }
        if (this.material == GoldArmor.LIGHT_BLUE_ARMOR_MATERIAL_GOLD_WOOL) { return 3847130; }
        if (this.material == GoldArmor.CYAN_ARMOR_MATERIAL_GOLD_WOOL) { return 1481884; }
        if (this.material == GoldArmor.BLUE_ARMOR_MATERIAL_GOLD_WOOL) { return 3949738; }
        if (this.material == GoldArmor.PURPLE_ARMOR_MATERIAL_GOLD_WOOL) { return 8991416; }
        if (this.material == GoldArmor.MAGENTA_ARMOR_MATERIAL_GOLD_WOOL) { return 13061821; }
        if (this.material == GoldArmor.PINK_ARMOR_MATERIAL_GOLD_WOOL) { return 15961002; }
        if (this.material == GoldArmor.LIGHT_GRAY_ARMOR_MATERIAL_GOLD_WOOL) { return 10329495; }
        if (this.material == GoldArmor.GRAY_ARMOR_MATERIAL_GOLD_WOOL) { return 4673362; }
        if (this.material == GoldArmor.BLACK_ARMOR_MATERIAL_GOLD_WOOL) { return 3355443; }

//dia + wool
        if (this.material == DiaArmor.ARMOR_MATERIAL_DIA_WOOL) { return 16777215; }
        if (this.material == DiaArmor.RED_ARMOR_MATERIAL_DIA_WOOL) { return 11546150; }
        if (this.material == DiaArmor.ORANGE_ARMOR_MATERIAL_DIA_WOOL) { return 16351261; }
        if (this.material == DiaArmor.BROWN_ARMOR_MATERIAL_DIA_WOOL) { return 8606770; }
        if (this.material == DiaArmor.YELLOW_ARMOR_MATERIAL_DIA_WOOL) { return 16701501; }
        if (this.material == DiaArmor.LIME_ARMOR_MATERIAL_DIA_WOOL) { return 8439583; }
        if (this.material == DiaArmor.GREEN_ARMOR_MATERIAL_DIA_WOOL) { return 6192150; }
        if (this.material == DiaArmor.LIGHT_BLUE_ARMOR_MATERIAL_DIA_WOOL) { return 3847130; }
        if (this.material == DiaArmor.CYAN_ARMOR_MATERIAL_DIA_WOOL) { return 1481884; }
        if (this.material == DiaArmor.BLUE_ARMOR_MATERIAL_DIA_WOOL) { return 3949738; }
        if (this.material == DiaArmor.PURPLE_ARMOR_MATERIAL_DIA_WOOL) { return 8991416; }
        if (this.material == DiaArmor.MAGENTA_ARMOR_MATERIAL_DIA_WOOL) { return 13061821; }
        if (this.material == DiaArmor.PINK_ARMOR_MATERIAL_DIA_WOOL) { return 15961002; }
        if (this.material == DiaArmor.LIGHT_GRAY_ARMOR_MATERIAL_DIA_WOOL) { return 10329495; }
        if (this.material == DiaArmor.GRAY_ARMOR_MATERIAL_DIA_WOOL) { return 4673362; }
        if (this.material == DiaArmor.BLACK_ARMOR_MATERIAL_DIA_WOOL) { return 3355443; }

//leather + wool
        if (this.material == LeatherArmor.ARMOR_MATERIAL_LEATHER_CHAIN) { return 10511680; }
        if (this.material == LeatherArmor.ARMOR_MATERIAL_LEATHER_IRON) { return 10511680; }
        if (this.material == LeatherArmor.ARMOR_MATERIAL_LEATHER_GOLD) { return 10511680; }
        if (this.material == LeatherArmor.ARMOR_MATERIAL_LEATHER_WOOL) { return 16777215; }
        if (this.material == LeatherArmor.RED_ARMOR_MATERIAL_LEATHER_WOOL) { return 11546150; }
        if (this.material == LeatherArmor.ORANGE_ARMOR_MATERIAL_LEATHER_WOOL) { return 16351261; }
        if (this.material == LeatherArmor.BROWN_ARMOR_MATERIAL_LEATHER_WOOL) { return 8606770; }
        if (this.material == LeatherArmor.YELLOW_ARMOR_MATERIAL_LEATHER_WOOL) { return 16701501; }
        if (this.material == LeatherArmor.LIME_ARMOR_MATERIAL_LEATHER_WOOL) { return 8439583; }
        if (this.material == LeatherArmor.GREEN_ARMOR_MATERIAL_LEATHER_WOOL) { return 6192150; }
        if (this.material == LeatherArmor.LIGHT_BLUE_ARMOR_MATERIAL_LEATHER_WOOL) { return 3847130; }
        if (this.material == LeatherArmor.CYAN_ARMOR_MATERIAL_LEATHER_WOOL) { return 1481884; }
        if (this.material == LeatherArmor.BLUE_ARMOR_MATERIAL_LEATHER_WOOL) { return 3949738; }
        if (this.material == LeatherArmor.PURPLE_ARMOR_MATERIAL_LEATHER_WOOL) { return 8991416; }
        if (this.material == LeatherArmor.MAGENTA_ARMOR_MATERIAL_LEATHER_WOOL) { return 13061821; }
        if (this.material == LeatherArmor.PINK_ARMOR_MATERIAL_LEATHER_WOOL) { return 15961002; }
        if (this.material == LeatherArmor.LIGHT_GRAY_ARMOR_MATERIAL_LEATHER_WOOL) { return 10329495; }
        if (this.material == LeatherArmor.GRAY_ARMOR_MATERIAL_LEATHER_WOOL) { return 4673362; }
        if (this.material == LeatherArmor.BLACK_ARMOR_MATERIAL_LEATHER_WOOL) { return 3355443; }

        else return 16777215;
    }

}

