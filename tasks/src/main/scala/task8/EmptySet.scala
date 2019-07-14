package task8

class EmptySet extends IntSet {

  override def incl(x: Int): IntSet = new NonEmptySet(x, new EmptySet, new EmptySet)

  override def contains(x: Int): Boolean = false

  override def union(x: IntSet): IntSet = x

  override def intersect(x: IntSet): IntSet = new EmptySet

  override def excl(x: Int): IntSet = this

  override def isEmpty: Boolean = true
}
