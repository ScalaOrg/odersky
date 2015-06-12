package coursera.functional_programming_principles.week_5_lists

object flatten_list {
  def flatten(xs: List[Any]): List[Any] =
    xs match {
      case List() => xs
      case (element: List[Any]) :: rest => flatten(element) ::: flatten(rest)
      case element :: rest => element :: flatten(rest)
    }                                             //> flatten: (xs: List[Any])List[Any]

  flatten(List(List(1, 1), 2, List(List(List(List(5, 5), 4), 3), List(5, 8))))
                                                  //> res0: List[Any] = List(1, 1, 2, 5, 5, 4, 3, 5, 8)
}