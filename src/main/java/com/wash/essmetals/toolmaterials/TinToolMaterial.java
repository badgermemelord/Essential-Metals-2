package com.wash.essmetals.toolmaterials;

import com.wash.essmetals.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TinToolMaterial implements ToolMaterial {

    public static final TinToolMaterial INSTANCE = new TinToolMaterial();

    @Override
    public int getDurability() {
        return 150;
    }

    @Override
    public float getMiningSpeedMultiplier(){
        return 4.0f;
    }

    @Override
    public float getAttackDamage() {
        return 2.0f;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.TIN_INGOT, ModItems.TIN_BLOCK);
    }

}
