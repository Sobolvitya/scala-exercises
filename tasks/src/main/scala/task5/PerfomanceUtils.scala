package task5

object PerfomanceUtils {

  def timeit[R] (block: => R): R = {
    val startTime = System.currentTimeMillis()
    val result = block
    val endTime = System.currentTimeMillis()

    println("Total execution time: " + (endTime - startTime))
    result
  }

  def main(args: Array[String]): Unit = {
    def x: (Int, Int) => List[Int] = (a, b) =>
      List.range(a, b, 1)
      .map(el => el * 2)
      .filter(el => el % 3 == 0)

    val res1 = timeit(x(1, 2000))
    res1.foreach(el => println(el))
  }
}
