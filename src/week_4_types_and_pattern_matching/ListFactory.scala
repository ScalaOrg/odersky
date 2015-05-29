package week_4_types_and_pattern_matching

import coursera.functional_programming_principles.week_3_data_and_abstraction.EmptyList
import coursera.functional_programming_principles.week_3_data_and_abstraction.List
import coursera.functional_programming_principles.week_3_data_and_abstraction.NonEmptyList

object ListFactory {
  def apply[T](): List[T] = new EmptyList
  def apply[T](x1: T): List[T] = new NonEmptyList(x1, ListFactory())
  def apply[T](x1: T, x2: T): List[T] = new NonEmptyList(x1, ListFactory(x2))
}