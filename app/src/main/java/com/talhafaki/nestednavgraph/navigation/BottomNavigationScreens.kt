package com.talhafaki.nestednavgraph.navigation

import com.talhafaki.nestednavgraph.R

/**
 * Created by talhafaki on 4.06.2022.
 */

sealed class BottomNavigationScreens(val route: String, val icon: Int) {
    object Home : BottomNavigationScreens("home", R.drawable.ic_home)
    object Music : BottomNavigationScreens("music", R.drawable.ic_music)
    object Movie : BottomNavigationScreens("movie", R.drawable.ic_movie)
}