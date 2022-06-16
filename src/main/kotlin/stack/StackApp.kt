package stack

class Element(val name: String)

fun main() {
    val stack = Stack<Element>()
    stack.push(Element("first"))
    stack.push(Element("second"))
    println("Peek: ${stack.peek()?.name}")
    println("Pop: ${stack.peek()?.name}")
    println("Peek: ${stack.peek()?.name}")
    println("Pop: ${stack.peek()?.name}")
    println("Peek: ${stack.peek()?.name}")
    println("Pop: ${stack.peek()?.name}")
}