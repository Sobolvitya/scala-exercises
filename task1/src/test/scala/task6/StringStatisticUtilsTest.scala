package task6

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner
import task6.StringStatisticUtils._

import scala.collection.immutable.HashMap

@RunWith(classOf[JUnitRunner])
class StringStatisticUtilsTest extends FunSuite {

  test("find the longest word") {
    assertResult("longest")(longestWord("the longest word in this line"))
  }

  test("find the most common word") {
    assertResult("word")(mostCommonWord("the most common word is word not most but word"))
  }

  test("find the most common letter") {
    assertResult('v')(mostCommonLetter("thevv mostv common letter vv is v"))
  }

  test ("each letter to set of words") {
    val result = HashMap(
      'l' -> Set("letters"),
      'e' -> Set("letters", "appears"),
      't' -> Set("letters", "to", "it"),
      'r' -> Set("letters", "words", "appears"),
      's' -> Set("letters", "words", "appears"),
      'o' -> Set("to", "words"),
      'w' -> Set("words"),
      'd' -> Set("words"),
      'i' -> Set("it", "in"),
      'a' -> Set("appears"),
      'p' -> Set("appears"),
      'n' -> Set("in")
    )
    assertResult(result)(mapLetterToWords("letters to words it appears in"))
  }
}
