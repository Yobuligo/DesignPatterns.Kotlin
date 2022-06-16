package composite

fun main() {
    val root = Node("Root")
    val subNode1 = Node("SubNode 1")
    subNode1.addChild(Node("SubNode 1.1"))
    subNode1.addChild(Node("SubNode 1.2"))
    root.addChild(subNode1)

    val subNode2 = Node("SubNode 2")
    subNode2.addChild(Node("SubNode 2.1"))
    subNode2.addChild(Node("SubNode 2.2"))
    root.addChild(subNode2)

    NodePrinter().print(root)
}