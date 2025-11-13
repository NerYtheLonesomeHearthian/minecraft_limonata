package limonata.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import limonata.init.LimonataModItems;
import limonata.init.LimonataModGameRules;
import limonata.init.LimonataModBlocks;

public class AAAAAAAAAAAAAAAAAAAAAProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rand = 0;
		double points = 0;
		if ((world.getMaxLocalRawBrightness(BlockPos.containing(x + 0.5, y + 1.5, z + 0.5)) > 7 || world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)))
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND) {
			points = 0;
			points = 1 / (Math.floor(25 / points) + 1);
			rand = Math.random() / 2;
			if (rand <= points) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == LimonataModBlocks.LEMON_CROP_0.get()) {
					world.setBlock(BlockPos.containing(x, y, z), LimonataModBlocks.LEMON_CROP_1.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == LimonataModBlocks.LEMON_CROP_1.get()) {
					world.setBlock(BlockPos.containing(x, y, z), LimonataModBlocks.LEMON_CROP_2.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == LimonataModBlocks.LEMON_CROP_2.get()) {
					world.setBlock(BlockPos.containing(x, y, z), LimonataModBlocks.LEMON_CROP_3.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == LimonataModBlocks.LEMON_CROP_3.get()) {
					world.setBlock(BlockPos.containing(x, y, z), LimonataModBlocks.LEMON_CROP_4.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == LimonataModBlocks.LEMON_CROP_4.get()) {
					world.setBlock(BlockPos.containing(x, y, z), LimonataModBlocks.LEMON_CROP_5.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == LimonataModBlocks.LEMON_CROP_5.get()) {
					world.setBlock(BlockPos.containing(x, y, z), LimonataModBlocks.LEMON_CROP_5_5.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == LimonataModBlocks.LEMON_CROP_5_5.get()) {
					world.setBlock(BlockPos.containing(x, y, z), LimonataModBlocks.LEMON_CROP_6.get().defaultBlockState(), 3);
				} else if (world.getLevelData().getGameRules().getBoolean(LimonataModGameRules.DO_LEMON_TREES_GROW_FINAL_STAGE) == true) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == LimonataModBlocks.LEMON_CROP_6.get()) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						if (world instanceof ServerLevel _level)
							_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("limonata:lemon_tree"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
									BlockPos.containing(x, y, z));
					}
				}
			}
		} else {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(LimonataModItems.LEMON_SEEDS.get()));
				entityToSpawn.setPickUpDelay(0);
				_level.addFreshEntity(entityToSpawn);
			}
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.crop.break")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.crop.break")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		}
	}
}