package task8

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class IntSetTest extends FunSuite {

  test("include and contains works") {
    val set = new EmptySet incl 10 incl 12

    assert(!set.isEmpty)
    assert(set.contains(10))
    assert(set.contains(12))
  }

  test("exclude works") {
    val set = new EmptySet incl 9 incl 2 incl 4

    assert(set.contains(9))
    assert(set.contains(2))
    assert(set.contains(4))

    val newSet1 = set excl 2

    assert(newSet1.contains(9))
    assert(!newSet1.contains(2))
    assert(newSet1.contains(4))

    val newSet2 = newSet1 excl 9

    assert(!newSet2.contains(9))
    assert(!newSet2.contains(2))
    assert(newSet2.contains(4))

    val emptySet = newSet2 excl 4

    assert(emptySet.isEmpty)
  }

  test("union works") {
    val set1 = new EmptySet incl 4 incl 3 incl 5
    val set2 = new EmptySet incl 7 incl 2 incl 5

    val unionSet = set1 union set2

    assert(unionSet.contains(4))
    assert(unionSet.contains(3))
    assert(unionSet.contains(5))
    assert(unionSet.contains(7))
    assert(unionSet.contains(2))
  }

  test("intersection works") {
    val set1 = new EmptySet incl 4 incl 3 incl 5 incl 7
    val set2 = new EmptySet incl 7 incl 2 incl 5

    val intersectionSet = set1 intersect set2

    assert(intersectionSet.contains(7))
    assert(intersectionSet.contains(5))
    assert(!intersectionSet.contains(4))
    assert(!intersectionSet.contains(3))
    assert(!intersectionSet.contains(2))
  }
}
