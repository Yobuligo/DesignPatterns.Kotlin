package observable

class Observable : IObservable {
    private val observers = mutableListOf<IObserver>()

    override fun addObserver(observer: IObserver) {
        observers.add(observer)
    }

    override fun notifyObservers() {
        observers.forEach { observer ->
            observer.onNotify()
        }
    }
}