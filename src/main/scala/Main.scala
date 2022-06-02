import scala.math._

@main def hello: Unit = 
  println("Hello world!")
  println(msg)

  println()
  println("by Andrew :)")
  println("A small vector")
  println(d1.mkString(" ").mkString(" "))  // 1D vector

  println("A number sequence with a formatted string")
  for (x <- 1 to 5) println(x+s"= (${pow(x,x)})^(1/${x})")
  
  println()
  println(s"A nice (${d2.length},${d2(0).length}) matrix:")
  for (j <- 0 to d2.length-1)
    for (i <- 0 to d2(0).length-1)
      d2(j)(i) = (i+1)+(d2.length*j)
  d2.map(row => println(row.toArray.mkString(" ")))


def msg = "I was compiled by Scala 3. :)"
val d2 = Array.ofDim[Int](15,15)  
val d1 = Array(1,2,3)

object Main:
  val name = Option("Andrew")
  name.get
  // name.getOrElse()

