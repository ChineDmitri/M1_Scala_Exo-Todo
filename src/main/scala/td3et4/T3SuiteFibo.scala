package fr.esgi.funcProg
package td3et4

import scala.annotation.tailrec

object T3SuiteFibo extends App {
  val vectorOrig = Vector(1, 2, 3)
  val newVector = FunctionsT3.sumLast(vectorOrig)
  println(newVector)

  //  Test avec 1 element
  println("Fibo with default arg " + FunctionsT3.fiboWith2Args(1))
  //  Test avec 2 element
  println("Fibo with default arg " + FunctionsT3.fiboWith2Args(2))
  //  Test avec 3 element
  println("Fibo with default arg " + FunctionsT3.fiboWith2Args(3))
  //  Test avec 4 element
  println("Fibo with default arg " + FunctionsT3.fiboWith2Args(4))

  //  Test avec 1 element
  println("Fibo without default arg " + FunctionsT3.fiboWith1Arg(1))
  //  Test avec 2 element
  println("Fibo without default arg " + FunctionsT3.fiboWith1Arg(2))
  //  Test avec 3 element
  println("Fibo without default arg " + FunctionsT3.fiboWith1Arg(3))
  //  Test avec 4 element
  println("Fibo without default arg " + FunctionsT3.fiboWith1Arg(4))
}

case object FunctionsT3 {

  def sumLast(v: Vector[Int]): Vector[Int] = {
    val somme = v(v.size - 2) + v.last
    v :+ somme
  }


  @tailrec
  def fiboWith2Args(n: Int, v: Vector[Int] = Vector(0, 1)): Vector[Int] = {
    if (v.size >= n) {
      v.take(n)
    } else {
      val updatedVector = FunctionsT3.sumLast(v)
      fiboWith2Args(n, updatedVector)
    }
  }

  def fiboWith1Arg(n: Int): Vector[Int] = {
    // Proposer une re-factorisation de la fonction =>
    // utilisation methode recursive + method with annotation @tailrec will be compiled with tail call optimization
    FunctionsT3.fiboWith2Args(n, Vector(0, 1))
  }

}