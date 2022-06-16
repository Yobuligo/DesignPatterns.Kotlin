package decorator

fun main() {
    var pizza: IPizza = Pizza()
    PizzaPrinter().print(pizza)
    pizza = TomatoesDecorator(pizza)
    PizzaPrinter().print(pizza)
    pizza = OlivesDecorator(pizza)
    PizzaPrinter().print(pizza)
    pizza = SalamiDecorator(pizza)
    PizzaPrinter().print(pizza)
    pizza = CheeseDecorator(pizza)
    PizzaPrinter().print(pizza)
}