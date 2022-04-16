package com.example.network

import com.example.network.models.films.FilmsListModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2.2/films/top")
    suspend fun loadTop250Films(
        @Query("type") type: String,
        @Query("page") page: Int
    ): FilmsListModel
}