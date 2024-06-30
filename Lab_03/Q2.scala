import scala.io.StdIn.readLine

object Q2{

    def length(s: String): Int = {
        if(s.isEmpty){
            0
        }else{
            1 + length(s.tail)
        }
    }


    def stringLength(stringList: List[String]): List[String] = {
        stringList.filter(s => length(s) > 5)

    } 

    def main(args: Array[String]): Unit = {
        println("Enter Strings seperated by commas: ")
        val inputString = readLine().split(",").map(_.trim).toList
        val filteredStrings = stringLength(inputString)
        println(s"Input Strings: $inputString")
        println(s"Filtered Strings $filteredStrings")
    }

    












}