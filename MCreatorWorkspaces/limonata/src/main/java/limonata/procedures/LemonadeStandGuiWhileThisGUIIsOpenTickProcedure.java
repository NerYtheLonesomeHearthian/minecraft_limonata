package limonata.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import limonata.init.LimonataModMenus;
import limonata.init.LimonataModItems;

public class LemonadeStandGuiWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LimonataModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == LimonataModItems.ICE_CUBES.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof LimonataModMenus.MenuAccessor _menu)
				_menu.sendMenuStateUpdate(_player, 0, "label_empty8", "*", true);
		}
	}
}