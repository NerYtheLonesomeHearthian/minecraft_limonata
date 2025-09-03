/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package limonata.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import limonata.client.particle.LemonadeFluidDripParticle;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LimonataModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(LimonataModParticleTypes.LEMONADE_FLUID_DRIP.get(), LemonadeFluidDripParticle::provider);
	}
}