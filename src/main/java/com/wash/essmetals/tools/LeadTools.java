package com.wash.essmetals.tools;

import com.wash.essmetals.customtoolitems.CustomAxeItem;
import com.wash.essmetals.customtoolitems.CustomHoeItem;
import com.wash.essmetals.customtoolitems.CustomPickaxeItem;
import com.wash.essmetals.toolmaterials.LeadToolMaterial;
import net.minecraft.item.*;

public class LeadTools {

    public static ToolItem LEAD_SWORD = new SwordItem(LeadToolMaterial.INSTANCE, 4, -3.0F, new Item.Settings().group(ItemGroup.COMBAT));

    public static ToolItem LEAD_SHOVEL = new ShovelItem(LeadToolMaterial.INSTANCE, 4, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem LEAD_PICKAXE = new CustomPickaxeItem(LeadToolMaterial.INSTANCE, 4, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem LEAD_AXE = new CustomAxeItem(LeadToolMaterial.INSTANCE, 4, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem LEAD_HOE = new CustomHoeItem(LeadToolMaterial.INSTANCE, 4, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));

}
