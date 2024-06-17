object q3 {
  def volumeOfSphere(radius: Double): Double = {
    val Pi = 3.141592653589793
    (4.0 / 3.0) * Pi * Math.pow(radius, 3)
  }

  def main(args: Array[String]): Unit = {
    val radius = 5
    val volume = volumeOfSphere(radius)
    println(s"The volume of a sphere with radius $radius is $volume")
  }
}
