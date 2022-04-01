package com.wash.essmetals.toolmaterials;

import com.wash.essmetals.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ZincToolMaterial implements ToolMaterial {

    public static final ZincToolMaterial INSTANCE = new ZincToolMaterial();

    @Override
    public int getDurability() {
        return 175;
    }

    @Override
    public float getMiningSpeedMultiplier(){
        return 5.0f;
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
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.ZINC_INGOT, ModItems.ZINC_BLOCK);
    }

}
