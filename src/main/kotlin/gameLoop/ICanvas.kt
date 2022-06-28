package gameLoop

interface ICanvas {
    fun clear()
    fun writeXY(x: Int, y: Int, text: String)
}