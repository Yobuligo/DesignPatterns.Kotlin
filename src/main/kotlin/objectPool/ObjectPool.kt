package objectPool

class ObjectPool<T>(private val maxNumberInstances: Int = 3, private val factory: (index: Int) -> T) : IObjectPool<T> {
    private val locked = mutableListOf<T>()
    private val unlocked = mutableListOf<T>()

    override fun checkOut(): T {
        return checkOutFromPool() ?: checkOutFromFactory()
        ?: throw RuntimeException("No free objects available in Pool")
    }

    override fun checkIn(instance: T) {
        locked.remove(instance)
        unlocked.add(instance)
    }

    private fun checkOutFromPool(): T? {
        return if (unlocked.size > 0) {
            unlocked[0].apply {
                locked.add(this)
                unlocked.remove(this)
            }
        } else {
            null
        }
    }

    private fun checkOutFromFactory(): T? {
        return if (locked.size < maxNumberInstances) {
            factory.invoke(locked.size).apply { locked.add(this) }
        } else {
            null
        }
    }
}