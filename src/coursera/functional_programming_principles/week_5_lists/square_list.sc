package coursera.functional_programming_principles.week_5_lists

object square_list {
	def squareListMatch(xs: List[Int]): List[Int] = xs match {
	    case Nil     => xs
	    case y :: ys => y * y :: squareListMatch(ys)
	  }                                       //> squareListMatch: (xs: List[Int])List[Int]
	 
	def squareListMap(xs: List[Int]): List[Int] = xs.map { x => x * x }
                                                  //> squareListMap: (xs: List[Int])List[Int]

  def list = List(1, 2, 3, 4, 5)                  //> list: => List[Int]
  
  squareListMatch(list)                           //> res0: List[Int] = List(1, 4, 9, 16, 25)
  squareListMap(list)                             //> res1: List[Int] = List(1, 4, 9, 16, 25)
}