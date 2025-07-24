import com.azabost.quest.build.Config

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
//    alias(libs.plugins.testFixtures)
}
android {
    namespace = "com.azabost.quest.post.api"
    compileSdk = 36

    defaultConfig {
        minSdk = 28

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = Config.javaVersion
        targetCompatibility = Config.javaVersion
    }
}
kotlin {
    compilerOptions {
        jvmTarget = Config.kotlinJvmTarget
    }
}


dependencies {

    implementation(projects.configApi)

    //Serialization
    implementation(libs.kotlinx.serialization.core)
    implementation(libs.kotlinx.serialization.json)

    //Retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.kotlinxSerialization)

}