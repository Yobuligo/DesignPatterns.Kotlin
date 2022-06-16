package abstractFactory

class KotlinElementFactory : IElementFactory {
    override fun button(): IButton {
        return KotlinButton()
    }

    override fun input(): IInput {
        return KotlinInput()
    }
}