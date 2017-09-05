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

import android.content.Context
import android.net.ConnectivityManager
import android.view.inputmethod.InputMethodManager
import com.lvwind.kashi.KashiExt

/**
 * Created by LvWind on 2017/9/5.
 */

val Context.connectivityManager: ConnectivityManager
    get() = KashiExt.context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

val Context.inputMethodManager: InputMethodManager
    get() = KashiExt.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager