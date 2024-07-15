import scala.io.StdIn.readLine  // Importing the readLine function from the Scala standard library for reading user input

object question_1 {  // Defining an object named question_1

  // Function to continuously prompt the user to enter product names
  def getProductList(): List[String] = {  // Defining a function named getProductList that returns a List of Strings
    var products: List[String] = List()  // Initializing an empty list to store product names
    var input: String = ""  // Initializing an empty string to store user input

    // Loop to keep prompting the user until "done" is entered
    while (input.toLowerCase != "done") {  // Continue looping while the input is not "done"
      input = readLine("Enter product name (type 'done' when you have finished): ")  // Prompting the user for input
      if (input.toLowerCase != "done") {  // If the input is not "done"
        products = products :+ input  // Append the input to the products list
      }
    }

    products  // Return the list of products
  }

  // Function to print the product list with their positions
  def printProductList(products: List[String]): Unit = {  // Defining a function named printProductList that takes a list of Strings and returns Unit (no return value)
    products.zipWithIndex.foreach { case (product, index) =>  // Zipping the products list with their indices and iterating over the pairs
      println(s"${index + 1}. $product")  // Printing each product with its position (index + 1)
    }
  }

  // Function to get the total number of products
  def getTotalProducts(products: List[String]): Int = {  // Defining a function named getTotalProducts that takes a list of Strings and returns an Int
    products.length  // Return the length of the products list (total number of products)
  }

  // Main function to test the functionality
  def main(args: Array[String]): Unit = {  // Defining the main function, the entry point of the program
    val products = getProductList()  // Calling getProductList to get the list of products and storing it in a variable
    println("\nProduct List")  // Printing a header for the product list
    printProductList(products)  // Calling printProductList to print the list of products
    println(s"\nTotal number of Products: ${getTotalProducts(products)}")  // Printing the total number of products by calling getTotalProducts
  }
}
