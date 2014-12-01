// Solution-4.scala
// Solution to Exercise 4 in "Case Classes"
import com.atomicscala.AtomicTest._

case class Dimension(var height:Int, var width:Int)

val c = new Dimension(5,7)
c.height is 5
c.height = 10
c.height is 10
c.width = 19
c.width is 19
