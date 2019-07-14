package task15

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner
import SeqUtils._

@RunWith(classOf[JUnitRunner])
class SeqUtilsTest extends FunSuite {

  test("finds median of even seq of ints") {
    assertResult(2.5)(List(1, 2, 3, 4).median)
  }

  test("finds median of uneven seq of ints") {
    assertResult(3)(List(1, 2, 3, 4, 5).median)
  }

  test("finds median of even seq of doubles") {
    assertResult(2.5)(List(1d, 2d, 3d, 4d).median)
  }

  test("finds median of uneven seq of doubles") {
    assertResult(3)(List(1.2, 2.1, 3d, 4.4, 5.3).median)
  }
}
