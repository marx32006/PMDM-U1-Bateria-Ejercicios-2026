// build.gradle.kts del MÓDULO :app → cómo se construye la app
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "com.pmdm.tema1"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.pmdm.tema1"
        minSdk = 24
        targetSdk = 35
        // EJ25 · Versión de la app: versionCode (número que siempre sube) y versionName (texto SemVer)
        versionCode = 1
        versionName = "1.0.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(platform("androidx.compose:compose-bom:2024.12.01"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.activity:activity-compose:1.9.3")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.3")

    testImplementation("junit:junit:4.13.2")
}
