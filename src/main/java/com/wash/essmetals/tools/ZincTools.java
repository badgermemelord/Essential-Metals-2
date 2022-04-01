package com.wash.essmetals.tools;

import com.wash.essmetals.customtoolitems.CustomAxeItem;
import com.wash.essmetals.customtoolitems.CustomHoeItem;
import com.wash.essmetals.customtoolitems.CustomPickaxeItem;
import com.wash.essmetals.toolmaterials.ZincToolMaterial;
import net.minecraft.item.*;

public class ZincTools {

    public static ToolItem ZINC_SWORD = new SwordItem(ZincToolMaterial.INSTANCE, 4, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));

    public static ToolItem ZINC_SHOVEL = new ShovelItem(ZincToolMaterial.INSTANCE, 2, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem ZINC_PICKAXE = new CustomPickaxeItem(ZincToolMaterial.INSTANCE, 2, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem ZINC_AXE = new CustomAxeItem(ZincToolMaterial.INSTANCE, 2, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem ZINC_HOE = new CustomHoeItem(ZincToolMaterial.INSTANCE, 2, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));

}
