/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package limonata.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import limonata.fluid.types.LemonadeFluidType;

import limonata.LimonataMod;

public class LimonataModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, LimonataMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> LEMONADE_TYPE = REGISTRY.register("lemonade", () -> new LemonadeFluidType());
}