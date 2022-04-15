package com.example.ui_main

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.ui_main.components.FilmListColumn

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@OptIn(ExperimentalMaterialApi::class, androidx.compose.foundation.ExperimentalFoundationApi::class)
@Composable
fun FilmScreen(navigate: (Int) -> Unit) {
    val viewModel: FilmListViewModel = hiltViewModel()
    val state = viewModel.characterListState.value
    val characters = state.dataList?.collectAsLazyPagingItems()
    val lazyListState = rememberLazyListState()

    Scaffold() {
        if (state.errorMessage.isNotEmpty()) {

            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = state.errorMessage)
            }
        }

        characters?.let { items ->
            FilmListColumn(items = items, listState = lazyListState) { characterId ->
                navigate(characterId)
            }
        }


    }
}


