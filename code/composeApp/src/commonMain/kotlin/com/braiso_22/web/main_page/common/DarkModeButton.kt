package com.braiso_22.web.main_page.common

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DarkModeButton(isDarkMode: Boolean, modifier: Modifier = Modifier) {
    Icon(
        // shows failing in some ides but it's fine
        imageVector = if (isDarkMode)
            Icons.Default.LightMode
        else
            Icons.Default.DarkMode,
        if (isDarkMode)
            "Activate Light Mode"
        else
            "Activate Dark Mode",
        modifier = modifier,
    )
}