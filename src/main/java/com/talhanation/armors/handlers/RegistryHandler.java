package com.talhanation.armors.handlers;

import com.talhanation.armors.IHasModel;
import com.talhanation.armors.armor.WoolArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.Item;

@Mod.EventBusSubscriber
public class RegistryHandler {


    @SubscribeEvent
    public static void oItemRegister(RegistryEvent.Register<Item> event){

        event.getRegistry().registerAll(WoolArmor.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event){

        for(Item item : WoolArmor.ITEMS){

            if(item instanceof IHasModel){

                ((IHasModel)item).registerModels();
            }
        }

    }
}
