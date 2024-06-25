plugins {
    `java-library`
    id("buildsrcs.common-conventions")
}

dependencies {
    api(project(":module-model"))
    implementation(libs.spring.boot.starter)
//    implementation("org.springframework.boot:spring-boot-starter:3.2.4")
}