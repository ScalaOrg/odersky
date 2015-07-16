package coursera.functional_programming_principles.week_6_collections

object polynomial {
  class Poly(terms0: Map[Int, Double]) {
    def this(bindings: (Int, Double)*) = this(bindings.toMap)
 
    val terms = terms0.withDefaultValue(0.0)
 
    def +(other: Poly) = new Poly(terms ++ other.terms.map(adjustTerms))
    
    def ++ (other: Poly) = new Poly(other.terms.foldLeft(terms)(addTerm))

    def addTerm(terms: Map[Int, Double], term: (Int, Double)): Map[Int, Double] = {
      val (exp, coeff) = term
      terms + (exp -> (coeff + terms(exp)))
    }
    
    def adjustTerms(term: (Int, Double)) = {
      val (exp, coeff) = term
      exp -> (coeff + terms(exp))
    }
      
    override def toString =
      (for ((exp, coeff) <- terms.toList.sorted) yield s"${coeff}^${exp}").mkString(" + ")
  }
  
  val p1 = new Poly(1 -> 1.2, 3 -> 2, 5 -> 3.5)   //> p1  : coursera.functional_programming_principles.week_6_collections.polynomi
                                                  //| al.Poly = 1.2^1 + 2.0^3 + 3.5^5
  val p2 = new Poly(4 -> 2.2, 3 -> 1.4, 2 -> 3.5, 5 -> 1.7)
                                                  //> p2  : coursera.functional_programming_principles.week_6_collections.polynomi
                                                  //| al.Poly = 3.5^2 + 1.4^3 + 2.2^4 + 1.7^5
  p1 + p2                                         //> res0: coursera.functional_programming_principles.week_6_collections.polynomi
                                                  //| al.Poly = 1.2^1 + 3.5^2 + 3.4^3 + 2.2^4 + 5.2^5
  p1 ++ p2                                        //> res1: coursera.functional_programming_principles.week_6_collections.polynomi
                                                  //| al.Poly = 1.2^1 + 3.5^2 + 3.4^3 + 2.2^4 + 5.2^5
}