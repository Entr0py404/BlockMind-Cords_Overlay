
package net.blockmind.cordsoverlay.command;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.Commands;

import net.blockmind.cordsoverlay.procedures.SetcordsCommandExecutedProcedure;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class SetcordsCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("setcords")

				.then(Commands.argument("SlotNumber", DoubleArgumentType.doubleArg(1, 5))
						.then(Commands.argument("SlotName", StringArgumentType.string()).executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);
							Direction direction = entity.getDirection();

							SetcordsCommandExecutedProcedure.execute(x, y, z, arguments, entity);
							return 0;
						}))));
	}
}
