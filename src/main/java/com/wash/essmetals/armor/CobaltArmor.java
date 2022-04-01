package com.wash.essmetals.armor;

import com.wash.essmetals.Essmetals;
import com.wash.essmetals.armormaterials.CobaltArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class CobaltArmor {

    public static final ArmorMaterial COBALT_ARMOR_MATERIAL = new CobaltArmorMaterial();

    public static final Item COBALT_HELMET = new ArmorItem(COBALT_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Essmetals.BASIC_GROUP));
    public static final Item COBALT_CHESTPLATE = new ArmorItem(COBALT_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Essmetals.BASIC_GROUP));
    public static final Item COBALT_LEGGINGS = new ArmorItem(COBALT_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Essmetals.BASIC_GROUP));
    public static final Item COBALT_BOOTS = new ArmorItem(COBALT_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Essmetals.BASIC_GROUP));


}
