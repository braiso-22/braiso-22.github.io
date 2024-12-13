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

public val MyIconPack.Python: ImageVector
    get() {
        if (_python != null) {
            return _python!!
        }
        _python = Builder(name = "Python", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                curveTo(10.791f, 3.0f, 9.0f, 4.791f, 9.0f, 7.0f)
                lineTo(9.0f, 8.0f)
                lineTo(14.0f, 8.0f)
                curveTo(14.552f, 8.0f, 15.0f, 8.448f, 15.0f, 9.0f)
                curveTo(15.0f, 9.552f, 14.552f, 10.0f, 14.0f, 10.0f)
                lineTo(9.0f, 10.0f)
                lineTo(8.0f, 10.0f)
                lineTo(7.0f, 10.0f)
                curveTo(4.791f, 10.0f, 3.0f, 11.791f, 3.0f, 14.0f)
                lineTo(3.0f, 18.0f)
                curveTo(3.0f, 20.209f, 4.791f, 22.0f, 7.0f, 22.0f)
                lineTo(8.0f, 22.0f)
                lineTo(8.0f, 17.0f)
                curveTo(8.0f, 15.346f, 9.346f, 14.0f, 11.0f, 14.0f)
                lineTo(19.0f, 14.0f)
                curveTo(19.552f, 14.0f, 20.0f, 13.552f, 20.0f, 13.0f)
                lineTo(20.0f, 7.0f)
                curveTo(20.0f, 4.791f, 18.209f, 3.0f, 16.0f, 3.0f)
                lineTo(13.0f, 3.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveTo(12.552f, 5.0f, 13.0f, 5.448f, 13.0f, 6.0f)
                curveTo(13.0f, 6.552f, 12.552f, 7.0f, 12.0f, 7.0f)
                curveTo(11.448f, 7.0f, 11.0f, 6.552f, 11.0f, 6.0f)
                curveTo(11.0f, 5.448f, 11.448f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(22.0f, 8.0f)
                lineTo(22.0f, 13.0f)
                curveTo(22.0f, 14.654f, 20.654f, 16.0f, 19.0f, 16.0f)
                lineTo(11.0f, 16.0f)
                curveTo(10.448f, 16.0f, 10.0f, 16.448f, 10.0f, 17.0f)
                lineTo(10.0f, 23.0f)
                curveTo(10.0f, 25.209f, 11.791f, 27.0f, 14.0f, 27.0f)
                lineTo(17.0f, 27.0f)
                curveTo(19.209f, 27.0f, 21.0f, 25.209f, 21.0f, 23.0f)
                lineTo(21.0f, 22.0f)
                lineTo(16.0f, 22.0f)
                curveTo(15.448f, 22.0f, 15.0f, 21.552f, 15.0f, 21.0f)
                curveTo(15.0f, 20.448f, 15.448f, 20.0f, 16.0f, 20.0f)
                lineTo(21.0f, 20.0f)
                lineTo(22.0f, 20.0f)
                lineTo(23.0f, 20.0f)
                curveTo(25.209f, 20.0f, 27.0f, 18.209f, 27.0f, 16.0f)
                lineTo(27.0f, 12.0f)
                curveTo(27.0f, 9.791f, 25.209f, 8.0f, 23.0f, 8.0f)
                lineTo(22.0f, 8.0f)
                close()
                moveTo(18.0f, 23.0f)
                curveTo(18.552f, 23.0f, 19.0f, 23.448f, 19.0f, 24.0f)
                curveTo(19.0f, 24.552f, 18.552f, 25.0f, 18.0f, 25.0f)
                curveTo(17.448f, 25.0f, 17.0f, 24.552f, 17.0f, 24.0f)
                curveTo(17.0f, 23.448f, 17.448f, 23.0f, 18.0f, 23.0f)
                close()
            }
        }
        .build()
        return _python!!
    }

private var _python: ImageVector? = null
