package com.cdsap.talaiot.extensions

import org.gradle.api.Project

/**
 * Looks for the Talaiot extension. If none found it will throw an exception.
 */
fun <T> Project.getTalaiotExtension(): T = this.extensions.getByNameWithType("talaiot")
