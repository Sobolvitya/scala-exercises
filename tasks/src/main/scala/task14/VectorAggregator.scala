package task14


class VectorAggregator (val numbers: Vector[Int]) {

  val defaultNumbers: Vector[Int] = numbers

  lazy val x: Vector[Int] = defaultNumbers.map(el => el * el)

  lazy val y: Long = x.foldLeft(0l)((agg, el) => agg + el)

  lazy val z: Double = Math.sqrt(y)

}
