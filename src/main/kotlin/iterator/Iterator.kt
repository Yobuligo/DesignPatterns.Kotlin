package iterator

class Iterator<T>(private val elements: List<T>) : IIterator<T> {
    private var index: Int = 0

    override fun hasNext(): Boolean {
        return index < elements.size
    }

    override fun getNext(): T {
        index++
        return elements[index - 1]
    }
}