plugins {
    id("talaiotPlugin")
}

talaiotPlugin {
    idPlugin = "com.cdsap.talaiot.plugin.elasticsearch"
    artifact = "elasticsearch"
    group = "com.cdsap.talaiot.plugin"
    mainClass = "com.cdsap.talaiot.plugin.elasticsearch.TalaiotElasticSearchPlugin"
    version = "1.4.0-SNAPSHOT"
}

dependencies {
    implementation(project(":library:plugins:elastic-search:elastic-search-publisher"))
    implementation(project(":library:core:talaiot"))
}
