package io.thedogofchaos.skaialib;

import com.mojang.logging.LogUtils;
import io.thedogofchaos.skaialib.client.ClientProxy;
import io.thedogofchaos.skaialib.common.CommonProxy;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.slf4j.Logger;

/**
 * JADE: she told me that the dreams of a denizen draw from the same well of potential from which every conceivable possibility arises
 */
@Mod(SkaiaLib.MOD_ID)
public class SkaiaLib {
    public static final String MOD_ID = "skaialib";
    public static final String MOD_NAME = "SkaiaLib";

    private static final Logger LOGGER = LogUtils.getLogger();

    public FMLJavaModLoadingContext modLoadingContext = FMLJavaModLoadingContext.get();
    public IEventBus modBus = modLoadingContext.getModEventBus();

    public SkaiaLib() {
        SkaiaLib.init();
        DistExecutor.unsafeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);
    }

    public static void init() {
        LOGGER.info("We're loading {} on the {}", MOD_NAME, FMLEnvironment.dist);
    }

}
