package com.talhafaki.nestednavgraph.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

/**
* Created by talhafaki on 4.06.2022.
*/

@Composable
fun MainNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = AUTH_GRAPH_ROUTE,
        route = MAIN_GRAPH_ROUTE
    ) {
        homeNavGraph(navController = navController)
        authNavGraph(navController = navController)
    }
}