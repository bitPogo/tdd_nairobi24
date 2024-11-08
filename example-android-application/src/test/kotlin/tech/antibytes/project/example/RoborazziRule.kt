/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.project.example

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.onRoot
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.InternalRoborazziApi
import com.github.takahirom.roborazzi.RoborazziRule
import com.github.takahirom.roborazzi.provideRoborazziContext

@OptIn(InternalRoborazziApi::class, ExperimentalRoborazziApi::class)
fun roborazziOf(
    szenario: AndroidComposeTestRule<ActivityScenarioRule<ComponentActivity>, ComponentActivity>,
    captureType: RoborazziRule.CaptureType = RoborazziRule.CaptureType.None,
): RoborazziRule {
    return RoborazziRule(
        composeRule = szenario,
        captureRoot = szenario.onRoot(),
        options = RoborazziRule.Options(
            outputDirectoryPath = "${provideRoborazziContext().outputDirectory}/../../snapshots/images",
            captureType = captureType,
        ),
    )
}
