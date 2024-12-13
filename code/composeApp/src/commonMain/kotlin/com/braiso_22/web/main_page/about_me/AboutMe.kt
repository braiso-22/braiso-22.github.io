package com.braiso_22.web.main_page.about_me

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import braiso_22.composeapp.generated.resources.*
import braiso_22.composeapp.generated.resources.Res
import braiso_22.composeapp.generated.resources.about_me
import braiso_22.composeapp.generated.resources.about_me1
import braiso_22.composeapp.generated.resources.about_me2
import com.braiso_22.web.theme.verySmallPadding
import org.jetbrains.compose.resources.stringResource

@Composable
fun aboutMeText(): String {
    return stringResource(Res.string.about_me1) + "\n\n" + stringResource(Res.string.about_me2) + "\n\n" + stringResource(
        Res.string.about_me3
    )
}


@Composable
fun AboutMe(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(stringResource(Res.string.about_me), style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.padding(verySmallPadding))
        Text(aboutMeText())
    }
}
