package fr.esgi.funcProg
package td8

object T1Reducer extends App {
  println(FucntionsForReucer.factorial(5))

  val s = Seq(1, 2, 3)

  println("Reduce Left")
  s.reduceLeft((l, r) => {
    println(l - r)
    l - r
  })
  println("Reduce Right")
  s.reduceRight((l, r) => {
    println(l - r)
    l - r
  })
}

case object FucntionsForReucer {

  def factorial(n: Int): Int = {
    val arr = 1 to n

    if (n == 0) 1
    else (arr).reduce((x,y) => x * y)
  }

}
