package com.wash.essmetals;

import com.wash.essmetals.registry.ConfigurationFeatures;
import com.wash.essmetals.registry.ModBlocks;
import com.wash.essmetals.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class Essmetals implements ModInitializer {

    public static final String MOD_ID = "essmetals";
    public static final ItemGroup BASIC_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "essential_metals_basics"))
            .icon(() -> new ItemStack(Blocks.DIAMOND_BLOCK))
            .appendItems(stacks -> {
                //ores
                stacks.add(new ItemStack(ModBlocks.TIN_ORE));
                stacks.add(new ItemStack(ModBlocks.ZINC_ORE));
                stacks.add(new ItemStack(ModBlocks.LEAD_ORE));
                stacks.add(new ItemStack(ModBlocks.SILVER_ORE));
                stacks.add(new ItemStack(ModBlocks.COBALT_ORE));
                stacks.add(new ItemStack(ModBlocks.NICKEL_ORE));
                stacks.add(new ItemStack(ModBlocks.BAUXITE_ORE));
                stacks.add(new ItemStack(ModBlocks.TITANIUM_ORE));
                stacks.add(new ItemStack(ModBlocks.TUNGSTEN_ORE));
                //blocks
                stacks.add(new ItemStack(ModBlocks.TIN_BLOCK));
                stacks.add(new ItemStack(ModBlocks.ZINC_BLOCK));
                stacks.add(new ItemStack(ModBlocks.LEAD_BLOCK));
                stacks.add(new ItemStack(ModBlocks.SILVER_BLOCK));
                stacks.add(new ItemStack(ModBlocks.COBALT_BLOCK));
                stacks.add(new ItemStack(ModBlocks.NICKEL_BLOCK));
                stacks.add(new ItemStack(ModBlocks.ALUMINIUM_BLOCK));
                stacks.add(new ItemStack(ModBlocks.TITANIUM_BLOCK));
                stacks.add(new ItemStack(ModBlocks.TUNGSTEN_BLOCK));
                //ingots
                stacks.add(new ItemStack(ModItems.TIN_INGOT));
                stacks.add(new ItemStack(ModItems.ZINC_INGOT));
                stacks.add(new ItemStack(ModItems.LEAD_INGOT));
                stacks.add(new ItemStack(ModItems.SILVER_INGOT));
                stacks.add(new ItemStack(ModItems.COBALT_INGOT));
                stacks.add(new ItemStack(ModItems.NICKEL_INGOT));
                stacks.add(new ItemStack(ModItems.ALUMINIUM_INGOT));
                stacks.add(new ItemStack(ModItems.TITANIUM_INGOT));
                stacks.add(new ItemStack(ModItems.TUNGSTEN_INGOT));
                //raw
                stacks.add(new ItemStack(ModItems.RAW_COBALT));
                stacks.add(new ItemStack(ModItems.RAW_TIN));
                stacks.add(new ItemStack(ModItems.RAW_LEAD));
                stacks.add(new ItemStack(ModItems.RAW_ZINC));
                stacks.add(new ItemStack(ModItems.RAW_SILVER));
                stacks.add(new ItemStack(ModItems.RAW_NICKEL));
                stacks.add(new ItemStack(ModItems.RAW_ALUMINIUM));
                stacks.add(new ItemStack(ModItems.RAW_TITANIUM));
                stacks.add(new ItemStack(ModItems.RAW_TUNGSTEN));











            })
            .build();

    public static final ItemGroup ITEM_GROUP  = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "items"))
            .icon(() -> new ItemStack(Blocks.DIAMOND_BLOCK))
            .appendItems(stacks -> {
            })
            .build();



    @Override
    public void onInitialize() {

        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ConfigurationFeatures.registerFeatures();



    }
}
