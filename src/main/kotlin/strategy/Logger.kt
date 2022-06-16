package strategy

class Logger : ITextPrinter {
    override fun print(text: String) {
        println("Print '$text' into a logger.")
    }
}