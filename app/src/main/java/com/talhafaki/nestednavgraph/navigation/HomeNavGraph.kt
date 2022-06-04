package com.talhafaki.nestednavgraph.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.talhafaki.nestednavgraph.ui.screen.HomeScreen

/**
 * Created by talhafaki on 4.06.2022.
 */

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_GRAPH_ROUTE
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(
                navigateToAuth = {
                    navController.navigate(AUTH_GRAPH_ROUTE)
                }
            )
        }
    }
}