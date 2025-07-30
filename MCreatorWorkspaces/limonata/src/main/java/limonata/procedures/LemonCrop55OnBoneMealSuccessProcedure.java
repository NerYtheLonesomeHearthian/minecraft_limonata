package limonata.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import limonata.init.LimonataModBlocks;

public class LemonCrop55OnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), LimonataModBlocks.LEMON_CROP_6.get().defaultBlockState(), 3);
	}
}