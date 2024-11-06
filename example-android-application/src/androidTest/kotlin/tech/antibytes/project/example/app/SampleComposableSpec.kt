/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

@file:Suppress("ktlint:standard:function-naming")

package tech.antibytes.project.example.app

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import tech.antibytes.kfixture.fixture
import tech.antibytes.kfixture.kotlinFixture
import tech.antibytes.kmock.Mock
import tech.antibytes.util.test.mustBe

class SampleComposableSpec {
    @get:Rule
    val composeTestRule = createComposeRule()
    private val flow = MutableStateFlow("")
    private val fixture = kotlinFixture()

    @Before
    fun setUp() {
        flow.update { "" }
    }

    @Test
    fun Given_a_onclick_function_When_the_button_has_been_clicked_Then_it_excutes_the_lambda() {
        // Given
        var hadBeenClicked = false

        composeTestRule.setContent {
            SampleComponent(text = "test") {
                hadBeenClicked = true
            }
        }

        // When
        composeTestRule.onNodeWithText("Click me").performClick()

        // Then
        hadBeenClicked mustBe true
    }
}
