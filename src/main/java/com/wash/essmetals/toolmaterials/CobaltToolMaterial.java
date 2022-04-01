package com.wash.essmetals.toolmaterials;

import com.wash.essmetals.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CobaltToolMaterial implements ToolMaterial {

    public static final CobaltToolMaterial INSTANCE = new CobaltToolMaterial();

    @Override
    public int getDurability() {
        return 750;
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
    public int getMiningLevel() {return 3;}

    @Override
    public int getEnchantability() {
        return 5;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.COBALT_INGOT, ModItems.COBALT_BLOCK);
    }

}
