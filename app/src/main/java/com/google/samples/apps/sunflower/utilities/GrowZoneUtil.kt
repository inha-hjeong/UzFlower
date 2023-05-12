/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.sunflower.utilities

import kotlin.math.abs


fun getZoneForLatitude(latitude: Double) = when (abs(latitude)) {
    in 0.0..7.0 -> 13
    in 7.0..14.0 -> 12
    in 14.0..21.0 -> 11
    in 21.0..28.0 -> 10
    in 28.0..35.0 -> 9
    in 35.0..42.0 -> 8
    in 42.0..49.0 -> 7
    in 49.0..56.0 -> 6
    in 56.0..63.0 -> 5
    in 63.0..70.0 -> 4
    in 70.0..77.0 -> 3
    in 77.0..84.0 -> 2
    else -> 1 // Remaining latitudes are assigned to zone 1.
}
