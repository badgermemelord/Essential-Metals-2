package com.wash.essmetals.tools;

import com.wash.essmetals.customtoolitems.CustomAxeItem;
import com.wash.essmetals.customtoolitems.CustomHoeItem;
import com.wash.essmetals.customtoolitems.CustomPickaxeItem;
import com.wash.essmetals.toolmaterials.NickelToolMaterial;
import com.wash.essmetals.toolmaterials.ZincToolMaterial;
import net.minecraft.item.*;

public class NickelTools {

    public static ToolItem NICKEL_SWORD = new SwordItem(NickelToolMaterial.INSTANCE, 6, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));

    public static ToolItem NICKEL_SHOVEL = new ShovelItem(NickelToolMaterial.INSTANCE, 2, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem NICKEL_PICKAXE = new CustomPickaxeItem(NickelToolMaterial.INSTANCE, 2, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem NICKEL_AXE = new CustomAxeItem(NickelToolMaterial.INSTANCE, 2, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem NICKEL_HOE = new CustomHoeItem(NickelToolMaterial.INSTANCE, 2, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));

}
