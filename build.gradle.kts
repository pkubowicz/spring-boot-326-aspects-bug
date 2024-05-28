plugins {
    `java-library`
}

dependencies {
    api(platform("org.springframework.boot:spring-boot-dependencies:3.2.6"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    implementation("org.apache.commons:commons-lang3")

    implementation("org.springframework:spring-tx")
    // instead of spring-kafka
//    implementation("org.springframework.kafka:spring-kafka")

    runtimeOnly("org.springframework:spring-aspects")
    // instead of deps below
//    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//    runtimeOnly("com.mysql:mysql-connector-j")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}


tasks.test {
    useJUnitPlatform()
}


repositories {
    mavenCentral()
}
