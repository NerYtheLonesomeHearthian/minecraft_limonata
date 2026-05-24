package limonata.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import limonata.procedures.*;

import com.google.common.collect.ImmutableMap;

public class LemonCrop0Block extends Block implements BonemealableBlock {
	public static final IntegerProperty AGE_7 = BlockStateProperties.AGE_7;
	private final ImmutableMap<BlockState, VoxelShape> shapes = this.makeShapes();

	public LemonCrop0Block() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.CROP).instabreak().noCollission().randomTicks().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(AGE_7, 0));
	}

	private ImmutableMap<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			if (state.getValue(AGE_7) == 1) {
				return box(6.25, -1, 6.75, 9.75, 3, 9.25);
			} else if (state.getValue(AGE_7) == 2) {
				return box(6.5, -1, 7, 9.5, 4.5, 9.5);
			} else if (state.getValue(AGE_7) == 3) {
				return box(5.8, -1, 7, 10.2, 6.5, 10.2);
			} else if (state.getValue(AGE_7) == 4) {
				return box(5.7, -1, 5.7, 10.3, 10, 10.3);
			} else if (state.getValue(AGE_7) == 5) {
				return box(5.7, -1, 5.7, 10.3, 14, 10.3);
			} else if (state.getValue(AGE_7) == 6) {
				return box(4, -1, 4, 12, 14, 12);
			} else if (state.getValue(AGE_7) == 7) {
				return box(1.8, -1, 1.8, 14.1, 14, 14.1);
			}
			return box(5.9, -1, 7.25, 10.1, 1, 9.1);
		});
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return shapes.get(state);
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(AGE_7);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(AGE_7, 0);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		if (worldIn instanceof LevelAccessor world) {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return LemonSeedsCropPlacementConditionProcedure.execute(world, x, y, z);
		}
		return super.canSurvive(blockstate, worldIn, pos);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		return !state.canSurvive(world, currentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public PathType getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return PathType.OPEN;
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		LemonCropNeighbourBlockChangesProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.randomTick(blockstate, world, pos, random);
		LemonCropOnTickUpdateBLOCKSTATESProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}

	@Override
	public boolean isValidBonemealTarget(LevelReader worldIn, BlockPos pos, BlockState blockstate) {
		if (worldIn instanceof LevelAccessor world) {
			return LemonCrop0CanBoneMealBeUsedOnThisBlockBLOCKSTATESProcedure.execute(blockstate);
		}
		return false;
	}

	@Override
	public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState blockstate) {
		return LemonCropBoneMealSuccessConditionProcedure.execute();
	}

	@Override
	public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState blockstate) {
		LemonCropOnBonemealSuccessBLOCKSTATESProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}
}