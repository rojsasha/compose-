package com.example.network.di

import com.example.network.ApiService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    private val json = Json { ignoreUnknownKeys = true }

    @ExperimentalSerializationApi
    private val converter = json.asConverterFactory("application/json".toMediaType())

    @ExperimentalSerializationApi
    @Singleton
    @Provides
    fun provideApi(): ApiService {
        return Retrofit.Builder()
            .addConverterFactory(converter)
            .baseUrl("https://kinopoiskapiunofficial.tech/api/")
            .client(okHttpClient())
            .build()
            .create(ApiService::class.java)
    }

    private fun okHttpClient(): OkHttpClient {
        val okHttpClient = OkHttpClient.Builder()
        okHttpClient.connectTimeout(30, TimeUnit.SECONDS)
        okHttpClient.readTimeout(30, TimeUnit.SECONDS)
        okHttpClient.writeTimeout(30, TimeUnit.SECONDS)

        when {
            BuildConfig.DEBUG -> {
                val logging = HttpLoggingInterceptor()
                logging.level = HttpLoggingInterceptor.Level.BODY
                okHttpClient.addInterceptor(logging)
            }
        }
        return okHttpClient.build()
    }
}