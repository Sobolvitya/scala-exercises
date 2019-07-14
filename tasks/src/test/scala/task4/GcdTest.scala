package task4

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner
import task4.Gcd.gcd

@RunWith(classOf[JUnitRunner])
class GcdTest extends FunSuite {

  test("finds gcd correctly when exists > 1") {
    assertResult(4)(gcd(12, 16))
  }

  test("finds gcd correctly when doesn't exists > 1") {
    assertResult(1)(gcd(35, 33))
  }
}
