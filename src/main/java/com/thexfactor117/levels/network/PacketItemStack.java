package com.thexfactor117.levels.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/**
 * 
 * @author TheXFactor117
 *
 */
public class PacketItemStack implements IMessage
{
	private NBTTagCompound nbt;
	
	public PacketItemStack() {}
	
	public PacketItemStack(NBTTagCompound nbt)
	{
		this.nbt = nbt;
	}
	
	@Override
	public void fromBytes(ByteBuf buf) 
	{
		this.nbt = ByteBufUtils.readTag(buf);
	}

	@Override
	public void toBytes(ByteBuf buf) 
	{
		ByteBufUtils.writeTag(buf, nbt);
	}
	
	public static class Handler implements IMessageHandler<PacketItemStack, IMessage>
	{
		@Override
		public IMessage onMessage(final PacketItemStack message, MessageContext ctx) 
		{			
			IThreadListener mainThread = Minecraft.getMinecraft();
			mainThread.addScheduledTask(new Runnable()
			{
				@Override
				public void run() {}
			});
			
			return null;
		}
	}
}
