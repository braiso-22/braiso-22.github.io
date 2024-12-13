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

public val MyIconPack.Linkedin: ImageVector
    get() {
        if (_linkedin != null) {
            return _linkedin!!
        }
        _linkedin = Builder(name = "Linkedin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.6797f, 1.9219f)
                lineTo(4.3203f, 1.9219f)
                curveTo(2.9961f, 1.9219f, 1.9219f, 2.9961f, 1.9219f, 4.3203f)
                lineTo(1.9219f, 19.6797f)
                curveTo(1.9219f, 21.0039f, 2.9961f, 22.0781f, 4.3203f, 22.0781f)
                lineTo(19.6797f, 22.0781f)
                curveTo(21.0039f, 22.0781f, 22.0781f, 21.0039f, 22.0781f, 19.6797f)
                lineTo(22.0781f, 4.3203f)
                curveTo(22.0781f, 2.9961f, 21.0039f, 1.9219f, 19.6797f, 1.9219f)
                close()
                moveTo(8.1602f, 9.6016f)
                lineTo(8.1602f, 18.7188f)
                lineTo(5.2813f, 18.7188f)
                lineTo(5.2813f, 9.6016f)
                close()
                moveTo(5.2813f, 6.9453f)
                curveTo(5.2813f, 6.2734f, 5.8555f, 5.7617f, 6.7188f, 5.7617f)
                curveTo(7.5859f, 5.7617f, 8.125f, 6.2734f, 8.1602f, 6.9453f)
                curveTo(8.1602f, 7.6172f, 7.6211f, 8.1602f, 6.7188f, 8.1602f)
                curveTo(5.8555f, 8.1602f, 5.2813f, 7.6172f, 5.2813f, 6.9453f)
                close()
                moveTo(18.7188f, 18.7188f)
                lineTo(15.8398f, 18.7188f)
                curveTo(15.8398f, 18.7188f, 15.8398f, 14.2734f, 15.8398f, 13.9219f)
                curveTo(15.8398f, 12.9609f, 15.3594f, 12.0f, 14.1602f, 11.9805f)
                lineTo(14.1211f, 11.9805f)
                curveTo(12.9609f, 11.9805f, 12.4805f, 12.9688f, 12.4805f, 13.9219f)
                curveTo(12.4805f, 14.3555f, 12.4805f, 18.7188f, 12.4805f, 18.7188f)
                lineTo(9.6016f, 18.7188f)
                lineTo(9.6016f, 9.6016f)
                lineTo(12.4805f, 9.6016f)
                lineTo(12.4805f, 10.8281f)
                curveTo(12.4805f, 10.8281f, 13.4063f, 9.6016f, 15.2695f, 9.6016f)
                curveTo(17.1758f, 9.6016f, 18.7188f, 10.9102f, 18.7188f, 13.5664f)
                close()
                moveTo(18.7188f, 18.7188f)
            }
        }
        .build()
        return _linkedin!!
    }

private var _linkedin: ImageVector? = null
