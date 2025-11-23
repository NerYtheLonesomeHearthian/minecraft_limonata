/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package limonata.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import limonata.item.*;

import limonata.LimonataMod;

public class LimonataModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LimonataMod.MODID);
	public static final DeferredItem<Item> MUSIC_DISC_LIMONATA_CHIAMATA;
	public static final DeferredItem<Item> GLASS;
	public static final DeferredItem<Item> GLASS_OF_LEMONADE;
	public static final DeferredItem<Item> LEMON;
	public static final DeferredItem<Item> CUT_LEMON;
	public static final DeferredItem<Item> LEMON_SEEDS;
	public static final DeferredItem<Item> LEMON_CROP_2;
	public static final DeferredItem<Item> LEMON_CROP_1;
	public static final DeferredItem<Item> LEMON_CROP_3;
	public static final DeferredItem<Item> LEMON_CROP_4;
	public static final DeferredItem<Item> LEMON_CROP_5;
	public static final DeferredItem<Item> LEMON_CROP_6;
	public static final DeferredItem<Item> LEMON_CROP_5_5;
	public static final DeferredItem<Item> LEMON_LEAVES;
	public static final DeferredItem<Item> LEMON_LEAVES_LEMON;
	public static final DeferredItem<Item> ICE_CUBES;
	public static final DeferredItem<Item> LEMONADE_STAND;
	public static final DeferredItem<Item> LEMONADE_ACHIEVEMENT_ITEM;
	public static final DeferredItem<Item> DRAFT_LEMONADE;
	public static final DeferredItem<Item> LEMONADE_STAND_ACHIEVEMENT_ITEM;
	public static final DeferredItem<Item> LEMON_CRATE;
	public static final DeferredItem<Item> GOLDEN_LEMON;
	public static final DeferredItem<Item> DOUBLE_LEMONADE;
	public static final DeferredItem<Item> TRIPLE_LEMONADE;
	public static final DeferredItem<Item> QUADRUPLE_LEMONADE;
	public static final DeferredItem<Item> QUINTUPLE_LEMONADE;
	public static final DeferredItem<Item> CEMENT_LEMONADE;
	public static final DeferredItem<Item> NETHER_BRICKS_LEMONADE;
	public static final DeferredItem<Item> POWDER_LEMONADE;
	public static final DeferredItem<Item> BRICKS_LEMONADE;
	public static final DeferredItem<Item> GOLDEN_LEMONADE;
	public static final DeferredItem<Item> ENCHANTED_GOLDEN_LEMON;
	public static final DeferredItem<Item> ENCHANTED_GOLDEN_LEMONADE;
	public static final DeferredItem<Item> LEMONADE_BUCKET;
	public static final DeferredItem<Item> LEMONADE_BOTTLE;
	public static final DeferredItem<Item> LEMONSHROOM;
	public static final DeferredItem<Item> HATCHLING_LEMONSHROOM;
	public static final DeferredItem<Item> GROWN_LEMONSHROOM;
	public static final DeferredItem<Item> ADULT_LEMONSHROOM;
	static {
		MUSIC_DISC_LIMONATA_CHIAMATA = REGISTRY.register("music_disc_limonata_chiamata", MusicDiscLimonataChiamataItem::new);
		GLASS = REGISTRY.register("glass", GlassItem::new);
		GLASS_OF_LEMONADE = REGISTRY.register("glass_of_lemonade", LimonataglassItem::new);
		LEMON = REGISTRY.register("lemon", LemonItem::new);
		CUT_LEMON = REGISTRY.register("cut_lemon", CutlemonItem::new);
		LEMON_SEEDS = block(LimonataModBlocks.LEMON_SEEDS);
		LEMON_CROP_2 = block(LimonataModBlocks.LEMON_CROP_2);
		LEMON_CROP_1 = block(LimonataModBlocks.LEMON_CROP_1);
		LEMON_CROP_3 = block(LimonataModBlocks.LEMON_CROP_3);
		LEMON_CROP_4 = block(LimonataModBlocks.LEMON_CROP_4);
		LEMON_CROP_5 = block(LimonataModBlocks.LEMON_CROP_5);
		LEMON_CROP_6 = block(LimonataModBlocks.LEMON_CROP_6);
		LEMON_CROP_5_5 = block(LimonataModBlocks.LEMON_CROP_5_5);
		LEMON_LEAVES = block(LimonataModBlocks.LEMON_LEAVES);
		LEMON_LEAVES_LEMON = block(LimonataModBlocks.LEMON_LEAVES_LEMON);
		ICE_CUBES = REGISTRY.register("ice_cubes", IceCubesItem::new);
		LEMONADE_STAND = block(LimonataModBlocks.LEMONADE_STAND);
		LEMONADE_ACHIEVEMENT_ITEM = REGISTRY.register("lemonade_achievement_item", LemonadeAchievementItemItem::new);
		DRAFT_LEMONADE = REGISTRY.register("draft_lemonade", DraftLemonadeItem::new);
		LEMONADE_STAND_ACHIEVEMENT_ITEM = REGISTRY.register("lemonade_stand_achievement_item", LemonadeStandAchievementItemItem::new);
		LEMON_CRATE = block(LimonataModBlocks.LEMON_CRATE);
		GOLDEN_LEMON = REGISTRY.register("golden_lemon", GoldenLemonItem::new);
		DOUBLE_LEMONADE = REGISTRY.register("double_lemonade", DoubleLemonadeItem::new);
		TRIPLE_LEMONADE = REGISTRY.register("triple_lemonade", TripleLemonadeItem::new);
		QUADRUPLE_LEMONADE = REGISTRY.register("quadruple_lemonade", QuadrupleLemonadeItem::new);
		QUINTUPLE_LEMONADE = REGISTRY.register("quintuple_lemonade", QuintupleLemonadeItem::new);
		CEMENT_LEMONADE = REGISTRY.register("cement_lemonade", CementLemonadeItem::new);
		NETHER_BRICKS_LEMONADE = REGISTRY.register("nether_bricks_lemonade", NetherBricksLemonadeItem::new);
		POWDER_LEMONADE = REGISTRY.register("powder_lemonade", PowderLemonadeItem::new);
		BRICKS_LEMONADE = REGISTRY.register("bricks_lemonade", BricksLemonadeItem::new);
		GOLDEN_LEMONADE = REGISTRY.register("golden_lemonade", GoldenLemonadeItem::new);
		ENCHANTED_GOLDEN_LEMON = REGISTRY.register("enchanted_golden_lemon", EnchantedGoldenLemonItem::new);
		ENCHANTED_GOLDEN_LEMONADE = REGISTRY.register("enchanted_golden_lemonade", EnchantedGoldenLemonadeItem::new);
		LEMONADE_BUCKET = REGISTRY.register("lemonade_bucket", LemonadeItem::new);
		LEMONADE_BOTTLE = REGISTRY.register("lemonade_bottle", LemonadeBottleItem::new);
		LEMONSHROOM = block(LimonataModBlocks.LEMONSHROOM);
		HATCHLING_LEMONSHROOM = block(LimonataModBlocks.HATCHLING_LEMONSHROOM);
		GROWN_LEMONSHROOM = block(LimonataModBlocks.GROWN_LEMONSHROOM);
		ADULT_LEMONSHROOM = block(LimonataModBlocks.ADULT_LEMONSHROOM);
	}

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.FluidHandler.ITEM, (stack, context) -> new FluidBucketWrapper(stack), LEMONADE_BUCKET.get());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}