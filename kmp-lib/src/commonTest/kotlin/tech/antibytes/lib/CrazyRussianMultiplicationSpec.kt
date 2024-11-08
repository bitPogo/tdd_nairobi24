/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.lib

import kotlin.js.JsName
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CrazyRussianMultiplicationSpec {
    @Test
    @JsName("fn1")
    fun `Given first number is zero and the 2nd number is something When multiply is called Then it returns 0`() {
        // Given
        val one = 0

        val two = 1
        // When
        val actual = CrazyRussianMultiplication.multiply(
            number1 = one,
            number2 = two,
        )
        // Then
        assertEquals(
            actual = actual,
            expected = 0
        )
    }

    @Test
    @JsName("fn3")
    fun `Given left number is one and the right number is something When multiply is called Then it returns the right number`() {
        // Given
        val number1 = 1
        val number2 = 42

        // When
        val actual = CrazyRussianMultiplication.multiply(
            number1 = number1,
            number2 = number2
        )

        // Then
        assertEquals(
            actual = actual,
            expected = number2
        )
    }

    @Test
    @JsName("fn4")
    fun `Given left number is two and right number is something When multiply is called Then it returns the double of the right number `(){
        // Given
        val leftNumber = 2
        val rightNumber = 5

        // When
        val actual = CrazyRussianMultiplication.multiply(
            number1 = leftNumber,
            number2 = rightNumber
        )

        // Then
        assertEquals(
            actual = actual,
            expected = rightNumber * 2
        )
    }

    @Test
    @JsName("fn5")
    fun `Given left number is 4 and right number is 8 When multiply is called Then it returns 32`(){
        // Given
        val leftNumber = 4
        val rightNumber = 8

        // When
        val actual = CrazyRussianMultiplication.multiply(
            number1 = leftNumber,
            number2 = rightNumber
        )
        // Then

        assertEquals(
            actual = actual,
            expected = leftNumber * rightNumber
        )
    }


    @Test
    @JsName("fn0")
    fun `It fulfils the CrazyRussianMultiplicationContract`() {
        assertTrue {
            CrazyRussianMultiplication is CrazyRussiansMultiplicationContract
        }
    }
}