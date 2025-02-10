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

package io.thedogofchaos.skaialib.api.registry;

import com.tterrag.registrate.Registrate;
import org.jetbrains.annotations.NotNull;

public class SkaiaRegistrate extends Registrate {
    protected SkaiaRegistrate(String modid) {
        super(modid);
    }

    @NotNull
    public static SkaiaRegistrate create(String modId) {
        return new SkaiaRegistrate(modId);
    }
}
