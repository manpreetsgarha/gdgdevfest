import org.jetbrains.kotlin.config.KotlinCompilerVersion

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
        ndk {
            abiFilter("armeabi-v7a")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to mutableListOf("*.jar"))))
    implementation(kotlin("stdlib-jdk7", KotlinCompilerVersion.VERSION))
}

