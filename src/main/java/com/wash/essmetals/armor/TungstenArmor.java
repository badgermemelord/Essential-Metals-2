package com.wash.essmetals.armor;

import com.wash.essmetals.Essmetals;
import com.wash.essmetals.armormaterials.TungstenArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class TungstenArmor {

    public static final ArmorMaterial TUNGSTEN_ARMOR_MATERIAL = new TungstenArmorMaterial();

    public static final Item TUNGSTEN_HELMET = new ArmorItem(TUNGSTEN_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Essmetals.ITEM_GROUP));
    public static final Item TUNGSTEN_CHESTPLATE = new ArmorItem(TUNGSTEN_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Essmetals.ITEM_GROUP));
    public static final Item TUNGSTEN_LEGGINGS = new ArmorItem(TUNGSTEN_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Essmetals.ITEM_GROUP));
    public static final Item TUNGSTEN_BOOTS = new ArmorItem(TUNGSTEN_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Essmetals.ITEM_GROUP));


}
