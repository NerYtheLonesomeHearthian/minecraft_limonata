/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package limonata.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class LimonataModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> DO_LEMON_TREES_GROW_FINAL_STAGE;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		DO_LEMON_TREES_GROW_FINAL_STAGE = GameRules.register("doLemonTreesGrowFinalStage", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
	}
}