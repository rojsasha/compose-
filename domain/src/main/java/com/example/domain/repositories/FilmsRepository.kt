package com.example.domain.repositories

import androidx.paging.PagingData
import com.example.domain.model.CountriesDto
import com.example.domain.model.FilmDto
import kotlinx.coroutines.flow.Flow

interface FilmsRepository {
    suspend fun loadTop250Films(): Flow<PagingData<FilmDto>>
}