object q2 extends App{

val patterMatching: Int => String = num => {
        if(num <= 0) ("Negativoe/ Zero is input")
        else if(num % 2 == 0) ("Even is given")
        else ("Odd is given")

    }

println("Enter a number: ")
val number = scala.io.StdIn.readInt()
val result = patterMatching(number)

println("Result is: " + result)
    
}