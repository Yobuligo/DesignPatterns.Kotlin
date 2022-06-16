package facade

class CodeFacade {
    fun prettyPrint(code: ICode) {
        PrettyPrinter().prettyPrint(code)
    }

    fun checkSyntax(code: ICode) {
        SyntaxChecker().check(code)
    }

    fun build(code: ICode) {
        Builder().build(code)
    }

    fun publish(code: ICode) {
        Publisher().publish(code)
    }
}