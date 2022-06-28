package gameLoop

class CoordinateSystemInitializer : ICoordinateSystemInitializer {
    override fun initialize(width: Int, height: Int): ICoordinateSystem {
        val coordinates = mutableListOf<ICoordinate>().apply {
            repeat(width) { internalWidth ->
                repeat(height) { internalHeight ->
                    add(Coordinate(internalWidth, internalHeight, ' '))
                }
            }
        }
        return CoordinateSystem(coordinates)
    }
}