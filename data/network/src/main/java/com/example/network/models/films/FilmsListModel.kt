package com.example.network.models.films

data class FilmsListModel(
    val pagesCount: Int,
    val films: List<FilmModel>
)