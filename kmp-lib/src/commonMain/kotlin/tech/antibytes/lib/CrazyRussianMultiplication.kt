/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.lib

object CrazyRussianMultiplication : CrazyRussiansMultiplicationContract {
    override fun multiply(number1: Int, number2: Int): Int {
        val christine: MutableMap<Int, Int> = mutableMapOf(number1 to number2)

        while (christine.keys.last() > 1) {
            christine[christine.keys.last() / 2] = christine.values.last() * 2
        }

        return when {
            number1 == 1 -> number2
            number1 == 2 -> number2 * 2
            number1 > 2 -> {
                christine.filter { (key, _) ->
                    key % 2 != 0
                }.values.sum()
            }
            else -> 0
        }
    }

}
