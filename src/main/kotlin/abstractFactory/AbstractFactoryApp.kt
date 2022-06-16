package abstractFactory

fun main() {
    val elementFactoryTester = ElementFactoryTester()
    elementFactoryTester.test(KotlinElementFactory())
    elementFactoryTester.test(HTMLElementFactory())
}