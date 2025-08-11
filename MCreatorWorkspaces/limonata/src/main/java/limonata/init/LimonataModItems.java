/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package limonata.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import limonata.item.MusicDiscLimonataChiamataItem;
import limonata.item.LimonataglassItem;
import limonata.item.LemonseedsItem;
import limonata.item.LemonadeStandAchievementItemItem;
import limonata.item.LemonadeAchievementItemItem;
import limonata.item.LemonItem;
import limonata.item.IceCubesItem;
import limonata.item.GlassItem;
import limonata.item.DraftLemonadeItem;
import limonata.item.CutlemonItem;

import limonata.LimonataMod;

public class LimonataModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LimonataMod.MODID);
	public static final DeferredItem<Item> MUSIC_DISC_LIMONATA_CHIAMATA = REGISTRY.register("music_disc_limonata_chiamata", MusicDiscLimonataChiamataItem::new);
	public static final DeferredItem<Item> GLASS = REGISTRY.register("glass", GlassItem::new);
	public static final DeferredItem<Item> GLASS_OF_LEMONADE = REGISTRY.register("glass_of_lemonade", LimonataglassItem::new);
	public static final DeferredItem<Item> LEMON = REGISTRY.register("lemon", LemonItem::new);
	public static final DeferredItem<Item> CUTLEMON = REGISTRY.register("cutlemon", CutlemonItem::new);
	public static final DeferredItem<Item> LEMONSEEDS = REGISTRY.register("lemonseeds", LemonseedsItem::new);
	public static final DeferredItem<Item> LEMON_CROP_0 = block(LimonataModBlocks.LEMON_CROP_0);
	public static final DeferredItem<Item> LEMON_CROP_2 = block(LimonataModBlocks.LEMON_CROP_2);
	public static final DeferredItem<Item> LEMON_CROP_1 = block(LimonataModBlocks.LEMON_CROP_1);
	public static final DeferredItem<Item> LEMON_CROP_3 = block(LimonataModBlocks.LEMON_CROP_3);
	public static final DeferredItem<Item> LEMON_CROP_4 = block(LimonataModBlocks.LEMON_CROP_4);
	public static final DeferredItem<Item> LEMON_CROP_5 = block(LimonataModBlocks.LEMON_CROP_5);
	public static final DeferredItem<Item> LEMON_CROP_6 = block(LimonataModBlocks.LEMON_CROP_6);
	public static final DeferredItem<Item> LEMON_CROP_5_5 = block(LimonataModBlocks.LEMON_CROP_5_5);
	public static final DeferredItem<Item> LEMON_LEAVES = block(LimonataModBlocks.LEMON_LEAVES);
	public static final DeferredItem<Item> LEMON_LEAVES_LEMON = block(LimonataModBlocks.LEMON_LEAVES_LEMON);
	public static final DeferredItem<Item> ICE_CUBES = REGISTRY.register("ice_cubes", IceCubesItem::new);
	public static final DeferredItem<Item> LEMONADE_STAND = block(LimonataModBlocks.LEMONADE_STAND);
	public static final DeferredItem<Item> LEMONADE_ACHIEVEMENT_ITEM = REGISTRY.register("lemonade_achievement_item", LemonadeAchievementItemItem::new);
	public static final DeferredItem<Item> DRAFT_LEMONADE = REGISTRY.register("draft_lemonade", DraftLemonadeItem::new);
	public static final DeferredItem<Item> LEMONADE_STAND_ACHIEVEMENT_ITEM = REGISTRY.register("lemonade_stand_achievement_item", LemonadeStandAchievementItemItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}