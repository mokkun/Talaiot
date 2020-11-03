pluginManagement {
    repositories {
        mavenLocal()
        maven { url = uri("https://plugins.gradle.org/m2/") }
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "com.cdsap.talaiot.plugin.base") {
                useModule("com.cdsap.talaiot.plugin:base:${requested.version}")
            }
        }
    }
}
