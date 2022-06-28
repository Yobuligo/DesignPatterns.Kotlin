package lazy

/**
 * If it is required to load an object lazy, e.g. because it is very expensive to create it,
 * but anyway there must be an object which can be shared to several classes, the lazy initializer can be used.
 * An object (lazy) wraps the access to that object. But it only creates the real object if it is requested
 *
 * It Kotlin there is already a way by using the delegate function "by lazy{}"
 */


class Test {
    fun call() {
        println("Now I am initialized and called")
    }
}

fun main() {
    val lazyTest = lazy { Test() }
    lazyTest.instance.call()
}