package queue

trait Queue[T] {

  def put(el: T): Queue[T]

  def get :Option[T]

  def dequeue: Queue[T]
}
