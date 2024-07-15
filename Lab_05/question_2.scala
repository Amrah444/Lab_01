object question_2 { 

  // Define a case class Book with attributes title, author, and isbn
  case class Book(title: String, author: String, isbn: String)

  // Create an initial set containing at least three different books
  var library: Set[Book] = Set(  // Initialize a mutable set named library
    Book("1984", "George Orwell", "1234567890"),  // Add book "1984" to the set
    Book("To Kill a Mockingbird", "Harper Lee", "0987654321"),  // Add book "To Kill a Mockingbird" to the set
    Book("The Great Gatsby", "F. Scott Fitzgerald", "1122334455")  // Add book "The Great Gatsby" to the set
  )

  // Function to add a new book to the library
  def addBook(newBook: Book): Unit = {  // Define a function addBook that takes a Book object and returns Unit (no return value)
    library += newBook  // Add the new book to the library set
    println(s"Added: ${newBook.title} by ${newBook.author}")  // Print a confirmation message
  }

  // Function to remove a book from the library by its ISBN
  def removeBook(isbn: String): Unit = {  // Define a function removeBook that takes a String (ISBN) and returns Unit
    val bookToRemove = library.find(_.isbn == isbn)  // Find the book with the given ISBN in the library set
    bookToRemove match {  // Pattern match on the result
      case Some(book) =>  // If a book is found
        library -= book  // Remove the book from the library set
        println(s"Removed: ${book.title} by ${book.author}")  // Print a confirmation message
      case None =>  // If no book is found
        println(s"No book found with ISBN: $isbn")  // Print a message indicating no book was found
    }
  }

  // Function to check if a book is already in the library by its ISBN
  def isBookInLibrary(isbn: String): Boolean = {  // Define a function isBookInLibrary that takes a String (ISBN) and returns a Boolean
    library.exists(_.isbn == isbn)  // Check if a book with the given ISBN exists in the library set
  }

  // Main function to test the functionality
  def main(args: Array[String]): Unit = {  // Define the main function, the entry point of the program
    // Print initial library collection
    println("Initial library collection:")  // Print a header for the initial library collection
    library.foreach(book => println(s"${book.title} by ${book.author} (ISBN: ${book.isbn})"))  // Iterate over the library set and print each book's details

    // Add a new book to the library
    val newBook = Book("Brave New World", "Aldous Huxley", "2233445566")  // Create a new Book object
    addBook(newBook)  // Add the new book to the library

    // Print updated library collection
    println("\nUpdated library collection:")  // Print a header for the updated library collection
    library.foreach(book => println(s"${book.title} by ${book.author} (ISBN: ${book.isbn})"))  // Iterate over the library set and print each book's details

    // Remove a book from the library
    removeBook("0987654321")  // Remove the book with the given ISBN from the library

    // Print updated library collection
    println("\nUpdated library collection after removal:")  // Print a header for the updated library collection after removal
    library.foreach(book => println(s"${book.title} by ${book.author} (ISBN: ${book.isbn})"))  // Iterate over the library set and print each book's details

    // Check if a book is in the library
    val isbnToCheck = "1234567890"  // Define a String variable to store the ISBN to check
    if (isBookInLibrary(isbnToCheck)) {  // Check if the book with the given ISBN is in the library
      println(s"\nThe book with ISBN $isbnToCheck is in the library.")  // Print a confirmation message if the book is found
    } else {  // If the book is not found
      println(s"\nThe book with ISBN $isbnToCheck is not in the library.")  // Print a message indicating the book is not in the library
    }
  }
}
