import scala.io.StdIn.readLine


object Q4 {

  def sumOfEvenNumbers(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    println("Enter some numbers seperated by commas: ")
    val input = readLine()

    // Split the input string into an array of strings and convert to integers
    val numbers = input.split(",").flatMap(s => s.trim.toIntOption).toList

    val evenSum = sumOfEvenNumbers(numbers)
    println(s"Sum of even numbers: $evenSum")
  }
}
