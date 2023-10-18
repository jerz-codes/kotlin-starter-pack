plugins {
    kotlin("jvm") version "1.9.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("jerz.codes:terminal")
    implementation("jerz.codes:dirs")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}