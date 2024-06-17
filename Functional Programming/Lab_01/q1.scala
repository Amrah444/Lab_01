object q1 {
  def areaOfDisk(radius: Double): Double = {
    val Pi = 3.141592653589793
    Pi * radius * radius
  }

  def main(args: Array[String]): Unit = {
    val radius = 5
    val area = areaOfDisk(radius)
    println(s"The area of a disk with radius $radius is $area")
  }
}
