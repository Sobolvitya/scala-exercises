package task11

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner
import task11.OptionsUtils.{firstNonNone, getFirstNonNone, maybeGetProduct}

@RunWith(classOf[JUnitRunner])
class OptionsUtilsTest extends FunSuite {

  test("should return first non empty element from 3") {
    assertResult(Some("this"))(firstNonNone(None, Some("this"), Some("that")))
  }

  test("should get product when all non none") {
    assertResult(Some(24))(maybeGetProduct(Some(2), Some(3), Some(4)))
  }

  test("should get empty when at least one is none") {
    assertResult(None)(maybeGetProduct(Some(3), Some(4), None))
  }

  test("should find first non empty from seq") {
    assertResult(Option("this"))(getFirstNonNone(List(None, None, Some("this"), Some("that"))))
  }

  test("should get empty if all empty") {
    assertResult(None)(getFirstNonNone(List(None, None)))
  }
}
