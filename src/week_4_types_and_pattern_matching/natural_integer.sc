package week_4_types_and_pattern_matching

object natural_integer {
  Zero + Zero                                     //> res0: week_4_types_and_pattern_matching.NaturalInteger = 0
  def one = Zero.successor                        //> one: => week_4_types_and_pattern_matching.Successor
  def two = one.successor                         //> two: => week_4_types_and_pattern_matching.Successor
  def three = two.successor                       //> three: => week_4_types_and_pattern_matching.Successor
  
  one + two                                       //> res1: week_4_types_and_pattern_matching.Successor = 0+1+1+1
  three + three                                   //> res2: week_4_types_and_pattern_matching.Successor = 0+1+1+1+1+1+1
  one - one                                       //> res3: week_4_types_and_pattern_matching.NaturalInteger = 0
  one + two - three                               //> res4: week_4_types_and_pattern_matching.NaturalInteger = 0
  
  one.predecessor                                 //> res5: week_4_types_and_pattern_matching.NaturalInteger = 0
  three.predecessor                               //> res6: week_4_types_and_pattern_matching.NaturalInteger = 0+1+1
  
  Zero - one                                      //> java.lang.UnsupportedOperationException: cannot subtract from zero
                                                  //| 	at week_4_types_and_pattern_matching.Zero$.$minus(NaturalInteger.scala:3
                                                  //| 1)
                                                  //| 	at week_4_types_and_pattern_matching.natural_integer$$anonfun$main$1.app
                                                  //| ly$mcV$sp(week_4_types_and_pattern_matching.natural_integer.scala:17)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week_4_types_and_pattern_matching.natural_integer$.main(week_4_types_
                                                  //| and_pattern_matching.natural_integer.scala:3)
                                                  //| 	at week_4_types_and_pattern_matching.natural_integer.main(week_4_types_a
                                                  //| nd_pattern_matching.natural_integer.scala)
 
}