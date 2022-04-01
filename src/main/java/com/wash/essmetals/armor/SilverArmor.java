package com.wash.essmetals.armor;

import com.wash.essmetals.Essmetals;
import com.wash.essmetals.armormaterials.SilverArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class SilverArmor {

    public static final ArmorMaterial SILVER_ARMOR_MATERIAL = new SilverArmorMaterial();

    public static final Item SILVER_MATERIAL_HELMET = new ArmorItem(SILVER_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Essmetals.BASIC_GROUP));
    public static final Item SILVER_MATERIAL_CHESTPLATE = new ArmorItem(SILVER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Essmetals.BASIC_GROUP));
    public static final Item SILVER_MATERIAL_LEGGINGS = new ArmorItem(SILVER_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Essmetals.BASIC_GROUP));
    public static final Item SILVER_MATERIAL_BOOTS = new ArmorItem(SILVER_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Essmetals.BASIC_GROUP));

}
