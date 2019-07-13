package task7

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner
import task7.StringUtils.toListCharacters

@RunWith(classOf[JUnitRunner])
class StringUtilsTest extends FunSuite {

  test("convert list of string to a list of all characters") {
    val result = List(
      'f', 'i', 'r', 's', 't', 's', 't', 'r', 'i', 'n', 'g', 's', 'e', 'c', 'o', 'n', 'd', 't', 'h', 'i', 'r', 'd'
    )
    assertResult(result)(toListCharacters(List("first string", "second", "third")))
  }
}
