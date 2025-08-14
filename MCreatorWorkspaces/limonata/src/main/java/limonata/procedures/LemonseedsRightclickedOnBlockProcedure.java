package limonata.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import limonata.init.LimonataModItems;
import limonata.init.LimonataModBlocks;

public class LemonseedsRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean hydrated = false;
		double rand = 0;
		double count = 0;
		double row = 0;
		double points = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FARMLAND && world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
			world.setBlock(BlockPos.containing(x, y + 1, z), LimonataModBlocks.LEMON_CROP_0.get().defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.crop.plant")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.crop.plant")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(LimonataModItems.LEMON_SEEDS.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (!(entity instanceof ServerPlayer _plr7 && _plr7.level() instanceof ServerLevel && _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().get(ResourceLocation.parse("minecraft:husbandry/plant_seed"))).isDone())) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:husbandry/plant_seed"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
	}
}