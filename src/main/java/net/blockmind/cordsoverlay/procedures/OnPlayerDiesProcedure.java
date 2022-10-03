package net.blockmind.cordsoverlay.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.blockmind.cordsoverlay.network.BlockmindCordsOverlayModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OnPlayerDiesProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(double x, double y, double z, Entity entity) {
		execute(null, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			{
				String _setval = "Death Cords: " + Math.round(x) + ", " + Math.round(y) + ", " + Math.round(z);
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.DeathCords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
