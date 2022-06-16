package iterator

interface IIterator<T> {
    fun hasNext(): Boolean
    fun getNext(): T
}