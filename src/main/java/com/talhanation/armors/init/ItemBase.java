package com.talhanation.armors.init;

import com.talhanation.armors.IHasModel;
import com.talhanation.armors.Main;
import com.talhanation.armors.armor.WoolArmor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {


    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        this.setCreativeTab(CreativeTabs.MATERIALS);
        this.maxStackSize = 64;
        WoolArmor.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");

    }
}
