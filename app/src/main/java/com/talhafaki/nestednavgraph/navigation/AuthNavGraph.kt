package com.talhafaki.nestednavgraph.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.talhafaki.nestednavgraph.ui.screen.LoginScreen
import com.talhafaki.nestednavgraph.ui.screen.SignUpScreen

/**
 * Created by talhafaki on 4.06.2022.
 */
fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = Screen.Login.route,
        route = AUTH_GRAPH_ROUTE
    ){
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(
                navigateToHome = {
                    navController.navigate(Screen.Main.route)
                },
                navigateToSignUp = {
                    navController.navigate(Screen.SignUp.route)
                }
            )
        }
        composable(
            route = Screen.SignUp.route
        ) {
            SignUpScreen(
                navigateToLogin = {
                    navController.navigate(Screen.Login.route)
                },
                navigateToHome = {
                    navController.navigate(Screen.Main.route)
                }
            )
        }
    }
}