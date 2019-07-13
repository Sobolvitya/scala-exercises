package task8

class NonEmptySet(elem: Int, left: IntSet, right: IntSet) extends IntSet {

  override def incl(x: Int): IntSet =
    if (x < elem) new NonEmptySet(elem, left incl x, right)
    else if (x > elem) new NonEmptySet(elem, left, right incl x)
    else this

  override def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  override def union(x: IntSet): IntSet = ((left union right) union x) incl elem

  override def intersect(x: IntSet): IntSet = {
    val set = (left intersect x) union (right intersect x)
    if (x.contains(elem)) set.incl(elem) else set
  }

  override def excl(x: Int): IntSet =
    if (x < elem) new NonEmptySet(elem, left excl x, right)
    else if (x > elem) new NonEmptySet(elem, left, right excl x)
    else left union right

  override def isEmpty: Boolean = false
}
