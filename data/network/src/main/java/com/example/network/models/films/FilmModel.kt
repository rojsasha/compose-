package com.example.network.models.films

data class FilmModel(
    val filmId: Int,
    val nameRu: String?,
    val nameEn: String?,
    val year: Int?,
    val filmLength: String?,
    val countries: List<CountriesModel>?,
    val genres: List<GenresModel>?,
    val rating: Double?,
    val ratingVoteCount: Int?,
    val posterUrl: String?,
    val posterUrlPreview: String?,
    val ratingChange: String?,
)