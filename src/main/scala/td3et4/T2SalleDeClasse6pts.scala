package fr.esgi.funcProg
package td3et4

import java.util.UUID

object T2SalleDeClasse6pts extends App {

  val room = FunctionsT2.createAndReturneClasseAvecEtudiants()

  val etudiantEFromClasse = room.get(1)(1) // Obtient l'élève E
  val etudiantDFromClasse = room.get(1)(0) // Obtient l'élève D
  println(s"${etudiantEFromClasse.id} : nom : ${etudiantEFromClasse.nom}, l'age : ${etudiantEFromClasse.age}")
  println(s"${etudiantDFromClasse.id} : nom : ${etudiantDFromClasse.nom}, l'age : ${etudiantDFromClasse.age}")

  room.displayPlan()
}

case object FunctionsT2 {

  def createAndReturneClasseAvecEtudiants(): Room = {
    val studentA = Student("Alpha", 18)
    val studentB = Student("Bravo", 17)
    val studentC = Student("Charlie", 16)
    val range1 = Vector(studentA, studentB, studentC)

    val studentD = Student("Delta", 18)
    val studentE = Student("Echo", 17)
    val studentF = Student("Foxtrot", 16)
    val range2 = Vector(studentD, studentE, studentF)

    val room = Room(
      range1,
      range2
    )

    room
  }

}

/*1.1 Construire une case class Student pour modéliser un élève*/
case class Student(nom: String, age: Int) {
  val id: String = UUID.randomUUID().toString
}

/* 1.1 Construire une case class Room pour la salle de cours
(on considère qu'une salle est une liste de rangs, chaque rang étant une liste d'élèves  )*/
/* ========== SOLUTION ==============
- Utilisation uperateur * pour avoir N liste de etudiant dans parametres.
- Utilisation du vecteur plus optimale selon l'avis de l'enseignant.
 ==================================== */
case class Room(students: Vector[Student]*) {

  /* 1.2 Proposer une méthode pour récupérer un élève en fonction de sa position.
  Exemple room.get(2)(1) = Student(E) */
  def get(row: Int)(seat: Int): Student = {
    students(row)(seat)
  }

  /*1.4 Ajouter une fonction affichant le plan de salle (0.5pt)*/
  def displayPlan(): Unit = {
    println("Plan de la salle de classe:")
    for (i <- students.indices) {
      for (j <- students(i).indices) {
        val student = students(i)(j)
        println(s"Rangée $i, Siège $j : ${student.nom}, Age: ${student.age} (idEtudiant : ${student.id}")
      }
    }
  }
}