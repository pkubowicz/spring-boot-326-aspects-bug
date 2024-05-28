plugins {
    `java-library`
}

val redissonVersion = "3.29.0"
val springdocVersion = "2.5.0"
dependencies {
    api(platform("org.springframework.boot:spring-boot-dependencies:3.2.6"))
    api(platform("org.springframework.cloud:spring-cloud-dependencies:2023.0.1"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-csv")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    runtimeOnly("org.redisson:redisson-spring-boot-starter:$redissonVersion")
    runtimeOnly("org.redisson:redisson-hibernate-6:$redissonVersion")
    implementation("org.springframework.boot:spring-boot-starter-cache")

    implementation("org.springdoc:springdoc-openapi-starter-common:$springdocVersion")
    runtimeOnly("org.springdoc:springdoc-openapi-starter-webmvc-ui:$springdocVersion")
    implementation("org.redisson:redisson:$redissonVersion")
    implementation("org.hibernate.validator:hibernate-validator")
    implementation("org.apache.commons:commons-lang3")
    implementation("org.springframework.kafka:spring-kafka")

    runtimeOnly("org.springframework:spring-aspects")
//    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//    runtimeOnly("com.mysql:mysql-connector-j")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.security:spring-security-test")
    testImplementation("org.awaitility:awaitility")
    testImplementation("org.json:json:20240303")
    testImplementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    testImplementation("org.springframework.cloud:spring-cloud-contract-wiremock")
}


tasks.test {
    useJUnitPlatform()
}


repositories {
    mavenCentral()
}
