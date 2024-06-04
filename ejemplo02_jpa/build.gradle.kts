plugins {
    id("java")
}

group = "com.distribuida"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    //implementation( project(":ejemplo01_cdi"))
    implementation("org.hibernate:hibernate-core:6.5.2.Final")
    implementation("com.h2database:h2:2.2.224")

}

sourceSets {
    main {
        output.setResourcesDir( file("${buildDir}/classes/java/main"))
    }
}

tasks.test {
    useJUnitPlatform()
}