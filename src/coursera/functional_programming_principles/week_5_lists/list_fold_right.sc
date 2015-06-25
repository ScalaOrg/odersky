package coursera.functional_programming_principles.week_5_lists

object list_fold_right {
  def mapFun[T, U](xs: List[T], f: T => U): List[U] =
    (xs foldRight List[U]())(f(_) :: _)           //> mapFun: [T, U](xs: List[T], f: T => U)List[U]

  def lengthFun[T](xs: List[T]): Int =
    (xs foldRight 0)((x, acc) => acc + 1)         //> lengthFun: [T](xs: List[T])Int
    
  mapFun(List(1, 2, 3, 4, 5, 6), (x: Int) => "-" + x + "-")
                                                  //> res0: List[String] = List(-1-, -2-, -3-, -4-, -5-, -6-)
  lengthFun(List(1, 2, 3, 4, 5, 6, 7))            //> res1: Int = 7
}