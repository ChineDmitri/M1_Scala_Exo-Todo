package fr.esgi.funcProg
package td3et4

/* Note : Dans toute cette feuille d’exercice, il est interdit d’utiliser les méthodes:
 - map,
 - reduce,
 - fold,
 - filter,
 - sort */
object Bases4pts extends App {

  /* 1. Afficher les 10 premiers entiers et leur valeur au carré
   en utilisant Range et foreach (0.5pt) */
  FunctionsT1.getFirst10IntAndPowForEach()

  /* 2.1. Créer une fonction firstTwo(s: Seq[Int]): (Int, Int)
  qui renvoie les deux premiers éléments d’une liste sous forme de tuple
  (on considère que la liste est toujours supérieur à 2 éléments) (0.5pt) */
  /* 2.2 OPTIONAL (si j'airrive) -> Transformer cette fonction pour être générique
  et marcher avec tout type de Seq (0.5pt) */ 4
  val seqInt = Seq(1, 11, 2, 22, 3, 33, 4, 44)
  val tupleInt: (Int, Int) = FunctionsT1.firstTwo(seqInt)
  println(tupleInt)
  val tupleStr: (String, String) = FunctionsT1.firstTwo(Seq("hello", "world", "Scala"))
  println(tupleStr)
  val tupleDouble: (Double, Double) = FunctionsT1.firstTwo(Seq(3.14, 2.71, 1.41, 1.61))
  println(tupleDouble)

  /* 3. Créer une fonction createSandwich(s: Seq[Int]): (Int, Seq[Int], Int)
  qui renvoie un tuple avec le premier élément de la liste,
  une sous-liste des éléments au milieu de la liste,
  et le dernier élément de la liste. (0.5pt) */
  val sandwich: (Int, Seq[Int], Int) = FunctionsT1.createSandwich(seqInt)
  println(sandwich)
}

case object FunctionsT1 {
  def getFirst10IntAndPowForEach(): Unit = {
    println("getFirst10IntAndPowForEach")
    (1 to 10).foreach { num =>
      val square = Math.pow(num, 2)
      println(s"Entier : $num, Carré : $square")
    }
  }

  def firstTwo[A](value: Seq[A]): (A, A) = {
    println("firstTwo(value: Seq[A]): (A, A)")
    (value.head, value.tail.head)
  }

  def createSandwich[A](value: Seq[A]): (A, Seq[A], A) = {
    println("createSandwich(value: Seq[A]): (A, Seq[A], A)")
    (value.head, value.tail.init, value.last)
  }
}
