package com.example.repository.mappers

import com.example.domain.model.CountriesDto
import com.example.domain.model.FilmDto
import com.example.domain.model.GenresDto
import com.example.network.models.films.CountriesModel
import com.example.network.models.films.FilmModel
import com.example.network.models.films.GenresModel

fun FilmModel.toFilm() = FilmDto(
    filmId = this.filmId,
    nameRu = this.nameRu,
    nameEn = this.nameEn,
    year = this.year,
    filmLength = this.filmLength,
    countries = this.countries?.toCountries(),
    genres = this.genres?.toGenres(),
    rating = this.rating,
    ratingVoteCount = this.ratingVoteCount,
    posterUrl = this.posterUrl,
    posterUrlPreview = this.posterUrlPreview,
    ratingChange = this.ratingChange,
)

private fun List<CountriesModel>.toCountries() = map { CountriesDto(it.country) }
private fun List<GenresModel>.toGenres() = map { GenresDto(it.genre) }