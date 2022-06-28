package gameLoop

class Rectangle(
    override val x1: Int, override val y1: Int, override val x2: Int, override val y2: Int, private val canvas: ICanvas
) : IRectangle, IComponent {
    override fun update() {
        TODO("Not yet implemented")
    }

    override fun render() {
        repeat(x2 - x1) {
            canvas.writeXY(x1 + it, y1, "*")
            canvas.writeXY(x1 + it, y2 - 1, "*")
        }

        repeat(y2 - y1) {
            canvas.writeXY(x1, y1 + it, "*")
            canvas.writeXY(x2, y1 + it, "*")
        }
    }
}