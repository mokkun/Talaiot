pluginManagement {
    repositories {
        mavenLocal()
        maven { url = uri("https://plugins.gradle.org/m2/") }
    }
    resolutionStrategy {
        eachPlugin {
            val namespace = requested.id.namespace
            if (namespace == "com.cdsap.talaiot.plugin") {
                val pluginName = requested.id.name
                val pluginVersion = requested.version
                useModule("$namespace:$pluginName:$pluginVersion")
            }
        }
    }
}
