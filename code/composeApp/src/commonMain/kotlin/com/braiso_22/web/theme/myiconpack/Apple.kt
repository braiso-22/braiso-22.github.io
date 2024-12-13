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

public val MyIconPack.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(name = "Apple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.565f, 9.785f)
                curveToRelative(-0.123f, 0.077f, -3.051f, 1.702f, -3.051f, 5.305f)
                curveToRelative(0.138f, 4.109f, 3.695f, 5.55f, 3.756f, 5.55f)
                curveToRelative(-0.061f, 0.077f, -0.537f, 1.963f, -1.947f, 3.94f)
                curveTo(23.204f, 26.283f, 21.962f, 28.0f, 20.076f, 28.0f)
                curveToRelative(-1.794f, 0.0f, -2.438f, -1.135f, -4.508f, -1.135f)
                curveToRelative(-2.223f, 0.0f, -2.852f, 1.135f, -4.554f, 1.135f)
                curveToRelative(-1.886f, 0.0f, -3.22f, -1.809f, -4.4f, -3.496f)
                curveToRelative(-1.533f, -2.208f, -2.836f, -5.673f, -2.882f, -9.0f)
                curveToRelative(-0.031f, -1.763f, 0.307f, -3.496f, 1.165f, -4.968f)
                curveToRelative(1.211f, -2.055f, 3.373f, -3.45f, 5.734f, -3.496f)
                curveToRelative(1.809f, -0.061f, 3.419f, 1.242f, 4.523f, 1.242f)
                curveToRelative(1.058f, 0.0f, 3.036f, -1.242f, 5.274f, -1.242f)
                curveTo(21.394f, 7.041f, 23.97f, 7.332f, 25.565f, 9.785f)
                close()
                moveTo(15.001f, 6.688f)
                curveToRelative(-0.322f, -1.61f, 0.567f, -3.22f, 1.395f, -4.247f)
                curveToRelative(1.058f, -1.242f, 2.729f, -2.085f, 4.17f, -2.085f)
                curveToRelative(0.092f, 1.61f, -0.491f, 3.189f, -1.533f, 4.339f)
                curveTo(18.098f, 5.937f, 16.488f, 6.872f, 15.001f, 6.688f)
                close()
            }
        }
        .build()
        return _apple!!
    }

private var _apple: ImageVector? = null
