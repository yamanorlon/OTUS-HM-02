pluginManagement {
    plugins {
        val kotlinVersion: String by settings
        kotlin("jvm") version kotlinVersion
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}


include("lessons")
include("lessons")
include("lessons:lesson-01")
include("lessons:lessons-02")
include("project")
include("project:project-tmp")