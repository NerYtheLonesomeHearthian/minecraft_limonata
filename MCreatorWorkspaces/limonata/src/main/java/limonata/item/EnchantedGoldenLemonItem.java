package limonata.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import limonata.procedures.EnchantedGoldenLemonEatingEffectsProcedure;

import java.util.List;

public class EnchantedGoldenLemonItem extends Item {
	public EnchantedGoldenLemonItem() {
		super(new Item.Properties().rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(4).saturationModifier(1.2f).alwaysEdible().build()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.limonata.enchanted_golden_lemon.description_0"));
		list.add(Component.translatable("item.limonata.enchanted_golden_lemon.description_1"));
		list.add(Component.translatable("item.limonata.enchanted_golden_lemon.description_2"));
		list.add(Component.translatable("item.limonata.enchanted_golden_lemon.description_3"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		EnchantedGoldenLemonEatingEffectsProcedure.execute(entity);
		return retval;
	}
}