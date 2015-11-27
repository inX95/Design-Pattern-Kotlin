import java.util.*

/**
 * Created by brandon on 15-11-27.
 */
class TreeNode(var name: String) {
    var parent: TreeNode? = null
    var children: Vector<TreeNode>

    init {
        children = Vector()
    }

    public fun getChildren(): Enumeration<TreeNode> = children.elements()


    public fun addChildren(node: TreeNode) = children.add(node)


    public fun rmChildren(node: TreeNode) = children.remove(node)

    public fun printTree() {
        println(name)
        this.children.forEach { it.printTree() }
    }

}

public class Tree(var name: String) {
    var root: TreeNode

    init {
        root = TreeNode(name)
    }
}