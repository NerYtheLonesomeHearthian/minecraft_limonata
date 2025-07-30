package limonata.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import limonata.init.LimonataModBlocks;

public class LemonCrop3OnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.75) {
			world.setBlock(BlockPos.containing(x, y, z), LimonataModBlocks.LEMON_CROP_4.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), LimonataModBlocks.LEMON_CROP_5.get().defaultBlockState(), 3);
		}
	}
}