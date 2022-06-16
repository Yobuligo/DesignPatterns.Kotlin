package command

fun main() {
    val button = Button(CopyCommand())
    button.click()
    button.command = RemoveCommand()
    button.click()
}