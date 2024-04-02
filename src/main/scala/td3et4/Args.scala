package fr.esgi.funcProg
package td3et4

object Args extends App {

  f(1, 2, 3, 11, 12, 13)

  def f(args: Int*): Unit = {
    println(args)
  }

  val seqTest1 = Seq("a", "b", "c")
  println(Set(seqTest1: _*) == Set("a", "b", "c"))

  val preparedSeq = Seq("A", "a", "a", "B", "b", "b")
  val seqToSet = Set(preparedSeq: _*)
  println(s"seqToSet equal ${seqToSet.toString()}")

}
