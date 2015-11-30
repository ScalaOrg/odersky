package coursera.functional_programming_principles.week_1_functions_and_evaluations

object sqrt_fixed_point {
  def fixedPoint(f: Double => Double) = {
    def loop(guess: Double): Double = {
      val next = f(guess)
      if(isCloseEnough(guess, next)) guess
      else loop(next)
    }
      
    def isCloseEnough(guess: Double, next: Double): Boolean =
      Math.abs((guess - next) / guess) / guess < 0.00001
      
    loop(1.0)
  }                                               //> fixedPoint: (f: Double => Double)Double
  fixedPoint(x => 1 + x / 2)                      //> res0: Double = 1.99993896484375
  
  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double
  
  def sqrt(x: Int) = fixedPoint(averageDamp(y => x / y))
                                                  //> sqrt: (x: Int)Double

  sqrt(2)                                         //> res1: Double = 1.4142156862745097
}