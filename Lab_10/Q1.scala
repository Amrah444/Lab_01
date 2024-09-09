class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero")

    // Simplify the fraction using gcd
    val g = gcd(n.abs, d.abs)
    val numerator: Int = if (d < 0) -n / g else n / g
    val denominator: Int = d.abs / g

    // Negate the rational number
    def neg: Rational = new Rational(-numerator, denominator)

    // String representation of the Rational number
    override def toString: String = 
        if (denominator == 1) numerator.toString else s"$numerator/$denominator"

    // Helper function to calculate gcd
    def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}

object RationalTest extends App {
    val x = new Rational(3, 4)
    println(x.neg)
}
