package com.llsit.androidprojecttemplate.di

import com.llsit.androidprojecttemplate.features.main.MainViewModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
    single {
        HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    single {
        OkHttpClient.Builder()
            .addInterceptor(get<HttpLoggingInterceptor>())
            .build()
    }

    single {
        Retrofit.Builder()
            .baseUrl("https://api.example.com/")
            .client(get())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}

val repositoryModule = module {
    // Define repositories here using singleOf(::MyRepository)
}

val viewModelModule = module {
    viewModelOf(::MainViewModel)
}

val appModule = listOf(networkModule, repositoryModule, viewModelModule)
