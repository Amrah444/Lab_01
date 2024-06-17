object q2 {
  def celsiusToFahrenheit(celsius: Double): Double = {
    celsius * 1.8 + 32.0
  }

  def main(args: Array[String]): Unit = {
    val celsius = 35
    val fahrenheit = celsiusToFahrenheit(celsius)
    println(s"$celsius°C is equivalent to $fahrenheit°F")
  }
}
