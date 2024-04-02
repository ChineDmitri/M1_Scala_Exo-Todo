package fr.esgi.funcProg
package td3et4

object T4Queue4pts extends App {

  case class Queue[A](in: List[A] = List(), out: List[A] = List()) {

    def enqueue(a: A): Queue[A] = {
      // ajoute en debut element A
      Queue(a :: in, out)
    }

    def dequeue: (A, Queue[A]) = {
      out match {
        case head :: tail => (head, Queue(in, tail))
        case Nil =>
          if (in.nonEmpty) {
            val (newOut, newIn) = in.reverse match {
              case head :: tail => (head, tail)
              case _            => throw new NoSuchElementException("Empty Queue")
            }
            (newOut, Queue(Nil, newIn))
          } else {
            throw new NoSuchElementException("Empty Queue")
          }
      }
    }

  }

  val qInt = Queue() enqueue 1 enqueue 2 enqueue 3
  println(qInt.dequeue._1) // 1
  println(qInt.dequeue._2.enqueue(4).dequeue._1) // 2

  val qStr = Queue() enqueue "1 el" enqueue "2 el" enqueue "3 el"
  println(qStr.dequeue._1) // 1
  println(qStr.dequeue._2.enqueue("4 el").dequeue._1) // 2
}
