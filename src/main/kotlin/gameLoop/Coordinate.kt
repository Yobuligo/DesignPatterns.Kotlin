package gameLoop

class Coordinate(override val x: Int, override val y: Int, override var char: Char) : ICoordinate {
    override val key: String = CoordinateKeyGenerator.generate(x, y)
}