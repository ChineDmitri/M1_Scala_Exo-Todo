package fr.esgi.funcProg
package practice

object BasicExo {
  val nombresForTest = Seq(1, 2, 3, 4, 5, 6)

  def main(args: Array[String]): Unit = {
    //    printForClassic(nombres)
    printWithWhile(nombresForTest)
  }

  // For classic
  def printForClassic(nombres: Seq[Int]): Unit = {
    println("This is print for classic")
    for (n <- nombres if n % 2 == 0) println(n)
  }

  // for -> forEach
  def printForEach(nombres: Seq[Int]): Unit = {
    println("This is print foreach")
    nombres foreach {
      n => if (n % 2 == 0) println(n)
    }
  }

  // use filter
  def printWithFilter(nombres: Seq[Int]): Unit = {
    println("This is print with filter")
    nombres
      //      /*OR*/ .filter(x => x % 2 == 0)
      .filter(_ % 2 == 0)
      .foreach(x => println(x))
  }

  // while ;(
  def printWithWhile(nombres: Seq[Int]): Unit = {
    println("While start")
    var i = 0
    while (i < nombres.size) {
      if (i == 3) {
        println("Nous somme arrivés en 3 !")
      }
      //i += 1
      i = i + 1
    }
    println("While terminé")
  }
}
