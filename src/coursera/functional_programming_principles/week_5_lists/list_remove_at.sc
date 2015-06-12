package coursera.functional_programming_principles.week_5_lists

object list_remove_at {
  def removeAt[T](n: Int, list: List[T]): List[T] =
    list match {
      case List() => list
      case element :: rest =>
        if (n == 0)
          rest
        else
          element :: removeAt(n - 1, rest)
    }                                             //> removeAt: [T](n: Int, list: List[T])List[T]
  removeAt(0, 1 :: 2 :: 3 :: Nil)                 //> res0: List[Int] = List(2, 3)
  removeAt(1, 1 :: 2 :: 3 :: Nil)                 //> res1: List[Int] = List(1, 3)
  removeAt(2, 1 :: 2 :: 3 :: Nil)                 //> res2: List[Int] = List(1, 2)
  removeAt(5, 1 :: 2 :: 3 :: Nil)                 //> res3: List[Int] = List(1, 2, 3)
  removeAt(-1, 1 :: 2 :: 3 :: Nil)                //> res4: List[Int] = List(1, 2, 3)

    
  def removeAt_2[T](n: Int, list: List[T]): List[T] = (list take n) ::: (list drop n + 1)
                                                  //> removeAt_2: [T](n: Int, list: List[T])List[T]
    
  removeAt_2(0, 1 :: 2 :: 3 :: Nil)               //> res5: List[Int] = List(2, 3)
  removeAt_2(1, 1 :: 2 :: 3 :: Nil)               //> res6: List[Int] = List(1, 3)
  removeAt_2(2, 1 :: 2 :: 3 :: Nil)               //> res7: List[Int] = List(1, 2)
  removeAt_2(5, 1 :: 2 :: 3 :: Nil)               //> res8: List[Int] = List(1, 2, 3)
  removeAt_2(-1, 1 :: 2 :: 3 :: Nil)              //> res9: List[Int] = List(1, 2, 3)
}