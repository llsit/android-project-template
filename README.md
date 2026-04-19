# Android Project Template - Koin & Compose

This branch (`android-koin`) features a clean, modular architecture using Jetpack Compose for the UI and **Koin** for lightweight dependency injection.

## 🚀 Key Features

- **Jetpack Compose**: 100% Kotlin-based UI toolkit for modern development.
- **Koin (Dependency Injection)**: A pragmatic and lightweight DI framework for Kotlin.
- **Clean Architecture**: Organized into `core`, `data`, `domain`, and `features` layers for better maintainability and testability.
- **Splash Screen API**: Integrated support for the modern Android Splash Screen.
- **State Management**: Uses `UiState` and `StateFlow` within ViewModels for reactive, lifecycle-aware UI updates.
- **Modern JVM Target**: Optimized for **Java 21** and **Kotlin 2.1.0**.

## 🛠 Project Structure

- `core`: Shared utilities, base classes, and core business logic (e.g., `UiState`).
- `data`: Implementation of repositories and data sources (Networking, Local Storage).
- `domain`: Pure business logic, entities, and repository interfaces.
- `features`: UI components and ViewModels, organized by feature (e.g., `main`).
- `di`: Koin modules defining how dependencies are provided.

## 📦 Main Dependencies

- **Koin**: `io.insert-koin:koin-android` & `io.insert-koin:koin-androidx-compose`
- **Compose**: Latest BOM with Material3.
- **Splash Screen**: `androidx.core:core-splashscreen`
- **Networking**: `com.squareup.okhttp3:okhttp`

## ⚙️ Build Configuration

- **Compile SDK**: 35
- **Min SDK**: 24
- **Java/Kotlin Target**: 21

## 🏁 Getting Started

1. **Check out the branch**:
   ```bash
   git checkout android-koin
   ```
2. **Sync with Gradle**: Open the project in Android Studio and wait for the sync to complete.
3. **Run**: Deploy to an emulator or physical device running API 24 or higher.
