package task12

object MultiplicationUtils {

  def multiply(list: List[Int], map: Map[Int, Double]): List[Double] = {
    list
      .map(el => map.get(el) match {
       case Some(value) => Some(el * value)
       case None => None
      })
      .filter(_.nonEmpty)
      .flatten
  }
}
