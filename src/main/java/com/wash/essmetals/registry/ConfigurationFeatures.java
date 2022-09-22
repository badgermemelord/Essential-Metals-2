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
                    Config.Worldgen.CoSize
            ));
    public static PlacedFeature OVERWORLD_COBALT_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_COBALT_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(Config.Worldgen.CoRate),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-8), YOffset.fixed(24))
            ));
    //Tin
    private static ConfiguredFeature<?, ?> OVERWORLD_TIN_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.TIN_ORE.getDefaultState(),
                    Config.Worldgen.SnSize
            ));
    public static PlacedFeature OVERWORLD_TIN_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_TIN_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(Config.Worldgen.SnRate),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(16), YOffset.fixed(64))
            ));
    //Zinc
    private static ConfiguredFeature<?, ?> OVERWORLD_ZINC_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.ZINC_ORE.getDefaultState(),
                    Config.Worldgen.ZnSize
            ));
    public static PlacedFeature OVERWORLD_ZINC_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_ZINC_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(Config.Worldgen.ZnRate),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(32), YOffset.fixed(48))
            ));
    //Lead
    private static ConfiguredFeature<?, ?> OVERWORLD_LEAD_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.LEAD_ORE.getDefaultState(),
                    Config.Worldgen.PbSize
            ));
    public static PlacedFeature OVERWORLD_LEAD_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_LEAD_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(Config.Worldgen.PbRate),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-8), YOffset.fixed(16))
            ));
    //Silver
    private static ConfiguredFeature<?, ?> OVERWORLD_SILVER_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.SILVER_ORE.getDefaultState(),
                    Config.Worldgen.AgSize
            ));
    public static PlacedFeature OVERWORLD_SILVER_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_SILVER_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(Config.Worldgen.AgRate),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-16), YOffset.fixed(32))
            ));
    //Nickel
    private static ConfiguredFeature<?, ?> OVERWORLD_NICKEL_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.NICKEL_ORE.getDefaultState(),
                    Config.Worldgen.NiSize
            ));
    public static PlacedFeature OVERWORLD_NICKEL_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_NICKEL_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(Config.Worldgen.NiRate),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(16), YOffset.fixed(42))
            ));
    //Bauxite
    private static ConfiguredFeature<?, ?> OVERWORLD_BAUXITE_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.BAUXITE_ORE.getDefaultState(),
                    Config.Worldgen.AlSize
            ));
    public static PlacedFeature OVERWORLD_BAUXITE_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_BAUXITE_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(Config.Worldgen.AlRate),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(86), YOffset.fixed(172))
            ));
    //Deepslate Ores

    //Deepslate Cobalt
    private static ConfiguredFeature<?, ?> OVERWORLD_DEEPSLATE_COBALT_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_COBALT_ORE.getDefaultState(),
                    Config.Worldgen.CoSize
            ));
    public static PlacedFeature OVERWORLD_DEEPSLATE_COBALT_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_DEEPSLATE_COBALT_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(Config.Worldgen.CoRate),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-16), YOffset.fixed(8))
            ));
    //Deepslate Lead
    private static ConfiguredFeature<?, ?> OVERWORLD_DEEPSLATE_LEAD_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_LEAD_ORE.getDefaultState(),
                    Config.Worldgen.PbSize
            ));
    public static PlacedFeature OVERWORLD_DEEPSLATE_LEAD_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_DEEPSLATE_LEAD_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(Config.Worldgen.PbRate),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-48), YOffset.fixed(-8))
            ));
    //Deepslate Silver
    private static ConfiguredFeature<?, ?> OVERWORLD_DEEPSLATE_SILVER_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_SILVER_ORE.getDefaultState(),
                    Config.Worldgen.AgSize
            ));
    public static PlacedFeature OVERWORLD_DEEPSLATE_SILVER_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_DEEPSLATE_SILVER_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(Config.Worldgen.AgRate),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-16), YOffset.fixed(8))
            ));
    //Deepslate Uranium
    private static ConfiguredFeature<?, ?> OVERWORLD_DEEPSLATE_URANIUM_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_URANIUM_ORE.getDefaultState(),
                    Config.Worldgen.USize
            ));
    public static PlacedFeature OVERWORLD_DEEPSLATE_URANIUM_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_DEEPSLATE_URANIUM_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(Config.Worldgen.URate),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-32))
            ));

    //End Ores

    //Titanium
    private static ConfiguredFeature<?, ?> END_TITANIUM_ORE_CONFIGURED_FEATURE = new ConfiguredFeature(
            Feature.ORE, new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    ModBlocks.TITANIUM_ORE.getDefaultState(),
            Config.Worldgen.TiSize
            ));
    public static PlacedFeature END_TITANIUM_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(END_TITANIUM_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(Config.Worldgen.TiRate),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(15))
            ));
    //Tungsten
    private static ConfiguredFeature<?, ?> END_TUNGSTEN_ORE_CONFIGURED_FEATURE = new ConfiguredFeature(
            Feature.ORE, new OreFeatureConfig(
            new BlockMatchRuleTest(Blocks.END_STONE),
            ModBlocks.TUNGSTEN_ORE.getDefaultState(),
            Config.Worldgen.WSize
    ));
    public static PlacedFeature END_TUNGSTEN_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(END_TUNGSTEN_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(Config.Worldgen.WRate),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(48))
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
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("essmetals", "nickel_ore"), OVERWORLD_NICKEL_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("essmetals", "nickel_ore"),
                OVERWORLD_NICKEL_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("essmetals", "nickel_ore")));
        //Bauxite
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("essmetals", "bauxite_ore"), OVERWORLD_BAUXITE_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("essmetals", "bauxite_ore"),
                OVERWORLD_BAUXITE_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("essmetals", "bauxite_ore")));
        //Deepslate Ores
        //Deepslate Cobalt
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("essmetals", "deepslate_cobalt_ore"), OVERWORLD_DEEPSLATE_COBALT_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("essmetals", "deepslate_cobalt_ore"),
                OVERWORLD_DEEPSLATE_COBALT_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("essmetals", "deepslate_cobalt_ore")));
        //Deepslate Lead
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("essmetals", "deepslate_lead_ore"), OVERWORLD_DEEPSLATE_LEAD_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("essmetals", "deepslate_lead_ore"),
                OVERWORLD_DEEPSLATE_LEAD_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("essmetals", "deepslate_lead_ore")));
        //Deepslate Silver
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("essmetals", "deepslate_silver_ore"), OVERWORLD_DEEPSLATE_SILVER_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("essmetals", "deepslate_silver_ore"),
                OVERWORLD_DEEPSLATE_SILVER_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("essmetals", "deepslate_silver_ore")));
        //Deepslate Uranium
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("essmetals", "deepslate_uranium_ore"), OVERWORLD_DEEPSLATE_URANIUM_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("essmetals", "deepslate_uranium_ore"),
                OVERWORLD_DEEPSLATE_URANIUM_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("essmetals", "deepslate_uranium_ore")));
        //End Ores
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

    }
}
