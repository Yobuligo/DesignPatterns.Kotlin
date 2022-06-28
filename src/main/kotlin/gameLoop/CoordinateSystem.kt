package gameLoop

class CoordinateSystem(coordinates: List<ICoordinate>) : ICoordinateSystem {
    private val coordinateKeyGenerator by lazy { CoordinateKeyGenerator }
    private val coordinates = mutableMapOf<String, ICoordinate>()

    init {
        coordinates.forEach { coordinate ->
            val key = coordinateKeyGenerator.generate(coordinate.x, coordinate.y)
            this.coordinates[key] = coordinate
        }
    }

    override fun find(x: Int, y: Int): ICoordinate {
        val key = coordinateKeyGenerator.generate(x, y)
        return coordinates[key]!!
    }
}