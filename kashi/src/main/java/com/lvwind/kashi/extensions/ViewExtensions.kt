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

import android.view.View

/**
 * Set visibility to GONE
 */
fun View.hide() {
    visibility = View.GONE
}

/**
 * Set visibility to VISIBLE
 */
fun View.show() {
    visibility = View.VISIBLE
}

/**
 * Set visibility to INVISIBLE
 */
fun View.invisible() {
    visibility = View.INVISIBLE
}

/**
 * Toggle visibility. If it is visible, sets to gone.
 */
fun View.toggleVisibility() {
    visibility = if (visibility == View.VISIBLE) {
        View.GONE
    } else {
        View.VISIBLE
    }
}

/**
 * Set width and height
 */
fun View.setSize(width: Int, height: Int) {
    val params = layoutParams
    params.width = width
    params.height = height
    layoutParams = params
}

/**
 * Set width
 */
fun View.setWidth(width: Int) {
    val params = layoutParams
    params.width = width
    layoutParams = params
}

/**
 * Set height
 */
fun View.setHeight(height: Int) {
    val params = layoutParams
    params.height = height
    layoutParams = params
}
