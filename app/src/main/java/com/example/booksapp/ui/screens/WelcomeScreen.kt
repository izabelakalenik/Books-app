package com.example.booksapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WelcomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)
    ) {
        WelcomeMessage()
    }
}

@Composable
fun WelcomeMessage(){
    Text(
        text = "Welcome to the Books App!",
        modifier = Modifier.padding(20.dp)
    )
}

//@Composable
//fun Image(){
//    Image(
//
//    )
//}