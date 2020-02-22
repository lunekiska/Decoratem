package io.github.vooki.decoratus;

import io.github.vooki.decoratus.common.objects.block.Blocks;
import io.github.vooki.decoratus.common.objects.item.Items;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class DecoratusMod implements ModInitializer
{

	public static final ItemGroup DECORATUS_ITEMS = FabricItemGroupBuilder.create
			(
				new Identifier("decoratus", "decoratus_items"))
				.icon(() -> new ItemStack(Items.BASALT_BRICK))
				.build();

	public static final ItemGroup DECORATUS_BLOCKS = FabricItemGroupBuilder.create
			(
				new Identifier("decoratus", "decoratus_blocks"))
				.icon(() -> new ItemStack(Blocks.WARPED_BRICKS_BLOCK))
				.build();

	@Override
	public void onInitialize()
	{
		Items.init();
		Blocks.init();
	}
}
