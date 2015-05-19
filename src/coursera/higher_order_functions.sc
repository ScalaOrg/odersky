package coursera

object higher_order_functions {
  def generic_expression(f: Double => Double,
                         combiner: (Double, Double) => Double,
                         initial_value: Int)
                        (a: Int, b: Int): Double = {
    def loop(a: Int, acc: Double): Double =
      if(a > b)
        acc
      else
        loop(a + 1, combiner(acc, f(a)))
        
    loop(a, initial_value)
  }                                               //> generic_expression: (f: Double => Double, combiner: (Double, Double) => Doub
                                                  //| le, initial_value: Int)(a: Int, b: Int)Double
  
  def product(f: Double => Double)(a: Int, b: Int) =
    generic_expression(f, (x, y) => x * y, 1)(a, b)
                                                  //> product: (f: Double => Double)(a: Int, b: Int)Double
  def sum(f: Double => Double)(a: Int, b: Int) =
    generic_expression(f, (x, y) => x + y, 0)(a, b)
                                                  //> sum: (f: Double => Double)(a: Int, b: Int)Double
  
  def factorial(n: Int): Int = product(x => x)(1, n).toInt
                                                  //> factorial: (n: Int)Int
  
  product(x => x / 2.0)(1, 5)                     //> res0: Double = 3.75
  sum(x => x / 1.0)(1, 5)                         //> res1: Double = 15.0
  factorial(5)                                    //> res2: Int = 120
}