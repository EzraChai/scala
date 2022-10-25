object ForLoop {
  def main(args: Array[String]) : Unit = {
    for (i <- 1 to 10){
        println(s"hello ${i}")
    }
    println()
    for (i <- 1 to 10 by 2 ){
        println(i)
    }
    println()
    for (i<- 10 to 0 by -2){
        println(i)
    }
    println()
  }
}
