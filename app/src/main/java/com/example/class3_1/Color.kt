package com.example.class3_1

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val colorLightPalette = lightColors(
    primary = Color.White,
    surface = Color.White,
    onSurface = Color.Black,
    onBackground = Color.Black,

)

val colorDark = Color.Black
val colorDarkOn = Color.White

val colorDarkPalette = darkColors(
    primary = Color.Red,
    background = colorDark,
    surface = Color.Transparent,
    onBackground = colorDarkOn,
    onSurface = colorDarkOn,
)