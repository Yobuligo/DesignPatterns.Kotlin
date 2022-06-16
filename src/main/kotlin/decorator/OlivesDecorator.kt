package decorator

class OlivesDecorator(pizza: IPizza) : IPizza {
    override val price: Float = pizza.price + 1
    override val description: String = pizza.description + " with olives"
}