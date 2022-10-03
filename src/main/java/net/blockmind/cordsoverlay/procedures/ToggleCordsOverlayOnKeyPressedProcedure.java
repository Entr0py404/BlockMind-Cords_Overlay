package net.blockmind.cordsoverlay.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.blockmind.cordsoverlay.network.BlockmindCordsOverlayModVariables;

public class ToggleCordsOverlayOnKeyPressedProcedure {
	public static void execute(LevelAccessor world) {
		if (world.isClientSide()) {
			if (BlockmindCordsOverlayModVariables.ShowCordsOverlay == true) {
				BlockmindCordsOverlayModVariables.ShowCordsOverlay = false;
			} else {
				BlockmindCordsOverlayModVariables.ShowCordsOverlay = true;
			}
		}
	}
}
