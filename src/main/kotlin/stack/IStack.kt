package stack

interface IStack<T> {
    /**
     * Adds the [element] of type [T] to the stack.
     */
    fun push(element: T)

    /**
     * Returns the last added element of type  [T] or null
     */
    fun peek(): T?

    /**
     * Drops the last added element of type [T] and returns it or returns null
     */
    fun pop(): T?
}