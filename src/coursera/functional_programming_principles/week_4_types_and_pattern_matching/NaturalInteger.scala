package coursera.functional_programming_principles.week_4_types_and_pattern_matching

// Peano Number
abstract class NaturalInteger {
  def isZero: Boolean
  def predecessor: NaturalInteger
  def successor = new Successor(this)
  def + (other: NaturalInteger): NaturalInteger
  def - (other: NaturalInteger): NaturalInteger
  
  override def toString =
    if (isZero == True)
      "0"
    else
      s"$predecessor+1"
}

class Successor(val previosInteger: NaturalInteger) extends NaturalInteger {
  def isZero = False
  def predecessor = previosInteger 
  def + (other: NaturalInteger) = new Successor(previosInteger + other)
  def - (other: NaturalInteger) = other.isZero.ifThenElse(this, previosInteger - other.predecessor)
}

object Zero extends NaturalInteger {
  def isZero = True
  def predecessor = throw new IllegalAccessError("no predecessor for zero")
  def + (other: NaturalInteger) = other 
  def - (other: NaturalInteger) = 
    if (other.isZero == False)
      throw new UnsupportedOperationException("cannot subtract from zero")
    else
      this
}
