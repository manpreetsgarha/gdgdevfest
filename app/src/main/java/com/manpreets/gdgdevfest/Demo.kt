package com.manpreets.gdgdevfest

/******
 *
android {
compileSdkVersion=28
defaultConfig {
applicationId("com.manpreets.gdgdevfest")
ndk {
abiFilter("armeabi-v7a")
}
}
}*/

fun main(args: Array<String>) {
    android {
        compileSdkVersion = 28
        defaultConfig {
            applicationId = "com.manpreets.gdgdevfest"
            ndkOptions {
                abiFilter = "armeabi-v7a"
            }
        }
    }
}

fun android(android: BaseAndroid.() -> Unit) = BaseAndroid().apply(android)

class BaseAndroid(var compileSdkVersion: Int = 23,
                  var defaultConfig: DefaultConfig = DefaultConfig())

class DefaultConfig(var applicationId: String = "default",
                    var ndkOptions: NdkOptions = NdkOptions()) {
    operator fun invoke(defaultConfig: DefaultConfig.() -> Unit) {
        this.apply(defaultConfig)
    }
}

class NdkOptions(var abiFilter: String = "") {
    operator fun invoke(f: NdkOptions.() -> Unit) {
        this.apply(f)
    }
}

fun hello(): Unit {
    var helloGDG = HelloGDG()
    helloGDG("Hello")
}

class HelloGDG {
    operator fun invoke(msg: String) {
        print(msg)
    }
}



