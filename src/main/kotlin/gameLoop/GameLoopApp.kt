package gameLoop

fun main() {
    val canvas = Canvas()
    canvas.clear()
    canvas.writeXY(30, 5, "Peter")
    canvas.writeXY(30, 6, "Verena")

    val rectangle = Rectangle(60, 8, 70, 15, canvas)
    val rectangle2 = Rectangle(25, 3, 43, 9, canvas)
    while(true) {
//        canvas.clear()
        canvas.render()
        rectangle.render()
        rectangle2.render()
        Thread.sleep(1000)
    }

}