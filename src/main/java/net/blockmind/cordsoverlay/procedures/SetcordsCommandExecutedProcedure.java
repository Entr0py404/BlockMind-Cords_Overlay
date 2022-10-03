package net.blockmind.cordsoverlay.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;

import net.blockmind.cordsoverlay.network.BlockmindCordsOverlayModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class SetcordsCommandExecutedProcedure {
	public static void execute(double x, double y, double z, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (!(StringArgumentType.getString(arguments, "SlotName"))
				.equals((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot1_Name)
				&& !(StringArgumentType.getString(arguments, "SlotName"))
						.equals((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot2_Name)
				&& !(StringArgumentType.getString(arguments, "SlotName"))
						.equals((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot3_Name)
				&& !(StringArgumentType.getString(arguments, "SlotName"))
						.equals((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot4_Name)
				&& !(StringArgumentType.getString(arguments, "SlotName"))
						.equals((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot5_Name)) {
			if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 1) {
				{
					String _setval = StringArgumentType.getString(arguments, "SlotName");
					entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CordsSlot1_Name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = StringArgumentType.getString(arguments, "SlotName") + ": " + new java.text.DecimalFormat("##").format(x) + ", "
							+ new java.text.DecimalFormat("##").format(y) + ", " + new java.text.DecimalFormat("##").format(z);
					entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CordsSlot1_Cords = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 2) {
				{
					String _setval = StringArgumentType.getString(arguments, "SlotName");
					entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CordsSlot2_Name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = StringArgumentType.getString(arguments, "SlotName") + ": " + new java.text.DecimalFormat("##").format(x) + ", "
							+ new java.text.DecimalFormat("##").format(y) + ", " + new java.text.DecimalFormat("##").format(z);
					entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CordsSlot2_Cords = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 3) {
				{
					String _setval = StringArgumentType.getString(arguments, "SlotName");
					entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CordsSlot3_Name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = StringArgumentType.getString(arguments, "SlotName") + ": " + new java.text.DecimalFormat("##").format(x) + ", "
							+ new java.text.DecimalFormat("##").format(y) + ", " + new java.text.DecimalFormat("##").format(z);
					entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CordsSlot3_Cords = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 4) {
				{
					String _setval = StringArgumentType.getString(arguments, "SlotName");
					entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CordsSlot4_Name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = StringArgumentType.getString(arguments, "SlotName") + ": " + new java.text.DecimalFormat("##").format(x) + ", "
							+ new java.text.DecimalFormat("##").format(y) + ", " + new java.text.DecimalFormat("##").format(z);
					entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CordsSlot4_Cords = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 5) {
				{
					String _setval = StringArgumentType.getString(arguments, "SlotName");
					entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CordsSlot5_Name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = StringArgumentType.getString(arguments, "SlotName") + ": " + new java.text.DecimalFormat("##").format(x) + ", "
							+ new java.text.DecimalFormat("##").format(y) + ", " + new java.text.DecimalFormat("##").format(z);
					entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CordsSlot5_Cords = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Cords name already exists in your list."), (false));
		}
	}
}
