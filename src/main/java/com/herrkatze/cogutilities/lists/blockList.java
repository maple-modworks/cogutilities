package com.herrkatze.cogutilities.lists;

import com.herrkatze.cogutilities.CogUtilities;
import com.herrkatze.cogutilities.wasteBarrelBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class blockList {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CogUtilities.MODID);
    public static final RegistryObject<Block> EMPTY_WASTE_BARREL = BLOCKS.register("empty_waste_barrel",() -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> WASTE_BARREL = BLOCKS.register("waste_barrel",() -> new wasteBarrelBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> DECAYED_WASTE_BARREL = BLOCKS.register("decayed_waste_barrel",() -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name,RegistryObject<T> block){
        return itemList.ITEMS.register(name,() -> new BlockItem(block.get(),new Item.Properties()));
    }

    // Register Block Items
    public static final RegistryObject<Item> EMPTY_WASTE_BARREL_ITEM = registerBlockItem("empty_waste_barrel",EMPTY_WASTE_BARREL);
    public static final RegistryObject<Item> WASTE_BARREL_ITEM = registerBlockItem("waste_barrel",WASTE_BARREL);
    public static final RegistryObject<Item> DECAYED_WASTE_BARREL_ITEM = registerBlockItem("decayed_waste_barrel",DECAYED_WASTE_BARREL);
}
