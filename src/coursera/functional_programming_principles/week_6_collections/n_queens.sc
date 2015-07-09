package coursera.functional_programming_principles.week_6_collections

object n_queens {
  def nQueens(n: Int): Seq[List[Int]] = {
    def isSafe(position: Int, placed: List[Int]): Boolean = {
      val rows = placed.length
      val placedWithRows = placed zip (rows - 1 to 0 by -1)
      placedWithRows forall {
        case (r, c) => position != r && math.abs(position - r) != rows - c
      }
    }
  
    def placeQueens(k: Int): Seq[List[Int]] =
      if (k == 0) Seq(List())
      else
        for {
					queens <- placeQueens(k - 1)
          column <- 0 until n
          if isSafe(column, queens)
        } yield column :: queens
        
    placeQueens(n)
  }                                               //> nQueens: (n: Int)Seq[List[Int]]
  
  nQueens(4)                                      //> res0: Seq[List[Int]] = List(List(2, 0, 3, 1), List(1, 3, 0, 2))
}