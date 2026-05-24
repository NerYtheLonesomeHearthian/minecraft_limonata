package limonata.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import limonata.init.LimonataModGameRules;
import limonata.init.LimonataModBlocks;

public class LemonCropOnTickUpdateBLOCKSTATESProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		boolean hydrated = false;
		double rand = 0;
		double count = 0;
		double row = 0;
		double points = 0;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND) {
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
				rand = Math.random() / 2;
				if (rand <= points) {
					if ((getPropertyByName(blockstate, "age") instanceof IntegerProperty _getip29 ? blockstate.getValue(_getip29) : -1) == 0) {
						{
							int _value = 1;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((getPropertyByName(blockstate, "age") instanceof IntegerProperty _getip32 ? blockstate.getValue(_getip32) : -1) == 1) {
						{
							int _value = 2;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((getPropertyByName(blockstate, "age") instanceof IntegerProperty _getip35 ? blockstate.getValue(_getip35) : -1) == 2) {
						{
							int _value = 3;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((getPropertyByName(blockstate, "age") instanceof IntegerProperty _getip38 ? blockstate.getValue(_getip38) : -1) == 3) {
						{
							int _value = 4;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((getPropertyByName(blockstate, "age") instanceof IntegerProperty _getip41 ? blockstate.getValue(_getip41) : -1) == 4) {
						{
							int _value = 5;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((getPropertyByName(blockstate, "age") instanceof IntegerProperty _getip44 ? blockstate.getValue(_getip44) : -1) == 5) {
						{
							int _value = 6;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((getPropertyByName(blockstate, "age") instanceof IntegerProperty _getip47 ? blockstate.getValue(_getip47) : -1) == 6) {
						{
							int _value = 7;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if (world.getLevelData().getGameRules().getBoolean(LimonataModGameRules.DO_LEMON_TREES_GROW_FINAL_STAGE) == true) {
						if ((getPropertyByName(blockstate, "age") instanceof IntegerProperty _getip51 ? blockstate.getValue(_getip51) : -1) == 7) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							if (world instanceof ServerLevel _level)
								_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("limonata:lemon_tree_crop_spawn"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
										BlockPos.containing(x, y, z));
						}
					}
				}
			}
		} else {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(LimonataModBlocks.LEMON_SEEDS.get()));
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

	private static Property<?> getPropertyByName(BlockState state, String name) {
		for (Property<?> property : state.getProperties()) {
			if (property.getName().equals(name)) {
				return property;
			}
		}
		return null;
	}
}