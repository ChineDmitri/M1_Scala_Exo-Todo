package fr.esgi.funcProg
package td3et4

object T5UpdateValues extends App {
  println("===== INT ========")
  val exoList1 = List(1, 2, 3, 4, 5)
  println("exoList1 avant modifierFunc1 " + exoList1)

  // func multiplication in 2
  val modifiedList =
    FunctionsT5.updateCollection(exoList1, FunctionsT5.modifierFunc1)
  println(
    "exoList1 apres modifierFunc1 " + modifiedList
  ) // Print: List(2, 4, 6, 8, 10)

  println("==================")
  println("==== DOUBLE ======")

  val exoList2: List[Double] = List(1d, 2d, 3d, 4d, 5d)
  println("exoList2 avant modifierFunc2 " + exoList1)

  // func multiplication in 2
  val modifiedList2 =
    FunctionsT5.updateCollection(exoList2, FunctionsT5.modifierFunc2)
  println(
    "exoList2 apres modifierFunc2 " + modifiedList2
  ) // Print: List(0.5, 1.0, 1.5, 2.0, 2.5)

  println("==================")
  println("==== STRING ======")

  val exoList3 = List("titi", "toto", "mama", "papa")
  println("exoList3 avant modifierFunc2 " + exoList1)

  // func for upperCase
  val modifiedList3 =
    FunctionsT5.updateCollection(exoList3, FunctionsT5.modifierFunc3)
  println(
    "exoList3 apres modifierFunc2 " + modifiedList3
  ) // Print: List(0.5, 1.0, 1.5, 2.0, 2.5)

}

case object FunctionsT5 {

  def updateCollection[A, B](collection: Seq[A], modifier: A => B): Seq[B] = {
    collection.map(modifier)
  }

  def modifierFunc1(value: Int): Int = {
    value * 2
  }

  def modifierFunc2(value: Double): Double = {
    value / 2
  }

  def modifierFunc3(value: String): String = {
    value.toUpperCase()
  }
}
