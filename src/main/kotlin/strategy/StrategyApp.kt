package strategy

// Other examples are: dependency injection to mock dependent objects
fun main() {
    val text = Text("Here is my text to be printed")
    text.print()
    text.print(Screen())
    text.print(Logger())
}