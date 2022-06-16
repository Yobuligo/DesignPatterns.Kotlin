package adapter

class WalkmanToPlayerAdapter(private val walkman: Walkman) : IPlayer {
    override val name: String = "Walkman"

    override fun next() {
        walkman.fastForward()
    }

    override fun start() {
        walkman.play()
    }

    override fun stop() {
        walkman.stop()
    }

    override fun previous() {
        walkman.fastBackward()
    }
}