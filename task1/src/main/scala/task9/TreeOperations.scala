package task9

object TreeOperations {

  def contains(t: IntTree, v: Int): Boolean = t match {
    case EmptyTree => false
    case node: Node =>
      if (node.elem > v) contains(node.left, v)
      else if (node.elem < v) contains(node.right, v)
      else true
  }

  def insert(t: IntTree, v: Int): IntTree = t match {
    case EmptyTree => Node(v, EmptyTree, EmptyTree)
    case node: Node =>
      if (node.elem > v) Node(node.elem, insert(node.left, v), node.right)
      else if (node.elem < v) Node(node.elem, node.left, insert(node.right, v))
      else node
  }
}
