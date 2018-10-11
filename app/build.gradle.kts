//apply plugin: 'com.android.application'
//apply plugin: 'kotlin-android'

plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "com.manpreets.gdgdevfest"
        minSdkVersion(15)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
        }
        create("releaseDev") {
            isMinifyEnabled = true
        }
    }
    flavorDimensions("default")
    productFlavors {
        create("prod") {
            setDimension("default")
        }
        create("dev") {
            setDimension("default")
        }
    }
}

dependencies {
    implementation(Dependencies.KotlinJdk7)
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
}