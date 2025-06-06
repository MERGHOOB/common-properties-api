// build.gradle.kts
plugins {
    java
    id("org.springframework.boot") version "3.5.0" // Your Spring Boot version
    id("io.spring.dependency-management") version "1.1.5" // Or compatible version
}

group = "com.devops.commonproperties" // Your group
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21 // Using JavaVersion enum for clarity
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
    implementation("org.springframework.boot:spring-boot-starter-data-redis")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.6.0") // Compatible version for SB 3.x
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}