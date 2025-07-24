import com.azabost.quest.build.Config

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.azabost.quest.analytics.impl"
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
    implementation(projects.loggingApi)
    implementation(projects.analyticsApi)

    implementation(libs.javax.inject)

}