package limonata.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import limonata.init.LimonataModBlocks;

public class LemonFungusOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rand = 0;
		double points = 0;
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x + 0.5, y + 1.5, z + 0.5)) <= 7 || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.PODZOL
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.MYCELIUM) {
			points = 0;
			points = 1 / (Math.floor(25 / points) + 1);
			rand = Math.random() / 2;
			if (rand <= points) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == LimonataModBlocks.LEMON_FUNGUS.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = LimonataModBlocks.LEMON_FUNGUS_STAGE_2.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Property<?> _propertyOld : _bso.getProperties()) {
							Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
							if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
								try {
									_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == LimonataModBlocks.LEMON_FUNGUS_STAGE_2.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = LimonataModBlocks.LEMON_FUNGUS_STAGE_3.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Property<?> _propertyOld : _bso.getProperties()) {
							Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
							if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
								try {
									_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == LimonataModBlocks.LEMON_FUNGUS_STAGE_3.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = LimonataModBlocks.LEMON_FUNGUS_STAGE_4.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Property<?> _propertyOld : _bso.getProperties()) {
							Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
							if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
								try {
									_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
		} else {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(LimonataModBlocks.LEMON_FUNGUS.get()));
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