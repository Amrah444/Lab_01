object q4 {
  def totalWholesaleCost(copies: Int): Double = {
    val coverPrice = 24.95
    val discount = 0.4
    val discountedPrice = coverPrice * (1 - discount)
    val shippingCost = if (copies <= 50) {
      3.0
    } else {
      3.0 + (copies - 50) * 0.75
    }
    discountedPrice * copies + shippingCost
  }

  def main(args: Array[String]): Unit = {
    val copies = 60
    val totalCost = totalWholesaleCost(copies)
    println(s"The total wholesale cost for $copies copies is Rs. $totalCost")
  }
}
