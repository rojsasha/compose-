package com.example.domain.usecase

import androidx.paging.PagingData
import com.example.domain.model.FilmDto
import com.example.domain.repositories.FilmsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTop250FilmsUseCase @Inject constructor(
    private val filmsRepository: FilmsRepository
) {

    suspend operator fun invoke(): Flow<PagingData<FilmDto>> {
        return filmsRepository.loadTop250Films()
    }
}