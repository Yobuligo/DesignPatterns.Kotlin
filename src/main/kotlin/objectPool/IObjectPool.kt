package objectPool

interface IObjectPool<T> {
    fun acquire(): T
    fun release(instance: T)
}