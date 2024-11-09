/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.lib

 class CircularBurrer<T: Any>(
     override val size: Int
 ) : CircularBufferContract<T>{
     private var _count = 0
     override val count: Int get() = _count

     override fun add(element: T) {
         _count++
     }

     override fun take(): T {
         TODO("Not yet implemented")
     }
 }
