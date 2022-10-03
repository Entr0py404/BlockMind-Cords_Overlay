package net.blockmind.cordsoverlay.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import net.blockmind.cordsoverlay.network.BlockmindCordsOverlayModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class RemoveCordsByNameCommandExecutedProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "SlotName"))
				.equals((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot1_Name)) {
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
		} else if ((StringArgumentType.getString(arguments, "SlotName"))
				.equals((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot2_Name)) {
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
		} else if ((StringArgumentType.getString(arguments, "SlotName"))
				.equals((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot3_Name)) {
			{
				String _setval = "";
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CordsSlot3_Name = _setval;
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
		} else if ((StringArgumentType.getString(arguments, "SlotName"))
				.equals((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot4_Name)) {
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
		} else if ((StringArgumentType.getString(arguments, "SlotName"))
				.equals((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot5_Name)) {
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
