package com.braiso_22.web

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    val link = document.querySelector("link[rel~='icon']") ?: document
        .createElement("link")
        .apply {
            setAttribute("rel", "icon")
            document.head?.appendChild(this);
        }
    link.setAttribute("href", "favicon.webp");

    ComposeViewport(document.body!!) {
        App()
    }
}