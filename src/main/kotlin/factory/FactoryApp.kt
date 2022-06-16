package factory

fun main() {
    val carFactory = CarFactory()
    val car: ICar = carFactory.create()
    car.drive()
}