package net.blockmind.cordsoverlay.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import net.blockmind.cordsoverlay.network.BlockmindCordsOverlayModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class TargetcordsByNumberCommandExecutedProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 1) {
			{
				String _setval = (entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot1_Cords;
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TargetCords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 2) {
			{
				String _setval = (entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot2_Cords;
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TargetCords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 3) {
			{
				String _setval = (entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot3_Cords;
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TargetCords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 4) {
			{
				String _setval = (entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot4_Cords;
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TargetCords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 5) {
			{
				String _setval = (entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot5_Cords;
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TargetCords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
