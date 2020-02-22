package io.github.vooki.decoratus.common.objects.item;

import io.github.vooki.decoratus.DecoratusMod;

import io.github.vooki.decoratus.common.objects.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items
{
    //ITEMS
    public static final Item BASALT_BRICK = register( "basalt_brick", new Item(new Item.Settings().group(DecoratusMod.DECORATUS_ITEMS)));
    //BLOCK ITEMS
    public static final Item WARPED_BRICKS_BLOCK = register( "warped_bricks_block", new BlockItem(Blocks.WARPED_BRICKS_BLOCK, new Item.Settings().group(DecoratusMod.DECORATUS_BLOCKS)));
    public static final Item CRIMSON_BRICKS_BLOCK = register( "crimson_bricks_block", new BlockItem(Blocks.CRIMSON_BRICKS_BLOCK, new Item.Settings().group(DecoratusMod.DECORATUS_BLOCKS)));

    public static Item register(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier("decoratus", name), item);
    }

    public static void init()
    {

    }
}
