/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.lib

import tech.antibytes.util.test.fulfils
import kotlin.js.JsName
import kotlin.test.Test
import kotlin.test.assertEquals

class CircularBufferSpec {
    @Test
    @JsName("fn1")
    fun `Given an initial size When the Circular Buffer is initialized Then the size of the Buffer is the same as the initial value` () {
        // Given
        val initialSize = 2

        // When
        val subjectUnderTest = CircularBurrer<Int>(initialSize)

        // Then
        assertEquals(
            actual = subjectUnderTest.size,
            expected = initialSize
        )
    }

    @Test
    @JsName("fn4")
    fun `Given an initial count When the Circular Buffer is initialized Then the count of the Buffer is the same as the initial value` () {
        // Given
        val initialSize = 200

        // When
        val subjectUnderTest = CircularBurrer<Int>(initialSize)

        // Then
        assertEquals(
            actual = subjectUnderTest.count,
            expected = 0
        )
    }

    @Test
    @JsName("fn2")
    fun `Given an arbitrary element When add is called Then the counter increases by 1` () {
        // Given
        val initialSize = 200
        val arbitraryElement = 42

        // When
        val subjectUnderTest = CircularBurrer<Int>(initialSize)
        subjectUnderTest.add(arbitraryElement)

        // Then
        assertEquals(
            actual = subjectUnderTest.count,
            expected = 1
        )
    }

    @Test
    @JsName("fn0")
    fun `It fulfils the CircularBufferContract`() {
        CircularBurrer<Int>(0) fulfils CircularBufferContract::class


    }
}