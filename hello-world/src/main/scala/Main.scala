object Main extends App {

  var a = 10;

  println(a);

  val age = 17; 

  // Print Hello World
  println("Hello, World!")

  // Initialize a new Student
  val stu1 = new Student("Zoewin Tan",age);

  // Print the student's info
  stu1.printInfo()

  //  Change Student's age to 18
  stu1.age = 18;

  // Print the student's info
  stu1.printInfo()
}