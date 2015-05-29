package coursera.functional_programming_principles.week_3_data_and_abstraction

object linked_list {
  new EmptyList                                   //> res0: coursera.functional_programming_principles.week_3_data_and_abstraction
                                                  //| .EmptyList[Nothing] = .
  
  val l1: List[Int] = new NonEmptyList(1, new EmptyList)
                                                  //> l1  : coursera.functional_programming_principles.week_3_data_and_abstraction
                                                  //| .List[Int] = 1 -> .
  val l2 = new NonEmptyList(2, l1)                //> l2  : coursera.functional_programming_principles.week_3_data_and_abstraction
                                                  //| .NonEmptyList[Int] = 2 -> 1 -> .
  val l3 = new NonEmptyList(3, l2)                //> l3  : coursera.functional_programming_principles.week_3_data_and_abstraction
                                                  //| .NonEmptyList[Int] = 3 -> 2 -> 1 -> .
  val l4 = new NonEmptyList(4, l3)                //> l4  : coursera.functional_programming_principles.week_3_data_and_abstraction
                                                  //| .NonEmptyList[Int] = 4 -> 3 -> 2 -> 1 -> .
  val l5 = new NonEmptyList(5, l4)                //> l5  : coursera.functional_programming_principles.week_3_data_and_abstraction
                                                  //| .NonEmptyList[Int] = 5 -> 4 -> 3 -> 2 -> 1 -> .
  val l6 = new NonEmptyList(6, l5)                //> l6  : coursera.functional_programming_principles.week_3_data_and_abstraction
                                                  //| .NonEmptyList[Int] = 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> .
  l6.nth(3)                                       //> res1: Int = 3
  l6.nth(9)                                       //> java.lang.IndexOutOfBoundsException: element does not exist for index 3
                                                  //| 	at coursera.functional_programming_principles.week_3_data_and_abstractio
                                                  //| n.EmptyList.nth(List.scala:14)
                                                  //| 	at coursera.functional_programming_principles.week_3_data_and_abstractio
                                                  //| n.EmptyList.nth(List.scala:10)
                                                  //| 	at coursera.functional_programming_principles.week_3_data_and_abstractio
                                                  //| n.NonEmptyList.nth(List.scala:25)
                                                  //| 	at coursera.functional_programming_principles.week_3_data_and_abstractio
                                                  //| n.NonEmptyList.nth(List.scala:25)
                                                  //| 	at coursera.functional_programming_principles.week_3_data_and_abstractio
                                                  //| n.NonEmptyList.nth(List.scala:25)
                                                  //| 	at coursera.functional_programming_principles.week_3_data_and_abstractio
                                                  //| n.NonEmptyList.nth(List.scala:25)
                                                  //| 	at coursera.functional_programming_principles.week_3_data_and_abstractio
                                                  //| n.NonEmptyList.nth(List.scala:25)
                                                  //| 	at coursera.functional_programming_principles.week_3_data_and_abstractio
                                                  //| n.NonEmptyList.nth(List.scala:25)
}