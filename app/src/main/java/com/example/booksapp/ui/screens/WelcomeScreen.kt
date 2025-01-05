package com.example.booksapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.booksapp.R


@Composable
fun WelcomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.big_spacer)))
            WelcomeText()
            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.medium_spacer)))
            StartButton()
        }

        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {
            BookImage()
        }
    }
}


@Composable
fun WelcomeText() {
    Text(
        text = stringResource(id = R.string.welcome_text),
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(dimensionResource(id = R.dimen.text_padding)),
        style = MaterialTheme.typography.headlineMedium
    )
}

@Composable
fun StartButton() {
    ElevatedButton(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.4f),
        ),
    ) {
        Text(
            text = stringResource(id = R.string.start_text),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(dimensionResource(id = R.dimen.text_padding)),
            style = MaterialTheme.typography.titleSmall
        )
    }
}


@Composable
fun BookImage() {
    Image(
        painter = painterResource(id = R.drawable.welcome_img),
        contentDescription = stringResource(id = R.string.book_content_description),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .height(dimensionResource(id = R.dimen.welcome_image_height))
            .clip(
                RoundedCornerShape(
                    topStart = dimensionResource(id = R.dimen.rounded_corners),
                    topEnd = dimensionResource(id = R.dimen.rounded_corners)
                )
            )
    )
}



