package coursera.functional_programming_principles.week_5_lists

object pack_encode_list {
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil      => Nil
    case x :: xs1 => {
      val (taken, dropped) = xs.span(y => y == x)
      taken :: pack(dropped)
    }
  }                                               //> pack: [T](xs: List[T])List[List[T]]

  pack(List("a", "a", "a", "b", "c", "c", "a"))   //> res0: List[List[String]] = List(List(a, a, a), List(b), List(c, c), List(a))
                                                  //| 

  def encode[T] (xs: List[T]): List[(T, Int)] = pack(xs) map (packed => (packed(0), packed.length))
                                                  //> encode: [T](xs: List[T])List[(T, Int)]
  encode(List("a", "a", "a", "b", "c", "c", "a")) //> res1: List[(String, Int)] = List((a,3), (b,1), (c,2), (a,1))
 
}