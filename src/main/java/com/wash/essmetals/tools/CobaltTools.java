package com.wash.essmetals.tools;

import com.wash.essmetals.customtoolitems.CustomAxeItem;
import com.wash.essmetals.customtoolitems.CustomHoeItem;
import com.wash.essmetals.customtoolitems.CustomPickaxeItem;
import com.wash.essmetals.toolmaterials.CobaltToolMaterial;
import net.minecraft.item.*;

public class CobaltTools {

    public static ToolItem COBALT_SWORD = new SwordItem(CobaltToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));

    public static ToolItem COBALT_SHOVEL = new ShovelItem(CobaltToolMaterial.INSTANCE, 0, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem COBALT_PICKAXE = new CustomPickaxeItem(CobaltToolMaterial.INSTANCE, 0, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem COBALT_AXE = new CustomAxeItem(CobaltToolMaterial.INSTANCE, 0, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem COBALT_HOE = new CustomHoeItem(CobaltToolMaterial.INSTANCE, 0, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));

}
