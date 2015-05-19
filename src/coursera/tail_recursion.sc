package coursera

import scala.annotation.tailrec

object tail_recursion {
  def factorial(n: Int): Int = {
    @tailrec // <--- forces the function to be tail recursive
    def loop(result: Int, current: Int): Int =
      if (current == 0)
        result
      else
        loop(result * current, current - 1)
        
    loop(1, n)
  }                                               //> factorial: (n: Int)Int
  
  factorial(1)                                    //> res0: Int = 1
  factorial(2)                                    //> res1: Int = 2
  factorial(5)                                    //> res2: Int = 120
  factorial(10)                                   //> res3: Int = 3628800
}