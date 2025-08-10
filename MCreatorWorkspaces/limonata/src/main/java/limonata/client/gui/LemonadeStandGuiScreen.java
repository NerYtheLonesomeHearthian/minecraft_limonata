package limonata.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import limonata.world.inventory.LemonadeStandGuiMenu;

import limonata.procedures.LmnstandGUIwaterBar2Procedure;
import limonata.procedures.LmnstandGUIwaterBar1Procedure;
import limonata.procedures.LmnstandGUIwaterBar0Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress9Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress8Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress7Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress6Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress5Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress4Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress3Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress2Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress21Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress20Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress1Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress19Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress18Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress17Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress16Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress15Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress14Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress13Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress12Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress11Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress10Procedure;
import limonata.procedures.LmnstandGUIbrewingProgress0Procedure;

import limonata.init.LimonataModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class LemonadeStandGuiScreen extends AbstractContainerScreen<LemonadeStandGuiMenu> implements LimonataModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;

	public LemonadeStandGuiScreen(LemonadeStandGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 214;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("limonata:textures/screens/lemonade_stand_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/icecubes_gui.png"), this.leftPos + 20, this.topPos + 21, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/glass_gui.png"), this.leftPos + 116, this.topPos + 105, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/bamboo_gui.png"), this.leftPos + 68, this.topPos + 21, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/sugar_gui.png"), this.leftPos + 70, this.topPos + 65, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/cutlemon_gui.png"), this.leftPos + 18, this.topPos + 65, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/water_bucket_gui.png"), this.leftPos + 8, this.topPos + 105, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/questionmark_gui.png"), this.leftPos + 80, this.topPos + 105, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/glassoflemonade_gui.png"), this.leftPos + 152, this.topPos + 105, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/glass1_gui.png"), this.leftPos + 34, this.topPos + 36, 0, 0, 36, 57, 36, 57);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/lemonadestandgui_waterlevel.png"), this.leftPos + 25, this.topPos + 111, 0, 0, 21, 6, 21, 6);
		if (LmnstandGUIwaterBar0Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/water_fuel_length_33.png"), this.leftPos + 27, this.topPos + 112, 0, 0, 18, 4, 18, 4);
		}
		if (LmnstandGUIwaterBar1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/water_fuel_length_66.png"), this.leftPos + 27, this.topPos + 112, 0, 0, 18, 4, 18, 4);
		}
		if (LmnstandGUIwaterBar2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/water_fuel_length.png"), this.leftPos + 27, this.topPos + 112, 0, 0, 18, 4, 18, 4);
		}
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/cooking_pot_mestolo.png"), this.leftPos + 138, this.topPos + 106, 0, 0, 9, 14, 9, 14);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/furnace_gui_big-slot.png"), this.leftPos + 129, this.topPos + 39, 0, 0, 26, 25, 26, 25);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/lemonadestandgui_coil.png"), this.leftPos + 46, this.topPos + 92, 0, 0, 12, 24, 12, 24);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/lemonadestandgui_finisharow.png"), this.leftPos + 141, this.topPos + 64, 0, 0, 22, 40, 22, 40);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/furnace.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 15, 22, 15);
		if (LmnstandGUIbrewingProgress0Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_0.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_1.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_2.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_3.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_4.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_5.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_6.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_7.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_8.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_9.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_10.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress11Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_11.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress12Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_12.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress13Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_13.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress14Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_14.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress15Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_15.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress16Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_16.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress17Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_17.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress18Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_18.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress19Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_19.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress20Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_20.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress21Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/burn_progress_21.png"), this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.limonata.lemonade_stand_gui.label_lemoande_stand"), 48, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.limonata.lemonade_stand_gui.label_empty"), 71, 109, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}