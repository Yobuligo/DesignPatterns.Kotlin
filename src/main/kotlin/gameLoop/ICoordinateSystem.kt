package gameLoop

interface ICoordinateSystem {
    fun find(x: Int, y: Int): ICoordinate
}