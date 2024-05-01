plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile group: 'org.apache.logging.log4j', name: 'log4j-api', version: '2.13.3'
    compile group: 'org.apache.logging.log4j', name: 'log4j-core', version: '2.13.3'
}

tasks.test {
    useJUnitPlatform()
}