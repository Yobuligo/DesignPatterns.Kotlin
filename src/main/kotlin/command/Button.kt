package command

class Button(var command: ICommand) {
    fun click() {
        command.execute()
    }
}