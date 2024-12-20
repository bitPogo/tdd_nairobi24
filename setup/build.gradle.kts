/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

import org.gradle.kotlin.dsl.antibytesCatalog

/*
 * Copyright (c) 2023 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */
plugins {
    `kotlin-dsl`

    alias(antibytesCatalog.plugins.gradle.antibytes.dependencyHelper)
}

repositories {
    gradlePluginPortal()
    mavenCentral()
    google()

    val antibytesPlugins = "^tech\\.antibytes\\.[\\.a-z\\-]+"
    maven {
        setUrl("https://raw.github.com/bitPogo/maven-snapshots/main/snapshots")
        content {
            includeGroupByRegex(antibytesPlugins)
        }
    }
    maven {
        setUrl("https://raw.github.com/bitPogo/maven-rolling-releases/main/rolling")
        content {
            includeGroupByRegex(antibytesPlugins)
        }
    }
}

dependencies {
    api(antibytesCatalog.gradle.antibytes.dependencyHelper)
    implementation(antibytesCatalog.gradle.antibytes.publishing)
    implementation(antibytesCatalog.gradle.antibytes.versioning)
    implementation(antibytesCatalog.gradle.antibytes.publishingConfiguration)
    implementation(antibytesCatalog.gradle.antibytes.quality)
    // implementation(antibytesCatalog.gradle.agp)
    implementation("com.android.tools.build:gradle:8.2.0")
    api(antibytesCatalog.gradle.antibytes.runtimeConfig)
}

gradlePlugin {
    plugins.create("tech.antibytes.gradle.setup") {
        id = "tech.antibytes.gradle.setup"
        implementationClass = "tech.antibytes.gradle.project.config.SetupPlugin"
    }
}
