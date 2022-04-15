package com.example.network.models.base

data class BaseFilmsListingModel<T>(
    val pagesCount: Int,
    val films: List<T>
)