import task1.QueueImpl

object Task1 {
  def main(args: Array[String]): Unit = {

    val q1 = new QueueImpl[String]()

    println(q1)

    val q2 = q1.put("el1")

    println(q2)

    println(q2.get)

    val q3 = q2.dequeue
    println(q3)
    val q4 = q3.dequeue
    println(q4)


  }
}
