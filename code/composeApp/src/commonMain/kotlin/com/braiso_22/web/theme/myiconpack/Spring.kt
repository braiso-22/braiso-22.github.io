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

public val MyIconPack.Spring: ImageVector
    get() {
        if (_spring != null) {
            return _spring!!
        }
        _spring = Builder(name = "Spring", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.8242f, 1.2617f)
                curveTo(21.4883f, 2.0664f, 21.0586f, 2.832f, 20.543f, 3.5352f)
                curveTo(17.4805f, 0.4609f, 12.9961f, -0.7266f, 8.8125f, 0.4258f)
                curveTo(4.6289f, 1.582f, 1.3906f, 4.9023f, 0.3359f, 9.1133f)
                curveTo(-0.7148f, 13.3281f, 0.5859f, 17.7773f, 3.7383f, 20.7656f)
                lineTo(4.1797f, 21.1563f)
                curveTo(7.6406f, 24.0742f, 12.4453f, 24.8008f, 16.6133f, 23.0391f)
                curveTo(20.7852f, 21.2773f, 23.6133f, 17.3281f, 23.9336f, 12.8125f)
                curveTo(24.2617f, 9.75f, 23.3633f, 5.8711f, 21.8242f, 1.2617f)
                close()
                moveTo(5.4492f, 20.8359f)
                curveTo(5.0898f, 21.2773f, 4.4414f, 21.3438f, 4.0f, 20.9883f)
                curveTo(3.5586f, 20.6289f, 3.4922f, 19.9805f, 3.8477f, 19.5391f)
                curveTo(4.207f, 19.0977f, 4.8555f, 19.0313f, 5.2969f, 19.3867f)
                curveTo(5.7383f, 19.7461f, 5.8047f, 20.3945f, 5.4492f, 20.8359f)
                close()
                moveTo(21.7773f, 17.2305f)
                curveTo(18.8047f, 21.1875f, 12.4648f, 19.8516f, 8.3984f, 20.043f)
                curveTo(8.3984f, 20.043f, 7.6797f, 20.0859f, 6.9531f, 20.2031f)
                curveTo(6.9531f, 20.2031f, 7.2266f, 20.0898f, 7.5742f, 19.957f)
                curveTo(10.4297f, 18.9609f, 11.7813f, 18.7695f, 13.5156f, 17.8789f)
                curveTo(16.7813f, 16.2188f, 20.0117f, 12.582f, 20.6836f, 8.8047f)
                curveTo(19.4414f, 12.4414f, 15.668f, 15.5664f, 12.2344f, 16.8359f)
                curveTo(9.8789f, 17.7031f, 5.6289f, 18.5469f, 5.6289f, 18.5469f)
                lineTo(5.457f, 18.457f)
                curveTo(2.5625f, 17.0508f, 2.4766f, 10.7852f, 7.7344f, 8.7656f)
                curveTo(10.0391f, 7.875f, 12.2422f, 8.3633f, 14.7305f, 7.7695f)
                curveTo(17.3867f, 7.1406f, 20.4609f, 5.1484f, 21.7109f, 2.5508f)
                curveTo(23.1094f, 6.707f, 24.7969f, 13.2109f, 21.7734f, 17.2344f)
                close()
                moveTo(21.7773f, 17.2305f)
            }
        }
        .build()
        return _spring!!
    }

private var _spring: ImageVector? = null
