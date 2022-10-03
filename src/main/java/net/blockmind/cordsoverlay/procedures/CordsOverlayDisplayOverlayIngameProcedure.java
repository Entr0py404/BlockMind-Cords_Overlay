package net.blockmind.cordsoverlay.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.blockmind.cordsoverlay.network.BlockmindCordsOverlayModVariables;

public class CordsOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.isClientSide()) {
			BlockmindCordsOverlayModVariables.CurrentCords = Math.round(x) + ", " + Math.round(y) + ", " + Math.round(z);
		}
		return BlockmindCordsOverlayModVariables.ShowCordsOverlay;
	}
}
