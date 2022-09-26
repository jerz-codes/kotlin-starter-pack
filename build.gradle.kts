import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
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

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}