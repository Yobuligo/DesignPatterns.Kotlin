package facade

fun main() {
    val code = Code("my Code")
    val codeFacade = CodeFacade()
    codeFacade.prettyPrint(code)
    codeFacade.checkSyntax(code)
    codeFacade.build(code)
    codeFacade.publish(code)
}