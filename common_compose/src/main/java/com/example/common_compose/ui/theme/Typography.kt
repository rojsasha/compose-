package com.example.common_compose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val lightThemeTypography = Typography(
    defaultFontFamily = fontRoboto,
    h1 = TextStyle(
        color = blackText,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp
    ),
    h2 = TextStyle(
        color = blackText,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp
    ),
    h3 = TextStyle(
        color = blackText,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp
    ),
    h4 = TextStyle(
        color = blackText,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    h5 = TextStyle(
        color = blackText,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    body1 = TextStyle(
        color = grayText,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    body2 = TextStyle(
        color = blackText,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    button = TextStyle(
        color = blue,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)

val darkThemeTypography = Typography(
    defaultFontFamily = fontRoboto,
    h1 = TextStyle(
        color = blackText,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp
    ),
    h2 = TextStyle(
        color = blackText,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp
    ),
    h3 = TextStyle(
        color = blackText,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp
    ),
    h4 = TextStyle(
        color = blackText,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    h5 = TextStyle(
        color = blackText,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    body1 = TextStyle(
        color = grayText,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    body2 = TextStyle(
        color = blackText,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    button = TextStyle(
        color = blue,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)
