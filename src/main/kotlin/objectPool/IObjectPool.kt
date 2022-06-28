package objectPool

interface IObjectPool<T> {
    fun checkOut(): T
    fun checkIn(instance: T)
}