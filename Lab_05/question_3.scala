import scala.io.StdIn  // Import readInt from scala.io.StdIn

object question_3 {

  // Recursive function to compute the nth Fibonacci number
  def fibonacci(n: Int): Int = {
    if (n <= 0) {
        0
    }
    else if (n == 1) {1
    }
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  // Recursive function to print the first n Fibonacci numbers
  def printFibonacci(n: Int): Unit = {
    def loop(i: Int): Unit = {
      if (i < n) {
        print(s"${fibonacci(i)} ")  // Print the ith Fibonacci number
        loop(i + 1)  // Recursively call loop with i incremented
      }
    }
    loop(0)  // Start the loop with i = 0
  }

  // Main function to test the functionality
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val n = StdIn.readInt()  // Read an integer input from the user
    println(s"First $n Fibonacci numbers:")
    printFibonacci(n)  // Print the first n Fibonacci numbers
  }
}
