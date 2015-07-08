package coursera.functional_programming_principles.week_6_collections

object scalar_product {
  def list1 = List(1, 2, 3)                       //> list1: => List[Int]
  def list2 = List(4, 5)                          //> list2: => List[Int]
  
  (for ( (a, b) <- list1 zip list2) yield a * b).sum
                                                  //> res0: Int = 14
}