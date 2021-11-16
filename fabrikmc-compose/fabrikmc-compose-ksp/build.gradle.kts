plugins {
    `java-version-script`
    kotlin("plugin.serialization")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.devtools.ksp:symbol-processing-api:1.5.31-1.0.1")
    implementation("com.squareup:kotlinpoet-ksp:1.10.2")
    implementation(project(":${rootProject.name}-compose:${rootProject.name}-compose-mojang-api"))
}