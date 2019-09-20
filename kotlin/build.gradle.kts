dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:+")
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.4.1")
    testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.0")
    testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:2.0.0")
    // testRuntimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.3.41")
    testImplementation("io.strikt:strikt-core:+")
    testImplementation("io.mockk:mockk:+")
    testImplementation("org.assertj:assertj-core:+")
    testImplementation("com.willowtreeapps.assertk:assertk-jvm:+")
}
