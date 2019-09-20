node {
    version = "12.7.0"
    yarnVersion = "1.17.3"
}

tasks {
    val check by getting {
        dependsOn("yarn_install", "yarn_jest")
    }
}
