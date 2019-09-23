node {
    version = "12.7.0"
    yarnVersion = "1.17.3"
    download = true
}

tasks {
    "check" {
        dependsOn("yarn_install", "yarn_test")
    }
}
