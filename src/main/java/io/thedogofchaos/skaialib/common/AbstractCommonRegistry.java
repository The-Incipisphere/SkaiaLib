package io.thedogofchaos.skaialib.common;

import net.minecraftforge.eventbus.api.IEventBus;

abstract class AbstractCommonRegistry {
    abstract void init(IEventBus eventBus) {
    }
}
