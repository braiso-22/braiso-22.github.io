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

public val MyIconPack.Android: ImageVector
    get() {
        if (_android != null) {
            return _android!!
        }
        _android = Builder(name = "Android", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 1.0f)
                curveTo(7.372f, 1.0f, 7.244f, 1.049f, 7.1465f, 1.1465f)
                curveTo(6.9515f, 1.3415f, 6.9515f, 1.6585f, 7.1465f, 1.8535f)
                lineTo(8.457f, 3.1641f)
                curveTo(6.9691f, 4.2559f, 6.0f, 6.0128f, 6.0f, 8.0f)
                lineTo(18.0f, 8.0f)
                curveTo(18.0f, 6.0128f, 17.0309f, 4.2559f, 15.543f, 3.1641f)
                lineTo(16.8535f, 1.8535f)
                curveTo(17.0485f, 1.6575f, 17.0485f, 1.3425f, 16.8535f, 1.1465f)
                curveTo(16.6585f, 0.9515f, 16.3415f, 0.9515f, 16.1465f, 1.1465f)
                lineTo(14.6641f, 2.6289f)
                curveTo(13.8606f, 2.2296f, 12.9582f, 2.0f, 12.0f, 2.0f)
                curveTo(11.0418f, 2.0f, 10.1394f, 2.2296f, 9.3359f, 2.6289f)
                lineTo(7.8535f, 1.1465f)
                curveTo(7.756f, 1.049f, 7.628f, 1.0f, 7.5f, 1.0f)
                close()
                moveTo(9.0f, 5.0f)
                lineTo(10.0f, 5.0f)
                lineTo(10.0f, 6.0f)
                lineTo(9.0f, 6.0f)
                lineTo(9.0f, 5.0f)
                close()
                moveTo(14.0f, 5.0f)
                lineTo(15.0f, 5.0f)
                lineTo(15.0f, 6.0f)
                lineTo(14.0f, 6.0f)
                lineTo(14.0f, 5.0f)
                close()
                moveTo(4.0f, 9.0f)
                curveTo(3.448f, 9.0f, 3.0f, 9.448f, 3.0f, 10.0f)
                lineTo(3.0f, 16.0f)
                curveTo(3.0f, 16.552f, 3.448f, 17.0f, 4.0f, 17.0f)
                curveTo(4.552f, 17.0f, 5.0f, 16.552f, 5.0f, 16.0f)
                lineTo(5.0f, 10.0f)
                curveTo(5.0f, 9.448f, 4.552f, 9.0f, 4.0f, 9.0f)
                close()
                moveTo(6.0f, 9.0f)
                lineTo(6.0f, 17.0f)
                curveTo(6.0f, 17.552f, 6.448f, 18.0f, 7.0f, 18.0f)
                lineTo(8.0f, 18.0f)
                lineTo(8.0f, 21.5f)
                curveTo(8.0f, 22.328f, 8.672f, 23.0f, 9.5f, 23.0f)
                curveTo(10.328f, 23.0f, 11.0f, 22.328f, 11.0f, 21.5f)
                lineTo(11.0f, 18.0f)
                lineTo(13.0f, 18.0f)
                lineTo(13.0f, 21.5f)
                curveTo(13.0f, 22.328f, 13.672f, 23.0f, 14.5f, 23.0f)
                curveTo(15.328f, 23.0f, 16.0f, 22.328f, 16.0f, 21.5f)
                lineTo(16.0f, 18.0f)
                lineTo(17.0f, 18.0f)
                curveTo(17.552f, 18.0f, 18.0f, 17.552f, 18.0f, 17.0f)
                lineTo(18.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                close()
                moveTo(20.0f, 9.0f)
                curveTo(19.448f, 9.0f, 19.0f, 9.448f, 19.0f, 10.0f)
                lineTo(19.0f, 16.0f)
                curveTo(19.0f, 16.552f, 19.448f, 17.0f, 20.0f, 17.0f)
                curveTo(20.552f, 17.0f, 21.0f, 16.552f, 21.0f, 16.0f)
                lineTo(21.0f, 10.0f)
                curveTo(21.0f, 9.448f, 20.552f, 9.0f, 20.0f, 9.0f)
                close()
            }
        }
        .build()
        return _android!!
    }

private var _android: ImageVector? = null
