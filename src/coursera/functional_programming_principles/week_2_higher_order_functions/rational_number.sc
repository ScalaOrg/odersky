package coursera.functional_programming_principles.week_2_higher_order_functions

object rational_number {
  class Rational(x: Int, y: Int) {
    require(y != 0, "denominator must be non-zero")
  
    private val g = gcd(x, y)

    val numerator = x / g
    val denominator = y / g
    
    def this(x: Int) = this(x, 1)
    
    override def toString = {
      if (denominator != 1)
        s"$numerator / $denominator"
      else
        numerator.toString
    }
    
    def +(other: Rational) =
      new Rational(
        numerator * other.denominator + other.numerator * denominator,
        denominator * other.denominator)
        
    def -(other: Rational) = this + (-other)
        
    def *(other: Rational) =
      new Rational(
        numerator * other.numerator,
        denominator * other.denominator)
      
    def unary_- = new Rational(-numerator, denominator)
    
    def less(other: Rational) = numerator * other.denominator < other.numerator * denominator
    
    def max(other: Rational) = if (less(other)) other else this
    
    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  }
  
  val x = new Rational(1, 3)                      //> x  : coursera.functional_programming_principles.week_2_higher_order_functio
                                                  //| ns.rational_number.Rational = 1 / 3
  val y = new Rational(5, 7)                      //> y  : coursera.functional_programming_principles.week_2_higher_order_functio
                                                  //| ns.rational_number.Rational = 5 / 7
  val z = new Rational(3, 2)                      //> z  : coursera.functional_programming_principles.week_2_higher_order_functio
                                                  //| ns.rational_number.Rational = 3 / 2
  
  (x + y) * z                                     //> res0: coursera.functional_programming_principles.week_2_higher_order_functi
                                                  //| ons.rational_number.Rational = 11 / 7
  x - y - z                                       //> res1: coursera.functional_programming_principles.week_2_higher_order_functi
                                                  //| ons.rational_number.Rational = -79 / 42
  y + y                                           //> res2: coursera.functional_programming_principles.week_2_higher_order_functi
                                                  //| ons.rational_number.Rational = 10 / 7
  
  x.less(y)                                       //> res3: Boolean = true
  
  x.max(y)                                        //> res4: coursera.functional_programming_principles.week_2_higher_order_functi
                                                  //| ons.rational_number.Rational = 5 / 7
  
  new Rational(2)                                 //> res5: coursera.functional_programming_principles.week_2_higher_order_functi
                                                  //| ons.rational_number.Rational = 2
}