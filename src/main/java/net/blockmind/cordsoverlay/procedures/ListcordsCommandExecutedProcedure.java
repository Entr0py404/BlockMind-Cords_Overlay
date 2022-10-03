package net.blockmind.cordsoverlay.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.blockmind.cordsoverlay.network.BlockmindCordsOverlayModVariables;

public class ListcordsCommandExecutedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot1_Cords).equals("")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(
						new TextComponent(("[Slot 1] " + (entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot1_Cords)),
						(false));
		}
		if (!((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot2_Cords).equals("")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(
						new TextComponent(("[Slot 2] " + (entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot2_Cords)),
						(false));
		}
		if (!((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot3_Cords).equals("")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(
						new TextComponent(("[Slot 3] " + (entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot3_Cords)),
						(false));
		}
		if (!((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot4_Cords).equals("")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(
						new TextComponent(("[Slot 4] " + (entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot4_Cords)),
						(false));
		}
		if (!((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot5_Cords).equals("")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(
						new TextComponent(("[Slot 5] " + (entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot5_Cords)),
						(false));
		}
		if (((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot1_Cords).equals("")
				&& ((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot2_Cords).equals("")
				&& ((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot3_Cords).equals("")
				&& ((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot4_Cords).equals("")
				&& ((entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindCordsOverlayModVariables.PlayerVariables())).CordsSlot5_Cords).equals("")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("No cords have been stored."), (false));
		}
	}
}
