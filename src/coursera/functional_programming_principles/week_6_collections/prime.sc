package coursera.functional_programming_principles.week_6_collections

object prime {
  def isPrime(n: Int): Boolean = {
    if (n == 1)
      return false
      
    if (n < 4)
      return true
            
    (2 to (n / 2)).find { x => n % x == 0 }.size == 0
  }                                               //> isPrime: (n: Int)Boolean
    
  isPrime(2)                                      //> res0: Boolean = true
  isPrime(1)                                      //> res1: Boolean = false
  isPrime(3)                                      //> res2: Boolean = true
  isPrime(6)                                      //> res3: Boolean = false
  isPrime(235)                                    //> res4: Boolean = false
  isPrime(23)                                     //> res5: Boolean = true
  isPrime(123)                                    //> res6: Boolean = false
}