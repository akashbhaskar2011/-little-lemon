package com.example.littlelemon.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.littlelemon.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)
private val karlaFontFamily = FontFamily(
    Font(R.font.karla_regular)
)

//val karlaTypography = Typography(
//    defaultFontFamily = karlaFontFamily,
//    h1 = TextStyle(
//        fontFamily = karlaFontFamily,
//        fontWeight = FontWeight.Bold,
//        fontSize = 30.sp
//    ),
//    h2 = TextStyle(
//        fontFamily = karlaFontFamily,
//        fontWeight = FontWeight.Bold,
//        fontSize = 24.sp
//    ),
//    // You can customize other text styles as needed
//)