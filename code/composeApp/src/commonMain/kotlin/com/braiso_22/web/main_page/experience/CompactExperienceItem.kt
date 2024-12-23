package com.braiso_22.web.main_page.experience

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.FormatListBulleted
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.FormatListBulleted
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import braiso_22.composeapp.generated.resources.Res
import com.braiso_22.web.main_page.common.ImageWithBorder
import com.braiso_22.web.theme.smallPadding
import com.braiso_22.web.theme.verySmallPadding
import org.jetbrains.compose.resources.stringResource

@Composable
fun CompactExperienceItem(
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
            headlineContent = {
                Row(
                    verticalAlignment = Alignment.Top,
                ) {
                    ImageWithBorder(
                        painter = companyLogo,
                        contentDescription = "$companyName logo",
                        size = 64,
                    )
                    Spacer(modifier = Modifier.padding(smallPadding))
                    Row(
                        verticalAlignment = Alignment.Top,
                    ) {
                        Column(
                            modifier = Modifier.weight(0.5f)
                        ) {
                            Text(
                                text = companyName,
                                style = MaterialTheme.typography.labelMedium,
                            )
                            Spacer(modifier = Modifier.padding(vertical = verySmallPadding))
                            Text(
                                text = jobPosition,
                            )
                        }
                        Spacer(modifier = Modifier.padding(smallPadding))
                        AssistChip(
                            onClick = {},
                            label = {
                                Text(
                                    text = workedYears,
                                    modifier = Modifier.fillMaxWidth().wrapContentWidth()
                                )
                            },
                            modifier = Modifier.width(130.dp)
                        )
                    }
                }
            },
            supportingContent = {
                JobDescription(
                    description = description,
                    tasks = tasks,
                    modifier = Modifier.padding(smallPadding)
                )
            },
            colors = ListItemDefaults.colors(
                containerColor = MaterialTheme.colorScheme.surfaceContainerHighest,
            ),
            modifier = modifier
        )
    }
}