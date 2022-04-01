package com.wash.essmetals.registry;

import com.wash.essmetals.config.Config;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.Arrays;
import java.util.List;

public class ConfigurationFeatures {

    //Cobalt
    private static ConfiguredFeature<?, ?> OVERWORLD_COBALT_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.COBALT_ORE.getDefaultState(),
                    6
            ));
    public static PlacedFeature OVERWORLD_COBALT_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_COBALT_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(3),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(32))
            ));
    //Tin
    private static ConfiguredFeature<?, ?> OVERWORLD_TIN_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.TIN_ORE.getDefaultState(),
                    6
            ));
    public static PlacedFeature OVERWORLD_TIN_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_TIN_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(8),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(16), YOffset.fixed(64))
            ));
    //Zinc
    private static ConfiguredFeature<?, ?> OVERWORLD_ZINC_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.ZINC_ORE.getDefaultState(),
                    6
            ));
    public static PlacedFeature OVERWORLD_ZINC_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_ZINC_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(6),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(32), YOffset.fixed(48))
            ));
    //Lead
    private static ConfiguredFeature<?, ?> OVERWORLD_LEAD_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.LEAD_ORE.getDefaultState(),
                    8
            ));
    public static PlacedFeature OVERWORLD_LEAD_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_LEAD_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(6),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-16), YOffset.fixed(48))
            ));
    //Silver
    private static ConfiguredFeature<?, ?> OVERWORLD_SILVER_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.SILVER_ORE.getDefaultState(),
                    4
            ));
    public static PlacedFeature OVERWORLD_SILVER_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_SILVER_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(4),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-32), YOffset.fixed(32))
            ));
    //Nickel
    private static ConfiguredFeature<?, ?> OVERWORLD_NICKEL_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.NICKEL_ORE.getDefaultState(),
                    4
            ));
    public static PlacedFeature OVERWORLD_NICKEL_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_NICKEL_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(5),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-32), YOffset.fixed(32))
            ));
    //Bauxite
    private static ConfiguredFeature<?, ?> OVERWORLD_BAUXITE_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.BAUXITE_ORE.getDefaultState(),
                    6
            ));
    public static PlacedFeature OVERWORLD_BAUXITE_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_BAUXITE_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(8),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(64), YOffset.fixed(96))
            ));
    //End Ores
    //Titanium
    private static ConfiguredFeature<?, ?> END_TITANIUM_ORE_CONFIGURED_FEATURE = new ConfiguredFeature(
            Feature.ORE, new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    ModBlocks.TITANIUM_ORE.getDefaultState(),
                    4
            ));
    public static PlacedFeature END_TITANIUM_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(END_TITANIUM_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(1),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(15))
            ));
    //Tungsten
    private static ConfiguredFeature<?, ?> END_TUNGSTEN_ORE_CONFIGURED_FEATURE = new ConfiguredFeature(
            Feature.ORE, new OreFeatureConfig(
            new BlockMatchRuleTest(Blocks.END_STONE),
            ModBlocks.TUNGSTEN_ORE.getDefaultState(),
            4
    ));
    public static PlacedFeature END_TUNGSTEN_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(END_TUNGSTEN_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(10),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(48))
            ));
    //Test1
    private static ConfiguredFeature<?, ?> END_COBALT_ORE_CONFIGURED_FEATURE = new ConfiguredFeature(
            Feature.ORE, new OreFeatureConfig(
            new BlockMatchRuleTest(Blocks.END_STONE),
            ModBlocks.COBALT_ORE.getDefaultState(),
            6
    ));
    public static PlacedFeature END_COBALT_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(END_COBALT_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(20),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));


    public static void registerFeatures() {
        //Cobalt
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("essmetals", "cobalt_ore"), OVERWORLD_COBALT_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("essmetals", "cobalt_ore"),
                OVERWORLD_COBALT_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("essmetals", "cobalt_ore")));
        //Tin
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("essmetals", "tin_ore"), OVERWORLD_TIN_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("essmetals", "tin_ore"),
                OVERWORLD_TIN_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("essmetals", "tin_ore")));
        //Zinc
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("essmetals", "zinc_ore"), OVERWORLD_ZINC_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("essmetals", "zinc_ore"),
                OVERWORLD_ZINC_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("essmetals", "zinc_ore")));
        //Lead
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("essmetals", "lead_ore"), OVERWORLD_LEAD_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("essmetals", "lead_ore"),
                OVERWORLD_LEAD_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("essmetals", "lead_ore")));
        //Silver
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("essmetals", "silver_ore"), OVERWORLD_SILVER_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("essmetals", "silver_ore"),
                OVERWORLD_SILVER_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("essmetals", "silver_ore")));
        //Nickel

        //Bauxite

        //Titanium
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("essmetals", "titanium_ore"), END_TITANIUM_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("essmetals", "titanium_ore"),
                END_TITANIUM_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("essmetals", "titanium_ore")));
        //Tungsten
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("essmetals", "end_tungsten_ore"), END_TUNGSTEN_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("essmetals", "end_tungsten_ore"),
                END_TUNGSTEN_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("essmetals", "end_tungsten_ore")));
        ///Test1
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("essmetals", "end_cobalt_ore"), END_COBALT_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("essmetals", "end_cobalt_ore"),
                END_COBALT_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("essmetals", "end_cobalt_ore")));
    }
}
