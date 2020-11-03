package com.cdsap.talaiot.extensions

import org.gradle.api.UnknownDomainObjectException
import org.gradle.api.plugins.ExtensionContainer

/**
 * Looks for the extension of a given name. If none found it will throw an exception.
 *
 * @param name The extension name.
 * @return A extension with the given type, never null.
 * @throws UnknownDomainObjectException When the given extension is not found.
 * @throws ClassCastException If the given type is not compatible with the extension.
 */
@Suppress("UNCHECKED_CAST")
@Throws(UnknownDomainObjectException::class, ClassCastException::class)
internal fun <T> ExtensionContainer.getByNameWithType(name: String): T = this.getByName(name) as T
