package myiconpack

import MyIconPack
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val MyIconPack.Kotlin: ImageVector
    get() {
        if (_kotlin != null) {
            return _kotlin!!
        }
        _kotlin = Builder(name = "Kotlin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 50.0f, viewportHeight = 50.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(46.0f, 46.0f)
                lineTo(6.0f, 46.0f)
                lineTo(26.0f, 26.0f)
                close()
                moveTo(45.0f, 4.0f)
                lineTo(4.0f, 45.17f)
                lineTo(4.0f, 25.83f)
                lineTo(25.83f, 4.0f)
                close()
                moveTo(23.0f, 4.0f)
                lineTo(4.0f, 23.0f)
                lineTo(4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _kotlin!!
    }

private var _kotlin: ImageVector? = null
