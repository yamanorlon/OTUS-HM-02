plugins {
    alias(libs.plugins.kotlin.jvm)
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation(libs.kotlin.stdlib)
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
