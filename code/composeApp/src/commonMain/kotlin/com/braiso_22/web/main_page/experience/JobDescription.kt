package com.braiso_22.web.main_page.experience

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import braiso_22.composeapp.generated.resources.Res
import braiso_22.composeapp.generated.resources.main_tasks
import com.braiso_22.web.theme.smallPadding
import com.braiso_22.web.theme.verySmallPadding
import org.jetbrains.compose.resources.stringResource

@Composable
fun JobDescription(
    description: String,
    tasks: List<String> = emptyList(),
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
    ) {
        Text(description)
        Spacer(modifier = Modifier.padding(smallPadding))
        if (tasks.isNotEmpty()) {
            Text(stringResource(Res.string.main_tasks))
        }
        tasks.forEach { task ->
            Row(
                verticalAlignment = Alignment.Top,
                modifier = Modifier.padding(vertical = verySmallPadding)
            ) {
                Icon(Icons.Default.ChevronRight, null)
                Spacer(modifier = Modifier.padding(verySmallPadding))
                Text(text = task)
            }
        }
    }
}