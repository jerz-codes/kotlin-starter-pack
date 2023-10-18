package jerz.codes.wprawki

import jerz.codes.pixelart.pixelArt
import java.awt.Color
import java.awt.event.KeyEvent
import kotlin.system.measureTimeMillis

const val W = 320
const val H = 200

fun main() = pixelArt(
    widthInTiles = W,
    heightInTiles = H,
    tileSize = 4,
) {

    val palette = List(720) { Color.getHSBColor((it) % 720 / 720f, 1f, 1f) }

    var frames = 0

    measureTimeMillis {
        while (true) {
            frames++

            drawScreen {
                clearScreen(Color.BLACK)
                for (y in 0 until H) {
                    for (x in 0 until W) {
                        putPixel(x, y, palette[(x + y + frames) % 720])
                    }
                }
            }

            val keys = getPressedKeys()
            if (KeyEvent.VK_ESCAPE in keys) break
        }
    }.also { println("Drawing $frames took ${it}ms (${(frames.toFloat() / (it / 1000)).toInt()}FPS)") }
}