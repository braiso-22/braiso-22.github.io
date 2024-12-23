package com.braiso_22.web.main_page.profile_info

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import braiso_22.composeapp.generated.resources.Res
import braiso_22.composeapp.generated.resources.profile_picture
import com.braiso_22.web.main_page.common.ImageWithBorder
import org.jetbrains.compose.resources.painterResource

@Composable
fun ProfileImage(
    size: Int = 128,
    modifier: Modifier = Modifier,
) {
    ImageWithBorder(
        painter = painterResource(Res.drawable.profile_picture),
        contentDescription = "braiso_22 profile picture",
        size = size,
        modifier = modifier
    )
}