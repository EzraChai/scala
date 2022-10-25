object DataType {
  def main(args:Array[String]):Unit = {
    val c1 = 'C';
    val n1:Int = c1
    println(n1)

    var c2: Char = (n1 + 1).toChar
    println(c2)


    def m1():Unit = {
      println("m1 is running")
    }
    
    val a:Unit = m1()
    println(s"a: ${a}")

    // val n:Int = null
    var student:Student = new Student("Chloe Gan",18)
    println(student)
    student = null
    println(student)

    def m2(n:Int): Int = {
      if(n == 0)
        throw new NullPointerException
      else
        return n

    }

    val b = m2(0);
  }
}
