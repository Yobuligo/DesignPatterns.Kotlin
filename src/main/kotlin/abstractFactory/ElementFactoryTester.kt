package abstractFactory

class ElementFactoryTester {
    fun test(elementFactory: IElementFactory) {
        println(elementFactory.button().name)
        println(elementFactory.input().name)
    }
}