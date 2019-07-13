package task12

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner
import task12.MultiplicationUtils.multiply

@RunWith(classOf[JUnitRunner])
class MultiplicationUtilsTest extends FunSuite {

  test("should multiple correctly list to elements in map") {
    assertResult(List(3, 15))(multiply(List(1, 2, 3, 4), Map(1 -> 3, 3->5)))
  }

  test("should return emtpy list when no corresponding elements in map") {
    assertResult(List())(multiply(List(1, 2), Map(3 -> 4)))
  }

  test("should return empty list when initial list is empty") {
    assertResult(List())(multiply(List(), Map(2 -> 3)))
  }
}
