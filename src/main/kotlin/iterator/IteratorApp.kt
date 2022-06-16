package iterator

fun main() {
    val iterator = Iterator(listOf("One", "Two", "Three", "Four"))
    while (iterator.hasNext()) {
        println(iterator.getNext())
    }
}