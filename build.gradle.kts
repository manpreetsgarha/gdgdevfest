buildscript {
    repositories {
        jcenter()
        google()
    }
    dependencies {
        classpath(Dependencies.AndroidGradlePlugin)
        classpath(Dependencies.KotlinGradlePlugin)
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