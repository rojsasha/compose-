package com.example.ui_main

import androidx.paging.PagingData
import com.example.domain.model.FilmDto
import kotlinx.coroutines.flow.Flow

data class FilmListState(
    var isLoading: Boolean = false,
    val dataList: Flow<PagingData<FilmDto>>? = null,
    val errorMessage: String = ""
)