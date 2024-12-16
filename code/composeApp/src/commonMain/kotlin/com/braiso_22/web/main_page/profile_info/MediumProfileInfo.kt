package com.braiso_22.web.main_page.profile_info

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import braiso_22.composeapp.generated.resources.Res
import braiso_22.composeapp.generated.resources.full_stack_developer
import com.braiso_22.web.main_page.Event
import com.braiso_22.web.theme.mediumPadding
import com.braiso_22.web.theme.smallPadding
import com.braiso_22.web.theme.verySmallPadding
import org.jetbrains.compose.resources.stringResource

@Composable
fun MediumProfileInfo(
    onEvent: (Event) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            ProfileImage(
                modifier = Modifier.padding(smallPadding),
            )
            Spacer(Modifier.padding(mediumPadding))
            Column {
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
            }
        }
        SocialLinks(onEvent)
    }
}