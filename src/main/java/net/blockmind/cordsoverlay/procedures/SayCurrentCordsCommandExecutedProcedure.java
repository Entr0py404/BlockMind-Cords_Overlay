package net.blockmind.cordsoverlay.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

import net.blockmind.cordsoverlay.network.BlockmindCordsOverlayModVariables;

public class SayCurrentCordsCommandExecutedProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent(("Current cords: " + BlockmindCordsOverlayModVariables.CurrentCords)),
						ChatType.SYSTEM, Util.NIL_UUID);
		}
	}
}
