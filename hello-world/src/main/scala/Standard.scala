import scala.io.StdIn
object Standard {
  def main(args: Array[String]):Unit = {
    println("Enter your name:")
    val name = StdIn.readLine()

    println("Enter your age:")
    val age = StdIn.readInt()

    println(s"Your name is ${name}, ${age} years old")

  }
}
