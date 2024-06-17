object q5 {
  def main(args: Array[String]): Unit = {
    
    val easyPaceDistance1 = 2 
    val easyPaceDistance2 = 2 
    val tempoPaceDistance = 3 

    val easyPaceTimePerKm = 8 
    val tempoPaceTimePerKm = 7 

    val easyPaceTime1 = easyPaceDistance1 * easyPaceTimePerKm
    val tempoPaceTime = tempoPaceDistance * tempoPaceTimePerKm
    val easyPaceTime2 = easyPaceDistance2 * easyPaceTimePerKm

   
    val totalRunningTime = easyPaceTime1 + tempoPaceTime + easyPaceTime2

    
    println(s"The total running time is $totalRunningTime minutes")
  }
}
