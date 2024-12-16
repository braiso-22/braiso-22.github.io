package com.braiso_22.web.main_page.profile_info

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import braiso_22.composeapp.generated.resources.Res
import braiso_22.composeapp.generated.resources.full_stack_developer
import com.braiso_22.web.main_page.Event
import com.braiso_22.web.theme.smallPadding
import com.braiso_22.web.theme.verySmallPadding
import org.jetbrains.compose.resources.stringResource

@Composable
fun CompactProfileInfo(
    onEvent: (Event) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier,
    ) {
        ProfileImage(
            size = 192,
            modifier = Modifier.padding(smallPadding),
        )
        Spacer(Modifier.padding(smallPadding))
        Text(
            text = "Brais Fernández Vázquez",
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(Modifier.padding(verySmallPadding))
        Text(
            stringResource(Res.string.full_stack_developer),
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(Modifier.padding(verySmallPadding))
        LocationInfo()
        Spacer(Modifier.padding(verySmallPadding))
        CompactSocialLinks(onEvent)
    }
}