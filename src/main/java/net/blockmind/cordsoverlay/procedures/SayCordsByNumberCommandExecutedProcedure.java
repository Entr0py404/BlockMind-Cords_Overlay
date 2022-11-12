package net.blockmind.cordsoverlay.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

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
					_mcserv.getPlayerList().broadcastSystemMessage(
							Component.literal(((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot1_Cords)),
							false);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 2) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastSystemMessage(
							Component.literal(((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot2_Cords)),
							false);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 3) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastSystemMessage(
							Component.literal(((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot3_Cords)),
							false);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 4) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastSystemMessage(
							Component.literal(((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot4_Cords)),
							false);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 5) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastSystemMessage(
							Component.literal(((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot5_Cords)),
							false);
			}
		}
	}
}
