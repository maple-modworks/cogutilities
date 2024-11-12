package com.herrkatze.cogutilities;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;

import static com.herrkatze.cogutilities.lists.blockList.DECAYED_WASTE_BARREL;

public class wasteBarrelBlock extends Block {
    public wasteBarrelBlock(Properties pProperties) {
        super(pProperties);
    }
    @Override
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        pLevel.setBlock(pPos,DECAYED_WASTE_BARREL.get().defaultBlockState(),3);
    }

    @Override
    public boolean isRandomlyTicking(BlockState pState) {
        return true;
    }
}
