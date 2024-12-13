package com.braiso_22.web

import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import com.braiso_22.web.main_page.MainPage
import com.braiso_22.web.theme.AppTheme

@Composable
fun App() {
    var isDarkMode by remember { mutableStateOf(true) }
    AppTheme(
        darkTheme = isDarkMode
    ) {
        Surface {
            MainPage(
                isDarkMode,
                setIsDarkMode = { isDarkMode = !isDarkMode }
            )
        }
    }
}
