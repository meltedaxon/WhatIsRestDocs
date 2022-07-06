import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript{
    repositories{
        mavenCentral()
    }
    dependencies{
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.1.7.RELEASE")
    }
}

plugins{
    id("java")
    id("eclipse")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

group "org.example"
version "1.0-SNAPSHOT"

repositories{
    mavenCentral()
}
dependencies{
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}