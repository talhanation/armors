package com.talhanation.armors.init;

import com.talhanation.armors.Main;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {

    public static final DeferredRegister<SoundEvent> SOUNDS =  DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Main.MOD_ID);

    public static final RegistryObject<SoundEvent> ARMOR_EQUIP_WOOL = SOUNDS.register("wool",
            () -> new SoundEvent(new ResourceLocation(Main.MOD_ID,"wool")));
}
