import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.gradle.dsl.Coroutines

plugins {
    val kotlinVersion = "1.2.71"
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
    implementation("org.junit.platform:junit-platform-runner:1.3.0")

    // networking
    implementation("com.squareup.okhttp3:okhttp:3.11.0")
    implementation("com.squareup.okhttp3:logging-interceptor:3.11.0")
    implementation("com.squareup.retrofit2:retrofit:2.4.0")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.4.0")

    // rx
    implementation("io.reactivex.rxjava2:rxjava:2.2.2")
    implementation("io.reactivex.rxjava2:rxkotlin:2.3.0")

}

kotlin {
    experimental.coroutines = Coroutines.ENABLE
}
