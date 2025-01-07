package com.example.booksapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(navController: NavHostController) {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.background,
                contentColor = MaterialTheme.colorScheme.onBackground,
            ) {

                // Add icons to navigate to other screens
            }
        }
    ) { paddingValues ->

       Column (
           modifier = Modifier
               .padding(paddingValues)
               .fillMaxSize()
               .background(MaterialTheme.colorScheme.primary)
       ){
           SearchText()
       }
    }
}

@Composable
fun SearchText() {
    Text(
        text = stringResource(id = R.string.search_text),
        textAlign = TextAlign.Left,
        modifier = Modifier.padding(dimensionResource(id = R.dimen.text_padding)),
        style = MaterialTheme.typography.headlineSmall
    )
}