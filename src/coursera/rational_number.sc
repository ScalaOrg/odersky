package coursera

object rational_number {
  class Rational(x: Int, y: Int) {
    require(y != 0, "denominator must be non-zero")
  
    private val g = gcd(x, y)

    val numerator = x / g
    val denominator = y / g
    
    def this(x: Int) = this(x, 1)
    
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
    
    def less(other: Rational) = numerator * other.denominator < other.numerator * denominator
    
    def max(other: Rational) = if (less(other)) other else this
    
    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  }
  
  val x = new Rational(1, 3)                      //> x  : coursera.rational_number.Rational = 1 / 3
  val y = new Rational(5, 7)                      //> y  : coursera.rational_number.Rational = 5 / 7
  val z = new Rational(3, 2)                      //> z  : coursera.rational_number.Rational = 3 / 2
  
  x.add(y).mul(z)                                 //> res0: coursera.rational_number.Rational = 11 / 7
  x.sub(y).sub(z)                                 //> res1: coursera.rational_number.Rational = -79 / 42
  
  y.add(y)                                        //> res2: coursera.rational_number.Rational = 10 / 7
  
  x.less(y)                                       //> res3: Boolean = true
  
  x.max(y)                                        //> res4: coursera.rational_number.Rational = 5 / 7
  
  new Rational(2)                                 //> res5: coursera.rational_number.Rational = 2 / 1
}