package fr.esgi.funcProg
package td1

object FiltreImmutable {
  private val x = List(1, 2) // x contien [1, 2]
  private val y = List(3, 4, 5, 6) // y contien [3]

  private val z = x ++ y // z contien x & y

  def main(args: Array[String]): Unit = {
    val listFiltered: List[Int] = filter(merge(x, y))

    printList(listFiltered)
  }

  def merge(x: List[Int], y: List[Int]): List[Int] = {
    x ++ y
  }

  def filter(array: List[Int]): List[Int] = {
    var filteredArray = List[Int]()

    for (el <- array) {
      if (el % 2 == 0) {
        filteredArray = filteredArray :+ el
      }
    }
    //    /*On peut faire comme ça mais en scala sans return */ return filteredArray
    filteredArray
  }

  def printList(list: List[Int]): Unit = {
    list foreach {
      n =>
        println(n)
    }
  }


}
