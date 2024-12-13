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

public val MyIconPack.Github: ImageVector
    get() {
        if (_github != null) {
            return _github!!
        }
        _github = Builder(name = "Github", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9f, 2.1f)
                curveToRelative(-4.6f, 0.5f, -8.3f, 4.2f, -8.8f, 8.7f)
                curveToRelative(-0.5f, 4.7f, 2.2f, 8.9f, 6.3f, 10.5f)
                curveTo(8.7f, 21.4f, 9.0f, 21.2f, 9.0f, 20.8f)
                verticalLineToRelative(-1.6f)
                curveToRelative(0.0f, 0.0f, -0.4f, 0.1f, -0.9f, 0.1f)
                curveToRelative(-1.4f, 0.0f, -2.0f, -1.2f, -2.1f, -1.9f)
                curveToRelative(-0.1f, -0.4f, -0.3f, -0.7f, -0.6f, -1.0f)
                curveTo(5.1f, 16.3f, 5.0f, 16.3f, 5.0f, 16.2f)
                curveTo(5.0f, 16.0f, 5.3f, 16.0f, 5.4f, 16.0f)
                curveToRelative(0.6f, 0.0f, 1.1f, 0.7f, 1.3f, 1.0f)
                curveToRelative(0.5f, 0.8f, 1.1f, 1.0f, 1.4f, 1.0f)
                curveToRelative(0.4f, 0.0f, 0.7f, -0.1f, 0.9f, -0.2f)
                curveToRelative(0.1f, -0.7f, 0.4f, -1.4f, 1.0f, -1.8f)
                curveToRelative(-2.3f, -0.5f, -4.0f, -1.8f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.1f, 0.5f, -2.2f, 1.2f, -3.0f)
                curveTo(7.1f, 8.8f, 7.0f, 8.3f, 7.0f, 7.6f)
                curveTo(7.0f, 7.2f, 7.0f, 6.6f, 7.3f, 6.0f)
                curveToRelative(0.0f, 0.0f, 1.4f, 0.0f, 2.8f, 1.3f)
                curveTo(10.6f, 7.1f, 11.3f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveToRelative(1.4f, 0.1f, 2.0f, 0.3f)
                curveTo(15.3f, 6.0f, 16.8f, 6.0f, 16.8f, 6.0f)
                curveTo(17.0f, 6.6f, 17.0f, 7.2f, 17.0f, 7.6f)
                curveToRelative(0.0f, 0.8f, -0.1f, 1.2f, -0.2f, 1.4f)
                curveToRelative(0.7f, 0.8f, 1.2f, 1.8f, 1.2f, 3.0f)
                curveToRelative(0.0f, 2.2f, -1.7f, 3.5f, -4.0f, 4.0f)
                curveToRelative(0.6f, 0.5f, 1.0f, 1.4f, 1.0f, 2.3f)
                verticalLineToRelative(2.6f)
                curveToRelative(0.0f, 0.3f, 0.3f, 0.6f, 0.7f, 0.5f)
                curveToRelative(3.7f, -1.5f, 6.3f, -5.1f, 6.3f, -9.3f)
                curveTo(22.0f, 6.1f, 16.9f, 1.4f, 10.9f, 2.1f)
                close()
            }
        }
        .build()
        return _github!!
    }

private var _github: ImageVector? = null
