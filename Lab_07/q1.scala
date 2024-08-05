object q1{

    def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    def filterEvenNumbers(l1: List[Int]) : List[Int] = {
    l1.filter(num => num % 2 == 0) 
    }


    val output = filterEvenNumbers(input)

    println(output)

}
}