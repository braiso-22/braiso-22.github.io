package com.braiso_22.web.main_page.experience

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.painter.Painter

@Immutable
data class Job(
    val companyName: String,
    val companyLogo: Painter,
    val jobPosition: String,
    val workedYears: String,
    val companyTasks: List<String> = emptyList(),
    val description: String,
)
