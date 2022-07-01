package objectPool

class ObjectPool<T>(private val maxNumberInstances: Int = 3, private val factory: (index: Int) -> T) : IObjectPool<T> {
    private val acquired = mutableListOf<T>()
    private val released = mutableListOf<T>()

    override fun acquire(): T {
        return checkout(fetch())
    }

    override fun release(instance: T) {
        released.add(instance)
        acquired.remove(instance)
    }

    private fun fetch(): T {
        return if (released.isNotEmpty()) {
            released.first()
        } else {
            create()
        }
    }

    private fun create(): T {
        if (acquired.size < maxNumberInstances) {
            return factory(acquired.size + 1)
        } else {
            throw RuntimeException("No more objects available")
        }
    }

    private fun checkout(instance: T): T {
        acquired.add(instance)
        released.remove(instance)
        return instance
    }
}