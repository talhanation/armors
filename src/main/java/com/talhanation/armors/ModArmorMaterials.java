package com.talhanation.armors;

import com.talhanation.armors.init.SoundInit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.Tags;

import java.util.Optional;
import java.util.function.Supplier;


public enum ModArmorMaterials{

    WOOL("wool", 7, new int[]{1,1,2,1}, 15, SoundInit.ARMOR_EQUIP_WOOL.get(), 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.STRING)),

    WOOL_WOOL("wool_wool", 7 + 2, new int[]{1,2,3,1}, 15,SoundInit.ARMOR_EQUIP_WOOL.get(), 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.STRING)),

    LEATHER_WOOL("leather_wool", 5 + 2, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
        () -> Ingredient.of(Tags.Items.LEATHER)),

    CHAIN_WOOL("chain_wool", 15 + 2, new int[]{1, 4, 5, 2}, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_IRON)),


    IRON_WOOL("iron_wool", 15 + 2, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_IRON)),


    GOLD_WOOL("gold_wool", 7 + 2, new int[]{1, 3, 5, 2}, 25, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_GOLD)),


    DIAMOND_WOOL("diamond_wool", 33 + 2, new int[]{3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.GEMS_DIAMOND)),


    NETHERITE_WOOL("netherite_wool", 37 + 2, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F,
            () -> Ingredient.of(Tags.Items.INGOTS_NETHERITE)),

    //LEATHER UPGRADE

    WOOL_LEATHER("wool_leather", 5 + 3, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.STRING)),

    LEATHER_LEATHER("leather_leather", 5 + 3, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.LEATHER)),

    CHAIN_LEATHER("chain_leather", 15 + 3, new int[]{1, 4, 5, 2}, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_IRON)),


    IRON_LEATHER("iron_leather", 15 + 3, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_IRON)),


    GOLD_LEATHER("gold_leather", 7 + 3, new int[]{1, 3, 5, 2}, 25, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_GOLD)),


    DIAMOND_LEATHER("diamond_leather", 33 + 3, new int[]{3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.GEMS_DIAMOND)),


    NETHERITE_LEATHER("netherite_leather", 37 + 3, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F,
            () -> Ingredient.of(Tags.Items.INGOTS_NETHERITE)),

    //CHAIN UPGRADE

    WOOL_CHAIN("wool_chain", 7 + 5, new int[]{1,1,2,1}, 15, SoundInit.ARMOR_EQUIP_WOOL.get(), 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.STRING)),

    LEATHER_CHAIN("leather_chain", 5 + 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.LEATHER)),


    CHAIN_CHAIN("chain_chain", 15 + 5, new int[]{1, 4, 5, 2}, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_IRON)),


    IRON_CHAIN("iron_chain", 15 + 5, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_IRON)),


    GOLD_CHAIN("gold_chain", 7 + 5, new int[]{1, 3, 5, 2}, 25, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_GOLD)),


    DIAMOND_CHAIN("diamond_chain", 33 + 5, new int[]{3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.GEMS_DIAMOND)),


    NETHERITE_CHAIN("netherite_chain", 37 + 5, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F,
            () -> Ingredient.of(Tags.Items.INGOTS_NETHERITE)),


    //IRON UPGRADE

    WOOL_IRON("wool_iron", 7 + 10, new int[]{1 ,1 ,2 ,1 }, 15, SoundInit.ARMOR_EQUIP_WOOL.get(), 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.STRING)),

    LEATHER_IRON("leather_iron", 5 + 10, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.LEATHER)),


    CHAIN_IRON("chain_iron", 15 + 10, new int[]{1, 4, 5, 2}, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_IRON)),


    IRON_IRON("iron_iron", 15 + 10, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_IRON)),


    GOLD_IRON("gold_iron", 7 + 10, new int[]{1, 3, 5, 2}, 25, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_GOLD)),


    DIAMOND_IRON("diamond_iron", 33 + 10, new int[]{3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.GEMS_DIAMOND)),


    NETHERITE_IRON("netherite_iron", 37 + 10, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F,
            () -> Ingredient.of(Tags.Items.INGOTS_NETHERITE)),


    //GOLD UPGRADE
    WOOL_GOLD("wool_gold", 7 + 3, new int[]{0,1,2,0}, 15 + 8, SoundInit.ARMOR_EQUIP_WOOL.get(), 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.STRING)),

    LEATHER_GOLD("leather_gold", 5 + 3, new int[]{1, 2, 3, 1}, 15 + 8, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.LEATHER)),


    CHAIN_GOLD("chain_gold", 15 + 3, new int[]{1, 4, 5, 2}, 12 + 8, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_IRON)),


    IRON_GOLD("iron_gold", 15 + 3, new int[]{2, 5, 6, 2}, 9 + 8, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_IRON)),


    GOLD_GOLD("gold_gold", 7 + 3, new int[]{1, 3, 5, 2}, 25 + 8, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_GOLD)),


    DIAMOND_GOLD("diamond_gold", 33 + 3, new int[]{3, 6, 8, 3}, 10 + 8, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.GEMS_DIAMOND)),


    NETHERITE_GOLD("netherite_gold", 37 + 3, new int[]{3, 6, 8, 3}, 15 + 8, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F,
            () -> Ingredient.of(Tags.Items.INGOTS_NETHERITE)),


    //DIAMOND UPGRADE

    WOOL_DIAMOND("wool_diamond", 7 + 15, new int[]{1,2,3,1}, 15, SoundInit.ARMOR_EQUIP_WOOL.get(), 0.8F, 0.0F,
            () -> Ingredient.of(Tags.Items.STRING)),


    LEATHER_DIAMOND("leather_diamond", 5 + 15, new int[]{2, 3, 4, 2}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.8F, 0.0F,
            () -> Ingredient.of(Tags.Items.LEATHER)),


    CHAIN_DIAMOND("chain_diamond", 15 + 15, new int[]{2, 5, 6, 3}, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 0.8F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_IRON)),


    IRON_DIAMOND("iron_diamond", 15 + 15, new int[]{3, 6, 7, 3}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.8F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_IRON)),


    GOLD_DIAMOND("gold_diamond", 7 + 15, new int[]{2, 4, 6, 3}, 25, SoundEvents.ARMOR_EQUIP_GOLD, 0.8F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_GOLD)),


    DIAMOND_DIAMOND("diamond_diamond", 33 + 15, new int[]{4, 7, 9, 4}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.8F, 0.0F,
            () -> Ingredient.of(Tags.Items.GEMS_DIAMOND)),


    NETHERITE_DIAMOND("netherite_diamond", 37 + 15, new int[]{4, 7, 9, 4}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.8F, 0.1F,
            () -> Ingredient.of(Tags.Items.INGOTS_NETHERITE)),


    //NETHERITE UPGRADE

    WOOL_NETHERITE("wool_netherite", 7 + 18, new int[]{1,2,3,1}, 15, SoundInit.ARMOR_EQUIP_WOOL.get(), 1.0F, 0.034F,
            () -> Ingredient.of(Tags.Items.STRING)),


    LEATHER_NETHERITE("leather_netherite", 5 + 18, new int[]{2, 3, 4, 2}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 1.0F, 0.034F,
            () -> Ingredient.of(Tags.Items.LEATHER)),


    CHAIN_NETHERITE("chain_netherite", 15 + 18, new int[]{2, 5, 6, 3}, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 1.0F, 0.034F,
            () -> Ingredient.of(Tags.Items.INGOTS_IRON)),


    IRON_NETHERITE("iron_netherite", 15 + 18, new int[]{3, 6, 7, 3}, 9, SoundEvents.ARMOR_EQUIP_IRON, 1.0F, 0.034F,
            () -> Ingredient.of(Tags.Items.INGOTS_IRON)),


    GOLD_NETHERITE("gold_netherite", 7 + 18, new int[]{2, 4, 6, 3}, 25, SoundEvents.ARMOR_EQUIP_GOLD, 1.0F, 0.034F,
            () -> Ingredient.of(Tags.Items.INGOTS_GOLD)),


    DIAMOND_NETHERITE("diamond_netherite", 33 + 18, new int[]{4, 7, 9, 4}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.034F,
            () -> Ingredient.of(Tags.Items.GEMS_DIAMOND)),


    NETHERITE_NETHERITE("netherite_netherite", 37 + 18, new int[]{4, 7, 9, 4}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.134F,
            () -> Ingredient.of(Tags.Items.INGOTS_NETHERITE));



    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durability;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;
    private IModArmorMaterial iModArmorMaterial;

    ModArmorMaterials(String name, int durability, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackres, Supplier<Ingredient> repair){
        this.name = name;
        this.durability = durability;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackres;
        this.repairIngredient = new LazyValue<>(repair);
    }

    public static Optional<IModArmorMaterial> ifModArmorMaterial(IArmorMaterial material) {
        return (material instanceof IModArmorMaterial) ? Optional.of((IModArmorMaterial)material) : Optional.empty();
    }

    public IModArmorMaterial iModArmorMaterial() {
        if (this.iModArmorMaterial == null)
            this.iModArmorMaterial = new IModArmorMaterial(this);
        return this.iModArmorMaterial();
    }



    public static class IModArmorMaterial implements IArmorMaterial {
        private final ModArmorMaterials materialReference;

        public IModArmorMaterial(ModArmorMaterials m) {
            this.materialReference = m;
        }

        public int getDurabilityForSlot(EquipmentSlotType slot) {
            return ModArmorMaterials.HEALTH_PER_SLOT[slot.getIndex()] * this.materialReference.durability;
        }

        public int getDefenseForSlot(EquipmentSlotType slot) {
            return this.materialReference.slotProtections[slot.getIndex()];
        }

        public int getEnchantmentValue() {
            return this.materialReference.enchantmentValue;
        }

        public SoundEvent getEquipSound() {
            return this.materialReference.sound;
        }

        public Ingredient getRepairIngredient() {
            return this.materialReference.repairIngredient.get();
        }

        @OnlyIn(Dist.CLIENT)
        public String getName() {
            return this.materialReference.name;
        }

        public float getToughness() {
            return this.materialReference.toughness;
        }

        @Override
        public float getKnockbackResistance() {
            return this.getKnockbackResistance();
        }

    }
}

