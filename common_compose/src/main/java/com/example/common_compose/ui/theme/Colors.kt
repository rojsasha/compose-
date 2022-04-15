package com.example.common_compose.ui.theme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val blackText = Color(0xFF1D1D1D)
val grayText = Color(0xFF566379)
val gray = Color(0xFF808B9F)
val grayOther = Color(0xFF97A4BA)
val yellow = Color(0xFFFFB72A)
val red = Color(0xFFFF3B30)
val commonBackground = Color(0xFFE5E5E5)
val darkBlue = Color(0xFF0E4DA4)
val blue = Color(0xFF185AC5)
val blue50 = Color(0x7F185AC5)
val blue30Transparency = Color(0x4D185AC5)
val pureWhite = Color(0xFFFFFFFF)
val pureWhiteAlpha20 = Color(0x20FFFFFF)
val lightBlue = Color(0xFFF3F7FC)
val green = Color(0xFF2CC03B)
val lightBlueGray = Color(0xFF97A4BA)
val lightGray = Color(0xFFD5D5D5)
val almostWhite = Color(0xFFF1F1F1)
val grayLight = Color(0xFF97A4BA)
val grayLight20Transparency = Color(0x3397A4BA)
val grayLine = Color(0xFFD5D5D5)

val DarkColorPalette = darkColors(
    primary = blackText,
    primaryVariant = grayText,
    secondary = yellow,
    onPrimary = blue,
    background = pureWhite,
    onBackground = blue,
    surface = pureWhite,
    onSurface = blue
)

val LightColorPalette = lightColors(
    primary = blackText,
    primaryVariant = grayText,
    secondary = yellow,
    onPrimary = blue,
    background = pureWhite,
    onBackground = blue,
    surface = pureWhite,
    onSurface = blue
)

