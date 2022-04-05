package com.wash.essmetals.registry;

import com.wash.essmetals.Essmetals;
import com.wash.essmetals.armor.*;
import com.wash.essmetals.tools.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items
        //Ingots
    public static final Item TIN_INGOT = new Item(new Item.Settings());
    public static final Item COBALT_INGOT = new Item(new Item.Settings());
    public static final Item SILVER_INGOT = new Item(new Item.Settings());
    public static final Item LEAD_INGOT = new Item(new Item.Settings());
    public static final Item ZINC_INGOT = new Item(new Item.Settings());
    public static final Item TITANIUM_INGOT = new Item(new Item.Settings());
    public static final Item TUNGSTEN_INGOT = new Item(new Item.Settings());
    public static final Item NICKEL_INGOT = new Item(new Item.Settings());
    public static final Item ALUMINIUM_INGOT = new Item(new Item.Settings());
        //nuggets
    public static final Item TIN_NUGGET = new Item(new Item.Settings());
    public static final Item COBALT_NUGGET = new Item(new Item.Settings());
    public static final Item SILVER_NUGGET = new Item(new Item.Settings());
    public static final Item LEAD_NUGGET = new Item(new Item.Settings());
    public static final Item ZINC_NUGGET = new Item(new Item.Settings());
    public static final Item TITANIUM_NUGGET = new Item(new Item.Settings());
    public static final Item TUNGSTEN_NUGGET = new Item(new Item.Settings());
    public static final Item NICKEL_NUGGET = new Item(new Item.Settings());
    public static final Item ALUMINIUM_NUGGET = new Item(new Item.Settings());

        //Raw Metals
    public static final Item RAW_TIN = new Item(new Item.Settings());
    public static final Item RAW_COBALT = new Item(new Item.Settings());
    public static final Item RAW_ZINC = new Item(new Item.Settings());
    public static final Item RAW_LEAD = new Item(new Item.Settings());
    public static final Item RAW_SILVER = new Item(new Item.Settings());
    public static final Item RAW_TITANIUM = new Item(new Item.Settings());
    public static final Item RAW_TUNGSTEN = new Item(new Item.Settings());
    public static final Item RAW_NICKEL = new Item(new Item.Settings());
    public static final Item RAW_ALUMINIUM = new Item(new Item.Settings());

        //Block Items
    public static final BlockItem TIN_ORE = new BlockItem(ModBlocks.TIN_ORE, new Item.Settings());
    public static final BlockItem COBALT_ORE = new BlockItem(ModBlocks.COBALT_ORE, new Item.Settings());
    public static final BlockItem ZINC_ORE = new BlockItem(ModBlocks.ZINC_ORE, new Item.Settings());
    public static final BlockItem LEAD_ORE = new BlockItem(ModBlocks.LEAD_ORE, new Item.Settings());
    public static final BlockItem SILVER_ORE = new BlockItem(ModBlocks.SILVER_ORE, new Item.Settings());
    public static final BlockItem TITANIUM_ORE = new BlockItem(ModBlocks.TITANIUM_ORE, new Item.Settings());
    public static final BlockItem TUNGSTEN_ORE = new BlockItem(ModBlocks.TUNGSTEN_ORE, new Item.Settings());
    public static final BlockItem NICKEL_ORE = new BlockItem(ModBlocks.NICKEL_ORE, new Item.Settings());
    public static final BlockItem BAUXITE_ORE = new BlockItem(ModBlocks.BAUXITE_ORE, new Item.Settings());
    public static final BlockItem DEEPSLATE_COBALT_ORE = new BlockItem(ModBlocks.DEEPSLATE_COBALT_ORE, new Item.Settings());
    public static final BlockItem DEEPSLATE_LEAD_ORE = new BlockItem(ModBlocks.DEEPSLATE_LEAD_ORE, new Item.Settings());
    public static final BlockItem DEEPSLATE_SILVER_ORE = new BlockItem(ModBlocks.DEEPSLATE_SILVER_ORE, new Item.Settings());

    public static final BlockItem TIN_BLOCK = new BlockItem(ModBlocks.TIN_BLOCK, new Item.Settings());
    public static final BlockItem ZINC_BLOCK = new BlockItem(ModBlocks.ZINC_BLOCK, new Item.Settings());
    public static final BlockItem LEAD_BLOCK = new BlockItem(ModBlocks.LEAD_BLOCK, new Item.Settings());
    public static final BlockItem SILVER_BLOCK = new BlockItem(ModBlocks.SILVER_BLOCK, new Item.Settings());
    public static final BlockItem COBALT_BLOCK = new BlockItem(ModBlocks.COBALT_BLOCK, new Item.Settings());
    public static final BlockItem TITANIUM_BLOCK = new BlockItem(ModBlocks.TITANIUM_BLOCK, new Item.Settings());
    public static final BlockItem TUNGSTEN_BLOCK = new BlockItem(ModBlocks.TUNGSTEN_BLOCK, new Item.Settings());
    public static final BlockItem NICKEL_BLOCK = new BlockItem(ModBlocks.NICKEL_BLOCK, new Item.Settings());
    public static final BlockItem ALUMINIUM_BLOCK = new BlockItem(ModBlocks.ALUMINIUM_BLOCK, new Item.Settings());



    public static void registerItems() {



        //items

            //Ingots
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "tin_ingot"), TIN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "cobalt_ingot"), COBALT_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "silver_ingot"), SILVER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "lead_ingot"), LEAD_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "zinc_ingot"), ZINC_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "titanium_ingot"), TITANIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "tungsten_ingot"), TUNGSTEN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "nickel_ingot"), NICKEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "aluminium_ingot"), ALUMINIUM_INGOT);

            //Nuggets
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "tin_nugget"), TIN_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "cobalt_nugget"), COBALT_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "silver_nugget"), SILVER_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "lead_nugget"), LEAD_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "zinc_nugget"), ZINC_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "titanium_nugget"), TITANIUM_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "tungsten_nugget"), TUNGSTEN_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "nickel_nugget"), NICKEL_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "aluminium_nugget"), ALUMINIUM_NUGGET);

            //Raw Metals
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "raw_cobalt"), RAW_COBALT);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "raw_tin"), RAW_TIN);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "raw_zinc"), RAW_ZINC);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "raw_lead"), RAW_LEAD);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "raw_silver"), RAW_SILVER);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "raw_titanium"), RAW_TITANIUM);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "raw_tungsten"), RAW_TUNGSTEN);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "raw_nickel"), RAW_NICKEL);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "raw_aluminium"), RAW_ALUMINIUM);

            //Tools
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "tin_pickaxe"), TinTools.TIN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "tin_axe"), TinTools.TIN_AXE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "tin_shovel"), TinTools.TIN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "tin_hoe"), TinTools.TIN_HOE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "tin_sword"), TinTools.TIN_SWORD);

        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "cobalt_pickaxe"), CobaltTools.COBALT_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "cobalt_axe"), CobaltTools.COBALT_AXE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "cobalt_shovel"), CobaltTools.COBALT_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "cobalt_hoe"), CobaltTools.COBALT_HOE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "cobalt_sword"), CobaltTools.COBALT_SWORD);

        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "zinc_pickaxe"), ZincTools.ZINC_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "zinc_axe"), ZincTools.ZINC_AXE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "zinc_shovel"), ZincTools.ZINC_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "zinc_hoe"), ZincTools.ZINC_HOE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "zinc_sword"), ZincTools.ZINC_SWORD);

        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "lead_pickaxe"), LeadTools.LEAD_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "lead_axe"), LeadTools.LEAD_AXE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "lead_shovel"), LeadTools.LEAD_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "lead_hoe"), LeadTools.LEAD_HOE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "lead_sword"), LeadTools.LEAD_SWORD);

        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "silver_pickaxe"), SilverTools.SILVER_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "silver_axe"), SilverTools.SILVER_AXE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "silver_shovel"), SilverTools.SILVER_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "silver_hoe"), SilverTools.SILVER_HOE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "silver_sword"), SilverTools.SILVER_SWORD);

            //Armor

        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "cobalt_helmet"), CobaltArmor.COBALT_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "cobalt_chestplate"), CobaltArmor.COBALT_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "cobalt_leggings"), CobaltArmor.COBALT_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "cobalt_boots"), CobaltArmor.COBALT_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "zinc_helmet"), ZincArmor.ZINC_MATERIAL_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "zinc_chestplate"), ZincArmor.ZINC_MATERIAL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "zinc_leggings"), ZincArmor.ZINC_MATERIAL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "zinc_boots"), ZincArmor.ZINC_MATERIAL_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "tin_helmet"), TinArmor.TIN_MATERIAL_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "tin_chestplate"), TinArmor.TIN_MATERIAL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "tin_leggings"), TinArmor.TIN_MATERIAL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "tin_boots"), TinArmor.TIN_MATERIAL_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "silver_helmet"), SilverArmor.SILVER_MATERIAL_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "silver_chestplate"), SilverArmor.SILVER_MATERIAL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "silver_leggings"), SilverArmor.SILVER_MATERIAL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "silver_boots"), SilverArmor.SILVER_MATERIAL_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "lead_helmet"), LeadArmor.LEAD_MATERIAL_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "lead_chestplate"), LeadArmor.LEAD_MATERIAL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "lead_leggings"), LeadArmor.LEAD_MATERIAL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "lead_boots"), LeadArmor.LEAD_MATERIAL_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "nickel_helmet"), NickelArmor.NICKEL_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "nickel_chestplate"), NickelArmor.NICKEL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "nickel_leggings"), NickelArmor.NICKEL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "nickel_boots"), NickelArmor.NICKEL_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "aluminium_helmet"), AluminiumArmor.ALUMINIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "aluminium_chestplate"), AluminiumArmor.ALUMINIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "aluminium_leggings"), AluminiumArmor.ALUMINIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "aluminium_boots"), AluminiumArmor.ALUMINIUM_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "titanium_helmet"), TitaniumArmor.TITANIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "titanium_chestplate"), TitaniumArmor.TITANIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "titanium_leggings"), TitaniumArmor.TITANIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "titanium_boots"), TitaniumArmor.TITANIUM_BOOTS);


        //blockitems
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "tin_ore"), TIN_ORE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "cobalt_ore"), COBALT_ORE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "zinc_ore"), ZINC_ORE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "lead_ore"), LEAD_ORE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "silver_ore"), SILVER_ORE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "titanium_ore"), TITANIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "tungsten_ore"), TUNGSTEN_ORE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "nickel_ore"), NICKEL_ORE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "bauxite_ore"), BAUXITE_ORE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "deepslate_cobalt_ore"), DEEPSLATE_COBALT_ORE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "deepslate_lead_ore"), DEEPSLATE_LEAD_ORE);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "deepslate_silver_ore"), DEEPSLATE_SILVER_ORE);

        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "tin_block"), TIN_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "zinc_block"), ZINC_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "lead_block"), LEAD_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "silver_block"), SILVER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "cobalt_block"), COBALT_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "titanium_block"), TITANIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "tungsten_block"), TUNGSTEN_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "nickel_block"), NICKEL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Essmetals.MOD_ID, "aluminium_block"), ALUMINIUM_BLOCK);
    }
}
