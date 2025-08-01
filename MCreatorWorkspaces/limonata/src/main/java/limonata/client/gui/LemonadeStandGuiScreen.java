package limonata.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import limonata.world.inventory.LemonadeStandGuiMenu;

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
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/questionmark_gui.png"), this.leftPos + 96, this.topPos + 61, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/bamboo_gui.png"), this.leftPos + 62, this.topPos + 42, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/cutlemon_gui.png"), this.leftPos + 44, this.topPos + 78, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/glass_gui.png"), this.leftPos + 62, this.topPos + 106, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/sugar_gui.png"), this.leftPos + 62, this.topPos + 78, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/water_bucket_gui.png"), this.leftPos + 26, this.topPos + 106, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/icecubes_gui.png"), this.leftPos + 26, this.topPos + 42, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(ResourceLocation.parse("limonata:textures/screens/glassoflemonade_gui.png"), this.leftPos + 152, this.topPos + 61, 0, 0, 16, 16, 16, 16);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.limonata.lemonade_stand_gui.label_lemoande_stand"), 56, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.limonata.lemonade_stand_gui.label_empty"), 85, 63, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}