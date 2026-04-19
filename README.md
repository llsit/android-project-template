# Android Project Template

This is a modern Android application template built with **Jetpack Compose**, **Hilt**, and best practices for Android development.

## 🚀 Features

- **Jetpack Compose**: Modern UI toolkit for building native Android apps.
- **Hilt (Dependency Injection)**: Pre-configured dependency injection for better testability and maintainability.
- **Splash Screen API**: Integrated support for the modern Android Splash Screen.
- **Modern Build System**: Configured with **Java 21**, **Kotlin 2.1.0**, and Version Catalogs (`libs.versions.toml`).
- **OkHttp**: Ready-to-use networking client.
- **Performance Optimized**: Includes `<profileable android:shell="true" />` for advanced profiling.

## 🛠 Project Structure

- `app`: Main application module.
- `gradle/libs.versions.toml`: Centralized dependency management.
- `app/src/main/java`: Source code following clean architecture principles.

## ⚙️ Configuration

- **Compile SDK**: 35
- **Min SDK**: 24
- **JVM Toolchain**: 21
- **Kotlin Target**: JVM 21

## 🏁 Getting Started

1. Open the project in **Android Studio Ladybug (2024.2.1)** or newer.
2. Sync the project with Gradle files.
3. Run the `app` module on an emulator or physical device.

## 📝 Recent Improvements
- Aligned JVM targets to **Java 21** to resolve KSP/Javac inconsistencies.
- Added **Splash Screen API** for a polished app startup experience.
- Configured **Hilt** and **OkHttp** as a foundation for data-driven features.
