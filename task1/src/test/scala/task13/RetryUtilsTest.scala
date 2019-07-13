package task13

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner
import task13.RetryUtils._

@RunWith(classOf[JUnitRunner])
class RetryUtilsTest extends FunSuite {

  test("should retry default max retries without success") {
    def methodToRetry = (customCountDown: CustomCountDown) => {
      customCountDown.decrease()
      throw new Exception
    }

    val customCountDown = new CustomCountDown(10)
    assertThrows[MaxRetriesReachedException]{retry(methodToRetry(customCountDown))}
    assertResult(0)(customCountDown.value)
  }

  test("should retry explicit max retries without success") {
    def methodToRetry = (customCountDown: CustomCountDown) => {
      customCountDown.decrease()
      throw new Exception
    }

    val customCountDown = new CustomCountDown(10)
    assertThrows[MaxRetriesReachedException]{retry(methodToRetry(customCountDown))(maxRetry = 5, sleepMs = 500)}
    assertResult(5)(customCountDown.value)
  }

  test("should succeed after 9 retries") {
    def methodToRetry = (customCountDown: CustomCountDown) => {
      customCountDown.decrease()
      if (customCountDown.value > 1) {
        throw new Exception
      }
      customCountDown
    }
    val customCountDown = new CustomCountDown(10)
    assertResult(1)(retry(methodToRetry(customCountDown)).value)
  }

  class CustomCountDown (val count: Int) {
    var value: Int = count

    def decrease(): Unit = value -= 1
  }
}
