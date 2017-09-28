/*
 * Copyright (c) 2017. Jason Shaw <lvwind.shaw@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lvwind.kashi.extensions

import android.app.Application
import android.content.pm.PackageManager


fun Application.hideLauncherIcon() {
    val p = packageManager
    val componentName = packageManager.getLaunchIntentForPackage(packageName).component
    p.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP)

}

fun Application.showLauncherIcon() {
    val p = packageManager
    val componentName = packageManager.getLaunchIntentForPackage(packageName).component
    p.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP)

}
