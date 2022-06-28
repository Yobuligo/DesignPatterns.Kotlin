package gameLoop

interface ICoordinateKeyGenerator {
    fun generate(x: Int, y: Int): String
}