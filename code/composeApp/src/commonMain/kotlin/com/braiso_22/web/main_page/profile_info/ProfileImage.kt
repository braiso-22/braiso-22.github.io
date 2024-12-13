package com.braiso_22.web.main_page.profile_info

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import braiso_22.composeapp.generated.resources.Res
import braiso_22.composeapp.generated.resources.profile_picture
import com.braiso_22.web.theme.verySmallPadding
import org.jetbrains.compose.resources.painterResource

@Composable
fun ProfileImage(
    size: Int = 128,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.clip(shape = CircleShape).size(size.dp).background(
                color = MaterialTheme.colorScheme.primary
            ),
        ) {
            Image(
                painter = painterResource(Res.drawable.profile_picture),
                contentDescription = "braiso_22 profile picture",
                contentScale = ContentScale.Crop,
                modifier = Modifier.padding(verySmallPadding).clip(
                    shape = CircleShape
                )
            )
        }
    }
}