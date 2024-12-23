package com.braiso_22.web.main_page.experience

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.braiso_22.web.main_page.common.ImageWithBorder

@Composable
fun ExperienceItem(
    companyName: String,
    jobPosition: String,
    companyLogo: Painter,
    workedYears: String,
    description: String,
    tasks: List<String> = emptyList(),
    modifier: Modifier = Modifier,
) {
    Row(modifier = modifier) {
        ListItem(
            overlineContent = {
                Text(
                    text = companyName,
                    style = MaterialTheme.typography.labelMedium,
                )
            },
            headlineContent = {
                Text(
                    text = jobPosition,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            },
            supportingContent = {
                JobDescription(
                    description = description,
                    tasks = tasks,
                )
            },
            trailingContent = {
                AssistChip(
                    onClick = {},
                    label = {
                        Text(text = workedYears,modifier = Modifier.fillMaxWidth().wrapContentWidth())
                    },
                    modifier = Modifier.width(130.dp)
                )
            },
            leadingContent = {
                ImageWithBorder(
                    painter = companyLogo,
                    contentDescription = "$companyName logo",
                    size = 64,
                )
            },
            colors = ListItemDefaults.colors(
                containerColor = MaterialTheme.colorScheme.surfaceContainerHighest,
            ),
            modifier = modifier
        )
    }
}
