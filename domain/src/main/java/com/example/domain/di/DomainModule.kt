package com.example.domain.di

import com.example.domain.repositories.FilmsRepository
import com.example.domain.usecase.GetTop250FilmsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DomainModule {

    @Provides
    @Singleton
    fun provideGetTop250FilmsUseCase(filmsRepository: FilmsRepository) =
        GetTop250FilmsUseCase(filmsRepository)
}