package limonata.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import limonata.init.LimonataModBlocks;

public class LemonCrop0OnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.75) {
			world.setBlock(BlockPos.containing(x, y, z), LimonataModBlocks.LEMON_CROP_1.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), LimonataModBlocks.LEMON_CROP_2.get().defaultBlockState(), 3);
		}
	}
}