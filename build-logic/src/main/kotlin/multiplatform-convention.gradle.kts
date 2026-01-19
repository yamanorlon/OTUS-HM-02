plugins {
    alias(libs.plugins.kotlin.mpp)
}

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    linuxX64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.kotlin.stdlib)
                implementation(libs.coroutines.core)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}
