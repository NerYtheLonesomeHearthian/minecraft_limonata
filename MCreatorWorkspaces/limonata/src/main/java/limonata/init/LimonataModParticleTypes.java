/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package limonata.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import limonata.LimonataMod;

public class LimonataModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, LimonataMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> LEMONADE_FLUID_DRIP = REGISTRY.register("lemonade_fluid_drip", () -> new SimpleParticleType(false));
}