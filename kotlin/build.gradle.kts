dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.5.2")
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.4.1")
    testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.7")
    testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:2.0.7")
    testImplementation("io.strikt:strikt-core:+")
    testImplementation("io.mockk:mockk:+")
    testImplementation("org.assertj:assertj-core:+")
    testImplementation("com.willowtreeapps.assertk:assertk-jvm:+")
}

tasks.withType(Test::class.java).configureEach {
    useJUnitPlatform {
        includeEngines.addAll(arrayOf("spek2", "junit-jupiter", "kotlintest"))
    }
}
