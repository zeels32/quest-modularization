import com.azabost.quest.build.Config

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
//    alias(libs.plugins.testFixtures)
}

android {
    namespace = "com.azabost.quest.logging.api"
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

    implementation(projects.configApi)
    implementation(projects.analyticsApi)

}