/*
 * Copyright © 2014 Jerzy Chalupski
 * Copyright © 2018 Jason A. Donenfeld <Jason@zx2c4.com>
 * Copyright © 2018-2019 Harsh Shandilya <msfjarvis@gmail.com> All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */
plugins {
    `kotlin-dsl`
}

repositories {
    maven("https://plugins.gradle.org/m2/")
    jcenter()
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:3.26.0")
}
