plugins {
    application
    kotlin("jvm") version "1.3.61"
    id("com.github.johnrengelman.shadow") version "5.0.0"
}

group = "com.justai.jaicf"
version = "1.0.0"

application {
    mainClassName = "com.justai.jaicf.template.ServerKt"
}

repositories {
    mavenCentral()
    jcenter()
    maven("https://dl.bintray.com/just-ai/jaicf")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation("org.slf4j:slf4j-simple:1.7.30")
    implementation("org.slf4j:slf4j-log4j12:1.7.30")

    implementation("com.justai.jaicf:core:0.0.1")
    implementation("com.justai.jaicf:google-actions:0.0.1")
    implementation("com.justai.jaicf:webhook:0.0.1")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

tasks.withType<Jar> {
    manifest {
        attributes(
            mapOf(
                "Main-Class" to application.mainClassName
            )
        )
    }
}

tasks.create("stage") {
    dependsOn("shadowJar")
}