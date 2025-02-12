/*
 * Copyright (C) 2025 The-Incipisphere
 *
 * This file is part of SkaiaLib.
 *
 * SkaiaLib is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SkaiaLib is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SkaiaLib. If not, see <http://www.gnu.org/licenses/>.
 */

package io.thedogofchaos.skaialib.client;

import io.thedogofchaos.skaialib.common.CommonProxy;
import net.minecraftforge.eventbus.api.IEventBus;

public class ClientProxy extends CommonProxy {
    public ClientProxy() {
        super();
    }

    @Override
    public void init(IEventBus modEventBus) {
        super.init(modEventBus);
        // do cool client-related shit here
    }
}
