package myiconpack

import MyIconPack
import androidx.compose.ui.graphics.vector.ImageVector
import kotlin.collections.List as ____KtList

public object MyiconpackGroup

public val MyIconPack.Myiconpack: MyiconpackGroup
  get() = MyiconpackGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MyiconpackGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf()
    return __AllIcons!!
  }
