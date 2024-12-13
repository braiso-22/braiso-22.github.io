import androidx.compose.ui.graphics.vector.ImageVector
import myiconpack.AllIcons
import myiconpack.Android
import myiconpack.Apple
import myiconpack.Compose
import myiconpack.Csharp
import myiconpack.Docker
import myiconpack.Github
import myiconpack.Kotlin
import myiconpack.Ktor
import myiconpack.Linkedin
import myiconpack.Myiconpack
import myiconpack.Python
import myiconpack.React
import myiconpack.Selenium
import myiconpack.Spring
import myiconpack.Sql
import kotlin.collections.List as ____KtList

public object MyIconPack

private var __AllIcons: ____KtList<ImageVector>? = null

public val MyIconPack.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Myiconpack.AllIcons + listOf(Spring, Android, Github, Sql, Compose, Python, Docker,
        Ktor, Kotlin, Linkedin, React, Selenium, Csharp, Apple)
    return __AllIcons!!
  }
