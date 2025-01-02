package com.example.booksapp.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.booksapp.ui.screens.WelcomeScreen
import com.example.booksapp.ui.theme.BooksAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BooksAppTheme {
                WelcomeScreen()
            }
        }
    }

}

