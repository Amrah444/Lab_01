object q2{

    def main(args: Array[String]): Unit = {

    val input = List(1, 2, 3, 4, 5)

    def calculateSquare(l2: List[Int]) : List[Int] = {
    l2.map(num => num * num) 
    }


    val output = calculateSquare(input)

    println(output)

}
}