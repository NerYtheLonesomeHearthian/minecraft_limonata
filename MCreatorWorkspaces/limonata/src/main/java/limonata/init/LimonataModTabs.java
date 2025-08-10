/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package limonata.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import limonata.LimonataMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class LimonataModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LimonataMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(LimonataModItems.LEMONSEEDS.get());
			tabData.accept(LimonataModBlocks.LEMON_LEAVES.get().asItem());
			tabData.accept(LimonataModBlocks.LEMON_LEAVES_LEMON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(LimonataModBlocks.LEMONADE_STAND.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(LimonataModItems.MUSIC_DISC_LIMONATA_CHIAMATA.get());
			tabData.accept(LimonataModItems.GLASS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(LimonataModItems.LEMON.get());
			tabData.accept(LimonataModItems.CUTLEMON.get());
			tabData.accept(LimonataModItems.ICE_CUBES.get());
			tabData.accept(LimonataModItems.GLASS_OF_LEMONADE.get());
		}
	}
}