package net.blockmind.cordsoverlay.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.blockmind.cordsoverlay.BlockmindCordsOverlayMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockmindCordsOverlayModVariables {
	public static boolean ShowCordsOverlay = true;
	public static String CurrentCords = "";

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		BlockmindCordsOverlayMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer,
				PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			clone.CordsSlot1_Name = original.CordsSlot1_Name;
			clone.CordsSlot1_Cords = original.CordsSlot1_Cords;
			clone.CordsSlot2_Name = original.CordsSlot2_Name;
			clone.CordsSlot2_Cords = original.CordsSlot2_Cords;
			clone.CordsSlot3_Name = original.CordsSlot3_Name;
			clone.CordsSlot3_Cords = original.CordsSlot3_Cords;
			clone.CordsSlot4_Name = original.CordsSlot4_Name;
			clone.CordsSlot4_Cords = original.CordsSlot4_Cords;
			clone.CordsSlot5_Name = original.CordsSlot5_Name;
			clone.CordsSlot5_Cords = original.CordsSlot5_Cords;
			clone.TargetCords = original.TargetCords;
			clone.DeathCords = original.DeathCords;
			if (!event.isWasDeath()) {
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("blockmind_cords_overlay", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public String CordsSlot1_Name = "";
		public String CordsSlot1_Cords = "";
		public String CordsSlot2_Name = "";
		public String CordsSlot2_Cords = "";
		public String CordsSlot3_Name = "";
		public String CordsSlot3_Cords = "";
		public String CordsSlot4_Name = "";
		public String CordsSlot4_Cords = "";
		public String CordsSlot5_Name = "";
		public String CordsSlot5_Cords = "";
		public String TargetCords = "";
		public String DeathCords = "";

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				BlockmindCordsOverlayMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putString("CordsSlot1_Name", CordsSlot1_Name);
			nbt.putString("CordsSlot1_Cords", CordsSlot1_Cords);
			nbt.putString("CordsSlot2_Name", CordsSlot2_Name);
			nbt.putString("CordsSlot2_Cords", CordsSlot2_Cords);
			nbt.putString("CordsSlot3_Name", CordsSlot3_Name);
			nbt.putString("CordsSlot3_Cords", CordsSlot3_Cords);
			nbt.putString("CordsSlot4_Name", CordsSlot4_Name);
			nbt.putString("CordsSlot4_Cords", CordsSlot4_Cords);
			nbt.putString("CordsSlot5_Name", CordsSlot5_Name);
			nbt.putString("CordsSlot5_Cords", CordsSlot5_Cords);
			nbt.putString("TargetCords", TargetCords);
			nbt.putString("DeathCords", DeathCords);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			CordsSlot1_Name = nbt.getString("CordsSlot1_Name");
			CordsSlot1_Cords = nbt.getString("CordsSlot1_Cords");
			CordsSlot2_Name = nbt.getString("CordsSlot2_Name");
			CordsSlot2_Cords = nbt.getString("CordsSlot2_Cords");
			CordsSlot3_Name = nbt.getString("CordsSlot3_Name");
			CordsSlot3_Cords = nbt.getString("CordsSlot3_Cords");
			CordsSlot4_Name = nbt.getString("CordsSlot4_Name");
			CordsSlot4_Cords = nbt.getString("CordsSlot4_Cords");
			CordsSlot5_Name = nbt.getString("CordsSlot5_Name");
			CordsSlot5_Cords = nbt.getString("CordsSlot5_Cords");
			TargetCords = nbt.getString("TargetCords");
			DeathCords = nbt.getString("DeathCords");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.CordsSlot1_Name = message.data.CordsSlot1_Name;
					variables.CordsSlot1_Cords = message.data.CordsSlot1_Cords;
					variables.CordsSlot2_Name = message.data.CordsSlot2_Name;
					variables.CordsSlot2_Cords = message.data.CordsSlot2_Cords;
					variables.CordsSlot3_Name = message.data.CordsSlot3_Name;
					variables.CordsSlot3_Cords = message.data.CordsSlot3_Cords;
					variables.CordsSlot4_Name = message.data.CordsSlot4_Name;
					variables.CordsSlot4_Cords = message.data.CordsSlot4_Cords;
					variables.CordsSlot5_Name = message.data.CordsSlot5_Name;
					variables.CordsSlot5_Cords = message.data.CordsSlot5_Cords;
					variables.TargetCords = message.data.TargetCords;
					variables.DeathCords = message.data.DeathCords;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
