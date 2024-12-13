package com.braiso_22.web.main_page.profile_info

import MyIconPack
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import braiso_22.composeapp.generated.resources.Res
import braiso_22.composeapp.generated.resources.full_stack_developer
import com.braiso_22.web.main_page.Event
import com.braiso_22.web.theme.smallPadding
import com.braiso_22.web.theme.verySmallPadding
import myiconpack.Github
import myiconpack.Linkedin
import org.jetbrains.compose.resources.stringResource

@Composable
fun ProfileInfo(
    onEvent: (Event) -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = modifier,
    ) {
        ProfileImage(
            modifier = Modifier.padding(smallPadding),
        )
        Spacer(Modifier.padding(smallPadding))
        ProfileDetails(onEvent)
    }
}

@Composable
fun ProfileDetails(onEvent: (Event) -> Unit) {
    Column {
        Text(
            text = "Brais Fernández Vázquez",
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(Modifier.padding(verySmallPadding))
        Text(stringResource(Res.string.full_stack_developer), style = MaterialTheme.typography.titleMedium)
        Spacer(Modifier.padding(verySmallPadding))
        LocationInfo()
        Spacer(Modifier.padding(verySmallPadding))
        SocialLinks(onEvent)
    }
}

@Composable
fun LocationInfo() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(imageVector = Icons.Default.LocationOn, contentDescription = "Location Icon")
        Spacer(Modifier.padding(verySmallPadding))
        Text("A Coruña")
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun SocialLinks(onEvent: (Event) -> Unit) {
    FlowRow(
        horizontalArrangement = Arrangement.spacedBy(smallPadding),
    ) {
        SocialButton(
            onClick = { onEvent(Event.ClickEmail) },
            icon = Icons.Default.Mail,
            text = "braisfv22@gmail.com"
        )
        SocialButton(
            onClick = { onEvent(Event.ClickCv) },
            icon = Icons.Default.Description,
            text = "CV",
            outlined = true,
        )
        SocialButton(
            onClick = { onEvent(Event.ClickLinkedin) },
            icon = MyIconPack.Linkedin,
            outlined = true,
        )
        SocialButton(
            onClick = { onEvent(Event.ClickGithub) },
            icon = MyIconPack.Github,
            outlined = true,
        )
    }
}

@Composable
fun SocialButton(
    icon: ImageVector,
    onClick: () -> Unit,
    text: String? = null,
    outlined: Boolean = false,
) {
    if (outlined) {
        OutlinedButton(onClick = onClick) {
            SocialContent(icon, text)
        }
    } else {
        Button(onClick = onClick) {
            SocialContent(icon, text)
        }
    }
}

@Composable
fun SocialContent(
    icon: ImageVector,
    text: String? = null,
) {
    Icon(icon, contentDescription = null)
    if (text != null) {
        Spacer(Modifier.padding(verySmallPadding))
        Text(text)
    }
}