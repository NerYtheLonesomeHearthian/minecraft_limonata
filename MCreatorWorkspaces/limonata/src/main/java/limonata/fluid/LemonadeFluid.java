package limonata.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import limonata.init.LimonataModItems;
import limonata.init.LimonataModFluids;
import limonata.init.LimonataModFluidTypes;
import limonata.init.LimonataModBlocks;

public abstract class LemonadeFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> LimonataModFluidTypes.LEMONADE_TYPE.get(), () -> LimonataModFluids.LEMONADE.get(), () -> LimonataModFluids.FLOWING_LEMONADE.get())
			.explosionResistance(100f).tickRate(6).bucket(() -> LimonataModItems.LEMONADE_BUCKET.get()).block(() -> (LiquidBlock) LimonataModBlocks.LEMONADE.get());

	private LemonadeFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LemonadeFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LemonadeFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}