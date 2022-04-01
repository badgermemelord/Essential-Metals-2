package com.wash.essmetals.toolmaterials;

import com.wash.essmetals.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class LeadToolMaterial implements ToolMaterial {

    public static final LeadToolMaterial INSTANCE = new LeadToolMaterial();

    @Override
    public int getDurability() {
        return 10;
    }

    @Override
    public float getMiningSpeedMultiplier(){
        return 2.0f;
    }

    @Override
    public float getAttackDamage() {
        return 4.0f;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.LEAD_INGOT, ModItems.LEAD_BLOCK);
    }

}
