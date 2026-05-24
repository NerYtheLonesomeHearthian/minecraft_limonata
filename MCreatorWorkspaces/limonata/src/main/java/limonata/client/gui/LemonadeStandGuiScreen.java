package limonata.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import limonata.world.inventory.LemonadeStandGuiMenu;

import limonata.procedures.*;

import limonata.init.LimonataModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class LemonadeStandGuiScreen extends AbstractContainerScreen<LemonadeStandGuiMenu> implements LimonataModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private static final ResourceLocation BACKGROUND = ResourceLocation.parse("limonata:textures/screens/lemonade_stand_gui.png");
	private static final ResourceLocation IMAGE_0 = ResourceLocation.parse("limonata:textures/screens/icecubes_gui.png");
	private static final ResourceLocation IMAGE_1 = ResourceLocation.parse("limonata:textures/screens/glass_gui.png");
	private static final ResourceLocation IMAGE_2 = ResourceLocation.parse("limonata:textures/screens/bamboo_gui.png");
	private static final ResourceLocation IMAGE_3 = ResourceLocation.parse("limonata:textures/screens/sugar_gui.png");
	private static final ResourceLocation IMAGE_4 = ResourceLocation.parse("limonata:textures/screens/cutlemon_gui.png");
	private static final ResourceLocation IMAGE_5 = ResourceLocation.parse("limonata:textures/screens/water_bucket_gui.png");
	private static final ResourceLocation IMAGE_6 = ResourceLocation.parse("limonata:textures/screens/questionmark_gui.png");
	private static final ResourceLocation IMAGE_7 = ResourceLocation.parse("limonata:textures/screens/glassoflemonade_gui.png");
	private static final ResourceLocation IMAGE_8 = ResourceLocation.parse("limonata:textures/screens/glass1_gui.png");
	private static final ResourceLocation IMAGE_9 = ResourceLocation.parse("limonata:textures/screens/lemonadestandgui_waterlevel.png");
	private static final ResourceLocation IMAGE_10 = ResourceLocation.parse("limonata:textures/screens/water_fuel_length_33.png");
	private static final ResourceLocation IMAGE_11 = ResourceLocation.parse("limonata:textures/screens/water_fuel_length_66.png");
	private static final ResourceLocation IMAGE_12 = ResourceLocation.parse("limonata:textures/screens/water_fuel_length.png");
	private static final ResourceLocation IMAGE_13 = ResourceLocation.parse("limonata:textures/screens/cooking_pot_mestolo.png");
	private static final ResourceLocation IMAGE_14 = ResourceLocation.parse("limonata:textures/screens/lemonadestandgui_coil.png");
	private static final ResourceLocation IMAGE_15 = ResourceLocation.parse("limonata:textures/screens/lemonadestandgui_finisharow.png");
	private static final ResourceLocation IMAGE_16 = ResourceLocation.parse("limonata:textures/screens/furnace.png");
	private static final ResourceLocation IMAGE_17 = ResourceLocation.parse("limonata:textures/screens/burn_progress_0.png");
	private static final ResourceLocation IMAGE_18 = ResourceLocation.parse("limonata:textures/screens/burn_progress_1.png");
	private static final ResourceLocation IMAGE_19 = ResourceLocation.parse("limonata:textures/screens/burn_progress_2.png");
	private static final ResourceLocation IMAGE_20 = ResourceLocation.parse("limonata:textures/screens/burn_progress_3.png");
	private static final ResourceLocation IMAGE_21 = ResourceLocation.parse("limonata:textures/screens/burn_progress_4.png");
	private static final ResourceLocation IMAGE_22 = ResourceLocation.parse("limonata:textures/screens/burn_progress_5.png");
	private static final ResourceLocation IMAGE_23 = ResourceLocation.parse("limonata:textures/screens/burn_progress_6.png");
	private static final ResourceLocation IMAGE_24 = ResourceLocation.parse("limonata:textures/screens/burn_progress_7.png");
	private static final ResourceLocation IMAGE_25 = ResourceLocation.parse("limonata:textures/screens/burn_progress_8.png");
	private static final ResourceLocation IMAGE_26 = ResourceLocation.parse("limonata:textures/screens/burn_progress_9.png");
	private static final ResourceLocation IMAGE_27 = ResourceLocation.parse("limonata:textures/screens/burn_progress_10.png");
	private static final ResourceLocation IMAGE_28 = ResourceLocation.parse("limonata:textures/screens/burn_progress_11.png");
	private static final ResourceLocation IMAGE_29 = ResourceLocation.parse("limonata:textures/screens/burn_progress_12.png");
	private static final ResourceLocation IMAGE_30 = ResourceLocation.parse("limonata:textures/screens/burn_progress_13.png");
	private static final ResourceLocation IMAGE_31 = ResourceLocation.parse("limonata:textures/screens/burn_progress_14.png");
	private static final ResourceLocation IMAGE_32 = ResourceLocation.parse("limonata:textures/screens/burn_progress_15.png");
	private static final ResourceLocation IMAGE_33 = ResourceLocation.parse("limonata:textures/screens/burn_progress_16.png");
	private static final ResourceLocation IMAGE_34 = ResourceLocation.parse("limonata:textures/screens/burn_progress_17.png");
	private static final ResourceLocation IMAGE_35 = ResourceLocation.parse("limonata:textures/screens/burn_progress_18.png");
	private static final ResourceLocation IMAGE_36 = ResourceLocation.parse("limonata:textures/screens/burn_progress_19.png");
	private static final ResourceLocation IMAGE_37 = ResourceLocation.parse("limonata:textures/screens/burn_progress_20.png");
	private static final ResourceLocation IMAGE_38 = ResourceLocation.parse("limonata:textures/screens/burn_progress_21.png");
	private static final ResourceLocation IMAGE_39 = ResourceLocation.parse("limonata:textures/screens/lemonadestandgui_addspecialingredientarrow.png");
	private static final ResourceLocation IMAGE_40 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui.png");
	private static final ResourceLocation IMAGE_41 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui01.png");
	private static final ResourceLocation IMAGE_42 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui02.png");
	private static final ResourceLocation IMAGE_43 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui03.png");
	private static final ResourceLocation IMAGE_44 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui04.png");
	private static final ResourceLocation IMAGE_45 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui05.png");
	private static final ResourceLocation IMAGE_46 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui06.png");
	private static final ResourceLocation IMAGE_47 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui07.png");
	private static final ResourceLocation IMAGE_48 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui08.png");
	private static final ResourceLocation IMAGE_49 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui09.png");
	private static final ResourceLocation IMAGE_50 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui10.png");
	private static final ResourceLocation IMAGE_51 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui11.png");
	private static final ResourceLocation IMAGE_52 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui12.png");
	private static final ResourceLocation IMAGE_53 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui13.png");
	private static final ResourceLocation IMAGE_54 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui14.png");
	private static final ResourceLocation IMAGE_55 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui15.png");
	private static final ResourceLocation IMAGE_56 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui16.png");
	private static final ResourceLocation IMAGE_57 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui17.png");
	private static final ResourceLocation IMAGE_58 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui18.png");
	private static final ResourceLocation IMAGE_59 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui19.png");
	private static final ResourceLocation IMAGE_60 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui20.png");
	private static final ResourceLocation IMAGE_61 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui21.png");
	private static final ResourceLocation IMAGE_62 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui22.png");
	private static final ResourceLocation IMAGE_63 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui23.png");
	private static final ResourceLocation IMAGE_64 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui24.png");
	private static final ResourceLocation IMAGE_65 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui25.png");
	private static final ResourceLocation IMAGE_66 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui26.png");
	private static final ResourceLocation IMAGE_67 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui27.png");
	private static final ResourceLocation IMAGE_68 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui28.png");
	private static final ResourceLocation IMAGE_69 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui29.png");
	private static final ResourceLocation IMAGE_70 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui30.png");
	private static final ResourceLocation IMAGE_71 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui31.png");
	private static final ResourceLocation IMAGE_72 = ResourceLocation.parse("limonata:textures/screens/lemonadejuggui32full.png");

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
		guiGraphics.blit(BACKGROUND, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(IMAGE_0, this.leftPos + 20, this.topPos + 21, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(IMAGE_1, this.leftPos + 116, this.topPos + 105, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(IMAGE_2, this.leftPos + 68, this.topPos + 21, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(IMAGE_3, this.leftPos + 70, this.topPos + 64, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(IMAGE_4, this.leftPos + 18, this.topPos + 65, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(IMAGE_5, this.leftPos + 8, this.topPos + 105, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(IMAGE_6, this.leftPos + 80, this.topPos + 105, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(IMAGE_7, this.leftPos + 152, this.topPos + 105, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(IMAGE_8, this.leftPos + 34, this.topPos + 36, 0, 0, 36, 57, 36, 57);
		guiGraphics.blit(IMAGE_9, this.leftPos + 25, this.topPos + 111, 0, 0, 21, 6, 21, 6);
		if (LmnstandGUIwaterBar0Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_10, this.leftPos + 27, this.topPos + 112, 0, 0, 18, 4, 18, 4);
		}
		if (LmnstandGUIwaterBar1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_11, this.leftPos + 27, this.topPos + 112, 0, 0, 18, 4, 18, 4);
		}
		if (LmnstandGUIwaterBar2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_12, this.leftPos + 27, this.topPos + 112, 0, 0, 18, 4, 18, 4);
		}
		guiGraphics.blit(IMAGE_13, this.leftPos + 138, this.topPos + 106, 0, 0, 9, 14, 9, 14);
		guiGraphics.blit(IMAGE_14, this.leftPos + 46, this.topPos + 92, 0, 0, 12, 24, 12, 24);
		guiGraphics.blit(IMAGE_15, this.leftPos + 141, this.topPos + 64, 0, 0, 22, 40, 22, 40);
		guiGraphics.blit(IMAGE_16, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 15, 22, 15);
		if (LmnstandGUIbrewingProgress0Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_17, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_18, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_19, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_20, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_21, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_22, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_23, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_24, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_25, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_26, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_27, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress11Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_28, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress12Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_29, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress13Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_30, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress14Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_31, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress15Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_32, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress16Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_33, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress17Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_34, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress18Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_35, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress19Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_36, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress20Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_37, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		if (LmnstandGUIbrewingProgress21Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(IMAGE_38, this.leftPos + 95, this.topPos + 44, 0, 0, 22, 16, 22, 16);
		}
		guiGraphics.blit(IMAGE_39, this.leftPos + 97, this.topPos + 80, 0, 0, 43, 22, 43, 22);
		guiGraphics.blit(IMAGE_40, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_41, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_42, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_43, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_44, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_45, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_46, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_47, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_48, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_49, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_50, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_51, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_52, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_53, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_54, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_55, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_56, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_57, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_58, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_59, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_60, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_61, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_62, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_63, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_64, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_65, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_66, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_67, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_68, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_69, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_70, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_71, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
		guiGraphics.blit(IMAGE_72, this.leftPos + 127, this.topPos + 35, 0, 0, 33, 33, 33, 33);
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