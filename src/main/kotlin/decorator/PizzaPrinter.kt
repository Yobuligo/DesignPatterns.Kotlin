package decorator

class PizzaPrinter {
    fun print(pizza: IPizza) {
        println("${pizza.description} for ${pizza.price} EUR")
    }
}