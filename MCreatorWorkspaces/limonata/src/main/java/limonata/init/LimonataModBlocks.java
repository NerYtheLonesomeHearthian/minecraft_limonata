/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package limonata.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import limonata.block.*;

import limonata.LimonataMod;

public class LimonataModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(LimonataMod.MODID);
	public static final DeferredBlock<Block> LEMON_SEEDS;
	public static final DeferredBlock<Block> LEMON_CROP_2;
	public static final DeferredBlock<Block> LEMON_CROP_1;
	public static final DeferredBlock<Block> LEMON_CROP_3;
	public static final DeferredBlock<Block> LEMON_CROP_4;
	public static final DeferredBlock<Block> LEMON_CROP_5;
	public static final DeferredBlock<Block> LEMON_CROP_6;
	public static final DeferredBlock<Block> LEMON_CROP_5_5;
	public static final DeferredBlock<Block> LEMON_LEAVES;
	public static final DeferredBlock<Block> LEMON_LEAVES_LEMON;
	public static final DeferredBlock<Block> LEMONADE_STAND;
	public static final DeferredBlock<Block> LEMON_CRATE;
	public static final DeferredBlock<Block> LEMONADE;
	public static final DeferredBlock<Block> LEMONSHROOM;
	public static final DeferredBlock<Block> HATCHLING_LEMONSHROOM;
	public static final DeferredBlock<Block> GROWN_LEMONSHROOM;
	public static final DeferredBlock<Block> ADULT_LEMONSHROOM;
	public static final DeferredBlock<Block> LEMONSHROOMBLOCK;
	public static final DeferredBlock<Block> LEMONSHROOMSTEM;
	static {
		LEMON_SEEDS = REGISTRY.register("lemon_seeds", LemonCrop0Block::new);
		LEMON_CROP_2 = REGISTRY.register("lemon_crop_2", LemonCrop2Block::new);
		LEMON_CROP_1 = REGISTRY.register("lemon_crop_1", LemonCrop1Block::new);
		LEMON_CROP_3 = REGISTRY.register("lemon_crop_3", LemonCrop3Block::new);
		LEMON_CROP_4 = REGISTRY.register("lemon_crop_4", LemonCrop4Block::new);
		LEMON_CROP_5 = REGISTRY.register("lemon_crop_5", LemonCrop5Block::new);
		LEMON_CROP_6 = REGISTRY.register("lemon_crop_6", LemonCrop6Block::new);
		LEMON_CROP_5_5 = REGISTRY.register("lemon_crop_5_5", LemonCrop55Block::new);
		LEMON_LEAVES = REGISTRY.register("lemon_leaves", LemonLeavesBlock::new);
		LEMON_LEAVES_LEMON = REGISTRY.register("lemon_leaves_lemon", LemonLeavesLemonBlock::new);
		LEMONADE_STAND = REGISTRY.register("lemonade_stand", LemonadeStandBlock::new);
		LEMON_CRATE = REGISTRY.register("lemon_crate", LemonCrateBlock::new);
		LEMONADE = REGISTRY.register("lemonade", LemonadeBlock::new);
		LEMONSHROOM = REGISTRY.register("lemonshroom", LemonfungusBlock::new);
		HATCHLING_LEMONSHROOM = REGISTRY.register("hatchling_lemonshroom", LemonFungusStage2Block::new);
		GROWN_LEMONSHROOM = REGISTRY.register("grown_lemonshroom", LemonFungusStage3Block::new);
		ADULT_LEMONSHROOM = REGISTRY.register("adult_lemonshroom", LemonFungusStage4Block::new);
		LEMONSHROOMBLOCK = REGISTRY.register("lemonshroomblock", LemonshroomblockBlock::new);
		LEMONSHROOMSTEM = REGISTRY.register("lemonshroomstem", LemonshroomstemBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}