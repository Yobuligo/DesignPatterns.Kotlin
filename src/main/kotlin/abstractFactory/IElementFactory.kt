package abstractFactory

interface IElementFactory {
    fun button(): IButton
    fun input(): IInput
}