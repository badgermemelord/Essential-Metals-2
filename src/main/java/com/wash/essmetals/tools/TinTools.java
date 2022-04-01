package com.wash.essmetals.tools;

import com.wash.essmetals.customtoolitems.CustomAxeItem;
import com.wash.essmetals.customtoolitems.CustomHoeItem;
import com.wash.essmetals.customtoolitems.CustomPickaxeItem;
import com.wash.essmetals.toolmaterials.TinToolMaterial;
import net.minecraft.item.*;

public class TinTools {

    public static ToolItem TIN_SWORD = new SwordItem(TinToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));

    public static ToolItem TIN_SHOVEL = new ShovelItem(TinToolMaterial.INSTANCE, 1, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem TIN_PICKAXE = new CustomPickaxeItem(TinToolMaterial.INSTANCE, 1, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem TIN_AXE = new CustomAxeItem(TinToolMaterial.INSTANCE, 1, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem TIN_HOE = new CustomHoeItem(TinToolMaterial.INSTANCE, 1, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));


}


