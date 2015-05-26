package coursera.functional_programming_principles.week_1_functions_and_evaluations

object newton_square_root {
  def sqrt(x: Double): Double = { // <--- privatize non-public methods

    def sqrtIter(guess: Double): Double =
      if (isCloseEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isCloseEnough(guess: Double): Boolean =
      // accurate for large numbers
      // Math.abs(guess - x / guess) < Math.min(0.01, Math.max(1e-25, x))
      Math.abs(guess * guess - x) / x < 0.01

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }                                               //> sqrt: (x: Double)Double

  sqrt(1)                                         //> res0: Double = 1.0
  sqrt(2)                                         //> res1: Double = 1.4166666666666665
  sqrt(1e5)                                       //> res2: Double = 317.2028655357483
  sqrt(1e-50)                                     //> res3: Double = 1.000873029120681E-25
  sqrt(1e50)                                      //> res4: Double = 1.000873029120681E25
}