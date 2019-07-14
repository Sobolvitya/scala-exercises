package task1

import queue.Queue

import scala.reflect.ClassTag

class QueueImpl[T:ClassTag] private (els: Array[T]) extends Queue[T] {

  private val elements: Array[T] = els

  def this() {
    this(new Array[T](0))
  }

  override def put(el: T): Queue[T] = new QueueImpl[T](elements :+ el)

  override def get: Option[T] = if (elements.isEmpty) Option.empty else Option(elements(0))

  override def dequeue: Queue[T] = if (elements.isEmpty) this else new QueueImpl[T](elements.tail)

  override def toString: String =
    if(!els.isEmpty) els.map(e => e.toString).reduce((e1, e2) => e1 + ", " + e2)
    else "EMPTY"
}
