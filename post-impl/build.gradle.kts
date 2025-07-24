import com.azabost.quest.build.Config

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
}

android {
    namespace = "com.azabost.quest.post_impl"
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

    implementation(projects.postApi)
    implementation(projects.configApi)
    implementation(projects.theme)
    implementation(projects.analyticsApi)
    implementation(projects.analyticsImpl)
    implementation(projects.timeApi)
    implementation(projects.loggingApi)
    implementation(projects.loggingImpl)
    implementation(projects.shareImpl)

    // AndroidX
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.activity.compose)

    // Hilt
    implementation(libs.hilt.core)
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
    implementation(libs.javax.inject)

    // Compose
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.kotlinxSerialization)

}