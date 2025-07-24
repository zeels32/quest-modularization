pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "quest"
include(":app")
include(":analytics-api")
include(":analytics-impl")
include(":config-api")
include(":config-impl")
include(":theme")
include(":lifecycle")
include(":network")
include(":serialization")
include(":time-api")
include(":time-impl")
include(":logging-api")
include(":logging-impl")
include(":post-impl")
include(":post-api")
include(":share-impl")
include(":share-api")

