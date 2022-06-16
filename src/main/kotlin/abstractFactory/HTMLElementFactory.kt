package abstractFactory

class HTMLElementFactory : IElementFactory {
    override fun button(): IButton {
        return HTMLButton()
    }

    override fun input(): IInput {
        return HTMLInput()
    }
}