package io.thedogofchaos.skaialib.common;

import net.minecraftforge.eventbus.api.IEventBus;

public abstract class AbstractCommonProxy {
    void init(IEventBus eventBus) {
        AbstractCommonRegistry.init(eventBus);
    }
}
