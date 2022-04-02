package com.wash.essmetals.armor;

import com.wash.essmetals.Essmetals;
import com.wash.essmetals.armormaterials.NickelArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class NickelArmor {

    public static final ArmorMaterial NICKEL_ARMOR_MATERIAL = new NickelArmorMaterial();

    public static final Item NICKEL_HELMET = new ArmorItem(NICKEL_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Essmetals.ITEM_GROUP));
    public static final Item NICKEL_CHESTPLATE = new ArmorItem(NICKEL_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Essmetals.ITEM_GROUP));
    public static final Item NICKEL_LEGGINGS = new ArmorItem(NICKEL_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Essmetals.ITEM_GROUP));
    public static final Item NICKEL_BOOTS = new ArmorItem(NICKEL_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Essmetals.ITEM_GROUP));


}
