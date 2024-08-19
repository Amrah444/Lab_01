object StringFormatter extends App {

  // Method to convert a string to uppercase
  def toUpper(str: String): String = str.toUpperCase

  // Method to convert a string to lowercase
  def toLower(str: String): String = str.toLowerCase

  // Method to format a name based on a function
  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }

  // Test cases
  val names = List(
    ("Benny", toUpper),
    ("Niroshan", (name: String) => toUpper(name.substring(0, 2)) + toLower(name.substring(2))),
    ("Saman", toLower),
    ("Kumara", (name: String) => toUpper(name.substring(0, 1)) + toLower(name.substring(1)))
  )

  // Applying the format and printing the results
  names.foreach {
    case (name, formatFunc) => println(formatNames(name)(formatFunc))
  }
}
