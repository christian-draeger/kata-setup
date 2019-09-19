plugins {
    java
}

java.sourceCompatibility = JavaVersion.VERSION_1_8

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:+")
    testImplementation("org.assertj:assertj-core:+")
    testImplementation("org.hamcrest:hamcrest:2.1")
}
