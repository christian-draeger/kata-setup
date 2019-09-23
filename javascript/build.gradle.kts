node {
    version = "12.7.0"
    yarnVersion = "1.17.3"
    download = true
    workDir = file("${project.rootDir}/build/nodejs")
    yarnWorkDir = file("${project.rootDir}/build/yarn")
    nodeModulesDir = file("${project.rootDir}/build/node_modules")
}

tasks {
    "check" {
        dependsOn("yarn_install", "yarn_test")
    }
}
