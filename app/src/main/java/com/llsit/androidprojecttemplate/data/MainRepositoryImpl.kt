package com.llsit.androidprojecttemplate.data

import com.llsit.androidprojecttemplate.domain.MainRepository
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor() : MainRepository {
    override fun fetchData(): String {
        return "Data from Hilt-injected Repository"
    }
}
