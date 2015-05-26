package coursera.functional_programming_principles.week_3_data_and_abstraction

object binary_tree {
  val t1 = EmptyTreeNode.add(5)                   //> t1  : coursera.functional_programming_principles.week_3_data_and_abstraction
                                                  //| .TreeNode = {. 5 .}
  t1.add(5)                                       //> res0: coursera.functional_programming_principles.week_3_data_and_abstraction
                                                  //| .BinaryTree = {. 5 .}
  t1.add(5)
    .add(3)                                       //> res1: coursera.functional_programming_principles.week_3_data_and_abstraction
                                                  //| .BinaryTree = {{. 3 .} 5 .}
  val t2 = t1.add(5)
             .add(3)
             .add(1)
             .add(2)
             .add(7)
             .add(4)
             .add(8)
             .add(5)                              //> t2  : coursera.functional_programming_principles.week_3_data_and_abstraction
                                                  //| .BinaryTree = {{{. 1 {. 2 .}} 3 {. 4 .}} 5 {. 7 {. 8 .}}}
             
  t2.contains(5)                                  //> res2: Boolean = true
  t2.contains(1)                                  //> res3: Boolean = true
  t2.contains(9)                                  //> res4: Boolean = false
  
  val t3 = EmptyTreeNode.add(10)
                        .add(8)
                        .add(9)
                        .add(7)
                        .add(11)
                        .add(14)                  //> t3  : coursera.functional_programming_principles.week_3_data_and_abstraction
                                                  //| .BinaryTree = {{{. 7 .} 8 {. 9 .}} 10 {. 11 {. 14 .}}}
                      
  t2.union(t3)                                    //> res5: coursera.functional_programming_principles.week_3_data_and_abstraction
                                                  //| .BinaryTree = {{{{{. 1 {. 2 .}} 3 {. 4 {. 5 .}}} 7 .} 8 {. 9 .}} 10 {. 11 {.
                                                  //|  14 .}}}
}

abstract class BinaryTree {
  def add(x: Int): BinaryTree
  def contains(x: Int): Boolean
  def union(other: BinaryTree): BinaryTree
}

object EmptyTreeNode extends BinaryTree {
  def add(x: Int) = new TreeNode(x, EmptyTreeNode, EmptyTreeNode)
  def contains(x: Int): Boolean = false
  def union(other: BinaryTree): BinaryTree = other
  
  override def toString = "."
}

class TreeNode(element: Int, leftSubTree: BinaryTree, rightSubTree: BinaryTree) extends BinaryTree {
  def add(x: Int) =
    if (x < element) new TreeNode(element, leftSubTree add x, rightSubTree)
    else if (x > element) new TreeNode(element, leftSubTree, rightSubTree add x)
    else this
    
  def contains(x: Int): Boolean =
    if (x < element) leftSubTree contains x
    else if (x > element) rightSubTree contains x
    else true
  
  def union(other: BinaryTree): BinaryTree =
    ((leftSubTree union rightSubTree) union other) add element
  
  override def toString = s"{$leftSubTree $element $rightSubTree}"
}