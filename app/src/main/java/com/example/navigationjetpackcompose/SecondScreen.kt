package com.example.navigationjetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
fun SecondScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .background(color = Color(120, 45, 67)),
        contentAlignment = Alignment.Center
    )
    {
        Text(
            text = "Second",
            color = Color.Cyan,
            fontSize = 40.sp,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSecond() {
    SecondScreen()
}