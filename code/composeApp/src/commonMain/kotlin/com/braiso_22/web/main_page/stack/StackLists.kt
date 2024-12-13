package com.braiso_22.web.main_page.stack

import MyIconPack
import androidx.compose.ui.graphics.vector.ImageVector
import myiconpack.*

data class Technology(
    val name: String,
    val icon: ImageVector,
)

val mobileTecnologies = listOf(
    Technology("Android", MyIconPack.Android),
    Technology("KMP", MyIconPack.Kotlin),
    Technology("IOS", MyIconPack.Apple),
)

val backendTecnologies = listOf(
    Technology("Kotlin/Ktor", MyIconPack.Kotlin),
    Technology("C#/.NET Core", MyIconPack.Csharp),
    Technology("Java/Spring", MyIconPack.Spring),
    Technology("SQL", MyIconPack.Sql),
)

val webTecnologies = listOf(
    Technology(
        "React/Typescript",
        MyIconPack.React
    ),
    Technology("CMP/Kotlin", MyIconPack.Kotlin),
)
val otherTecnologies = listOf(
    Technology("AI/Python", MyIconPack.Python),
    Technology("Selenium/Python", MyIconPack.Python),
    Technology("Docker/DockerHub", MyIconPack.Docker),
    Technology("Git/Github", MyIconPack.Github),
)