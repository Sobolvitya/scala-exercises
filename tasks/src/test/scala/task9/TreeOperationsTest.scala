package task9

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner
import task9.TreeOperations._

@RunWith(classOf[JUnitRunner])
class TreeOperationsTest extends FunSuite {

  test("insert and contains works") {
    val tree = insert(insert(insert(EmptyTree, 5), 8), 2)

    assert(contains(tree, 5))
    assert(contains(tree, 2))
    assert(contains(tree, 8))
    assert(!contains(tree, 7))
  }
}
