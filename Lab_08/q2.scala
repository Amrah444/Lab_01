object q2{

    def printMessage(x: Int) : String = {

        if(x % 3 ==0 && x % 5 == 0) ("Multiple of Both Three and Five")
        else if(x % 3 == 0) ("Multiple of Three")
        else if(x % 5 == 0) ("Multiple of Five")
        else ("Not a Multiple of Three or Five")
    }




    def main(args: Array[String]) : Unit = {

        println("Enter a number: ")
        val x = scala.io.StdIn.readInt()

        val Message = printMessage(x)
        println(Message)
    }


}