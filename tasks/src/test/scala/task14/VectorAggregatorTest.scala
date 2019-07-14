package task14

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class VectorAggregatorTest extends FunSuite {

  test("should initialize all properly") {
    val aggregator = new VectorAggregator(Vector(0, 4, 3))

    assertResult(Vector(0, 16, 9))(aggregator.x)
    assertResult(25)(aggregator.y)
    assertResult(5)(aggregator.z)
  }
}
