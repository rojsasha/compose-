package com.example.repository.di

import com.example.network.ApiService
import com.example.repository.datasource.FilmRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FilmRepositoryModule {

    @Singleton
    @Provides
    fun providesCharacterRepository(apiService: ApiService): FilmRepositoryImpl =
        FilmRepositoryImpl(apiService)

}