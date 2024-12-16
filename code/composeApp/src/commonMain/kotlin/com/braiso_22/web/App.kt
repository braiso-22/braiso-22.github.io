package com.braiso_22.web

import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.*
import com.braiso_22.web.main_page.MainPage
import com.braiso_22.web.theme.AppTheme

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun App() {
    var isDarkMode by remember { mutableStateOf(true) }
    AppTheme(
        darkTheme = isDarkMode
    ) {
        Surface {
            MainPage(
                isDarkMode,
                calculateWindowSizeClass(),
                setIsDarkMode = { isDarkMode = !isDarkMode }
            )
        }
    }
}
