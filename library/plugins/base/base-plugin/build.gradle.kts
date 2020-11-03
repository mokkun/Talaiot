plugins {
    id("talaiotPlugin")
}

talaiotPlugin {
    idPlugin = "com.cdsap.talaiot.plugin.base"
    artifact = "base"
    group = "com.cdsap.talaiot.plugin"
    mainClass = "com.cdsap.talaiot.plugin.base.TalaiotBasePlugin"
    version = "1.4.0-SNAPSHOT"
}

dependencies {
    implementation(project(":library:plugins:base:base-publisher"))
    implementation(project(":library:core:talaiot"))
}

