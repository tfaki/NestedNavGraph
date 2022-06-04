package com.talhafaki.nestednavgraph.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.talhafaki.nestednavgraph.ui.screen.HomeScreen
import com.talhafaki.nestednavgraph.ui.screen.MovieScreen
import com.talhafaki.nestednavgraph.ui.screen.MusicScreen

/**
 * Created by talhafaki on 4.06.2022.
 */

@Composable
fun BottomBarNavGraph(
    bottomBarNavController: NavHostController,
    navigateToAuth: () -> Unit
) {
    NavHost(bottomBarNavController, startDestination = BottomNavigationScreens.Home.route) {
        composable(BottomNavigationScreens.Home.route) {
            HomeScreen(
                navigateToAuth = {
                   navigateToAuth.invoke()
                }
            )
        }
        composable(BottomNavigationScreens.Music.route) {
            MusicScreen()
        }
        composable(BottomNavigationScreens.Movie.route) {
            MovieScreen()
        }
    }
}