package fr.esgi.funcProg
package td3et4

object TypedFunc extends App {

  def printAndReturn[A](value: A): A = {
    println(s"This is $value")
    value
  }

  def printAndReturn2(value: Any): Any = {
    println(s"This is $value")
    value
  }

  val wtf1 = printAndReturn(5)
  val wtf2 = printAndReturn2(5)

  println(s"wtf1 type : ${wtf1.getClass}, wtf2 type : ${wtf2.getClass}")

}
