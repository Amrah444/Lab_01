import scala.io.StdIn.readLine

object Q1 {
  def reverse(s: String): String = {
    if (s.isEmpty) {
      ""
    } else {
      reverse(s.tail) + s.head
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter a string: ")
    val input = readLine().toString
    val reversed = reverse(input)
    println(s"Original: $input")
    println(s"Reversed: $reversed")
  }
}
