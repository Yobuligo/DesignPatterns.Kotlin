package lazy

class Lazy<T : Any>(private val initializer: () -> T) : ILazy<T> {
    private lateinit var _instance: T

    override val instance: T
        get() {
            if (!this::_instance.isInitialized) {
                _instance = initializer()
            }
            return _instance
        }
}

/**
 * implement a nice factory to create the lazy object
 */
fun <T : Any> lazy(initializer: () -> T): ILazy<T> {
    return Lazy(initializer)
}