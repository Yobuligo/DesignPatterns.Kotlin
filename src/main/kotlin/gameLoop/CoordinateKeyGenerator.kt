package gameLoop

object CoordinateKeyGenerator : ICoordinateKeyGenerator {
    override fun generate(x: Int, y: Int): String {
        return "$x,$y"
    }
}