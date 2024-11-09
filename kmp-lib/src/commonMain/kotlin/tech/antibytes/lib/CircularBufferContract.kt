/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.lib

interface CircularBufferContract<T : Any> {
    fun add(element: T)
    fun take(): T
    val count: Int
    val size: Int
}