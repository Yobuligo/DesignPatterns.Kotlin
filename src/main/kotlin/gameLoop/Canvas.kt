package gameLoop

class Canvas : ICanvas, IComponent {
    private val width = 80
    private val height = 21
    private val coordinateSystem = CoordinateSystemInitializer().initialize(width, height)

    override fun clear() {
        repeat(height) {
            println("")
        }
    }

    override fun writeXY(x: Int, y: Int, text: String) {
        repeat(text.length){
            coordinateSystem.find(x + it - 1, y).char = text[it]
        }

    }

    override fun update() {
        TODO("Not yet implemented")
    }

    override fun render() {
        repeat(height) {
            println(buildRow(it))
        }
    }

    private fun buildRow(row: Int): String {
        var content: String = ""
        repeat(width) {
            val char = coordinateSystem.find(it, row).char
            content += char
        }
        return content
    }
}