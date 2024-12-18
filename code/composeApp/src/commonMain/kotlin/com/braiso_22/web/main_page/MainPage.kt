package com.braiso_22.web.main_page

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material3.*
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.AnnotatedString
import androidx.lifecycle.viewmodel.compose.viewModel
import com.braiso_22.web.main_page.about_me.AboutMe
import com.braiso_22.web.main_page.profile_info.CompactProfileInfo
import com.braiso_22.web.main_page.profile_info.ExpandedProfileInfo
import com.braiso_22.web.main_page.profile_info.MediumProfileInfo
import com.braiso_22.web.main_page.stack.ExpandedMyStack
import com.braiso_22.web.main_page.stack.MyStack
import com.braiso_22.web.theme.mediumPadding
import kotlinx.coroutines.flow.collectLatest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainPage(
    isDarkMode: Boolean,
    sizeClass: WindowSizeClass,
    setIsDarkMode: () -> Unit,
) {
    val snackbarHostState = remember { SnackbarHostState() }
    val viewmodel = viewModel { MainPageViewModel() }
    val clipboardManager = LocalClipboardManager.current
    val uriHandler = LocalUriHandler.current

    LaunchedEffect(Unit) {
        viewmodel.eventFlow.collectLatest { event ->
            when (event) {
                Action.ShowCopiedEmail -> {
                    snackbarHostState.currentSnackbarData?.dismiss()
                    clipboardManager.setText(AnnotatedString("braisfv22@gmail.com"))
                    snackbarHostState.showSnackbar(
                        message = "Email Copied",
                    )
                }

                is Action.OpenUrl -> {
                    uriHandler.openUri(event.url)
                }
            }
        }
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text("Braiso_22")
                },
                actions = {
                    IconButton(
                        onClick = setIsDarkMode,
                    ) {
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
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary,
                    navigationIconContentColor = MaterialTheme.colorScheme.onPrimary,
                    actionIconContentColor = MaterialTheme.colorScheme.onPrimary,
                )
            )
        },
        snackbarHost = {
            SnackbarHost(
                hostState = snackbarHostState,
            )
        },
    ) { paddingValues ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(paddingValues).fillMaxWidth().verticalScroll(
                rememberScrollState()
            )
        ) {
            val fraction = if (sizeClass.widthSizeClass == WindowWidthSizeClass.Expanded)
                0.85f
            else
                1f

            Column(
                modifier = Modifier.fillMaxWidth(fraction)
            ) {
                val cardModifier = Modifier.fillMaxWidth().padding(mediumPadding)
                Card(modifier = cardModifier) {
                    when (sizeClass.widthSizeClass) {
                        WindowWidthSizeClass.Compact -> {
                            CompactProfileInfo(
                                onEvent = { viewmodel.onEvent(it) },
                                modifier = cardModifier,
                            )
                        }

                        WindowWidthSizeClass.Medium -> {
                            MediumProfileInfo(
                                onEvent = { viewmodel.onEvent(it) },
                                modifier = cardModifier,
                            )
                        }

                        WindowWidthSizeClass.Expanded -> {
                            ExpandedProfileInfo(
                                onEvent = { viewmodel.onEvent(it) },
                                modifier = Modifier.padding(mediumPadding),
                            )
                        }
                    }
                }
                Card(modifier = cardModifier) {
                    AboutMe(Modifier.padding(mediumPadding))
                }
                Card(modifier = cardModifier) {
                    if (sizeClass.widthSizeClass == WindowWidthSizeClass.Expanded) {
                        ExpandedMyStack(Modifier.padding(mediumPadding))
                    } else {
                        MyStack(Modifier.padding(mediumPadding))
                    }
                }
            }
        }
    }
}
