/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package limonata.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import limonata.LimonataMod;

@EventBusSubscriber
public class LimonataModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LimonataMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LIMONATA_CREATIVE_TAB = REGISTRY.register("limonata_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.limonata.limonata_creative_tab")).icon(() -> new ItemStack(LimonataModItems.LEMONADE_ACHIEVEMENT_ITEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LimonataModItems.MUSIC_DISC_LIMONATA_CHIAMATA.get());
				tabData.accept(LimonataModBlocks.LEMONADE_STAND.get().asItem());
				tabData.accept(LimonataModItems.GLASS.get());
				tabData.accept(LimonataModBlocks.LEMON_CRATE.get().asItem());
				tabData.accept(LimonataModItems.LEMON.get());
				tabData.accept(LimonataModItems.CUT_LEMON.get());
				tabData.accept(LimonataModItems.GOLDEN_LEMON.get());
				tabData.accept(LimonataModBlocks.LEMON_LEAVES.get().asItem());
				tabData.accept(LimonataModBlocks.LEMON_LEAVES_LEMON.get().asItem());
				tabData.accept(LimonataModItems.ICE_CUBES.get());
				tabData.accept(LimonataModItems.DOUBLE_LEMONADE.get());
				tabData.accept(LimonataModItems.TRIPLE_LEMONADE.get());
				tabData.accept(LimonataModItems.QUADRUPLE_LEMONADE.get());
				tabData.accept(LimonataModItems.QUINTUPLE_LEMONADE.get());
				tabData.accept(LimonataModItems.CEMENT_LEMONADE.get());
				tabData.accept(LimonataModItems.NETHER_BRICKS_LEMONADE.get());
				tabData.accept(LimonataModItems.POWDER_LEMONADE.get());
				tabData.accept(LimonataModItems.BRICKS_LEMONADE.get());
				tabData.accept(LimonataModItems.GOLDEN_LEMONADE.get());
				tabData.accept(LimonataModItems.ENCHANTED_GOLDEN_LEMON.get());
				tabData.accept(LimonataModItems.ENCHANTED_GOLDEN_LEMONADE.get());
				tabData.accept(LimonataModItems.GLASS_OF_LEMONADE.get());
				tabData.accept(LimonataModItems.LEMONADE_BUCKET.get());
				tabData.accept(LimonataModItems.LEMONADE_BOTTLE.get());
				tabData.accept(LimonataModBlocks.LEMON_FUNGUS.get().asItem());
				tabData.accept(LimonataModItems.LEMON_SEEDS_OLD.get());
				tabData.accept(LimonataModBlocks.LEMON_SEEDS.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(LimonataModItems.MUSIC_DISC_LIMONATA_CHIAMATA.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(LimonataModItems.LEMON.get());
			tabData.accept(LimonataModItems.CUT_LEMON.get());
			tabData.accept(LimonataModItems.GOLDEN_LEMON.get());
			tabData.accept(LimonataModItems.DOUBLE_LEMONADE.get());
			tabData.accept(LimonataModItems.TRIPLE_LEMONADE.get());
			tabData.accept(LimonataModItems.QUADRUPLE_LEMONADE.get());
			tabData.accept(LimonataModItems.QUINTUPLE_LEMONADE.get());
			tabData.accept(LimonataModItems.CEMENT_LEMONADE.get());
			tabData.accept(LimonataModItems.NETHER_BRICKS_LEMONADE.get());
			tabData.accept(LimonataModItems.POWDER_LEMONADE.get());
			tabData.accept(LimonataModItems.BRICKS_LEMONADE.get());
			tabData.accept(LimonataModItems.GOLDEN_LEMONADE.get());
			tabData.accept(LimonataModItems.ENCHANTED_GOLDEN_LEMON.get());
			tabData.accept(LimonataModItems.ENCHANTED_GOLDEN_LEMONADE.get());
			tabData.accept(LimonataModItems.GLASS_OF_LEMONADE.get());
		}
	}
}