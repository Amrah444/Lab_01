class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero")

    // Simplify the fraction using gcd
    val g = gcd(n.abs, d.abs)
    val numerator: Int = if (d < 0) -n / g else n / g
    val denominator: Int = d.abs / g

    def neg: Rational = new Rational(-numerator, denominator)

        def +(that: Rational): Rational = {
        val newNumerator = this.numerator * that.denominator + that.numerator * this.denominator
        val newDenominator = this.denominator * that.denominator
        new Rational(newNumerator, newDenominator)
    }

        def -(that: Rational): Rational = {
        val newNumerator = this.numerator * that.denominator - that.numerator * this.denominator
        val newDenominator = this.denominator * that.denominator
        new Rational(newNumerator, newDenominator)
    }

     override def toString: String = 
        if (denominator == 1) numerator.toString else s"$numerator/$denominator"

    // Helper function to calculate gcd
    def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

}

object RationalTest extends App {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)
    val sum = x + (y - z)
    println(sum)
}
