plugins {
    kotlin("multiplatform") version "1.4.31"
}

group = "one.digitalinnovation.collections"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
}

kotlin {
    
    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
    }
}
