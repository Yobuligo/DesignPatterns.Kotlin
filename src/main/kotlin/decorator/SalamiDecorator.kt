package decorator

class SalamiDecorator(pizza: IPizza) : IPizza {
    override val price: Float = pizza.price + 2
    override val description: String = pizza.description + " with salami"
}