package com.example.navigationjetpackcompose

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Second : Screen("second_screen")
}
