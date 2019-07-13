package task10

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ListOperationsTest extends FunSuite {

  test("square each element in list with matcher implementation") {
    val list = ListOperations.squareList(List(1, 3, 5, 4))

    assertResult(List(1, 9, 25, 16))(list)
  }

  test("square each element in list with mapper implementation") {
    val list = ListOperations.squareListMap(List(1, 3, 5, 4))

    assertResult(List(1, 9, 25, 16))(list)
  }

}
