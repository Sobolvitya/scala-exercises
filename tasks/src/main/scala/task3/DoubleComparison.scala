package task3

object DoubleComparison {

  implicit val epsilon: Double = 0.01

  implicit class compare(private val d1: Double) extends AnyVal {
      def ~= (d2: Double)(implicit epsilon: Double): Boolean = Math.abs(d1 - d2) < epsilon
  }
}
