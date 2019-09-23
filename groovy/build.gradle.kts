plugins {
    groovy
}

dependencies {
    implementation("org.codehaus.groovy:groovy-all:2.5.8")
    testImplementation("org.junit.jupiter:junit-jupiter:5.5.2")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.5.2")
    testImplementation("org.spockframework:spock-core:1.3-groovy-2.5")
    testImplementation("org.hamcrest:hamcrest:2.1")
}
