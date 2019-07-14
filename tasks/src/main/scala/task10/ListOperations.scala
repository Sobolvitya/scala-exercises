package task10

object ListOperations {

  def squareList(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => (y * y) :: squareList(ys)
  }

  def squareListMap(xs: List[Int]): List[Int] = {
      xs map (el => el * el)
  }
}
