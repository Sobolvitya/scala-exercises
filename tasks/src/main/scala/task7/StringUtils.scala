package task7

object StringUtils {

  def toListCharacters(lines: List[String]): List[Char] = lines
    .flatMap(l => l.split("\\s+"))
    .flatMap(w => w.toCharArray)
}
