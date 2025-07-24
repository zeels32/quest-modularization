import com.azabost.quest.build.Config

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
}

android {
    namespace = "com.azabost.quest.logging_impl"
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

java {
    sourceCompatibility = Config.javaVersion
    targetCompatibility = Config.javaVersion
}

dependencies {

    implementation(libs.androidx.core.ktx)

    implementation(projects.loggingApi)
    implementation(projects.configApi)

    //Hilt
    implementation(libs.hilt.core)
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
    implementation(libs.javax.inject)

}