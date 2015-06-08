package coursera.functional_programming_principles.week_4_types_and_pattern_matching

import coursera.functional_programming_principles.week_3_data_and_abstraction.NonEmptyList

object list_variance {
  def nil_list = coursera.functional_programming_principles.week_3_data_and_abstraction.Nil
                                                  //> nil_list: => coursera.functional_programming_principles.week_3_data_and_abst
                                                  //| raction.Nil.type
  new NonEmptyList(1, nil_list)                   //> res0: coursera.functional_programming_principles.week_3_data_and_abstraction
                                                  //| .NonEmptyList[Int] = 1 -> nil
}