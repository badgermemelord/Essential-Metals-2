package com.wash.essmetals.armor;

import com.wash.essmetals.Essmetals;
import com.wash.essmetals.armormaterials.LeadArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class LeadArmor {

    public static final ArmorMaterial LEAD_ARMOR_MATERIAL = new LeadArmorMaterial();

    public static final Item LEAD_MATERIAL_HELMET = new ArmorItem(LEAD_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Essmetals.BASIC_GROUP));
    public static final Item LEAD_MATERIAL_CHESTPLATE = new ArmorItem(LEAD_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Essmetals.BASIC_GROUP));
    public static final Item LEAD_MATERIAL_LEGGINGS = new ArmorItem(LEAD_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Essmetals.BASIC_GROUP));
    public static final Item LEAD_MATERIAL_BOOTS = new ArmorItem(LEAD_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Essmetals.BASIC_GROUP));

}
