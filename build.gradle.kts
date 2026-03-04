plugins {
    kotlin("jvm") version "1.9.22"
    /**
     *  kotlin은 기본적으로 final class이기 때문에 allOpen같은 방식을 해주어야 하는데 제공해주는 플러그인을 사용할 경우
     *  알아서 open 클래스로 변경해줌
     */
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
