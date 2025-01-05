package com.example.booksapp.navigation

import androidx.compose.runtime.Composable
import com.example.booksapp.ui.theme.BooksAppTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.booksapp.ui.screens.FavouriteScreen
import com.example.booksapp.ui.screens.SearchScreen
import com.example.booksapp.ui.screens.WelcomeScreen

@Composable
fun AppNavigation() {
    BooksAppTheme {
        val navController = rememberNavController()

        NavHost(
            navController = navController,
            startDestination = Routes.WELCOME_SCREEN.name
        ) {

            composable(Routes.WELCOME_SCREEN.name) {
                WelcomeScreen(navController)
            }

            composable(Routes.SEARCH_SCREEN.name) {
                SearchScreen(navController)
            }

            composable(Routes.SEARCH_SCREEN.name) {
                FavouriteScreen(navController)
            }
        }
    }
}