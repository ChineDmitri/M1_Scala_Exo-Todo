package fr.esgi.funcProg
package td1

object MyVecClass extends App {
  case class MyVec(x: Int, y: Int) {
    /* + c'est pas modificateur, c'est nom de methode*/
    def +(additionalVec: MyVec): MyVec = MyVec(this.x + additionalVec.x, this.y + additionalVec.y)
    //  def add(additionalVec: MyVec): MyVec = MyVec(this.x + additionalVec.x, this.y + additionalVec.y)

    /*OR avec deux params*/
    def +(vec1: MyVec, vec2: MyVec): MyVec = MyVec(this.x + vec1.x + vec1.x, this.y + vec2.y + vec2.y)
  }

  private val myVec1 = MyVec(1, 1)
  private val myVec2 = MyVec(2, 3)
  private val myVec3 = MyVec(2, 3)

  println(myVec1 + myVec2)
  /*OR*/
  //  print(myVec1.add(myVec2))

  /*Voici démo pour 2 params*/
  println(myVec1.+(myVec2, myVec3))
}
