package gameLoop

interface ICoordinateSystemInitializer {
    fun initialize(width: Int, height: Int): ICoordinateSystem
}