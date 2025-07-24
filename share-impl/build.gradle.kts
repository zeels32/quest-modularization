import com.azabost.quest.build.Config

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.hilt)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.azabost.share_impl"
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

    implementation(libs.androidx.core.ktx)

    implementation(projects.configApi)
    implementation(projects.analyticsImpl)
    implementation(projects.analyticsApi)
    implementation(projects.loggingApi)
    implementation(projects.loggingImpl)
    implementation(projects.postApi)
    implementation(projects.shareApi)


    // Hilt
    implementation(libs.hilt.core)
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
    implementation(libs.javax.inject)
}