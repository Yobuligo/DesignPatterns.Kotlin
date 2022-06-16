package adapter

class MP3Player : IPlayer {
    override val name: String = "MP3 Player"

    override fun next() {
        println("Next MP3 player song")
    }

    override fun start() {
        println("Start MP3 player")
    }

    override fun stop() {
        println("Stop MP3 player")
    }

    override fun previous() {
        println("Previous MP3 player song")
    }
}