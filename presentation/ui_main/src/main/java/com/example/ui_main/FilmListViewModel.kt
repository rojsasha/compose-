package com.example.ui_main

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.domain.usecase.GetTop250FilmsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FilmListViewModel @Inject constructor(
    private val getTop250UseCase: GetTop250FilmsUseCase
) : ViewModel() {

    private val _filmListState: MutableState<FilmListState> = mutableStateOf(
        FilmListState()
    )

    private val handler = CoroutineExceptionHandler { _, exception ->
        _filmListState.value.isLoading = false
        _filmListState.value = FilmListState(
            errorMessage = exception.message!!
        )
    }

    val characterListState
        get() = _filmListState
    init {
        getCharacters()
    }

    private fun getCharacters() = viewModelScope.launch(handler) {
        val response = getTop250UseCase().cachedIn(viewModelScope)
        _filmListState.value = FilmListState(
            dataList = response
        )
    }
}