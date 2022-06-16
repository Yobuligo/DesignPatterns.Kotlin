package observable

interface IObservable {
    fun addObserver(observer: IObserver)
    fun notifyObservers()
}