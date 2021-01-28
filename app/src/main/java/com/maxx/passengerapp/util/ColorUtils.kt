package com.maxx.passengerapp.util

import androidx.compose.ui.graphics.Color

object ColorUtils {
    fun getColor(colorString: String): Color {
        return Color(android.graphics.Color.parseColor("#" + colorString))
    }
}