package coursera.functional_programming_principles.week_4_types_and_pattern_matching

object expression_problem {
  def e = Multiply(Divide(Number(4), Sum(Number(1), Number(1))), Sum(Number(2), Subtract(Number(3), Number(2))))
                                                  //> e: => coursera.functional_programming_principles.week_4_types_and_pattern_ma
                                                  //| tching.Multiply
  e.toString()                                    //> res0: String = 4 / (1 + 1) * (2 + 3 - 2)
  e.eval                                          //> res1: Integer = 6
  
  Sum(Multiply(Number(2), Variable('x')), Variable('y'))
                                                  //> res2: coursera.functional_programming_principles.week_4_types_and_pattern_ma
                                                  //| tching.Sum = 2 * x + y
  Multiply(Sum(Number(2), Variable('x')), Variable('y'))
                                                  //> res3: coursera.functional_programming_principles.week_4_types_and_pattern_ma
                                                  //| tching.Multiply = (2 + x) * y
}

trait Expression {
  def serialize(associative: Boolean = True): String =
    this match {
      case Number(n) => n.toString()
      case Variable(name) => name.toString()
      case Sum(expr1, expr2) => associative.ifThenElse(s"${expr1} + ${expr2}", s"(${expr1} + ${expr2})")
      case Subtract(expr1, expr2) => associative.ifThenElse(s"${expr1} - ${expr2}", s"(${expr1} - ${expr2})")
      case Multiply(expr1, expr2) => s"${expr1.serialize(False)} * ${expr2.serialize(False)}"
      case Divide(expr1, expr2) => s"${expr1.serialize(False)} / ${expr2.serialize(False)}"
   }
  
  override def toString =
    this match {
      case Number(_) => serialize(True)
      case Variable(_) => serialize(True)
      case Sum(_, _) => serialize(True)
      case Subtract(_, _) => serialize(True)
      case Multiply(_, _) => serialize(False)
      case Divide(_, _) => serialize(False)
    }
    
  def eval: Integer =
    this match {
      case Number(n) => n
      case Sum(expr1, expr2) => expr1.eval + expr2.eval
      case Subtract(expr1, expr2) => expr1.eval - expr2.eval
      case Multiply(expr1, expr2) => expr1.eval * expr2.eval
      case Divide(expr1, expr2) => expr1.eval / expr2.eval
    }
}

case class Number(val value: Integer) extends Expression

case class Sum(expr1: Expression, expr2: Expression) extends Expression

case class Subtract(expr1: Expression, expr2: Expression) extends Expression

case class Multiply(expr1: Expression, expr2: Expression) extends Expression

case class Divide(expr1: Expression, expr2: Expression) extends Expression

case class Variable(name: Character) extends Expression