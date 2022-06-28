package lazy

interface ILazy<T : Any> {
    val instance: T
}