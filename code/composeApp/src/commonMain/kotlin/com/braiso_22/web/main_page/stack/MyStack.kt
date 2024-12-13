package com.braiso_22.web.main_page.stack

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import braiso_22.composeapp.generated.resources.Res
import braiso_22.composeapp.generated.resources.*
import com.braiso_22.web.theme.smallPadding
import com.braiso_22.web.theme.verySmallPadding
import org.jetbrains.compose.resources.stringResource


@Composable
fun MyStack(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Spacer(modifier = Modifier.padding(verySmallPadding))

        Text(stringResource(Res.string.my_stack), style = MaterialTheme.typography.titleLarge)

        Spacer(modifier = Modifier.padding(verySmallPadding))

        MyStackSection(title = stringResource(Res.string.mobile), items = mobileTecnologies)
        MyStackSection(title = "Backend", items = backendTecnologies)
        MyStackSection(title = "Frontend", items = webTecnologies)
        MyStackSection(title = stringResource(Res.string.other), items = otherTecnologies)
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun MyStackSection(title: String, items: List<Technology>) {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(title, style = MaterialTheme.typography.titleMedium)
        Spacer(modifier = Modifier.padding(smallPadding))
        FlowRow(horizontalArrangement = Arrangement.spacedBy(smallPadding)) {
            items.forEach {
                AssistChip(
                    onClick = {},
                    label = { Text(it.name) },
                    leadingIcon = { Icon(it.icon, contentDescription = null) }
                )
            }
        }
    }
}
