package fr.esgi.funcProg
package td8

object T2Fold extends App {

  println(FunctionsForFold.toFold(5d))
  println(FunctionsForFold.toFold(5.0))
  println(FunctionsForFold.toFold(5.0, isLeft = false))

  val users = Users(Map("Alice" -> 25, "Bob" -> 30,"Charlie" -> 35))
  val usersWithIncreasedAge = users.getOlder("Bob")

  println(usersWithIncreasedAge)
}

case class Users(data: Map[String, Int]) {
  def getOlder(username: String): Users = {
    val updatedData = data.get(username) match {
      case Some(age) => data + (username -> (age + 1))
      case None => data
    }
    Users(updatedData)
  }
}


case object FunctionsForFold {

  def toFold(num: Double, isLeft: Boolean = true): Double = {
    val seq = Seq(1, 2, 3)

    if (isLeft) seq.foldLeft(num)((a, b) => {
      println(a + " / " + b + " = " + a / b)
      a / b
    })
    else
      seq.foldRight(5.0)((a, b) => {
        println(a + " / " + b + " =  " + a / b)
        a / b
      })
  }

//  def toFold[A](num: A, isLeft: Boolean = true)(implicit numeric: Numeric[A]): A = {
//    val seq = Seq(numeric.fromInt(1), numeric.fromInt(2), numeric.fromInt(3))
//
//    if (isLeft) seq.foldLeft(num)((a, b) => numeric.fromInt(a) / numeric.fromInt(b))
//    else seq.foldRight(num)((a, b) => numeric.fromInt(a) / numeric.fromInt(b))
//  }
}
