package com.example.booksapp.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import com.example.booksapp.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(navController: NavHostController) {
    Scaffold (
        modifier = Modifier
            .background(MaterialTheme.colorScheme.tertiary)
    ){
        SearchText()
    }

}

@Composable
fun SearchText() {
    Text(
        text = stringResource(id = R.string.welcome_text),
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(dimensionResource(id = R.dimen.text_padding)),
        style = MaterialTheme.typography.headlineMedium
    )
}