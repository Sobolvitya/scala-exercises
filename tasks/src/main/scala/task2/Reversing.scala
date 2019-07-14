package task2

import queue.Queue

trait Reversing extends Queue[String]{

  abstract override def put(el: String): Queue[String] = super.put(el.reverse)
}
