object String {
  def main(args:Array[String]):Unit = {

    val name = "Zoewin Tan";

    val age = 18;

    println("名字： "+name + " 岁数："+ age)

    // Zoewin TanZoewin TanZoewin Tan
    println(name * 3)

    printf("%d岁的 %s 在我家学习\n",age,name)

    // ??? Weird but useful... They said it looks like shell =d so I think its ok
    println(s"${age}岁的 ${name} 在我家看小猫咪")

    // val num = 3
    val num = 3.1415

    // Format
    println(f"pi = ${num}, pi in 2 decimal = ${num}%2.2f")

  }
}
