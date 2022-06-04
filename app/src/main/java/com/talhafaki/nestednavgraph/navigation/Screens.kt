package com.talhafaki.nestednavgraph.navigation

/**
 * Created by talhafaki on 4.06.2022.
 */

const val MAIN_GRAPH_ROUTE = "main"
const val ROOT_GRAPH_ROUTE = "root"
const val AUTH_GRAPH_ROUTE = "auth"

sealed class Screen(val route: String) {
    object Main : Screen(route = "main_screen")
    object Login: Screen(route = "login_screen")
    object SignUp: Screen(route = "sign_up_screen")
}