package com.wash.essmetals.tools;

import com.wash.essmetals.customtoolitems.CustomAxeItem;
import com.wash.essmetals.customtoolitems.CustomHoeItem;
import com.wash.essmetals.customtoolitems.CustomPickaxeItem;
import com.wash.essmetals.toolmaterials.SilverToolMaterial;
import net.minecraft.item.*;

public class SilverTools {

    public static ToolItem SILVER_SWORD = new SwordItem(SilverToolMaterial.INSTANCE, 4, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));

    public static ToolItem SILVER_SHOVEL = new ShovelItem(SilverToolMaterial.INSTANCE, 2, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem SILVER_PICKAXE = new CustomPickaxeItem(SilverToolMaterial.INSTANCE, 2, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem SILVER_AXE = new CustomAxeItem(SilverToolMaterial.INSTANCE, 2, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem SILVER_HOE = new CustomHoeItem(SilverToolMaterial.INSTANCE, 2, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));

}
