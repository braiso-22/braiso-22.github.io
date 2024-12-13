package com.braiso_22.web.main_page

import MyIconPack
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.braiso_22.web.main_page.about_me.AboutMe
import com.braiso_22.web.main_page.profile_info.ProfileInfo
import com.braiso_22.web.main_page.stack.MyStack
import com.braiso_22.web.theme.mediumPadding
import com.braiso_22.web.theme.smallPadding
import com.braiso_22.web.theme.verySmallPadding
import kotlinx.coroutines.flow.collectLatest
import myiconpack.Android
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.imageResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainPage(
    isDarkMode: Boolean,
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
            Card(
                modifier = Modifier.fillMaxWidth(0.75f).padding(mediumPadding)
            ) {
                ProfileInfo(
                    onEvent = { viewmodel.onEvent(it) },
                    modifier = Modifier.padding(mediumPadding),
                )
            }
            Card(modifier = Modifier.fillMaxWidth(0.75f).padding(mediumPadding)) {
                AboutMe(Modifier.padding(mediumPadding))
            }
            Card(modifier = Modifier.fillMaxWidth(0.75f).padding(mediumPadding)) {
                MyStack(Modifier.padding(mediumPadding))
            }
        }
    }
}
