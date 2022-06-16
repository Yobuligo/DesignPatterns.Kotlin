package composite

interface INode {
    val name: String
    fun addChild(node: INode)
    fun removeChild(node: INode)
    fun getChildren(): List<INode>
}