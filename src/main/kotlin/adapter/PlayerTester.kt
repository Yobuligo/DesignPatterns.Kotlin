package adapter

class PlayerTester(private val player: IPlayer) {
    fun test() {
        println("Testing device ${player.name}")
        player.next()
        player.previous()
        player.start()
        player.stop()
    }
}