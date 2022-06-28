package objectPool

/**
 * In case objects are very expensive to be created or there is only a limited number of them,
 * it makes sense to create them and to keep them in memory. Here the ObjectPoolPattern come into play.
 * One Example are threads where there is a pool of Threads available but can be used only by one user.
 */

fun main() {
    val objectPool = ObjectPool { index -> Thread(index) }
    val first = objectPool.checkOut()
    println(first.index)
    val second = objectPool.checkOut()
    println(second.index)
    val third = objectPool.checkOut()
    println(third.index)

    objectPool.checkIn(first)
    val fourth = objectPool.checkOut()
    println(fourth.index)

    try {
        objectPool.checkOut()
    } catch (e: Exception) {
        println(e.message)
    }
}