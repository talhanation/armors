package com.talhanation.armors.items;

import com.talhanation.armors.Main;
import com.talhanation.armors.ModArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static void register() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }

    private static RegistryObject<Item> regItem(String name, Supplier<? extends Item> sup) {
        RegistryObject<Item> item = ITEMS.register(name, sup);
        return item;
    }

    private static RegistryObject<Item> createHelmet(String name, ModArmorMaterials material, boolean compatiblity) {
        return ITEMS.register(name + "_helmet", () -> new ModArmorItem(material, EquipmentSlotType.HEAD, (new Item.Properties()).stacksTo(1).tab(compatiblity ? ItemGroup.TAB_COMBAT : null)));
    }

    private static RegistryObject<Item> createChestplate(String name, ModArmorMaterials material, boolean compatiblity) {
        return ITEMS.register(name + "_chestplate", () -> new ModArmorItem(material, EquipmentSlotType.CHEST, (new Item.Properties()).stacksTo(1).tab(compatiblity ? ItemGroup.TAB_COMBAT : null)));
    }

    private static RegistryObject<Item> createLeggings(String name, ModArmorMaterials material, boolean compatiblity) {
        return ITEMS.register(name + "_leggings", () -> new ModArmorItem(material, EquipmentSlotType.LEGS, (new Item.Properties()).stacksTo(1).tab(compatiblity ? ItemGroup.TAB_COMBAT : null)));
    }

    private static RegistryObject<Item> createBoots(String name, ModArmorMaterials material, boolean compatiblity) {
        return ITEMS.register(name + "_boots", () -> new ModArmorItem(material, EquipmentSlotType.FEET, (new Item.Properties()).stacksTo(1).tab(compatiblity ? ItemGroup.TAB_COMBAT : null)));
    }

    private static RegistryObject<Item> createDyedHelmet(String name, ModArmorMaterials material, boolean compatiblity) {
        return ITEMS.register(name + "_helmet", () -> new DyeableArmor(material, EquipmentSlotType.HEAD, (new Item.Properties()).stacksTo(1).tab(compatiblity ? ItemGroup.TAB_COMBAT : null)));
    }

    private static RegistryObject<Item> createDyedChestplate(String name, ModArmorMaterials material, boolean compatiblity) {
        return ITEMS.register(name + "_chestplate", () -> new DyeableArmor(material, EquipmentSlotType.CHEST, (new Item.Properties()).stacksTo(1).tab(compatiblity ? ItemGroup.TAB_COMBAT : null)));
    }

    private static RegistryObject<Item> createDyedLeggings(String name, ModArmorMaterials material, boolean compatiblity) {
        return ITEMS.register(name + "_leggings", () -> new DyeableArmor(material, EquipmentSlotType.LEGS, (new Item.Properties()).stacksTo(1).tab(compatiblity ? ItemGroup.TAB_COMBAT : null)));
    }

    private static RegistryObject<Item> createDyedBoots(String name, ModArmorMaterials material, boolean compatiblity) {
        return ITEMS.register(name + "_boots", () -> new DyeableArmor(material, EquipmentSlotType.FEET, (new Item.Properties()).stacksTo(1).tab(compatiblity ? ItemGroup.TAB_COMBAT : null)));
    }

    //WOOL
    //public static final RegistryObject<Item> WOOL_HELMET_ITEM = ITEMS.register(() -> new ModArmor("wool_helmet", ModArmorMaterials.WOOL, EquipmentSlotType.HEAD)(new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT))));

/*
    public static final RegistryObject<Item> WOOL_HELMET_ITEM = 		    createHelmet("wool", ModArmorMaterials.WOOL, true);
    public static final RegistryObject<Item> WOOL_CHESTPLATE_ITEM = 		createChestplate("wool", ModArmorMaterials.WOOL, true);
    public static final RegistryObject<Item> WOOL_LEGGINGS_ITEM = 		createLeggings("wool", ModArmorMaterials.WOOL, true);
    public static final RegistryObject<Item> WOOL_BOOTS_ITEM = 		    createBoots("wool", ModArmorMaterials.WOOL, true);
*/
    public static final RegistryObject<Item> WOOL_HELMET_ITEM = regItem("wool_helmet", () -> new ModArmorItem(ModArmorMaterials.WOOL, EquipmentSlotType.HEAD));

}