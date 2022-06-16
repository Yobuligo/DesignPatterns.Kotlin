package strategy

class Printer : ITextPrinter {
    override fun print(text: String) {
        println("Print '$text' on a printer.")
    }
}