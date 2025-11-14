package limonata.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import limonata.init.LimonataModItems;

public class LemonadeStandGuiWhileThisGUIIsOpenTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "waterLevelGUI") == 0) {
			if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 5).copy()).getItem() == Items.WATER_BUCKET) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("limonata:brew1")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("limonata:brew1")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("waterLevelGUI", 3);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable)
					_itemHandlerModifiable.setStackInSlot(5, ItemStack.EMPTY);
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.BUCKET).copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(5, _setstack);
				}
			}
		}
		if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "waterLevelGUI") == 1 || getBlockNBTNumber(world, BlockPos.containing(x, y, z), "waterLevelGUI") == 2
				|| getBlockNBTNumber(world, BlockPos.containing(x, y, z), "waterLevelGUI") == 3) {
			if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == LimonataModItems.ICE_CUBES.get() && (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == Blocks.BAMBOO.asItem()
					&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy()).getItem() == Items.SUGAR && (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == LimonataModItems.CUT_LEMON.get()
					&& ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 8).copy()).getItem() == LimonataModItems.DRAFT_LEMONADE.get() && itemFromBlockInventory(world, BlockPos.containing(x, y, z), 8).getCount() <= 63
							|| itemFromBlockInventory(world, BlockPos.containing(x, y, z), 8).getCount() == 0)) {
				if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "lemonadePreparationTime") == 221) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null) {
							_blockEntity.getPersistentData().putDouble("lemonadePreparationTime", 0);
						}
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null) {
							_blockEntity.getPersistentData().putDouble("lemonadePreparationTime", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "lemonadePreparationTime") + 1));
						}
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "lemonadePreparationTime") == 221) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("limonata:brew2")), SoundSource.BLOCKS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("limonata:brew2")), SoundSource.BLOCKS, 1, 1, false);
						}
					}
					if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
						ItemStack _setstack = new ItemStack(LimonataModItems.DRAFT_LEMONADE.get()).copy();
						_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 8).getCount() + 1);
						_itemHandlerModifiable.setStackInSlot(8, _setstack);
					}
					if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
						ItemStack _setstack = new ItemStack(LimonataModItems.ICE_CUBES.get()).copy();
						_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).getCount() - 1);
						_itemHandlerModifiable.setStackInSlot(0, _setstack);
					}
					if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
						ItemStack _setstack = new ItemStack(Blocks.BAMBOO).copy();
						_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).getCount() - 1);
						_itemHandlerModifiable.setStackInSlot(2, _setstack);
					}
					if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
						ItemStack _setstack = new ItemStack(Items.SUGAR).copy();
						_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).getCount() - 1);
						_itemHandlerModifiable.setStackInSlot(3, _setstack);
					}
					if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
						ItemStack _setstack = new ItemStack(LimonataModItems.CUT_LEMON.get()).copy();
						_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).getCount() - 1);
						_itemHandlerModifiable.setStackInSlot(4, _setstack);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null) {
							_blockEntity.getPersistentData().putDouble("waterLevelGUI", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "waterLevelGUI") - 1));
						}
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 8).copy()).getItem() == LimonataModItems.DRAFT_LEMONADE.get()) {
			if (((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 6).copy()).getItem() == Blocks.AIR.asItem() || (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 6).copy()).getItem() == Items.BUCKET)
					&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == LimonataModItems.GLASS.get()
					&& ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).copy()).getItem() == LimonataModItems.GLASS_OF_LEMONADE.get() && itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() <= 63
							|| itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() == 0)) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.GLASS.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(1, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.DRAFT_LEMONADE.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 8).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(8, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.GLASS_OF_LEMONADE.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(7, _setstack);
				}
			}
			if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 6).copy()).getItem() == Items.BRICK && (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == LimonataModItems.GLASS.get()
					&& ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).copy()).getItem() == LimonataModItems.BRICKS_LEMONADE.get() && itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() <= 63
							|| itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() == 0)) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.GLASS.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(1, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.DRAFT_LEMONADE.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 8).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(8, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.BRICK).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 6).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(6, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.BRICKS_LEMONADE.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(7, _setstack);
				}
			}
			if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 6).copy()).getItem() == Items.NETHER_BRICK && (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == LimonataModItems.GLASS.get()
					&& ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).copy()).getItem() == LimonataModItems.NETHER_BRICKS_LEMONADE.get() && itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() <= 63
							|| itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() == 0)) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.GLASS.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(1, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.DRAFT_LEMONADE.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 8).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(8, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.NETHER_BRICK).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 6).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(6, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.NETHER_BRICKS_LEMONADE.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(7, _setstack);
				}
			}
			if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 6).copy()).getItem() == Items.POWDER_SNOW_BUCKET && (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == LimonataModItems.GLASS.get()
					&& ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).copy()).getItem() == LimonataModItems.POWDER_LEMONADE.get() && itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() <= 63
							|| itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() == 0)) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.GLASS.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(1, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.DRAFT_LEMONADE.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 8).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(8, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.POWDER_SNOW_BUCKET).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 6).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(6, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.BUCKET).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 6).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(6, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.POWDER_LEMONADE.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(7, _setstack);
				}
			}
			if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 6).copy()).getItem() == Blocks.GRAY_CONCRETE_POWDER.asItem()
					&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == LimonataModItems.GLASS.get()
					&& ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).copy()).getItem() == LimonataModItems.CEMENT_LEMONADE.get() && itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() <= 63
							|| itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() == 0)) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.GLASS.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(1, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.DRAFT_LEMONADE.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 8).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(8, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Blocks.GRAY_CONCRETE_POWDER).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 6).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(6, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.CEMENT_LEMONADE.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(7, _setstack);
				}
			}
			if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 6).copy()).getItem() == LimonataModItems.GOLDEN_LEMON.get()
					&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == LimonataModItems.GLASS.get()
					&& ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).copy()).getItem() == LimonataModItems.GOLDEN_LEMONADE.get() && itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() <= 63
							|| itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() == 0)) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.GLASS.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(1, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.DRAFT_LEMONADE.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 8).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(8, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.GOLDEN_LEMON.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 6).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(6, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.GOLDEN_LEMONADE.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(7, _setstack);
				}
			}
			if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 6).copy()).getItem() == LimonataModItems.ENCHANTED_GOLDEN_LEMON.get()
					&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == LimonataModItems.GLASS.get()
					&& ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).copy()).getItem() == LimonataModItems.ENCHANTED_GOLDEN_LEMONADE.get() && itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() <= 63
							|| itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() == 0)) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.GLASS.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(1, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.DRAFT_LEMONADE.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 8).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(8, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.ENCHANTED_GOLDEN_LEMON.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 6).getCount() - 1);
					_itemHandlerModifiable.setStackInSlot(6, _setstack);
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(LimonataModItems.ENCHANTED_GOLDEN_LEMONADE.get()).copy();
					_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).getCount() + 1);
					_itemHandlerModifiable.setStackInSlot(7, _setstack);
				}
			}
		}
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDouble(tag);
		return -1;
	}

	private static ItemStack itemFromBlockInventory(LevelAccessor world, BlockPos pos, int slot) {
		if (world instanceof ILevelExtension ext) {
			IItemHandler itemHandler = ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
			if (itemHandler != null)
				return itemHandler.getStackInSlot(slot);
		}
		return ItemStack.EMPTY;
	}
}