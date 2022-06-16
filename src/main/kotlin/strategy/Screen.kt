package strategy

class Screen : ITextPrinter {
    override fun print(text: String) {
        println("Print '$text' on a screen.")
    }
}