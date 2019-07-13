package task11

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner
import task11.OptionsUtils.{firstNonNone, getFirstNonNone, maybeGetProduct}

@RunWith(classOf[JUnitRunner])
class OptionsUtilsTest extends FunSuite {

  test("should return first non empty element from 3") {
    assertResult(Option("this"))(firstNonNone(Option.empty, Option("this"), Option("that")))
  }

  test("should get product when all non none") {
    assertResult(Option(24))(maybeGetProduct(Option(2), Option(3), Option(4)))
  }

  test("should get empty when at least one is none") {
    assertResult(Option.empty)(maybeGetProduct(Option(3), Option(4), Option.empty))
  }

  test("should find first non empty from seq") {
    assertResult(Option("this"))(getFirstNonNone(List(Option.empty, Option.empty, Option("this"), Option("that"))))
  }

  test("should get empty if all empty") {
    assertResult(Option.empty)(getFirstNonNone(List(Option.empty, Option.empty)))
  }
}
