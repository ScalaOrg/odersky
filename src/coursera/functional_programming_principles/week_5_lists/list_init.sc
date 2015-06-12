package coursera.functional_programming_principles.week_5_lists

object list_init {
  def init[T](list: List[T]): List[T] =
    list match {
      case List() => throw new Error("empty list")
      case List(element) => List()
      case element :: rest => element :: init(rest)
    }                                             //> init: [T](list: List[T])List[T]
    
    init(1 :: 2 :: 3 :: Nil)                      //> res0: List[Int] = List(1, 2)
    init(List())                                  //> java.lang.Error: empty list
                                                  //| 	at coursera.functional_programming_principles.week_5_lists.list_init$$an
                                                  //| onfun$main$1.init$1(coursera.functional_programming_principles.week_5_lists.
                                                  //| list_init.scala:6)
                                                  //| 	at coursera.functional_programming_principles.week_5_lists.list_init$$an
                                                  //| onfun$main$1.apply$mcV$sp(coursera.functional_programming_principles.week_5_
                                                  //| lists.list_init.scala:12)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at coursera.functional_programming_principles.week_5_lists.list_init$.ma
                                                  //| in(coursera.functional_programming_principles.week_5_lists.list_init.scala:3
                                                  //| )
                                                  //| 	at coursera.functional_programming_principles.week_5_lists.list_init.mai
                                                  //| n(cours
                                                  //| Output exceeds cutoff limit.
}