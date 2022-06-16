package factory

class CarFactory : ICarFactory {
    override fun create(): ICar {
        return Car()
    }
}