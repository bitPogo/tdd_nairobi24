/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.lib

object FizzBuzz : FizzBuzzContract {
    override fun fizzBuzz(value: Int): String = if (value == 3) "fizz" else ""
}