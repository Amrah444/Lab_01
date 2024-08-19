object q1 extends App{

val flatFunction: Double => Double = amount => {

    if (amount <= 20000) amount * 0.02 + amount
    else if (amount <= 200000) amount * 0.04 + amount
    else if (amount <= 2000000) amount * 0.035 + amount
    else amount * 0.065
}


println("Enter the amount you deposit: ")
val num = scala.io.StdIn.readDouble()
val total = flatFunction(num)

println("The total amount is : " + total)




}