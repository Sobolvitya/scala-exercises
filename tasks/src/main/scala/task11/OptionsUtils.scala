package task11

object OptionsUtils {

  def firstNonNone(x: Option[Any], y: Option[Any], z: Option[Any]): Option[Any] = {
    if (x.nonEmpty) x
    else if (y.nonEmpty) y
    else if (z.nonEmpty) z
    else None
  }

  def maybeGetProduct(x: Option[Int], y: Option[Int], z: Option[Int]): Option[Int] = {
    if (x.nonEmpty && y.nonEmpty && z.nonEmpty) Some(x.get * y.get * z.get)
    else None
  }

  def getFirstNonNone(elements: Seq[Option[Any]]): Option[Any] = elements.find(el => el.nonEmpty).flatten
}
