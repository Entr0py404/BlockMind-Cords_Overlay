package net.blockmind.cordsoverlay.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class CordscommandsCommandExecutedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent("/listcords"), (false));
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent("/saycurrentcords"), (false));
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent("/cordscommands"), (false));
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent("/setcords <SlotNumber> <SlotName>"), (false));
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent("/saycords (<SlotNumber>|<SlotName>)"), (false));
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent("/targetcords (<SlotNumber>|<SlotName>)"), (false));
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent("/removecords (<SlotNumber>|<SlotName>)"), (false));
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent("/setcordsmanually <SlotNumber> <SlotName> <Cords>"), (false));
	}
}
