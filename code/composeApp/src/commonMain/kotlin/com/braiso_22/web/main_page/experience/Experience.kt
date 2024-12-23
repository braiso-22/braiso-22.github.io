package com.braiso_22.web.main_page.experience

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import braiso_22.composeapp.generated.resources.Res
import braiso_22.composeapp.generated.resources.experience
import com.braiso_22.web.theme.mediumPadding
import org.jetbrains.compose.resources.stringResource

@Composable
fun Experience(
    jobs: List<Job>,
    isCompact: Boolean,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
    ) {
        Text(
            stringResource(Res.string.experience),
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(mediumPadding)
        )
        for (job in jobs) {
            if (isCompact) {
                CompactExperienceItem(
                    companyName = job.companyName,
                    jobPosition = job.jobPosition,
                    companyLogo = job.companyLogo,
                    workedYears = job.workedYears,
                    tasks = job.companyTasks,
                    description = job.description,
                )

            } else {
                ExperienceItem(
                    companyName = job.companyName,
                    jobPosition = job.jobPosition,
                    companyLogo = job.companyLogo,
                    workedYears = job.workedYears,
                    tasks = job.companyTasks,
                    description = job.description,
                )
            }
        }
    }
}

