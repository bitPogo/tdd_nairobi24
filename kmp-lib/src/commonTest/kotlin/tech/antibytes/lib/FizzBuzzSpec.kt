/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.lib

import tech.antibytes.util.test.mustBe
import kotlin.js.JsName
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue


class FizzBuzzSpec {


    @Test
    @JsName("fn0")
    fun `FizzBuzz fulfils the FizzBuzzContract`() {
        assertTrue {
            FizzBuzz is FizzBuzzContract
        }
    }


    @Test
    @JsName("fn1")
    fun `Given number is not divisible by 3 5 or both When fizzBuzz is called Then it return empty string`() {
        // Given
        val number = 11
        // When
        val actual = FizzBuzz.fizzBuzz(number)
        // Then
        assertEquals(
            actual = actual,
            expected = ""
        )
    }

    @Test
    @JsName("fn2")
    fun `Given number is divisible by 3 When fizzBuzz is called Then it return Fizz`() {
        // Given
        val number = 3
        // When
        val actual = FizzBuzz.fizzBuzz(number)
        // Then
        actual mustBe "fizz"

        assertEquals(
            actual = actual,
            expected = "fizz"
        )
    }
}