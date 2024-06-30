object Q3{

  def findAverage(x: Int, y: Int): Double = {
    val average = (x + y) / 2.0
    average
  }

  def main(args: Array[String]): Unit = {
    val num1 = 10
    val num2 = 9
    val avg = findAverage(num1, num2)
    println(f"The average of the given two numbers: $avg%.2f")//f interpolation- allows us to create formatted strings
  }
}
