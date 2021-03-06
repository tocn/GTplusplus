package gtPlusPlus.core.handler;

import gtPlusPlus.xmod.Computronics.HANDLER_Computronics;
import gtPlusPlus.xmod.bop.HANDLER_BiomesOPlenty;
import gtPlusPlus.xmod.forestry.HANDLER_FR;
import gtPlusPlus.xmod.gregtech.HANDLER_GT;
import gtPlusPlus.xmod.growthcraft.HANDLER_GC;
import gtPlusPlus.xmod.ic2.HANDLER_IC2;
import gtPlusPlus.xmod.rftools.HANDLER_RfTools;
import gtPlusPlus.xmod.thermalfoundation.HANDLER_TF;

public class COMPAT_IntermodStaging {

	public static void preInit(){
		HANDLER_GT.preInit();
		HANDLER_GC.preInit();
		HANDLER_TF.preInit();
		HANDLER_FR.preInit();
		HANDLER_IC2.preInit();
		HANDLER_Computronics.preInit();
		HANDLER_BiomesOPlenty.preInit();
		HANDLER_RfTools.preInit();

	}

	public static void init(){
		HANDLER_GT.init();
		HANDLER_GC.init();
		HANDLER_TF.init();
		HANDLER_FR.Init();
		HANDLER_IC2.init();
		HANDLER_Computronics.init();
		HANDLER_BiomesOPlenty.init();
		HANDLER_RfTools.init();
	}

	public static void postInit(){
		HANDLER_GT.postInit();
		HANDLER_GC.postInit();
		HANDLER_TF.postInit();
		HANDLER_FR.postInit();
		HANDLER_IC2.postInit();
		HANDLER_Computronics.postInit();
		HANDLER_BiomesOPlenty.postInit();
		HANDLER_RfTools.postInit();
	}


}
