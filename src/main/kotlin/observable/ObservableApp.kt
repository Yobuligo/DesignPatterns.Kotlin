package observable

fun main() {
    val observable = Observable()
    observable.addObserver(Observer("Stacey"))
    observable.addObserver(Observer("Bertha"))
    observable.notifyObservers()
}