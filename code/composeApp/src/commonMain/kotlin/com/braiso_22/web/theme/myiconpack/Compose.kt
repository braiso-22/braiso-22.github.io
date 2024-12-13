package myiconpack

import MyIconPack
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

public val MyIconPack.Compose: ImageVector
    get() {
        if (_compose != null) {
            return _compose!!
        }
        _compose = Builder(name = "Compose", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 1.64f)
                curveToRelative(-0.46f, 0.17f, -7.95f, 4.5f, -8.39f, 4.84f)
                curveToRelative(-0.76f, 0.61f, -0.8f, 0.56f, 1.18f, 1.65f)
                curveToRelative(0.99f, 0.53f, 1.83f, 0.97f, 1.88f, 0.97f)
                curveToRelative(0.06f, -0.0f, 0.18f, -0.09f, 0.28f, -0.2f)
                curveToRelative(0.1f, -0.11f, 1.33f, -0.86f, 2.74f, -1.68f)
                curveToRelative(2.39f, -1.37f, 2.59f, -1.47f, 3.06f, -1.47f)
                curveToRelative(0.46f, 0.01f, 0.71f, 0.13f, 2.9f, 1.39f)
                curveToRelative(1.32f, 0.76f, 2.54f, 1.49f, 2.72f, 1.62f)
                curveToRelative(0.17f, 0.13f, 0.34f, 0.24f, 0.37f, 0.24f)
                curveToRelative(0.11f, -0.0f, 3.56f, -2.03f, 3.56f, -2.1f)
                curveToRelative(0.0f, -0.03f, -0.12f, -0.18f, -0.27f, -0.32f)
                curveToRelative(-0.42f, -0.38f, -8.28f, -4.89f, -8.71f, -4.99f)
                curveToRelative(-0.5f, -0.12f, -0.9f, -0.1f, -1.32f, 0.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.55f, 6.34f)
                curveToRelative(-1.09f, 0.56f, -4.89f, 2.82f, -4.92f, 2.93f)
                curveToRelative(-0.02f, 0.06f, 0.34f, 0.32f, 0.8f, 0.57f)
                lineToRelative(0.84f, 0.46f)
                lineToRelative(1.37f, -0.8f)
                curveToRelative(2.14f, -1.26f, 2.48f, -1.42f, 2.75f, -1.35f)
                curveToRelative(0.14f, 0.04f, 0.98f, 0.49f, 1.88f, 1.01f)
                curveToRelative(0.9f, 0.52f, 1.7f, 0.97f, 1.77f, 1.0f)
                curveToRelative(0.14f, 0.05f, 1.76f, -0.82f, 1.76f, -0.94f)
                curveToRelative(0.0f, -0.09f, 0.04f, -0.06f, -2.73f, -1.67f)
                curveToRelative(-1.3f, -0.75f, -2.51f, -1.38f, -2.69f, -1.41f)
                curveToRelative(-0.23f, -0.04f, -0.48f, 0.02f, -0.83f, 0.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.22f, 8.23f)
                lineToRelative(-1.74f, 1.02f)
                lineToRelative(0.01f, 3.32f)
                curveToRelative(0.02f, 3.51f, 0.0f, 3.63f, -0.45f, 4.05f)
                curveToRelative(-0.28f, 0.25f, -5.03f, 2.97f, -5.3f, 3.04f)
                lineToRelative(-0.24f, 0.06f)
                lineToRelative(0.0f, 2.14f)
                lineToRelative(0.0f, 2.13f)
                lineToRelative(0.43f, -0.13f)
                curveToRelative(0.51f, -0.15f, 8.2f, -4.57f, 8.61f, -4.94f)
                curveToRelative(0.16f, -0.15f, 0.39f, -0.5f, 0.52f, -0.77f)
                lineToRelative(0.24f, -0.5f)
                lineToRelative(0.0f, -4.88f)
                curveToRelative(0.0f, -4.03f, -0.03f, -4.94f, -0.14f, -5.22f)
                curveToRelative(-0.08f, -0.19f, -0.16f, -0.35f, -0.18f, -0.34f)
                curveToRelative(-0.02f, -0.0f, -0.81f, 0.46f, -1.76f, 1.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.33f, 7.53f)
                curveToRelative(-0.14f, 0.21f, -0.15f, 9.87f, -0.02f, 10.35f)
                curveToRelative(0.23f, 0.84f, 0.65f, 1.15f, 4.84f, 3.55f)
                curveToRelative(4.54f, 2.61f, 4.2f, 2.43f, 4.68f, 2.51f)
                lineToRelative(0.37f, 0.07f)
                lineToRelative(0.0f, -2.1f)
                lineToRelative(0.0f, -2.11f)
                lineToRelative(-0.27f, -0.06f)
                curveToRelative(-0.45f, -0.1f, -5.32f, -2.95f, -5.58f, -3.26f)
                curveToRelative(-0.42f, -0.5f, -0.47f, -0.91f, -0.44f, -4.11f)
                lineToRelative(0.02f, -3.0f)
                lineToRelative(-1.76f, -0.97f)
                curveToRelative(-1.21f, -0.67f, -1.79f, -0.95f, -1.84f, -0.87f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.16f, 10.0f)
                lineToRelative(-0.79f, 0.47f)
                lineToRelative(0.02f, 2.14f)
                curveToRelative(0.01f, 1.95f, 0.0f, 2.17f, -0.17f, 2.44f)
                curveToRelative(-0.13f, 0.21f, -0.73f, 0.61f, -1.95f, 1.3f)
                lineToRelative(-1.76f, 1.0f)
                lineToRelative(-0.01f, 0.97f)
                curveToRelative(0.0f, 0.61f, 0.04f, 0.98f, 0.1f, 0.98f)
                curveToRelative(0.23f, -0.0f, 4.87f, -2.75f, 5.18f, -3.06f)
                lineToRelative(0.32f, -0.34f)
                lineToRelative(0.0f, -3.14f)
                curveToRelative(0.0f, -1.73f, -0.03f, -3.17f, -0.07f, -3.19f)
                curveToRelative(-0.05f, -0.02f, -0.44f, 0.17f, -0.87f, 0.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.36f, 9.84f)
                curveToRelative(-0.03f, 0.11f, -0.06f, 1.45f, -0.06f, 2.96f)
                curveToRelative(0.0f, 2.45f, 0.02f, 2.79f, 0.19f, 3.15f)
                curveToRelative(0.17f, 0.37f, 0.37f, 0.51f, 2.72f, 1.86f)
                curveToRelative(1.4f, 0.81f, 2.64f, 1.49f, 2.77f, 1.52f)
                curveToRelative(0.22f, 0.05f, 0.22f, 0.04f, 0.22f, -0.94f)
                curveToRelative(0.0f, -0.86f, -0.02f, -1.0f, -0.17f, -1.06f)
                curveToRelative(-0.1f, -0.03f, -0.94f, -0.49f, -1.87f, -1.02f)
                curveToRelative(-1.16f, -0.66f, -1.74f, -1.05f, -1.87f, -1.26f)
                curveToRelative(-0.17f, -0.27f, -0.19f, -0.51f, -0.18f, -2.39f)
                lineToRelative(0.01f, -2.09f)
                lineToRelative(-0.85f, -0.47f)
                curveToRelative(-0.82f, -0.46f, -0.86f, -0.47f, -0.91f, -0.26f)
                close()
            }
        }
        .build()
        return _compose!!
    }

private var _compose: ImageVector? = null
