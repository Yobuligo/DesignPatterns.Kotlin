package stack

class Stack<T> : IStack<T> {
    private val elements = mutableListOf<T>()

    override fun push(element: T) {
        elements.add(element)
    }

    override fun peek(): T? {
        return elements.lastOrNull()
    }

    override fun pop(): T? {
        return elements.removeLastOrNull()

    }
}