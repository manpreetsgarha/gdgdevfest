import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

private const val VersionKotlin = "1.2.61"
private const val VersionAndroidGradlePlugin = "3.2.0"

object Dependencies {
    const val KotlinJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$VersionKotlin"

    const val KotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$VersionKotlin"

    const val AndroidGradlePlugin = "com.android.tools.build:gradle:$VersionAndroidGradlePlugin"
}

