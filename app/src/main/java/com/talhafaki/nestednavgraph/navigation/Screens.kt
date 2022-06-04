package com.talhafaki.nestednavgraph.navigation

/**
 * Created by talhafaki on 4.06.2022.
 */

const val MAIN_GRAPH_ROUTE = "main"
const val AUTH_GRAPH_ROUTE = "auth"
const val HOME_GRAPH_ROUTE = "home"

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Music : Screen(route = "music_screen")
    object Movie : Screen(route = "movie_screen")
    object Login: Screen(route = "login_screen")
    object SignUp: Screen(route = "sign_up_screen")
}