package com.wash.essmetals.armor;

import com.wash.essmetals.Essmetals;
import com.wash.essmetals.armormaterials.AluminiumArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class AluminiumArmor {

    public static final ArmorMaterial ALUMINIUM_ARMOR_MATERIAL = new AluminiumArmorMaterial();

    public static final Item ALUMINIUM_HELMET = new ArmorItem(ALUMINIUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Essmetals.ITEM_GROUP));
    public static final Item ALUMINIUM_CHESTPLATE = new ArmorItem(ALUMINIUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Essmetals.ITEM_GROUP));
    public static final Item ALUMINIUM_LEGGINGS = new ArmorItem(ALUMINIUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Essmetals.ITEM_GROUP));
    public static final Item ALUMINIUM_BOOTS = new ArmorItem(ALUMINIUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Essmetals.ITEM_GROUP));


}
