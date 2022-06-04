package com.talhafaki.nestednavgraph.ui.screen

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.talhafaki.nestednavgraph.navigation.AUTH_GRAPH_ROUTE
import com.talhafaki.nestednavgraph.navigation.BottomBarNavGraph
import com.talhafaki.nestednavgraph.navigation.BottomNavigationBar

/**
 * Created by talhafaki on 4.06.2022.
 */

@Composable
fun MainScreen(rootNavController: NavHostController) {

    val navControllerBottomBar = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavigationBar(navControllerBottomBar)
        }
    ) {
            BottomBarNavGraph(
                bottomBarNavController = navControllerBottomBar,
                navigateToAuth = {
                    rootNavController.navigate(AUTH_GRAPH_ROUTE)
                },
            )
    }
}