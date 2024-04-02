package fr.esgi.funcProg
package practice

object RecursiveExo1 {
  val numbers = Seq(1, 2, 3, 4, 5)

  def main(args: Array[String]): Unit = {
    printSeq(numbers)
  }

  def printSeq(s: Seq[Int]): Unit = {
    if (s.nonEmpty) {
      if (s.head % 2 == 0) {
        println(s.head)
      }

      printSeq(s.drop(1))
    }
  }

}
