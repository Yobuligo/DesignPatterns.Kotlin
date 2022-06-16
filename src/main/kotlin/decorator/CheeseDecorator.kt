package decorator

class CheeseDecorator(pizza: IPizza) : IPizza {
    override val price: Float = pizza.price + 2
    override val description: String = pizza.description + " with cheese"
}