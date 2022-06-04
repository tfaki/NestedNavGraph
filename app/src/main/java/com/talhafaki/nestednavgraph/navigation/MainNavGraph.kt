package com.talhafaki.nestednavgraph.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.talhafaki.nestednavgraph.ui.screen.MainScreen

/**
 * Created by talhafaki on 4.06.2022.
 */

fun NavGraphBuilder.mainNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Main.route,
        route = MAIN_GRAPH_ROUTE
    ) {
        composable(
            route = Screen.Main.route
        ) {
            MainScreen(rootNavController = navController)
        }
    }
}