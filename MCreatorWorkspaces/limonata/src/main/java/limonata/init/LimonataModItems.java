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

import limonata.item.TripleLemonadeItem;
import limonata.item.QuintupleLemonadeItem;
import limonata.item.QuadrupleLemonadeItem;
import limonata.item.PowderLemonadeItem;
import limonata.item.NetherBricksLemonadeItem;
import limonata.item.MusicDiscLimonataChiamataItem;
import limonata.item.LimonataglassItem;
import limonata.item.LemonseedsItem;
import limonata.item.LemonadeStandAchievementItemItem;
import limonata.item.LemonadeItem;
import limonata.item.LemonadeBottleItem;
import limonata.item.LemonadeAchievementItemItem;
import limonata.item.LemonItem;
import limonata.item.IceCubesItem;
import limonata.item.GoldenLemonadeItem;
import limonata.item.GoldenLemonItem;
import limonata.item.GlassItem;
import limonata.item.EnchantedGoldenLemonadeItem;
import limonata.item.EnchantedGoldenLemonItem;
import limonata.item.DraftLemonadeItem;
import limonata.item.DoubleLemonadeItem;
import limonata.item.CutlemonItem;
import limonata.item.CementLemonadeItem;
import limonata.item.BricksLemonadeItem;

import limonata.LimonataMod;

public class LimonataModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LimonataMod.MODID);
	public static final DeferredItem<Item> MUSIC_DISC_LIMONATA_CHIAMATA = REGISTRY.register("music_disc_limonata_chiamata", MusicDiscLimonataChiamataItem::new);
	public static final DeferredItem<Item> GLASS = REGISTRY.register("glass", GlassItem::new);
	public static final DeferredItem<Item> GLASS_OF_LEMONADE = REGISTRY.register("glass_of_lemonade", LimonataglassItem::new);
	public static final DeferredItem<Item> LEMON = REGISTRY.register("lemon", LemonItem::new);
	public static final DeferredItem<Item> CUT_LEMON = REGISTRY.register("cut_lemon", CutlemonItem::new);
	public static final DeferredItem<Item> LEMON_SEEDS = REGISTRY.register("lemon_seeds", LemonseedsItem::new);
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
	public static final DeferredItem<Item> LEMON_CRATE = block(LimonataModBlocks.LEMON_CRATE);
	public static final DeferredItem<Item> GOLDEN_LEMON = REGISTRY.register("golden_lemon", GoldenLemonItem::new);
	public static final DeferredItem<Item> DOUBLE_LEMONADE = REGISTRY.register("double_lemonade", DoubleLemonadeItem::new);
	public static final DeferredItem<Item> TRIPLE_LEMONADE = REGISTRY.register("triple_lemonade", TripleLemonadeItem::new);
	public static final DeferredItem<Item> QUADRUPLE_LEMONADE = REGISTRY.register("quadruple_lemonade", QuadrupleLemonadeItem::new);
	public static final DeferredItem<Item> QUINTUPLE_LEMONADE = REGISTRY.register("quintuple_lemonade", QuintupleLemonadeItem::new);
	public static final DeferredItem<Item> CEMENT_LEMONADE = REGISTRY.register("cement_lemonade", CementLemonadeItem::new);
	public static final DeferredItem<Item> NETHER_BRICKS_LEMONADE = REGISTRY.register("nether_bricks_lemonade", NetherBricksLemonadeItem::new);
	public static final DeferredItem<Item> POWDER_LEMONADE = REGISTRY.register("powder_lemonade", PowderLemonadeItem::new);
	public static final DeferredItem<Item> BRICKS_LEMONADE = REGISTRY.register("bricks_lemonade", BricksLemonadeItem::new);
	public static final DeferredItem<Item> GOLDEN_LEMONADE = REGISTRY.register("golden_lemonade", GoldenLemonadeItem::new);
	public static final DeferredItem<Item> ENCHANTED_GOLDEN_LEMON = REGISTRY.register("enchanted_golden_lemon", EnchantedGoldenLemonItem::new);
	public static final DeferredItem<Item> ENCHANTED_GOLDEN_LEMONADE = REGISTRY.register("enchanted_golden_lemonade", EnchantedGoldenLemonadeItem::new);
	public static final DeferredItem<Item> LEMONADE_BUCKET = REGISTRY.register("lemonade_bucket", LemonadeItem::new);
	public static final DeferredItem<Item> LEMONADE_BOTTLE = REGISTRY.register("lemonade_bottle", LemonadeBottleItem::new);
	public static final DeferredItem<Item> LEMON_FUNGUS = block(LimonataModBlocks.LEMON_FUNGUS);
	public static final DeferredItem<Item> LEMON_FUNGUS_STAGE_2 = block(LimonataModBlocks.LEMON_FUNGUS_STAGE_2);
	public static final DeferredItem<Item> LEMON_FUNGUS_STAGE_3 = block(LimonataModBlocks.LEMON_FUNGUS_STAGE_3);
	public static final DeferredItem<Item> LEMON_FUNGUS_STAGE_4 = block(LimonataModBlocks.LEMON_FUNGUS_STAGE_4);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}