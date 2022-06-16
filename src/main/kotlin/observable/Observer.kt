package observable

class Observer(private val name: String) : IObserver {
    override fun onNotify() {
        println("'$name' got informed")
    }
}