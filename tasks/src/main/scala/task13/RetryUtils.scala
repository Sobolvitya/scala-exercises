package task13

import scala.util.{Failure, Success, Try}

object RetryUtils {

  implicit val maxRetry: Int = 10

  implicit val sleepMs: Long = 1000l

  def retry[Res](block: => Res)(implicit maxRetry: Int, sleepMs: Long): Res = {

    def retry(retriesRemain: Int)(block: => Res): Res = Try(block) match {
      case Success(value) => value
      case Failure(exception) =>
        if (retriesRemain <= 1) throw new MaxRetriesReachedException(exception)
        else {
          Thread.sleep(sleepMs)
          retry(retriesRemain - 1)(block)
        }
    }

    retry(maxRetry)(block)
  }
}
