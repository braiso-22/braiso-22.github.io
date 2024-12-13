package myiconpack

import MyIconPack
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val MyIconPack.Ktor: ImageVector
    get() {
        if (_ktor != null) {
            return _ktor!!
        }
        _ktor = Builder(name = "Ktor", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.296f to Color(0xFF00AFFF), 0.694f to Color(0xFF5282FF),
                    1.0f to Color(0xFF945DFF), start = Offset(30.349089f,30.459465f), end =
                    Offset(63.647785f,63.87927f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.457f, 47.543f)
                lineTo(47.543f, 14.629f)
                lineTo(14.629f, 47.543f)
                lineToRelative(32.914f, 32.914f)
                close()
                moveTo(80.457f, 47.543f)
            }
            path(fill = linearGradient(0.108f to Color(0xFFC757BC), 0.173f to Color(0xFFCD5CA9),
                    0.492f to Color(0xFFE8744F), 0.716f to Color(0xFFF88316), 0.823f to
                    Color(0xFFFF8900), start = Offset(64.67601f,64.91123f), end =
                    Offset(96.157974f,96.50769f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(47.543f, 80.457f)
                lineToRelative(32.914f, 32.914f)
                lineToRelative(32.914f, -32.914f)
                lineToRelative(-32.914f, -32.914f)
                close()
                moveTo(47.543f, 80.457f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.457f, 47.543f)
                lineTo(47.543f, 47.543f)
                verticalLineToRelative(32.914f)
                horizontalLineToRelative(32.914f)
                close()
                moveTo(80.457f, 47.543f)
            }
        }
        .build()
        return _ktor!!
    }

private var _ktor: ImageVector? = null
