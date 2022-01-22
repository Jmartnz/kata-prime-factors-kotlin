plugins {
    kotlin("jvm") version "1.6.10"
}

group = "org.jmartnz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("io.kotest:kotest-runner-junit5-jvm:5.1.0")
}