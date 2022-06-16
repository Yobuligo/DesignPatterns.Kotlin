package adapter

fun main() {
    PlayerTester(MP3Player()).test()
    println()
    PlayerTester(WalkmanToPlayerAdapter(Walkman())).test()
}