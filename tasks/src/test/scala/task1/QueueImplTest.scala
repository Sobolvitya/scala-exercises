package task1

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class QueueImplTest extends FunSuite {

  test("Empty when get from empty queue") {
    assert(new QueueImpl[String]().get.isEmpty)
  }

  test("dequeue from Empty queue works") {
    new QueueImpl[Int].dequeue
  }

  test("FIFO works") {
    val result: Option[String] = new QueueImpl[String]()
      .put("el1")
      .put("el2")
      .get

    assert(result.nonEmpty)
    assert(result.get.compare("el1") == 0)
  }

  test("get is idempotent") {
    val queue = new QueueImpl[String]()
      .put("el1")

    val result: Option[String] = queue
      .get

    assert(result.equals(queue.get))
  }

  test("dequeue works") {
    val result: Option[String] = new QueueImpl[String]()
      .put("el1")
      .put("el2")
      .dequeue
      .get

    assert(result.nonEmpty)
    assert(result.get.compare("el2") == 0)
  }
}