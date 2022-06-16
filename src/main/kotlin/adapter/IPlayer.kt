package adapter

interface IPlayer {
    val name: String
    fun next()
    fun start()
    fun stop()
    fun previous()
}