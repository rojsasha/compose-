package com.example.domain.model

data class FilmDto(
    val filmId: Int,
    val nameRu: String?,
    val nameEn: String?,
    val year: Int?,
    val filmLength: String?,
    val countries: List<CountriesDto>?,
    val genres: List<GenresDto>?,
    val rating: Double?,
    val ratingVoteCount: Int?,
    val posterUrl: String?,
    val posterUrlPreview: String?,
    val ratingChange: String?,
)