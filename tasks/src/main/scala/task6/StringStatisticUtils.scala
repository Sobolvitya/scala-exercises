package task6

import scala.collection.immutable.HashMap

object StringStatisticUtils {

  def longestWord(line: String): String = line
      .split("\\s+")
      .reduce((s1, s2) => if (s1.length > s2.length) s1 else s2)

  def mostCommonWord(line: String): String = line
    .split("\\s+")
    .groupBy(identity)
    .mapValues(_.length)
    .reduce((a1, a2) => if (a1._2 > a2._2) a1 else a2)._1

  def mostCommonLetter(line: String): Char = line
    .split("\\s+")
    .flatMap(el => el.toCharArray)
    .groupBy(identity)
    .mapValues(_.length)
    .reduce((c1, c2) => if (c1._2 > c2._2) c1 else c2)._1

  def mapLetterToWords(line: String): Map[Char, Set[String]] = line
    .split("\\s+")
    .flatMap(el => el.toCharArray.map(c => (c, el)))
    .groupBy(p => p._1)
    .mapValues(v => v.map(el => el._2).toSet)
}
