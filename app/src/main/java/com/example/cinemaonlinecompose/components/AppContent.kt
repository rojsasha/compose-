package com.example.cinemaonlinecompose.components

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.common.Films
import com.example.ui_main.FilmScreen
import com.google.accompanist.navigation.animation.rememberAnimatedNavController


@ExperimentalMaterialApi
@ExperimentalAnimationApi
@Composable
fun AppContent() {
    val navController = rememberAnimatedNavController()
    NavHost(navController = navController, startDestination =  Films.FILMS_LIST) {
        composable(
            route = Films.FILMS_LIST
        ) {
            FilmScreen(){}
        }
    }
}
