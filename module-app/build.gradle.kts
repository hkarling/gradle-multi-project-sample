plugins {
//    id("org.springframework.boot") version "3.2.4"
    alias(libs.plugins.spring.boot)
    id("buildsrcs.common-conventions")
}

dependencies {
    implementation(project(":module-service"))
    implementation(libs.spring.boot.web)
    testImplementation(libs.spring.boot.test)
//    implementation("org.springframework.boot:spring-boot-starter-web:3.2.4")
//    testImplementation("org.springframework.boot:spring-boot-starter-test:3.2.4")
}
