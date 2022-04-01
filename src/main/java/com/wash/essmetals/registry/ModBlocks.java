package com.wash.essmetals.registry;

import com.wash.essmetals.Essmetals;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    //ores
    public static final Block TIN_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .requiresTool()
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.STONE)
            );
    public static final Block ZINC_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.STONE)
    );
    public static final Block COBALT_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.STONE)
    );
    public static final Block DEEPSLATE_COBALT_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.STONE)
    );
    public static final Block LEAD_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.STONE)
    );
    public static final Block DEEPSLATE_LEAD_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.STONE)
    );
    public static final Block SILVER_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.STONE)
    );
    public static final Block DEEPSLATE_SILVER_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.STONE)
    );
    public static final Block TITANIUM_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.STONE)
    );
    public static final Block TUNGSTEN_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.STONE)
    );
    public static final Block NICKEL_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.STONE)
    );
    public static final Block BAUXITE_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.STONE)
    );

    //blocks
    public static final Block TIN_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.METAL)
    );
    public static final Block ZINC_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.METAL)
    );
    public static final Block LEAD_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.METAL)
    );
    public static final Block SILVER_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.METAL)
    );
    public static final Block COBALT_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.METAL)
    );
    public static final Block TITANIUM_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .requiresTool()
            .strength(4.0f, 4.0f)
            .sounds(BlockSoundGroup.METAL)
    );
    public static final Block TUNGSTEN_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .requiresTool()
            .strength(5.0f, 5.0f)
            .sounds(BlockSoundGroup.METAL)
    );
    public static final Block NICKEL_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.METAL)
    );
    public static final Block ALUMINIUM_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.METAL)
    );
    //derivatives

    public static void registerBlocks() {

    //ores
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "tin_ore"), TIN_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "zinc_ore"), ZINC_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "cobalt_ore"), COBALT_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "deepslate_cobalt_ore"), DEEPSLATE_COBALT_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "lead_ore"), LEAD_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "deepslate_lead_ore"), DEEPSLATE_LEAD_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "silver_ore"), SILVER_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "deepslate_silver_ore"), DEEPSLATE_SILVER_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "titanium_ore"), TITANIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "tungsten_ore"), TUNGSTEN_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "nickel_ore"), NICKEL_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "bauxite_ore"), BAUXITE_ORE);


        //blocks
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "tin_block"), TIN_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "zinc_block"), ZINC_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "lead_block"), LEAD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "silver_block"), SILVER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "cobalt_block"), COBALT_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "titanium_block"), TITANIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "tungsten_block"), TUNGSTEN_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "nickel_block"), NICKEL_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Essmetals.MOD_ID, "aluminium_block"), ALUMINIUM_BLOCK);



        //derivatives
    }








}
