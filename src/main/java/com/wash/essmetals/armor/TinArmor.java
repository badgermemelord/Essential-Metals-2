package com.wash.essmetals.armor;

import com.wash.essmetals.Essmetals;
import com.wash.essmetals.armormaterials.TinArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class TinArmor {

    public static final ArmorMaterial TIN_ARMOR_MATERIAL = new TinArmorMaterial();

    public static final Item TIN_MATERIAL_HELMET = new ArmorItem(TIN_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Essmetals.BASIC_GROUP));
    public static final Item TIN_MATERIAL_CHESTPLATE = new ArmorItem(TIN_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Essmetals.BASIC_GROUP));
    public static final Item TIN_MATERIAL_LEGGINGS = new ArmorItem(TIN_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Essmetals.BASIC_GROUP));
    public static final Item TIN_MATERIAL_BOOTS = new ArmorItem(TIN_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Essmetals.BASIC_GROUP));

}
