buildscript {
    repositories {
        jcenter()
        google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.2.0")
        classpath(kotlin("gradle-plugin", "1.2.61"))
    }
}
allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.withType<Delete> {
    delete(rootProject.buildDir)
}