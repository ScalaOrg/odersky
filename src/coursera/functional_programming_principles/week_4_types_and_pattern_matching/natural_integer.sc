package coursera.functional_programming_principles.week_4_types_and_pattern_matching

object natural_integer {
  Zero + Zero                                     //> res0: coursera.functional_programming_principles.week_4_types_and_pattern_ma
                                                  //| tching.NaturalInteger = 0
  def one = Zero.successor                        //> one: => coursera.functional_programming_principles.week_4_types_and_pattern_
                                                  //| matching.Successor
  def two = one.successor                         //> two: => coursera.functional_programming_principles.week_4_types_and_pattern_
                                                  //| matching.Successor
  def three = two.successor                       //> three: => coursera.functional_programming_principles.week_4_types_and_patter
                                                  //| n_matching.Successor
  
  one + two                                       //> res1: coursera.functional_programming_principles.week_4_types_and_pattern_ma
                                                  //| tching.Successor = 0+1+1+1
  three + three                                   //> res2: coursera.functional_programming_principles.week_4_types_and_pattern_ma
                                                  //| tching.Successor = 0+1+1+1+1+1+1
  one - one                                       //> res3: coursera.functional_programming_principles.week_4_types_and_pattern_ma
                                                  //| tching.NaturalInteger = 0
  one + two - three                               //> res4: coursera.functional_programming_principles.week_4_types_and_pattern_ma
                                                  //| tching.NaturalInteger = 0
  
  one.predecessor                                 //> res5: coursera.functional_programming_principles.week_4_types_and_pattern_ma
                                                  //| tching.NaturalInteger = 0
  three.predecessor                               //> res6: coursera.functional_programming_principles.week_4_types_and_pattern_ma
                                                  //| tching.NaturalInteger = 0+1+1
  
  Zero - one                                      //> java.lang.UnsupportedOperationException: cannot subtract from zero
                                                  //| 	at coursera.functional_programming_principles.week_4_types_and_pattern_m
                                                  //| atching.Zero$.$minus(NaturalInteger.scala:31)
                                                  //| 	at coursera.functional_programming_principles.week_4_types_and_pattern_m
                                                  //| atching.natural_integer$$anonfun$main$1.apply$mcV$sp(coursera.functional_pro
                                                  //| gramming_principles.week_4_types_and_pattern_matching.natural_integer.scala:
                                                  //| 17)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at coursera.functional_programming_principles.week_4_types_and_pattern_m
                                                  //| atching.natural_integer$.main(coursera.functional_programming_principles.wee
                                                  //| k_4_types_and_pattern_matching.natural_integer.
                                                  //| Output exceeds cutoff limit.
 
}