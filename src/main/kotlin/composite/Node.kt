package composite

class Node(override val name: String) : INode {
    private val children = mutableListOf<INode>()

    override fun addChild(node: INode) {
        children.add(node)
    }

    override fun removeChild(node: INode) {
        children.remove(node)
    }

    override fun getChildren(): List<INode> {
        return children
    }
}