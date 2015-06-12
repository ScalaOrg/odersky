package coursera.functional_programming_principles.week_4_types_and_pattern_matching

object list_sort {
  def sort(list: List[Int]): List[Int] =
    list match {
      case List() => List()
      case a :: rest => insert(a, sort(rest))
    }                                             //> sort: (list: List[Int])List[Int]

  def insert(element: Int, list: List[Int]): List[Int] =
    list match {
      case List() => List(element)
      case a :: rest =>
        if (element <= a)
          element :: list
        else
          a :: insert(element, rest)
    }                                             //> insert: (element: Int, list: List[Int])List[Int]

  sort(List(4, 3, 1, 5, 10, 2, 1))                //> res0: List[Int] = List(1, 1, 2, 3, 4, 5, 10)
}