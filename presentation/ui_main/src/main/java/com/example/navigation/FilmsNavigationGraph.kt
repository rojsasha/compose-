package com.example.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.common.Films
import com.example.ui_main.FilmScreen
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalMaterialApi
@ExperimentalCoroutinesApi
@ExperimentalAnimationApi
fun NavGraphBuilder.filmsGraph(
    navHostController: NavHostController
) {
    navigation(
        startDestination = Films.FILMS_LIST,
        route = Films.FILMS_GRAPH
    ) {
        composable(
            route = Films.FILMS_GRAPH
        ) {
            FilmScreen(){

            }
        }
    }
}