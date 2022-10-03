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
import com.mojang.brigadier.arguments.StringArgumentType;

public class SayCordsByNameCommandExecutedProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "SlotName"))
				.equals((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot1_Name)) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(
							new TextComponent(((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot1_Cords)),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
		} else if ((StringArgumentType.getString(arguments, "SlotName"))
				.equals((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot1_Name)) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(
							new TextComponent(((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot1_Cords)),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
		} else if ((StringArgumentType.getString(arguments, "SlotName"))
				.equals((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot1_Name)) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(
							new TextComponent(((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot1_Cords)),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
		} else if ((StringArgumentType.getString(arguments, "SlotName"))
				.equals((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot1_Name)) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(
							new TextComponent(((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot1_Cords)),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
		} else if ((StringArgumentType.getString(arguments, "SlotName"))
				.equals((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot1_Name)) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(
							new TextComponent(((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot1_Cords)),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
		}
	}
}
