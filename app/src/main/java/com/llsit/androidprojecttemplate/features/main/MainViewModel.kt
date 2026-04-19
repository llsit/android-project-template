package com.llsit.androidprojecttemplate.features.main

import androidx.lifecycle.viewModelScope
import com.llsit.androidprojecttemplate.core.BaseViewModel
import com.llsit.androidprojecttemplate.core.UiState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : BaseViewModel<String>() {

    init {
        fetchData()
    }

    fun fetchData() {
        viewModelScope.launch {
            setState(UiState.Loading)
            try {
                // Simulate network call
                delay(2000)
                setState(UiState.Success("Hello from Koin and Compose!"))
            } catch (e: Exception) {
                setState(UiState.Error(e.message ?: "Unknown Error"))
            }
        }
    }
}
