plugins {
    kotlin("jvm") version "1.9.22"
    kotlin("plugin.spring") version "1.9.21"
    kotlin("plugin.jpa") version "1.9.21"
//    kotlin("plugin.noarg") version "1.9.21"
//    id("org.jetbrains.kotlin.plugin.allopen") version "1.6.21"
}

//allOpen{
//    annotations()
//}
//noArg{
//    annotations("javax.persistence.Entity")
//}

group = "pro.developia"
version = "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")

    testCompileOnly("org.projectlombok:lombok:1.18.24")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.24")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
