package limonata.procedures;

import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import limonata.init.LimonataModMenus;
import limonata.init.LimonataModItems;

public class LemonadeStandGuiWhileThisGUIIsOpenTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LimonataModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == LimonataModItems.ICE_CUBES.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LimonataModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == LimonataModItems.GLASS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LimonataModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.BAMBOO.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LimonataModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Items.SUGAR
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LimonataModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == LimonataModItems.CUTLEMON.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LimonataModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Items.WATER_BUCKET
				&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LimonataModMenus.MenuAccessor _menu12 ? _menu12.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == LimonataModItems.GLASS_OF_LEMONADE.get()
						&& itemFromBlockInventory(world, BlockPos.containing(x, y, z), 5).getCount() <= 63 || itemFromBlockInventory(world, BlockPos.containing(x, y, z), 5).getCount() == 0)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof LimonataModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(LimonataModItems.GLASS_OF_LEMONADE.get()).copy();
				_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 5).getCount() + 1);
				_menu.getSlots().get(5).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof LimonataModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(LimonataModItems.ICE_CUBES.get()).copy();
				_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).getCount() - 1);
				_menu.getSlots().get(0).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof LimonataModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(LimonataModItems.GLASS.get()).copy();
				_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).getCount() - 1);
				_menu.getSlots().get(1).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof LimonataModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Blocks.BAMBOO).copy();
				_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).getCount() - 1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof LimonataModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Items.SUGAR).copy();
				_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).getCount() - 1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof LimonataModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(LimonataModItems.CUTLEMON.get()).copy();
				_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 6).getCount() - 1);
				_menu.getSlots().get(6).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof LimonataModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(7).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof LimonataModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Items.BUCKET).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(7).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
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