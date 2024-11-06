/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.project.example.app

import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable

@Composable
fun SampleComponent(
    text: String,
    onClick: () -> Unit,
) {
    Text(text)

    TextButton(onClick = onClick) {
        Text("Click me")
    }
}