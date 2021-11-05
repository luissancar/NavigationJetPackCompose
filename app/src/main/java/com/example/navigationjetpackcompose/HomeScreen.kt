package com.example.navigationjetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(navController: NavController) {
    Box(
        Modifier
            .fillMaxSize()
            .background(color = Color.Red),
        contentAlignment = Alignment.Center
    )
    {
        Text(
            text = "Home",
            color = Color.Green,
            fontSize = 40.sp,
            modifier = Modifier.clickable {
                navController.navigate(Screen.Second.route)
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewGreeting() {
    HomeScreen(
        navController = rememberNavController( )
    )
}