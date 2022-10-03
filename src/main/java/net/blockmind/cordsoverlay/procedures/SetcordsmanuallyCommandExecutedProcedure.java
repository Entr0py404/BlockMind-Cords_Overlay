package net.blockmind.cordsoverlay.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.coordinates.BlockPosArgument;
import net.minecraft.commands.CommandSourceStack;

import net.blockmind.cordsoverlay.network.BlockmindCordsOverlayModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class SetcordsmanuallyCommandExecutedProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 1) {
			{
				String _setval = StringArgumentType.getString(arguments, "SlotName") + ": " + new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "Cords").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX() + ", " + new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "Cords").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY() + ", " + new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "Cords").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ();
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CordsSlot1_Cords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 2) {
			{
				String _setval = StringArgumentType.getString(arguments, "SlotName") + ": " + new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "Cords").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX() + ", " + new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "Cords").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY() + ", " + new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "Cords").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ();
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CordsSlot2_Cords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 3) {
			{
				String _setval = StringArgumentType.getString(arguments, "SlotName") + ": " + new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "Cords").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX() + ", " + new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "Cords").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY() + ", " + new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "Cords").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ();
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CordsSlot3_Cords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 4) {
			{
				String _setval = StringArgumentType.getString(arguments, "SlotName") + ": " + new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "Cords").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX() + ", " + new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "Cords").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY() + ", " + new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "Cords").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ();
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CordsSlot4_Cords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (DoubleArgumentType.getDouble(arguments, "SlotNumber") == 5) {
			{
				String _setval = StringArgumentType.getString(arguments, "SlotName") + ": " + new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "Cords").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX() + ", " + new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "Cords").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY() + ", " + new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "Cords").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ();
				entity.getCapability(BlockmindCordsOverlayModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CordsSlot5_Cords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
