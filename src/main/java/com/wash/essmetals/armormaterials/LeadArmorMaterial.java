package com.wash.essmetals.armormaterials;

import com.wash.essmetals.registry.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class LeadArmorMaterial implements ArmorMaterial{

    public static final LeadArmorMaterial INSTANCE = new LeadArmorMaterial();
    private static final int[] PROTECTION_VALUES = new int[] {1, 3, 2, 1};

    private static final int[] BASE_DURABILITY = new int[] {10, 13, 12, 9};
    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()]*1;
    }
    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }
    @Override
    public int getEnchantability() {
        return 2;
    }
    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.LEAD_INGOT, ModItems.LEAD_BLOCK);
    }
    @Override
    public String getName() {
        // Must be all lowercase
        return "lead";
    }
    @Override
    public float getToughness() {
        return 3.0F;
    }
    @Override
    public float getKnockbackResistance() {
        return 2.0F;
    }

}
