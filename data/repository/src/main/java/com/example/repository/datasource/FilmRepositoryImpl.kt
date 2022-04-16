package com.example.repository.datasource

import androidx.paging.*
import com.example.domain.model.FilmDto
import com.example.domain.repositories.FilmsRepository
import com.example.network.ApiService
import com.example.repository.mappers.toFilm
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FilmRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : FilmsRepository {

    override suspend fun loadTop250Films(): Flow<PagingData<FilmDto>> {
        return Pager(PagingConfig(pageSize = 20)) {
            FilmsPagingSource(apiService)
        }.flow
    }
}

class FilmsPagingSource(private val apiService: ApiService) : PagingSource<Int, FilmDto>() {
    override fun getRefreshKey(state: PagingState<Int, FilmDto>): Int? {
        return state.anchorPosition?.let { anchorposition ->
            state.closestPageToPosition(anchorposition)?.prevKey?.plus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, FilmDto> {
        val pageNumber = params.key ?: 1

        return try {
            val filmsResponse = apiService.loadTop250Films("TOP_250_BEST_FILMS", pageNumber)
            val films = filmsResponse.films.map { film ->
                film.toFilm()
            }

            val newPage = pageNumber + 1

            LoadResult.Page(
                data = films,
                nextKey = newPage,
                prevKey = null
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}