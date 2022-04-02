package com.wash.essmetals.armor;

import com.wash.essmetals.Essmetals;
import com.wash.essmetals.armormaterials.TitaniumArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class TitaniumArmor {

    public static final ArmorMaterial TITANIUM_ARMOR_MATERIAL = new TitaniumArmorMaterial();

    public static final Item TITANIUM_HELMET = new ArmorItem(TITANIUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Essmetals.ITEM_GROUP));
    public static final Item TITANIUM_CHESTPLATE = new ArmorItem(TITANIUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Essmetals.ITEM_GROUP));
    public static final Item TITANIUM_LEGGINGS = new ArmorItem(TITANIUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Essmetals.ITEM_GROUP));
    public static final Item TITANIUM_BOOTS = new ArmorItem(TITANIUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Essmetals.ITEM_GROUP));


}
