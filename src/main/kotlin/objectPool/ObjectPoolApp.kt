package objectPool

/**
 * In case objects are very expensive to be created or there is only a limited number of them,
 * it makes sense to create them and to keep them in memory. Here the ObjectPoolPattern come into play.
 * One Example are threads where there is a pool of Threads available but can be used only by one user.
 */

fun main() {
    val objectPool = ObjectPool { index -> Thread(index) }
    val first = objectPool.acquire()
    println(first.index)
    val second = objectPool.acquire()
    println(second.index)
    val third = objectPool.acquire()
    println(third.index)

    objectPool.release(first)
    val fourth = objectPool.acquire()
    println(fourth.index)

    try {
        objectPool.acquire()
    } catch (e: Exception) {
        println(e.message)
    }
}