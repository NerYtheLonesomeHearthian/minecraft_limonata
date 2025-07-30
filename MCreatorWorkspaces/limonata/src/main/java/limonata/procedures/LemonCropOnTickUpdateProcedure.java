package limonata.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import limonata.init.LimonataModItems;
import limonata.init.LimonataModBlocks;

public class LemonCropOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean hydrated = false;
		double rand = 0;
		double count = 0;
		double row = 0;
		double points = 0;
		if ((world.getMaxLocalRawBrightness(BlockPos.containing(x + 0.5, y + 1.5, z + 0.5)) > 7 || world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)))
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND) {
			if (world.getMaxLocalRawBrightness(BlockPos.containing(x + 0.5, y + 1.5, z + 0.5)) >= 9) {
				if (!world.getLevelData().isRaining()) {
					hydrated = false;
					row = 3;
					while (!hydrated && row > -4) {
						count = -3;
						while (count < 4) {
							if ((world.getBlockState(BlockPos.containing(x + count, y - 1, z + row))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + count, y, z + row))).getBlock() == Blocks.WATER) {
								hydrated = true;
								break;
							}
							count = count + 1;
						}
						row = row - 1;
					}
				} else {
					hydrated = true;
				}
				points = 0;
				row = 1;
				if (hydrated) {
					while (row > -2) {
						count = -1;
						while (count < 2) {
							if ((world.getBlockState(BlockPos.containing(x + count, y - 1, z + row))).getBlock() == Blocks.FARMLAND) {
								points = points + 0.75;
							}
							count = count + 1;
						}
						row = row - 1;
					}
				} else {
					while (row > -2) {
						count = -1;
						while (count < 2) {
							if ((world.getBlockState(BlockPos.containing(x + count, y - 1, z + row))).getBlock() == Blocks.FARMLAND) {
								points = points + 0.25;
							}
							count = count + 1;
						}
						row = row - 1;
					}
				}
				points = 1 / (Math.floor(25 / points) + 1);
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("limonata:lemon_crop")))
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("limonata:lemon_crop")))
						|| (world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("limonata:lemon_crop")))
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("limonata:lemon_crop")))) {
					points = points / 1.2;
				} else if (((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(ResourceLocation.parse("limonata:lemon_crop")))
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(ResourceLocation.parse("limonata:lemon_crop"))))
						&& ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("limonata:lemon_crop")))
								|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("limonata:lemon_crop"))))) {
					points = points / 1.2;
				}
				rand = Math.random();
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
					}
				}
			}
		} else {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(LimonataModItems.LEMONSEEDS.get()));
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