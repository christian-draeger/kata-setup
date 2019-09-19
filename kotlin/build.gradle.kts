plugins {
    kotlin("jvm")
}

java.sourceCompatibility = JavaVersion.VERSION_1_8

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:+")
    testImplementation("io.strikt:strikt-core:+")
    testImplementation("io.mockk:mockk:+")
    testImplementation("org.assertj:assertj-core:+")
    testImplementation("com.willowtreeapps.assertk:assertk-jvm:+")
}
