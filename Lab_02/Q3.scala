object Q3 {
//variables
  val normalHourlyRate: Int = 250
  val OThourlyRate: Int = 85
  val taxRate: Double = 0.12

  //functions
  def normalSalary(normalWorkingHourPerWeek: Double): Double = normalWorkingHourPerWeek * normalHourlyRate

  def OTSalary(OTWorkingHourPerWeek: Double): Double = OTWorkingHourPerWeek * OThourlyRate

  def grossSalary(normalWorkingHourPerWeek: Double, OTWorkingHourPerWeek: Double): Double = {
    normalSalary(normalWorkingHourPerWeek) + OTSalary(OTWorkingHourPerWeek)
  }

  def tax(grossSalary: Double): Double = grossSalary * taxRate

  def takeHomeSalary(normalWorkingHourPerWeek: Double, OTWorkingHourPerWeek: Double): Double = {
    val gross = grossSalary(normalWorkingHourPerWeek, OTWorkingHourPerWeek)
    gross - tax(gross)
  }

  //main function
  def main(args: Array[String]): Unit = {
    val normalWorkingHourPerWeek: Double = 40
    val OTWorkingHourPerWeek: Double = 30

    val takehome = takeHomeSalary(normalWorkingHourPerWeek, OTWorkingHourPerWeek)

    println(f"Take-home salary: Rs. $takehome%.2f")
  }
}
