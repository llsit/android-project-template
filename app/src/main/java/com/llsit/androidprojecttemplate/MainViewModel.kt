package com.llsit.androidprojecttemplate

import androidx.lifecycle.ViewModel
import com.llsit.androidprojecttemplate.domain.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: MainRepository
) : ViewModel() {
    val data = repository.fetchData()
}
