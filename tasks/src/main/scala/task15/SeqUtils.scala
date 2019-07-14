package task15

object SeqUtils {

  implicit class SeqMedian[T: Numeric](val seq: Seq[T])(implicit n: Numeric[T]) {
    def median: Double = {
      import n._
      val (lower, upper) = seq.sortWith((l, r) => l < r).splitAt(seq.size / 2)
      lower.head
      if (seq.size % 2 == 0) (lower.last + upper.head).toDouble() / 2d else upper.head.toDouble()
    }
  }

}
