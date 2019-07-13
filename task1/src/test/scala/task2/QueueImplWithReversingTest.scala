package task2

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner
import task1.QueueImpl

@RunWith(classOf[JUnitRunner])
class QueueImplWithReversingTest extends FunSuite {

  test("should put reversed String into queue") {
    val result: Option[String] = (new QueueImpl[String]() with Reversing)
      .put("hello Thomas ;)")
      .get

    assert(result.nonEmpty)
    assertResult(result.get)("); samohT olleh")
  }

  test("should work with empty string") {
    val result: Option[String] = (new QueueImpl[String]() with Reversing)
      .put("")
      .get

    assert(result.nonEmpty)
    assertResult(result.get)("")
  }
}