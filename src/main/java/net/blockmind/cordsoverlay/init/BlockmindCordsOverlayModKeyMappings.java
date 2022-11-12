
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.blockmind.cordsoverlay.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.blockmind.cordsoverlay.network.ToggleCordsOverlayMessage;
import net.blockmind.cordsoverlay.BlockmindCordsOverlayMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BlockmindCordsOverlayModKeyMappings {
	public static final KeyMapping TOGGLE_CORDS_OVERLAY = new KeyMapping("key.blockmind_cords_overlay.toggle_cords_overlay", GLFW.GLFW_KEY_Z,
			"key.categories.ui") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				BlockmindCordsOverlayMod.PACKET_HANDLER.sendToServer(new ToggleCordsOverlayMessage(0, 0));
				ToggleCordsOverlayMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(TOGGLE_CORDS_OVERLAY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				TOGGLE_CORDS_OVERLAY.consumeClick();
			}
		}
	}
}
