package com.wash.essmetals.armor;

import com.wash.essmetals.Essmetals;
import com.wash.essmetals.armormaterials.ZincArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class ZincArmor {

    public static final ArmorMaterial ZINC_ARMOR_MATERIAL = new ZincArmorMaterial();

    public static final Item ZINC_MATERIAL_HELMET = new ArmorItem(ZINC_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Essmetals.BASIC_GROUP));
    public static final Item ZINC_MATERIAL_CHESTPLATE = new ArmorItem(ZINC_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Essmetals.BASIC_GROUP));
    public static final Item ZINC_MATERIAL_LEGGINGS = new ArmorItem(ZINC_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Essmetals.BASIC_GROUP));
    public static final Item ZINC_MATERIAL_BOOTS = new ArmorItem(ZINC_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Essmetals.BASIC_GROUP));

}
