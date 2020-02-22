package io.github.vooki.decoratus.common.objects.item;

import io.github.vooki.decoratus.DecoratusMod;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items
{
    public static final Item BASALT_BRICK = register( "basalt_brick", new Item(new Item.Settings().group(DecoratusMod.DECORATUS_ITEMS)));

    public static Item register(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier("decoratus", name), item);
    }

    public static void init()
    {

    }
}
