package com.wash.essmetals.toolmaterials;

import com.wash.essmetals.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NickelToolMaterial implements ToolMaterial {

    public static final NickelToolMaterial INSTANCE = new NickelToolMaterial();

    @Override
    public int getDurability() {
        return 250;
    }

    @Override
    public float getMiningSpeedMultiplier(){
        return 6.0f;
    }

    @Override
    public float getAttackDamage() {
        return 3.0f;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 4;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.NICKEL_INGOT, ModItems.NICKEL_BLOCK, ModItems.NICKEL_NUGGET);
    }

}
