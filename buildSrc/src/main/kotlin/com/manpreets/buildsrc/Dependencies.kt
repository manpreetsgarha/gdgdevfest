import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

object Dependencies {
    const val VersionKotlin = "1.2.61"

    const val VersionAndroidGradlePlugin = "3.2.0"

    const val KotlinJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$VersionKotlin"

    const val KotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$VersionKotlin"

    const val AndroidGradlePlugin = "com.android.tools.build:gradle:$VersionAndroidGradlePlugin"
}

open class GDGTask : DefaultTask() {
    lateinit var message: String

    @TaskAction
    fun print() {
        print("Awesomeness from kotlin code $message")
    }
}