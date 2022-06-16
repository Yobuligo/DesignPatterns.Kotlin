package strategy

class Text(private val text: String) {
    private var textPrinterDefault: ITextPrinter = Printer()

    fun print(textPrinter: ITextPrinter? = null) {
        textPrinter?.print(text) ?: this.textPrinterDefault.print(text)
    }
}