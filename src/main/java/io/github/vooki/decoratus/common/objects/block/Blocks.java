package io.github.vooki.decoratus.common.objects.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks
{
    public static final Block WARPED_BRICKS_BLOCK = register("warped_bricks_block", new WarpedBricksBlock(FabricBlockSettings.of(Material.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES).strength(2,0.2f).sounds(BlockSoundGroup.NETHER_BRICK).build()));
    public static final Block CRIMSON_BRICKS_BLOCK = register("crimson_bricks_block", new CrimsonBricksBlock(FabricBlockSettings.of(Material.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES).strength(2,0.2f).sounds(BlockSoundGroup.NETHER_BRICK).build()));

    private static Block register(String name, Block block)
    {
        return Registry.register(Registry.BLOCK, new Identifier("decoratus", name), block);
    }

    public static void init()
    {

    }
}
