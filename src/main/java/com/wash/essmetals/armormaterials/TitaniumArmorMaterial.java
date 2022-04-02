package com.wash.essmetals.armormaterials;

import com.wash.essmetals.registry.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class TitaniumArmorMaterial implements ArmorMaterial{

    public static final TitaniumArmorMaterial INSTANCE = new TitaniumArmorMaterial();


    private static final int[] PROTECTION_VALUES = new int[] {4, 10, 8, 4};

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()]*66;
    }
    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }
    @Override
    public int getEnchantability() {
        return 10;
    }
    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.TITANIUM_INGOT, ModItems.TITANIUM_BLOCK);
    }
    @Override
    public String getName() {
        // Must be all lowercase
        return "titanium";
    }
    @Override
    public float getToughness() {
        return 3.0F;
    }
    @Override
    public float getKnockbackResistance() {
        return 0.0F;
    }

}
