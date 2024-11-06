/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.project.example.app

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode
import tech.antibytes.project.example.RoborazziTest
import tech.antibytes.project.example.TestApplication
import tech.antibytes.util.test.mustBe

@RunWith(AndroidJUnit4::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [33], application = TestApplication::class)
class SampleComponentSpec: RoborazziTest() {
    @Test
    fun `It renders a SampleComponent`() {
        subjectUnderTest.setContent {
            SampleComponent("Text") {}
        }
    }

    @Test
    fun `Given Click is called it propagates the given action`() {
        var hasBeenCalled = false

        subjectUnderTest.setContent {
            SampleComponent("Text") {
                hasBeenCalled = true
            }
        }

        subjectUnderTest.onNodeWithText("Text").performClick()

        hasBeenCalled mustBe true
    }
}