package coursera.functional_programming_principles.week_4_types_and_pattern_matching

abstract class Boolean {
  def ifThenElse[T](thenPart: => T, elsePart: => T): T
  
  def < (other: Boolean): Boolean = ifThenElse(False, other)
  
  def unary_! = ifThenElse(False, True)
}

object True extends Boolean {
  def ifThenElse[T](thenPart: => T, elsePart: => T) = thenPart
}

object False extends Boolean {
  def ifThenElse[T](thenPart: => T, elsePart: => T) = elsePart
}
