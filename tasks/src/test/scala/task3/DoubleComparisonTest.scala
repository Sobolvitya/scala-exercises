package task3

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner
import DoubleComparison._

@RunWith(classOf[JUnitRunner])
class DoubleComparisonTest extends FunSuite {

  test("not equal with explicit epsilon") {
    val d1 = 1.01d
    val d2 = 1.02d
    assertResult(false)((d1 ~= d2)(0.00999))
  }

  test("equal with explicit epsilon") {
    val d1 = 1.001d
    val d2 = 1.002d
    assertResult(true)((d1 ~= d2)(0.00999))
  }

  test("not equal with implicit epsilon") {
    val d1 = 1.1d
    val d2 = 1.2d
    assertResult(false)(d1 ~= d2)
  }

  test("equal with implicit epsilon") {
    val d1 = 1.001d
    val d2 = 1.002d
    assertResult(true)(d1 ~= d2)
  }
}
