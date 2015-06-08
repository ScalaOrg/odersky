package coursera.functional_programming_principles.week_3_data_and_abstraction

trait List[+T] {
  def isEmpty: Boolean
  def item: T
  def tail: List[T]
  def nth(index: Int): T
  def prepend[U >: T](element: U): List[U] = new NonEmptyList(element, this)
}

object Nil extends List[Nothing] {
  def isEmpty: Boolean = true
  def item: Nothing = throw new NoSuchElementException("list is nil")
  def tail: Nothing = throw new NoSuchElementException("list is nil")
  def nth(index: Int) = throw new IndexOutOfBoundsException("list is nil")
  
  override def toString = "nil"
}

class EmptyList[T] extends List[T] {
  def isEmpty = true
  def item: Nothing = throw new NoSuchElementException("no item in empty list")
  def tail: Nothing = throw new NoSuchElementException("no tail of an empty list")
  def nth(index: Int) = throw new IndexOutOfBoundsException(s"element does not exist for index $index")
  
  override def toString = "."
}

class NonEmptyList[T](val item: T, val tail: List[T]) extends List[T] {
  def isEmpty: Boolean = false
  def nth(index: Int) =
    if (index == 0)
      item
    else
      tail.nth(index - 1)
  
  override def toString = s"$item -> $tail"
}