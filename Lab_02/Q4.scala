object Q4 {

  // Constants
  val initialAttendance: Int = 120
  val initialPrice: Double = 15.0
  val attendanceChange: Int = 20
  val priceChange: Double = 5.0
  val performanceCost: Double = 500.0
  val costPerAttendee: Double = 3.0

  // Function to calculate attendance based on price
  def attendance(price: Double): Int = {
    if (price == initialPrice) initialAttendance
    else if (price < initialPrice) initialAttendance + attendanceChange
    else initialAttendance - attendanceChange
  }

  // Function to calculate revenue based on price
  def revenue(price: Double): Double = {
    attendance(price) * price
  }

  // Function to calculate total cost based on price
  def cost(price: Double): Double = {
    performanceCost + attendance(price) * costPerAttendee
  }

  // Function to calculate profit based on price
  def profit(price: Double): Double = {
    revenue(price) - cost(price)
  }

  // Function to find the best ticket price that maximizes profit
  def findBestPrice(): Double = {
    // Define the range of ticket prices to search within
    val minPrice = 5.0
    val maxPrice = 25.0
    val step = 1

    // Initialize variables to store the best price and profit found
    var bestPrice = minPrice
    var maxProfit = profit(minPrice)

    // Iterate through the range of prices and find the price with maximum profit
    var currentPrice = minPrice
    while (currentPrice <= maxPrice) {
      val currentProfit = profit(currentPrice)
      if (currentProfit > maxProfit) {
        maxProfit = currentProfit
        bestPrice = currentPrice
      }
      currentPrice += step
    }

    bestPrice
  }

  def main(args: Array[String]): Unit = {
    val bestPrice = findBestPrice()
    val bestProfit = profit(bestPrice)

    println(f"The best ticket price for maximum profit is Rs. $bestPrice%.2f")
    println(f"At this price, the maximum profit is Rs. $bestProfit%.2f")
  }
}
