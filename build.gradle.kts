import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.gradle.dsl.Coroutines

plugins {
    val kotlinVersion = "1.2.61"
    id("org.jetbrains.kotlin.jvm") version kotlinVersion
    application
}

application {
    mainClassName = "com.wabadaba.schoolapi.sample.MainKt"
}

version = "1.0.0-SNAPSHOT"

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = listOf("-Xjsr305=strict")
    }
}

repositories {
    jcenter()
    mavenCentral()
}

java.sourceSets {
    getByName("main").java.srcDirs("src/main/kotlin")
}


dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
}

kotlin {
    experimental.coroutines = Coroutines.ENABLE
}