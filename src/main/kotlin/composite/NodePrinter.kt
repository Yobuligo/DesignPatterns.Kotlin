package composite

class NodePrinter {
    fun print(node: INode, indent: Int = 0) {
        val indentation = "  "
        println("${indentation.repeat(indent)} ${node.name}")
        node.getChildren().forEach { child ->
            print(child, indent + 1)
        }
    }
}