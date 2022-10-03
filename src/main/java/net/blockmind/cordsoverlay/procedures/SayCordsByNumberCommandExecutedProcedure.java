package net.blockmind.cordsoverlay.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.Util;

import net.blockmind.cordsoverlay.network.BlockmindCordsOverlayModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class SayCordsByNumberCommandExecutedProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 1) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(
							new TextComponent(((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot1_Cords)),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 2) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(
							new TextComponent(((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot2_Cords)),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 3) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(
							new TextComponent(((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot3_Cords)),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 4) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(
							new TextComponent(((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot4_Cords)),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 5) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(
							new TextComponent(((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot5_Cords)),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
		}
	}
}
