package com.thexfactor117.levels;

import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

/**
 * 
 * @author TheXFactor117
 *
 */
public class Reference 
{
	public static final String MODID = "levels";
	public static final String NAME = "Levels";
	public static final String VERSION = "r1.1.2";
	public static final String COMMON_PROXY = "com.thexfactor117.levels.proxies.CommonProxy";
	public static final String CLIENT_PROXY = "com.thexfactor117.levels.proxies.ClientProxy";
	public static final String UPDATE_STRING = EnumChatFormatting.GOLD + "[Levels] " + EnumChatFormatting.GRAY + StatCollector.translateToLocal("levels.update");
	public static final int MAX_LEVEL = 6;
	public static final int MAX_ABILITY_LEVEL = 3;
}
