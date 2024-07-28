import scala.io.StdIn.readLine
import scala.util.Try

object StudentRecords {
  def main(args: Array[String]): Unit = {
    val studentRecord = getStudentInfoWithRetry()
    printStudentRecord(studentRecord)
  }

  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var valid = false
    var studentInfo: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'F')

    while (!valid) {
      val name = readLine("Enter student's name: ")
      val marks = readLine("Enter student's marks: ")
      val totalMarks = readLine("Enter total possible marks: ")

      val (isValid, errorMessage) = validateInput(name, marks, totalMarks)
      if (isValid) {
        studentInfo = getStudentInfo(name, marks.toInt, totalMarks.toInt)
        valid = true
      } else {
        println(s"Invalid input: ${errorMessage.getOrElse("Unknown error")}")
      }
    }

    studentInfo
  }

  def getStudentInfo(name: String, marks: Int, totalMarks: Int): (String, Int, Int, Double, Char) = {
    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }
    (name, marks, totalMarks, percentage, grade)
  }

  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Student Name: $name")
    println(s"Marks Obtained: $marks")
    println(s"Total Possible Marks: $totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }

  def validateInput(name: String, marks: String, totalMarks: String): (Boolean, Option[String]) = {
    if (name.trim.isEmpty) {
      (false, Some("Name cannot be empty"))
    } else if (!Try(marks.toInt).isSuccess || marks.toInt < 0) {
      (false, Some("Marks should be a positive integer"))
    } else if (!Try(totalMarks.toInt).isSuccess || totalMarks.toInt <= 0) {
      (false, Some("Total possible marks should be a positive integer"))
    } else if (marks.toInt > totalMarks.toInt) {
      (false, Some("Marks cannot exceed total possible marks"))
    } else {
      (true, None)
    }
  }
}
