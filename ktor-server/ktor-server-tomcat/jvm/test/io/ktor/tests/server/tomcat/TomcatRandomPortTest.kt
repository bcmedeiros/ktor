/*
 * Copyright 2014-2021 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.ktor.tests.server.tomcat

import io.ktor.server.testing.suites.*
import io.ktor.server.tomcat.*

class TomcatRandomPortTest :
    RandomPortTestSuite<TomcatApplicationEngine, TomcatApplicationEngine.Configuration>(Tomcat) {
}