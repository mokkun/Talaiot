package com.cdsap.talaiot.plugin.graph

import com.cdsap.talaiot.TalaiotExtension
import groovy.lang.Closure
import org.gradle.api.Project

/**
 * A [TalaiotExtension] for the Graph plugin.
 *
 * Note: extensions classes need to be declared as `open` so the Gradle internal factory can
 * dynamically create instances of them.
 *
 * @param project The Gradle [Project] that contains this extension.
 */
open class GraphExtension(project: Project) : TalaiotExtension(project) {
    internal var publishers: GraphConfiguration? = null

    /**
     * [GraphConfiguration] accessor for the [GraphExtension].
     *
     * @param block The configuration block for the [GraphExtension] publisher.
     */
    fun publishers(block: GraphConfiguration.() -> Unit) {
        publishers = GraphConfiguration(project).also(block)
    }

    /**
     * [GraphConfiguration] accessor for the [GraphExtension].
     *
     * @param closure The configuration closure for the [GraphExtension] publisher.
     */
    fun publishers(closure: Closure<*>) {
        publishers = GraphConfiguration(project)
        closure.delegate = publishers
        closure.call()
    }
}
