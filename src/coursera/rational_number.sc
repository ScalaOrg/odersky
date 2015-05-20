package coursera

object rational_number {
  class Rational(x: Int, y: Int) {
    val numerator = x
    val denominator = y
    
    override def toString = s"$numerator / $denominator"
    
    def add(other: Rational) =
      new Rational(
        numerator * other.denominator + other.numerator * denominator,
        denominator * other.denominator)
        
    def sub(other: Rational) = add(other.neg)
        
    def mul(other: Rational) =
      new Rational(
        numerator * other.numerator,
        denominator * other.denominator)
      
    def neg = new Rational(-numerator, denominator)
  }
  
  val x = new Rational(1, 3)                      //> x  : coursera.rational_number.Rational = 1 / 3
  val y = new Rational(5, 7)                      //> y  : coursera.rational_number.Rational = 5 / 7
  val z = new Rational(3, 2)                      //> z  : coursera.rational_number.Rational = 3 / 2
  
  x.add(y).mul(z)                                 //> res0: coursera.rational_number.Rational = 66 / 42
  x.sub(y).sub(z)                                 //> res1: coursera.rational_number.Rational = -79 / 42
}