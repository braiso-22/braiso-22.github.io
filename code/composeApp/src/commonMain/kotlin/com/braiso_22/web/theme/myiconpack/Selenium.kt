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

public val MyIconPack.Selenium: ImageVector
    get() {
        if (_selenium != null) {
            return _selenium!!
        }
        _selenium = Builder(name = "Selenium", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                curveTo(4.895f, 4.0f, 4.0f, 4.895f, 4.0f, 6.0f)
                lineTo(4.0f, 24.0f)
                curveTo(4.0f, 25.105f, 4.895f, 26.0f, 6.0f, 26.0f)
                lineTo(24.0f, 26.0f)
                curveTo(25.105f, 26.0f, 26.0f, 25.105f, 26.0f, 24.0f)
                lineTo(26.0f, 6.1211f)
                lineTo(18.5f, 13.6211f)
                lineTo(13.4395f, 8.5605f)
                lineTo(15.5605f, 6.4395f)
                lineTo(18.5f, 9.3789f)
                lineTo(23.8789f, 4.0f)
                lineTo(6.0f, 4.0f)
                close()
                moveTo(9.9902f, 14.8809f)
                curveTo(11.8212f, 14.8809f, 13.0881f, 15.8714f, 13.1211f, 17.3184f)
                lineTo(11.2852f, 17.3184f)
                curveTo(11.2422f, 16.7654f, 10.7166f, 16.3809f, 10.0176f, 16.3809f)
                curveTo(9.3186f, 16.3809f, 8.8594f, 16.7105f, 8.8594f, 17.2305f)
                curveTo(8.8594f, 17.6585f, 9.2063f, 17.9073f, 10.0293f, 18.0703f)
                lineTo(11.0371f, 18.2656f)
                curveTo(12.5811f, 18.5636f, 13.2734f, 19.2639f, 13.2734f, 20.5039f)
                curveTo(13.2744f, 22.1349f, 12.0285f, 23.1191f, 9.9805f, 23.1191f)
                curveTo(8.0035f, 23.1191f, 6.7576f, 22.1876f, 6.7246f, 20.6816f)
                lineTo(8.6211f, 20.6816f)
                curveTo(8.6701f, 21.2506f, 9.2395f, 21.6133f, 10.0625f, 21.6133f)
                curveTo(10.8045f, 21.6133f, 11.3125f, 21.2562f, 11.3125f, 20.7422f)
                curveTo(11.3125f, 20.3092f, 10.9721f, 20.0755f, 10.0781f, 19.8965f)
                lineTo(9.0488f, 19.6914f)
                curveTo(7.6188f, 19.4204f, 6.8828f, 18.6402f, 6.8828f, 17.4102f)
                curveTo(6.8828f, 15.8822f, 8.1052f, 14.8809f, 9.9902f, 14.8809f)
                close()
                moveTo(18.0293f, 16.8926f)
                curveTo(19.8593f, 16.8926f, 20.9258f, 18.0025f, 20.9258f, 19.8965f)
                lineTo(20.9258f, 20.4199f)
                lineTo(16.9316f, 20.4199f)
                lineTo(16.9316f, 20.5156f)
                curveTo(16.9476f, 21.2886f, 17.3894f, 21.7676f, 18.1094f, 21.7676f)
                curveTo(18.6584f, 21.7676f, 19.038f, 21.5648f, 19.166f, 21.2188f)
                lineTo(20.8887f, 21.2188f)
                curveTo(20.6807f, 22.3757f, 19.5926f, 23.1074f, 18.0566f, 23.1074f)
                curveTo(16.1626f, 23.1074f, 15.0742f, 21.9861f, 15.0742f, 20.0391f)
                curveTo(15.0742f, 18.0811f, 16.1893f, 16.8926f, 18.0293f, 16.8926f)
                close()
                moveTo(18.0391f, 18.2324f)
                curveTo(17.4201f, 18.2324f, 16.9894f, 18.6639f, 16.9414f, 19.3359f)
                lineTo(19.0957f, 19.3359f)
                curveTo(19.0637f, 18.6429f, 18.6681f, 18.2324f, 18.0391f, 18.2324f)
                close()
            }
        }
        .build()
        return _selenium!!
    }

private var _selenium: ImageVector? = null
