// Top-level build_groovy file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath(Dependencies.AndroidGradlePlugin)
        classpath(Dependencies.KotlinGradlePlugin)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build_groovy.gradlele files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

task<GDGTask>("hello") {
    message = "Bazinga!!"
}
task<Delete>("clean") {
    delete(rootProject.buildDir)
}
/*task clean(type: Delete) {
    delete rootProject.buildDir
}*/
