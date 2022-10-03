package net.blockmind.cordsoverlay.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import net.blockmind.cordsoverlay.network.BlockmindCordsOverlayModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class RemoveCordsByNumberCommandExecutedProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 1) {
			{
				String _setval = "";
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CordsSlot1_Name = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "";
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CordsSlot1_Cords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 2) {
			{
				String _setval = "";
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CordsSlot2_Name = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "";
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CordsSlot2_Cords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 3) {
			{
				String _setval = "";
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CordsSlot3_Cords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "";
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CordsSlot3_Cords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 4) {
			{
				String _setval = "";
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CordsSlot4_Name = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "";
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CordsSlot4_Cords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 5) {
			{
				String _setval = "";
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CordsSlot5_Name = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "";
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CordsSlot5_Cords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
