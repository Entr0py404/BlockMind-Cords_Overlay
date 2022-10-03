package net.blockmind.cordsoverlay.procedures;

import net.minecraft.world.entity.Entity;

import net.blockmind.cordsoverlay.network.BlockmindCordsOverlayModVariables;

public class ClearTargetCordsCommandExecutedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "";
			entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.TargetCords = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
