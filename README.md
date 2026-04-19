# Android Project Template - Hilt & Splash Screen

This branch (`android-hilt`) provides a foundational setup for a modern Android application using Jetpack Compose, Hilt for dependency injection, and the new Splash Screen API.

## 🚀 Key Features

- **Jetpack Compose**: Modern UI toolkit for building native Android apps.
- **Hilt (Dependency Injection)**: Pre-configured Hilt setup including `BaseApplication`, `NetworkModule`, and `RepositoryModule`.
- **Modern JVM Target**: Configured to use **Java 21** and **Kotlin 2.1.0** for better performance and modern language features.
- **Splash Screen API**: Integrated `androidx.core:core-splashscreen` for a smooth app launch experience.
- **Networking**: Includes **OkHttp** for robust network requests.
- **Performance Profiling**: Added `<profileable android:shell="true" />` for advanced debugging and profiling.

## 🛠 Project Structure

- `com.llsit.androidprojecttemplate.di`: Dagger Hilt modules for providing dependencies.
- `com.llsit.androidprojecttemplate.data`: Repository implementation for data handling.
- `com.llsit.androidprojecttemplate.domain`: Domain layer interfaces.
- `com.llsit.androidprojecttemplate.ui`: Jetpack Compose UI components and theme.

## ⚙️ Configuration Details

- **Compile SDK**: 35
- **Min SDK**: 24
- **JVM Toolchain**: 21
- **Kotlin Compiler**: JVM 21

## 🏁 Getting Started

1. **Clone the branch**:
   ```bash
   git checkout android-hilt
   ```
2. **Sync Project**: Perform a Gradle sync in Android Studio to download dependencies.
3. **Run**: Deploy to a device or emulator running API 24 or higher.

## 📝 Recent Fixes
- Resolved `Inconsistent JVM-target compatibility` by aligning Toolchain and Compiler options to Java 21.
- Fixed KSP compilation issues by adding missing OkHttp dependencies required by `NetworkModule`.
