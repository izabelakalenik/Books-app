package com.example.booksapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.booksapp.R

val dmSerifText = FontFamily(
    Font(R.font.dm_serif_text_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.dm_serif_text_italic, FontWeight.Normal, FontStyle.Italic),
    )


val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = dmSerifText,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),

    headlineMedium = TextStyle(
        fontFamily = dmSerifText,
        fontWeight = FontWeight.SemiBold,
        fontSize = 28.sp,
        textAlign = TextAlign.Center,
        lineHeight = 36.sp,
        letterSpacing = 0.0.sp,
        color = LightGrey
    ),

    titleSmall = TextStyle(
        fontFamily = dmSerifText,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
        lineHeight = 25.sp,
        letterSpacing = 0.1.sp,
        color = LightGrey
    )

)